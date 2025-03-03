package com.box.sdkgen.managers.filewatermarks;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class UpdateFileWatermarkHeaders {

  public Map<String, String> extraHeaders;

  public UpdateFileWatermarkHeaders() {
    this.extraHeaders = mapOf();
  }

  protected UpdateFileWatermarkHeaders(UpdateFileWatermarkHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class UpdateFileWatermarkHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public UpdateFileWatermarkHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public UpdateFileWatermarkHeaders build() {
      return new UpdateFileWatermarkHeaders(this);
    }
  }
}
