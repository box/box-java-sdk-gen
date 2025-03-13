package com.box.sdkgen.managers.sharedlinksappitems;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetSharedItemAppItemsHeaders {

  public final String boxapi;

  public Map<String, String> extraHeaders;

  public GetSharedItemAppItemsHeaders(String boxapi) {
    this.boxapi = boxapi;
    this.extraHeaders = mapOf();
  }

  protected GetSharedItemAppItemsHeaders(GetSharedItemAppItemsHeadersBuilder builder) {
    this.boxapi = builder.boxapi;
    this.extraHeaders = builder.extraHeaders;
  }

  public String getBoxapi() {
    return boxapi;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetSharedItemAppItemsHeadersBuilder {

    protected final String boxapi;

    protected Map<String, String> extraHeaders;

    public GetSharedItemAppItemsHeadersBuilder(String boxapi) {
      this.boxapi = boxapi;
      this.extraHeaders = mapOf();
    }

    public GetSharedItemAppItemsHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetSharedItemAppItemsHeaders build() {
      return new GetSharedItemAppItemsHeaders(this);
    }
  }
}
