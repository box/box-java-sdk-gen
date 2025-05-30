package com.box.sdkgen.managers.authorization;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class RefreshAccessTokenHeaders {

  public Map<String, String> extraHeaders;

  public RefreshAccessTokenHeaders() {
    this.extraHeaders = mapOf();
  }

  protected RefreshAccessTokenHeaders(RefreshAccessTokenHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class RefreshAccessTokenHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public RefreshAccessTokenHeadersBuilder() {
      this.extraHeaders = mapOf();
    }

    public RefreshAccessTokenHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public RefreshAccessTokenHeaders build() {
      return new RefreshAccessTokenHeaders(this);
    }
  }
}
