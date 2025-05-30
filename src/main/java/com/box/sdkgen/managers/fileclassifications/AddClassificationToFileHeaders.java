package com.box.sdkgen.managers.fileclassifications;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class AddClassificationToFileHeaders {

  public Map<String, String> extraHeaders;

  public AddClassificationToFileHeaders() {
    this.extraHeaders = mapOf();
  }

  protected AddClassificationToFileHeaders(AddClassificationToFileHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class AddClassificationToFileHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public AddClassificationToFileHeadersBuilder() {
      this.extraHeaders = mapOf();
    }

    public AddClassificationToFileHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public AddClassificationToFileHeaders build() {
      return new AddClassificationToFileHeaders(this);
    }
  }
}
