package com.box.sdkgen.managers.signrequests;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class CreateSignRequestHeaders {

  public Map<String, String> extraHeaders;

  public CreateSignRequestHeaders() {
    this.extraHeaders = mapOf();
  }

  protected CreateSignRequestHeaders(CreateSignRequestHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class CreateSignRequestHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public CreateSignRequestHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public CreateSignRequestHeaders build() {
      return new CreateSignRequestHeaders(this);
    }
  }
}
