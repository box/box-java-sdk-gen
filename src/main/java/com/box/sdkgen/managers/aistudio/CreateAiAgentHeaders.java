package com.box.sdkgen.managers.aistudio;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class CreateAiAgentHeaders {

  public Map<String, String> extraHeaders;

  public CreateAiAgentHeaders() {
    this.extraHeaders = mapOf();
  }

  protected CreateAiAgentHeaders(CreateAiAgentHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class CreateAiAgentHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public CreateAiAgentHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public CreateAiAgentHeaders build() {
      return new CreateAiAgentHeaders(this);
    }
  }
}
