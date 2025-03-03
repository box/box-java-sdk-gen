package com.box.sdkgen.managers.listcollaborations;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetGroupCollaborationsHeaders {

  public Map<String, String> extraHeaders;

  public GetGroupCollaborationsHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetGroupCollaborationsHeaders(GetGroupCollaborationsHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetGroupCollaborationsHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetGroupCollaborationsHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetGroupCollaborationsHeaders build() {
      return new GetGroupCollaborationsHeaders(this);
    }
  }
}
