package com.box.sdkgen.managers.zipdownloads;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetZipDownloadContentHeaders {

  public Map<String, String> extraHeaders;

  public GetZipDownloadContentHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetZipDownloadContentHeaders(GetZipDownloadContentHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetZipDownloadContentHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetZipDownloadContentHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetZipDownloadContentHeaders build() {
      return new GetZipDownloadContentHeaders(this);
    }
  }
}
