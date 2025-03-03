package com.box.sdkgen.managers.folderlocks;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class DeleteFolderLockByIdHeaders {

  public Map<String, String> extraHeaders;

  public DeleteFolderLockByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected DeleteFolderLockByIdHeaders(DeleteFolderLockByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class DeleteFolderLockByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public DeleteFolderLockByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public DeleteFolderLockByIdHeaders build() {
      return new DeleteFolderLockByIdHeaders(this);
    }
  }
}
