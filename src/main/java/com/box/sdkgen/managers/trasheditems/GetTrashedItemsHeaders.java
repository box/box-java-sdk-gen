package com.box.sdkgen.managers.trasheditems;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetTrashedItemsHeaders {

  public Map<String, String> extraHeaders;

  public GetTrashedItemsHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetTrashedItemsHeaders(GetTrashedItemsHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetTrashedItemsHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetTrashedItemsHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetTrashedItemsHeaders build() {
      return new GetTrashedItemsHeaders(this);
    }
  }
}
