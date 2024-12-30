package com.box.sdkgen.networking.boxnetworkclient;

import static com.box.sdkgen.box.BoxConstants.USER_AGENT_HEADER;
import static com.box.sdkgen.box.BoxConstants.X_BOX_UA_HEADER;
import static com.box.sdkgen.serialization.json.JsonManager.jsonToSerializedData;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import static com.box.sdkgen.serialization.json.JsonManager.sdToUrlParams;
import static java.util.Collections.singletonList;
import static okhttp3.ConnectionSpec.MODERN_TLS;

import com.box.sdkgen.box.errors.BoxAPIError;
import com.box.sdkgen.box.errors.BoxSDKError;
import com.box.sdkgen.networking.fetchoptions.FetchOptions;
import com.box.sdkgen.networking.fetchoptions.MultipartItem;
import com.box.sdkgen.networking.fetchoptions.ResponseFormat;
import com.box.sdkgen.networking.fetchresponse.FetchResponse;
import com.box.sdkgen.networking.network.NetworkSession;
import com.box.sdkgen.networking.networkclient.NetworkClient;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
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

public class BoxNetworkClient implements NetworkClient {

  private static final int BASE_TIMEOUT = 1;
  private static final double RANDOM_FACTOR = 0.5;

  protected OkHttpClient httpClient;

  public BoxNetworkClient(OkHttpClient httpClient) {
    this.httpClient = httpClient;
  }

  public BoxNetworkClient() {
    OkHttpClient.Builder builder =
        new OkHttpClient.Builder()
            .followSslRedirects(true)
            .followRedirects(false)
            .connectionSpecs(singletonList(MODERN_TLS));
    httpClient = builder.build();
  }

  public OkHttpClient getHttpClient() {
    return httpClient;
  }

  public FetchResponse fetch(FetchOptions options) {
    NetworkSession networkSession =
        options.getNetworkSession() == null ? new NetworkSession() : options.getNetworkSession();

    FetchOptions fetchOptions =
        networkSession.getInterceptors().stream()
            .reduce(
                options,
                (modifiedOptions, interceptor) -> interceptor.beforeRequest(modifiedOptions),
                (o1, o2) -> o2);

    boolean authenticationNeeded = false;
    Request request;
    FetchResponse fetchResponse = null;
    Exception exceptionThrown = null;

    int attemptNumber = 0;

    while (true) {
      request = prepareRequest(fetchOptions, authenticationNeeded, networkSession);

      Response response = null;
      try {
        response = executeOnClient(request);

        Map<String, String> headersMap =
            response.headers().toMultimap().entrySet().stream()
                .collect(
                    Collectors.toMap(
                        Map.Entry::getKey,
                        e -> e.getValue().get(0),
                        (existing, replacement) -> existing,
                        () -> new TreeMap<>(String.CASE_INSENSITIVE_ORDER)));

        String responseUrl =
            response.networkResponse() != null
                ? response.networkResponse().request().url().toString()
                : response.request().url().toString();
        fetchResponse =
            Objects.equals(fetchOptions.getResponseFormat().getEnumValue(), ResponseFormat.BINARY)
                ? new FetchResponse.FetchResponseBuilder(response.code(), headersMap)
                    .content(response.body().byteStream())
                    .url(responseUrl)
                    .build()
                : new FetchResponse.FetchResponseBuilder(response.code(), headersMap)
                    .data(
                        response.body() != null
                            ? jsonToSerializedData(response.body().string())
                            : null)
                    .url(responseUrl)
                    .build();

        fetchResponse =
            networkSession.getInterceptors().stream()
                .reduce(
                    fetchResponse,
                    (modifiedResponse, interceptor) -> interceptor.afterRequest(modifiedResponse),
                    (o1, o2) -> o2);

        if (fetchResponse.getStatus() >= 300 && fetchResponse.getStatus() < 400) {
          if (fetchOptions.followRedirects == false) {
            return fetchResponse;
          }
          if (!fetchResponse.getHeaders().containsKey("Location")) {
            throw new BoxSDKError(
                "Redirect response missing Location header for " + fetchOptions.getUrl());
          }
          return fetch(
              new FetchOptions.FetchOptionsBuilder(
                      fetchResponse.getHeaders().get("Location"), "GET")
                  .responseFormat(fetchOptions.getResponseFormat())
                  .auth(fetchOptions.getAuth())
                  .networkSession(networkSession)
                  .build());
        }

        boolean acceptedWithRetryAfter =
            fetchResponse.status == 202 && fetchResponse.getHeaders().get("Retry-After") != null;

        if (fetchResponse.getStatus() >= 200
            && fetchResponse.getStatus() < 299
            && (!acceptedWithRetryAfter || attemptNumber >= NetworkSession.MAX_ATTEMPTS)) {
          return fetchResponse;
        }

        if (fetchResponse.getStatus() == 401 && fetchOptions.getAuth() != null) {
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

      if (fetchResponse != null
          && fetchResponse.getStatus() >= 400
          && fetchResponse.getStatus() < 500
          && fetchResponse.getStatus() != 429
          && !authenticationNeeded) {
        throwOnUnsuccessfulResponse(request, fetchResponse, exceptionThrown);
      }

      if (attemptNumber >= NetworkSession.MAX_ATTEMPTS) {
        break;
      }

      try {
        int secondsToSleep =
            getRetryAfterTimeInSeconds(
                attemptNumber,
                fetchResponse != null ? fetchResponse.getHeaders().get("Retry-After") : null);
        TimeUnit.SECONDS.sleep(secondsToSleep);
      } catch (InterruptedException interruptedException) {
        throwOnUnsuccessfulResponse(request, fetchResponse, exceptionThrown);
      }

      attemptNumber++;
    }

    throwOnUnsuccessfulResponse(request, fetchResponse, exceptionThrown);
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
    requestBuilder.method(options.getMethod().toUpperCase(), body);
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

  protected Call createNewCall(Request request) {
    return this.httpClient.newCall(request);
  }

  private Response executeOnClient(Request request) throws IOException {
    return createNewCall(request).execute();
  }

  private static void throwOnUnsuccessfulResponse(
      Request request, FetchResponse fetchResponse, Exception exceptionThrown) {
    if (fetchResponse == null) {
      throw new BoxSDKError(exceptionThrown.getMessage(), exceptionThrown);
    }
    try {
      throw BoxAPIError.fromAPICall(request, fetchResponse);
    } finally {
      try {
        if (fetchResponse.getContent() != null) {
          fetchResponse.getContent().close();
        }
      } catch (IOException ignored) {
      }
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
