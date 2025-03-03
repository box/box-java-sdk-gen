package com.box.sdkgen.managers.comments;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class DeleteCommentByIdHeaders {

  public Map<String, String> extraHeaders;

  public DeleteCommentByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected DeleteCommentByIdHeaders(DeleteCommentByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class DeleteCommentByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public DeleteCommentByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public DeleteCommentByIdHeaders build() {
      return new DeleteCommentByIdHeaders(this);
    }
  }
}
