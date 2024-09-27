package com.box.sdkgen.networking.fetch;

import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class FetchOptions {

  protected final String url;

  protected String method;

  protected Map<String, String> params;

  protected Map<String, String> headers;

  protected JsonNode data;

  protected InputStream fileStream;

  protected List<MultipartItem> multipartData;

  protected String contentType;

  protected String responseFormat;

  protected Authentication auth;

  protected NetworkSession networkSession;

  public FetchOptions(String url) {
    this.contentType = "application/json";
    this.url = url;
  }

  protected FetchOptions(FetchOptionsBuilder builder) {
    this.url = builder.url;
    this.method = builder.method;
    this.params = builder.params;
    this.headers = builder.headers;
    this.data = builder.data;
    this.fileStream = builder.fileStream;
    this.multipartData = builder.multipartData;
    this.contentType = builder.contentType;
    this.responseFormat = builder.responseFormat;
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public String getUrl() {
    return url;
  }

  public String getMethod() {
    return method;
  }

  public Map<String, String> getParams() {
    return params;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public JsonNode getData() {
    return data;
  }

  public InputStream getFileStream() {
    return fileStream;
  }

  public List<MultipartItem> getMultipartData() {
    return multipartData;
  }

  public String getContentType() {
    return contentType;
  }

  public String getResponseFormat() {
    return responseFormat;
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class FetchOptionsBuilder {

    protected final String url;

    protected String method;

    protected Map<String, String> params;

    protected Map<String, String> headers;

    protected JsonNode data;

    protected InputStream fileStream;

    protected List<MultipartItem> multipartData;

    protected String contentType;

    protected String responseFormat;

    protected Authentication auth;

    protected NetworkSession networkSession;

    public FetchOptionsBuilder(String url) {
      this.contentType = "application/json";
      this.url = url;
    }

    public FetchOptionsBuilder method(String method) {
      this.method = method;
      return this;
    }

    public FetchOptionsBuilder params(Map<String, String> params) {
      this.params = params;
      return this;
    }

    public FetchOptionsBuilder headers(Map<String, String> headers) {
      this.headers = headers;
      return this;
    }

    public FetchOptionsBuilder data(JsonNode data) {
      this.data = data;
      return this;
    }

    public FetchOptionsBuilder fileStream(InputStream fileStream) {
      this.fileStream = fileStream;
      return this;
    }

    public FetchOptionsBuilder multipartData(List<MultipartItem> multipartData) {
      this.multipartData = multipartData;
      return this;
    }

    public FetchOptionsBuilder contentType(String contentType) {
      this.contentType = contentType;
      return this;
    }

    public FetchOptionsBuilder responseFormat(String responseFormat) {
      this.responseFormat = responseFormat;
      return this;
    }

    public FetchOptionsBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public FetchOptionsBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public FetchOptions build() {
      return new FetchOptions(this);
    }
  }
}
