package com.box.sdkgen.managers.signrequests;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class CancelSignRequestHeaders {

  public Map<String, String> extraHeaders;

  public CancelSignRequestHeaders() {
    this.extraHeaders = mapOf();
  }

  protected CancelSignRequestHeaders(CancelSignRequestHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class CancelSignRequestHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public CancelSignRequestHeadersBuilder() {
      this.extraHeaders = mapOf();
    }

    public CancelSignRequestHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public CancelSignRequestHeaders build() {
      return new CancelSignRequestHeaders(this);
    }
  }
}
