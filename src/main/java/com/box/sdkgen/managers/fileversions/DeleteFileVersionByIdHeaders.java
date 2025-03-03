package com.box.sdkgen.managers.fileversions;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class DeleteFileVersionByIdHeaders {

  public String ifMatch;

  public Map<String, String> extraHeaders;

  public DeleteFileVersionByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected DeleteFileVersionByIdHeaders(DeleteFileVersionByIdHeadersBuilder builder) {
    this.ifMatch = builder.ifMatch;
    this.extraHeaders = builder.extraHeaders;
  }

  public String getIfMatch() {
    return ifMatch;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class DeleteFileVersionByIdHeadersBuilder {

    protected String ifMatch;

    protected Map<String, String> extraHeaders;

    public DeleteFileVersionByIdHeadersBuilder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    public DeleteFileVersionByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public DeleteFileVersionByIdHeaders build() {
      return new DeleteFileVersionByIdHeaders(this);
    }
  }
}
