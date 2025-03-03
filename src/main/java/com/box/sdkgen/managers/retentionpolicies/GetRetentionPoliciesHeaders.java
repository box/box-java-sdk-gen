package com.box.sdkgen.managers.retentionpolicies;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetRetentionPoliciesHeaders {

  public Map<String, String> extraHeaders;

  public GetRetentionPoliciesHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetRetentionPoliciesHeaders(GetRetentionPoliciesHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetRetentionPoliciesHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetRetentionPoliciesHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetRetentionPoliciesHeaders build() {
      return new GetRetentionPoliciesHeaders(this);
    }
  }
}
