package com.box.sdkgen.managers.filemetadata;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetFileMetadataHeaders {

  public Map<String, String> extraHeaders;

  public GetFileMetadataHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetFileMetadataHeaders(GetFileMetadataHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetFileMetadataHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetFileMetadataHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetFileMetadataHeaders build() {
      return new GetFileMetadataHeaders(this);
    }
  }
}
