package com.box.sdkgen.networking.defaultnetworkclient;

import static com.box.sdkgen.serialization.json.JsonManager.jsonToSerializedData;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import static com.box.sdkgen.serialization.json.JsonManager.sdToUrlParams;
import static java.util.Collections.singletonList;
import static okhttp3.ConnectionSpec.MODERN_TLS;

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

public class DefaultNetworkClient implements NetworkClient {

  protected OkHttpClient httpClient;

  public DefaultNetworkClient(OkHttpClient httpClient) {
    this.httpClient = httpClient;
  }

  public DefaultNetworkClient() {
    OkHttpClient.Builder builder =
        new OkHttpClient.Builder()
            .followSslRedirects(true)
            .followRedirects(false)
            .connectionSpecs(singletonList(MODERN_TLS));
    httpClient = builder.build();
  }

  public FetchResponse fetch(FetchOptions options) {
    NetworkSession networkSession =
        options.getNetworkSession() == null
            ? new NetworkSession.NetworkSessionBuilder().networkClient(this).build()
            : options.getNetworkSession();

    FetchOptions fetchOptions =
        networkSession.getInterceptors().stream()
            .reduce(
                options,
                (modifiedOptions, interceptor) -> interceptor.beforeRequest(modifiedOptions),
                (o1, o2) -> o2);

    boolean authenticationNeeded = false;
    Request request;

    request = prepareRequest(fetchOptions, authenticationNeeded, networkSession);

    try {

      Response response = executeOnClient(request);

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

      FetchResponse fetchResponse =
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

      return fetchResponse;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
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

  private Response executeOnClient(Request request) {
    try {
      return createNewCall(request).execute();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
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
