package com.box.sdkgen.managers.storagepolicyassignments;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetStoragePolicyAssignmentByIdHeaders {

  public Map<String, String> extraHeaders;

  public GetStoragePolicyAssignmentByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetStoragePolicyAssignmentByIdHeaders(
      GetStoragePolicyAssignmentByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetStoragePolicyAssignmentByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetStoragePolicyAssignmentByIdHeadersBuilder extraHeaders(
        Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetStoragePolicyAssignmentByIdHeaders build() {
      return new GetStoragePolicyAssignmentByIdHeaders(this);
    }
  }
}
