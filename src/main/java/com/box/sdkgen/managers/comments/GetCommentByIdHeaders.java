package com.box.sdkgen.managers.comments;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetCommentByIdHeaders {

  public Map<String, String> extraHeaders;

  public GetCommentByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetCommentByIdHeaders(GetCommentByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetCommentByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetCommentByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetCommentByIdHeaders build() {
      return new GetCommentByIdHeaders(this);
    }
  }
}
