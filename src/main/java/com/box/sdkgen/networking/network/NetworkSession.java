package com.box.sdkgen.networking.network;

import com.box.sdkgen.networking.baseurls.BaseUrls;
import com.box.sdkgen.networking.boxnetworkclient.BoxNetworkClient;
import com.box.sdkgen.networking.interceptors.Interceptor;
import com.box.sdkgen.networking.networkclient.NetworkClient;
import com.box.sdkgen.networking.retries.BoxRetryStrategy;
import com.box.sdkgen.networking.retries.RetryStrategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NetworkSession {
  protected Map<String, String> additionalHeaders = new HashMap<>();

  protected BaseUrls baseUrls = new BaseUrls();

  protected List<Interceptor> interceptors = new ArrayList<>();

  protected NetworkClient networkClient;

  protected RetryStrategy retryStrategy;

  public NetworkSession() {
    networkClient = new BoxNetworkClient();
    retryStrategy = new BoxRetryStrategy();
  }

  protected NetworkSession(NetworkSessionBuilder builder) {
    this.additionalHeaders = builder.additionalHeaders;
    this.baseUrls = builder.baseUrls;
    this.networkClient = builder.networkClient;
    this.interceptors = builder.interceptors;
    this.retryStrategy = builder.retryStrategy;
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
        .retryStrategy(this.retryStrategy)
        .additionalHeaders(newHeaders)
        .build();
  }

  public NetworkSession withCustomBaseUrls(BaseUrls baseUrls) {
    return new NetworkSessionBuilder()
        .additionalHeaders(this.additionalHeaders)
        .interceptors(this.interceptors)
        .retryStrategy(this.retryStrategy)
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
        .retryStrategy(this.retryStrategy)
        .interceptors(newInterceptors)
        .build();
  }

  public NetworkSession withNetworkClient(NetworkClient networkClient) {
    return new NetworkSessionBuilder()
        .additionalHeaders(this.additionalHeaders)
        .baseUrls(this.baseUrls)
        .interceptors(this.interceptors)
        .retryStrategy(this.retryStrategy)
        .networkClient(networkClient)
        .build();
  }

  public NetworkSession withRetryStrategy(RetryStrategy retryStrategy) {
    return new NetworkSessionBuilder()
        .additionalHeaders(this.additionalHeaders)
        .baseUrls(this.baseUrls)
        .interceptors(this.interceptors)
        .networkClient(this.networkClient)
        .retryStrategy(retryStrategy)
        .build();
  }

  public Map<String, String> getAdditionalHeaders() {
    return additionalHeaders;
  }

  public BaseUrls getBaseUrls() {
    return baseUrls;
  }

  public NetworkClient getNetworkClient() {
    return networkClient;
  }

  public List<Interceptor> getInterceptors() {
    return interceptors;
  }

  public RetryStrategy getRetryStrategy() {
    return retryStrategy;
  }

  public static class NetworkSessionBuilder {

    protected Map<String, String> additionalHeaders = new HashMap<>();

    protected BaseUrls baseUrls = new BaseUrls();

    protected NetworkClient networkClient;

    protected List<Interceptor> interceptors = new ArrayList<>();

    protected RetryStrategy retryStrategy;

    public NetworkSessionBuilder() {
      networkClient = new BoxNetworkClient();
      retryStrategy = new BoxRetryStrategy();
    }

    public NetworkSessionBuilder additionalHeaders(Map<String, String> additionalHeaders) {
      this.additionalHeaders = additionalHeaders;
      return this;
    }

    public NetworkSessionBuilder baseUrls(BaseUrls baseUrls) {
      this.baseUrls = baseUrls;
      return this;
    }

    public NetworkSessionBuilder networkClient(NetworkClient networkClient) {
      this.networkClient = networkClient;
      return this;
    }

    public NetworkSessionBuilder interceptors(List<Interceptor> interceptors) {
      this.interceptors = interceptors;
      return this;
    }

    public NetworkSessionBuilder retryStrategy(RetryStrategy retryStrategy) {
      this.retryStrategy = retryStrategy;
      return this;
    }

    public NetworkSession build() {
      return new NetworkSession(this);
    }
  }
}
