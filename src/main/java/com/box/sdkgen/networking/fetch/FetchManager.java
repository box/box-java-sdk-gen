package com.box.sdkgen.networking.fetch;

import static com.box.sdkgen.box.BoxConstants.USER_AGENT_HEADER;
import static com.box.sdkgen.box.BoxConstants.X_BOX_UA_HEADER;
import static com.box.sdkgen.serialization.json.JsonManager.jsonToSerializedData;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import static com.box.sdkgen.serialization.json.JsonManager.sdToUrlParams;

import com.box.sdkgen.box.errors.BoxAPIError;
import com.box.sdkgen.box.errors.BoxSDKError;
import com.box.sdkgen.networking.network.NetworkSession;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;

public class FetchManager {

  private static final int BASE_TIMEOUT = 1;
  private static final double RANDOM_FACTOR = 0.5;

  public static FetchResponse fetch(FetchOptions options) {

    boolean authenticationNeeded = false;
    Request request;
    Response response = null;
    Exception exceptionThrown = null;

    NetworkSession networkSession =
        options.getNetworkSession() == null ? new NetworkSession() : options.getNetworkSession();
    OkHttpClient client = networkSession.getHttpClient();

    int attemptNumber = 0;

    while (true) {
      request = prepareRequest(options, authenticationNeeded, networkSession);

      try {
        response = executeOnClient(client, request);

        boolean acceptedWithRetryAfter =
            response.code() == 202 && response.header("Retry-After") != null;
        if (response.isSuccessful() && !acceptedWithRetryAfter) {
          if (Objects.equals(options.getResponseFormat(), "binary")) {
            return new FetchResponse(
                response.code(),
                null,
                response.body().byteStream(),
                response.headers().toMultimap().entrySet().stream()
                    .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().get(0))));
          }
          return new FetchResponse(
              response.code(),
              response.body() != null ? jsonToSerializedData(response.body().string()) : null,
              null,
              response.headers().toMultimap().entrySet().stream()
                  .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().get(0))));
        }

        if (response.code() == 401 && options.getAuth() != null) {
          authenticationNeeded = true;
        }

      } catch (Exception e) {
        exceptionThrown = e;
        // Retry network exception only once
        if (attemptNumber > 1) {
          if (response != null) {
            response.close();
          }
          throw new BoxSDKError(e.getMessage(), e);
        }
      }

      if (response != null
          && response.code() >= 400
          && response.code() < 500
          && response.code() != 429
          && !authenticationNeeded) {
        throwOnUnsuccessfulResponse(request, response, exceptionThrown);
      }

      if (attemptNumber >= NetworkSession.MAX_ATTEMPTS) {
        break;
      }

      try {

        int secondsToSleep =
            getRetryAfterTimeInSeconds(
                attemptNumber, response != null ? response.header("Retry-After") : null);
        TimeUnit.SECONDS.sleep(secondsToSleep);
      } catch (InterruptedException interruptedException) {
        throwOnUnsuccessfulResponse(request, response, exceptionThrown);
      }

      attemptNumber++;
    }

    throwOnUnsuccessfulResponse(request, response, exceptionThrown);
    return null;
  }

  private static Request prepareRequest(
      FetchOptions options, boolean reauthenticate, NetworkSession networkSession) {
    Request.Builder requestBuilder = new Request.Builder().url(options.getUrl());
    Headers headers = prepareHeaders(options, reauthenticate, networkSession);
    HttpUrl url = prepareUrl(options);
    RequestBody body = prepareRequestBody(options);

    requestBuilder.headers(headers);
    requestBuilder.url(url);
    requestBuilder.method(options.getMethod(), body);
    return requestBuilder.build();
  }

  private static Headers prepareHeaders(
      FetchOptions options, boolean reauthenticate, NetworkSession networkSession) {
    Headers.Builder headersBuilder = new Headers.Builder();

    networkSession.getAdditionalHeaders().forEach(headersBuilder::add);

    if (options.getHeaders() != null) {
      options.getHeaders().forEach(headersBuilder::add);
    }
    if (options.getAuth() != null) {
      if (reauthenticate) {
        options.getAuth().refreshToken(networkSession);
      }
      headersBuilder.add(
          "Authorization", options.getAuth().retrieveAuthorizationHeader(networkSession));
    }
    headersBuilder.add("User-Agent", USER_AGENT_HEADER);
    headersBuilder.add("X-Box-UA", X_BOX_UA_HEADER);
    return headersBuilder.build();
  }

  private static HttpUrl prepareUrl(FetchOptions options) {

    HttpUrl baseUrl = HttpUrl.parse(options.getUrl());
    if (baseUrl == null) {
      throw new IllegalArgumentException("Invalid URL " + options.getUrl());
    }
    HttpUrl.Builder urlBuilder = baseUrl.newBuilder();
    if (options.getParams() != null) {
      options.getParams().forEach(urlBuilder::addQueryParameter);
    }
    return urlBuilder.build();
  }

  private static RequestBody prepareRequestBody(FetchOptions options) {
    if (options.getMethod().equalsIgnoreCase("GET")) {
      return null;
    }
    String contentType = options.getContentType();
    MediaType mediaType = MediaType.parse(contentType);
    switch (contentType) {
      case "application/json":
      case "application/json-patch+json":
        return options.getData() != null
            ? RequestBody.create(sdToJson(options.getData()), mediaType)
            : RequestBody.create("", mediaType);
      case "application/x-www-form-urlencoded":
        return options.getData() != null
            ? RequestBody.create(sdToUrlParams(options.getData()), mediaType)
            : RequestBody.create("", mediaType);
      case "multipart/form-data":
        MultipartBody.Builder bodyBuilder = new MultipartBody.Builder().setType(MultipartBody.FORM);
        for (MultipartItem part : options.multipartData) {
          if (part.getData() != null) {
            bodyBuilder.addFormDataPart(part.getPartName(), sdToJson(part.getData()));
          } else {
            bodyBuilder.addFormDataPart(
                part.getPartName(),
                part.getFileName() != null ? part.getFileName() : "file",
                createMultipartRequestBody(part));
          }
        }
        return bodyBuilder.build();
      default:
        throw new IllegalArgumentException("Unsupported content type " + contentType);
    }
  }

  protected static Call createNewCall(OkHttpClient httpClient, Request request) {
    return httpClient.newCall(request);
  }

  private static Response executeOnClient(OkHttpClient httpClient, Request request)
      throws IOException {
    return createNewCall(httpClient, request).execute();
  }

  private static void throwOnUnsuccessfulResponse(
      Request request, Response response, Exception exceptionThrown) {
    if (response == null) {
      throw new BoxSDKError(exceptionThrown.getMessage(), exceptionThrown);
    }

    try {
      throw BoxAPIError.fromAPICall(request, response);
    } finally {
      response.close();
    }
  }

  private static int getRetryAfterTimeInSeconds(int attemptNumber, String retryAfterHeader) {

    if (retryAfterHeader != null) {
      return Integer.parseInt(retryAfterHeader);
    }

    double minWindow = 1 - RANDOM_FACTOR;
    double maxWindow = 1 + RANDOM_FACTOR;
    double jitter = (Math.random() * (maxWindow - minWindow)) + minWindow;
    return (int) (Math.pow(2, attemptNumber) * BASE_TIMEOUT * jitter);
  }

  public static RequestBody createMultipartRequestBody(MultipartItem part) {
    return new RequestBody() {
      @Override
      public MediaType contentType() {
        if (part.contentType != null) {
          return MediaType.parse(part.contentType);
        }
        return MediaType.parse("application/octet-stream");
      }

      @Override
      public void writeTo(BufferedSink sink) throws IOException {
        try (Source source = Okio.source(part.getFileStream())) {
          sink.writeAll(source);
        }
      }
    };
  }
}
