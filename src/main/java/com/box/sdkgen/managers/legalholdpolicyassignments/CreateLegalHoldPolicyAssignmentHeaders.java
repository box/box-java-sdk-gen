package com.box.sdkgen.managers.legalholdpolicyassignments;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class CreateLegalHoldPolicyAssignmentHeaders {

  public Map<String, String> extraHeaders;

  public CreateLegalHoldPolicyAssignmentHeaders() {
    this.extraHeaders = mapOf();
  }

  protected CreateLegalHoldPolicyAssignmentHeaders(
      CreateLegalHoldPolicyAssignmentHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class CreateLegalHoldPolicyAssignmentHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public CreateLegalHoldPolicyAssignmentHeadersBuilder extraHeaders(
        Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public CreateLegalHoldPolicyAssignmentHeaders build() {
      return new CreateLegalHoldPolicyAssignmentHeaders(this);
    }
  }
}
