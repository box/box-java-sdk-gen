package com.box.sdkgen.managers.legalholdpolicies;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetLegalHoldPoliciesHeaders {

  public Map<String, String> extraHeaders;

  public GetLegalHoldPoliciesHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetLegalHoldPoliciesHeaders(GetLegalHoldPoliciesHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetLegalHoldPoliciesHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetLegalHoldPoliciesHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetLegalHoldPoliciesHeaders build() {
      return new GetLegalHoldPoliciesHeaders(this);
    }
  }
}
