package com.box.sdkgen.managers.folderwatermarks;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetFolderWatermarkHeaders {

  public Map<String, String> extraHeaders;

  public GetFolderWatermarkHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetFolderWatermarkHeaders(GetFolderWatermarkHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetFolderWatermarkHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetFolderWatermarkHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetFolderWatermarkHeaders build() {
      return new GetFolderWatermarkHeaders(this);
    }
  }
}
