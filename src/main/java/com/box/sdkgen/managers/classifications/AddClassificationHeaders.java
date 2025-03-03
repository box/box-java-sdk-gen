package com.box.sdkgen.managers.classifications;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class AddClassificationHeaders {

  public Map<String, String> extraHeaders;

  public AddClassificationHeaders() {
    this.extraHeaders = mapOf();
  }

  protected AddClassificationHeaders(AddClassificationHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class AddClassificationHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public AddClassificationHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public AddClassificationHeaders build() {
      return new AddClassificationHeaders(this);
    }
  }
}
