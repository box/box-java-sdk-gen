package com.box.sdkgen.networking.network;

import static java.util.Collections.singletonList;
import static okhttp3.ConnectionSpec.MODERN_TLS;

import com.box.sdkgen.networking.baseurls.BaseUrls;
import com.box.sdkgen.networking.interceptors.Interceptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import okhttp3.OkHttpClient;

public class NetworkSession {

  public static int MAX_ATTEMPTS = 5;

  protected Map<String, String> additionalHeaders = new HashMap<>();

  protected BaseUrls baseUrls = new BaseUrls();

  protected OkHttpClient httpClient;

  protected List<Interceptor> interceptors = new ArrayList<>();

  public NetworkSession() {
    OkHttpClient.Builder builder =
        new OkHttpClient.Builder()
            .followSslRedirects(true)
            .followRedirects(false)
            .connectionSpecs(singletonList(MODERN_TLS));
    httpClient = builder.build();
  }

  protected NetworkSession(NetworkSessionBuilder builder) {
    this.additionalHeaders = builder.additionalHeaders;
    this.baseUrls = builder.baseUrls;
    this.httpClient = builder.httpClient;
    this.interceptors = builder.interceptors;
  }

  public NetworkSession withAdditionalHeaders() {
    return withAdditionalHeaders(new HashMap<>());
  }

  public NetworkSession withAdditionalHeaders(Map<String, String> additionalHeaders) {
    Map<String, String> newHeaders = new HashMap<>();
    newHeaders.putAll(this.additionalHeaders);
    newHeaders.putAll(additionalHeaders);
    return new NetworkSession.NetworkSessionBuilder()
        .baseUrls(this.baseUrls)
        .interceptors(this.interceptors)
        .additionalHeaders(newHeaders)
        .build();
  }

  public NetworkSession withCustomBaseUrls(BaseUrls baseUrls) {
    return new NetworkSessionBuilder()
        .additionalHeaders(this.additionalHeaders)
        .interceptors(this.interceptors)
        .baseUrls(baseUrls)
        .build();
  }

  public NetworkSession withInterceptors(List<Interceptor> interceptors) {
    List<Interceptor> newInterceptors =
        Stream.concat(this.interceptors.stream(), interceptors.stream())
            .collect(Collectors.toList());
    return new NetworkSessionBuilder()
        .additionalHeaders(this.additionalHeaders)
        .baseUrls(this.baseUrls)
        .interceptors(newInterceptors)
        .build();
  }

  public Map<String, String> getAdditionalHeaders() {
    return additionalHeaders;
  }

  public BaseUrls getBaseUrls() {
    return baseUrls;
  }

  public OkHttpClient getHttpClient() {
    return httpClient;
  }

  public List<Interceptor> getInterceptors() {
    return interceptors;
  }

  public static class NetworkSessionBuilder {

    protected Map<String, String> additionalHeaders = new HashMap<>();

    protected BaseUrls baseUrls = new BaseUrls();

    protected OkHttpClient httpClient;

    protected List<Interceptor> interceptors = new ArrayList<>();

    public NetworkSessionBuilder() {
      OkHttpClient.Builder builder =
          new OkHttpClient.Builder()
              .followSslRedirects(true)
              .followRedirects(true)
              .connectionSpecs(singletonList(MODERN_TLS));
      httpClient = builder.build();
    }

    public NetworkSessionBuilder additionalHeaders(Map<String, String> additionalHeaders) {
      this.additionalHeaders = additionalHeaders;
      return this;
    }

    public NetworkSessionBuilder baseUrls(BaseUrls baseUrls) {
      this.baseUrls = baseUrls;
      return this;
    }

    public NetworkSessionBuilder httpClient(OkHttpClient httpClient) {
      this.httpClient = httpClient;
      return this;
    }

    public NetworkSessionBuilder interceptors(List<Interceptor> interceptors) {
      this.interceptors = interceptors;
      return this;
    }

    public NetworkSession build() {
      return new NetworkSession(this);
    }
  }
}
