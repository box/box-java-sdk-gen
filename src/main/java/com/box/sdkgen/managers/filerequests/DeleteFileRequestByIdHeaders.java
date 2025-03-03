package com.box.sdkgen.managers.filerequests;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class DeleteFileRequestByIdHeaders {

  public Map<String, String> extraHeaders;

  public DeleteFileRequestByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected DeleteFileRequestByIdHeaders(DeleteFileRequestByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class DeleteFileRequestByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public DeleteFileRequestByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public DeleteFileRequestByIdHeaders build() {
      return new DeleteFileRequestByIdHeaders(this);
    }
  }
}
