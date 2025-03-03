package com.box.sdkgen.managers.retentionpolicyassignments;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetRetentionPolicyAssignmentsHeaders {

  public Map<String, String> extraHeaders;

  public GetRetentionPolicyAssignmentsHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetRetentionPolicyAssignmentsHeaders(
      GetRetentionPolicyAssignmentsHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetRetentionPolicyAssignmentsHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetRetentionPolicyAssignmentsHeadersBuilder extraHeaders(
        Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetRetentionPolicyAssignmentsHeaders build() {
      return new GetRetentionPolicyAssignmentsHeaders(this);
    }
  }
}
