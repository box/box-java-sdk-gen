package com.box.sdkgen.managers.users;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class CreateUserHeaders {

  public Map<String, String> extraHeaders;

  public CreateUserHeaders() {
    this.extraHeaders = mapOf();
  }

  protected CreateUserHeaders(CreateUserHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class CreateUserHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public CreateUserHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public CreateUserHeaders build() {
      return new CreateUserHeaders(this);
    }
  }
}
