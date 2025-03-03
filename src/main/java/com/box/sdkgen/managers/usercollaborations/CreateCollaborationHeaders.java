package com.box.sdkgen.managers.usercollaborations;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class CreateCollaborationHeaders {

  public Map<String, String> extraHeaders;

  public CreateCollaborationHeaders() {
    this.extraHeaders = mapOf();
  }

  protected CreateCollaborationHeaders(CreateCollaborationHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class CreateCollaborationHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public CreateCollaborationHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public CreateCollaborationHeaders build() {
      return new CreateCollaborationHeaders(this);
    }
  }
}
