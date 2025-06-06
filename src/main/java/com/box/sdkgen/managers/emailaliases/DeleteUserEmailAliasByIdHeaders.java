package com.box.sdkgen.managers.emailaliases;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class DeleteUserEmailAliasByIdHeaders {

  public Map<String, String> extraHeaders;

  public DeleteUserEmailAliasByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected DeleteUserEmailAliasByIdHeaders(DeleteUserEmailAliasByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class DeleteUserEmailAliasByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public DeleteUserEmailAliasByIdHeadersBuilder() {
      this.extraHeaders = mapOf();
    }

    public DeleteUserEmailAliasByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public DeleteUserEmailAliasByIdHeaders build() {
      return new DeleteUserEmailAliasByIdHeaders(this);
    }
  }
}
