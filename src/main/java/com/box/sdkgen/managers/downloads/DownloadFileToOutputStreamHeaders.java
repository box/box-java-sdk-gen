package com.box.sdkgen.managers.downloads;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class DownloadFileToOutputStreamHeaders {

  public String range;

  public String boxapi;

  public Map<String, String> extraHeaders;

  public DownloadFileToOutputStreamHeaders() {
    this.extraHeaders = mapOf();
  }

  protected DownloadFileToOutputStreamHeaders(DownloadFileToOutputStreamHeadersBuilder builder) {
    this.range = builder.range;
    this.boxapi = builder.boxapi;
    this.extraHeaders = builder.extraHeaders;
  }

  public String getRange() {
    return range;
  }

  public String getBoxapi() {
    return boxapi;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class DownloadFileToOutputStreamHeadersBuilder {

    protected String range;

    protected String boxapi;

    protected Map<String, String> extraHeaders;

    public DownloadFileToOutputStreamHeadersBuilder range(String range) {
      this.range = range;
      return this;
    }

    public DownloadFileToOutputStreamHeadersBuilder boxapi(String boxapi) {
      this.boxapi = boxapi;
      return this;
    }

    public DownloadFileToOutputStreamHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public DownloadFileToOutputStreamHeaders build() {
      return new DownloadFileToOutputStreamHeaders(this);
    }
  }
}
