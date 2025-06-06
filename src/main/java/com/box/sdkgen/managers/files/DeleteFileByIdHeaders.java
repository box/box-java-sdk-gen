package com.box.sdkgen.managers.files;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class DeleteFileByIdHeaders {

  public String ifMatch;

  public Map<String, String> extraHeaders;

  public DeleteFileByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected DeleteFileByIdHeaders(DeleteFileByIdHeadersBuilder builder) {
    this.ifMatch = builder.ifMatch;
    this.extraHeaders = builder.extraHeaders;
  }

  public String getIfMatch() {
    return ifMatch;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class DeleteFileByIdHeadersBuilder {

    protected String ifMatch;

    protected Map<String, String> extraHeaders;

    public DeleteFileByIdHeadersBuilder() {
      this.extraHeaders = mapOf();
    }

    public DeleteFileByIdHeadersBuilder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    public DeleteFileByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public DeleteFileByIdHeaders build() {
      return new DeleteFileByIdHeaders(this);
    }
  }
}
