package com.box.sdkgen.managers.folders;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class UpdateFolderByIdHeaders {

  public String ifMatch;

  public Map<String, String> extraHeaders;

  public UpdateFolderByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected UpdateFolderByIdHeaders(UpdateFolderByIdHeadersBuilder builder) {
    this.ifMatch = builder.ifMatch;
    this.extraHeaders = builder.extraHeaders;
  }

  public String getIfMatch() {
    return ifMatch;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class UpdateFolderByIdHeadersBuilder {

    protected String ifMatch;

    protected Map<String, String> extraHeaders;

    public UpdateFolderByIdHeadersBuilder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    public UpdateFolderByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public UpdateFolderByIdHeaders build() {
      return new UpdateFolderByIdHeaders(this);
    }
  }
}
