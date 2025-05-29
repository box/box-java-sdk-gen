package com.box.sdkgen.managers.workflows;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetWorkflowsHeaders {

  public Map<String, String> extraHeaders;

  public GetWorkflowsHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetWorkflowsHeaders(GetWorkflowsHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetWorkflowsHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetWorkflowsHeadersBuilder() {
      this.extraHeaders = mapOf();
    }

    public GetWorkflowsHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetWorkflowsHeaders build() {
      return new GetWorkflowsHeaders(this);
    }
  }
}
