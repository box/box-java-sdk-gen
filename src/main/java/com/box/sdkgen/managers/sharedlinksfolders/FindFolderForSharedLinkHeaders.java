package com.box.sdkgen.managers.sharedlinksfolders;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class FindFolderForSharedLinkHeaders {

  public String ifNoneMatch;

  public final String boxapi;

  public Map<String, String> extraHeaders;

  public FindFolderForSharedLinkHeaders(String boxapi) {
    this.boxapi = boxapi;
    this.extraHeaders = mapOf();
  }

  protected FindFolderForSharedLinkHeaders(FindFolderForSharedLinkHeadersBuilder builder) {
    this.ifNoneMatch = builder.ifNoneMatch;
    this.boxapi = builder.boxapi;
    this.extraHeaders = builder.extraHeaders;
  }

  public String getIfNoneMatch() {
    return ifNoneMatch;
  }

  public String getBoxapi() {
    return boxapi;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class FindFolderForSharedLinkHeadersBuilder {

    protected String ifNoneMatch;

    protected final String boxapi;

    protected Map<String, String> extraHeaders;

    public FindFolderForSharedLinkHeadersBuilder(String boxapi) {
      this.boxapi = boxapi;
      this.extraHeaders = mapOf();
    }

    public FindFolderForSharedLinkHeadersBuilder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }

    public FindFolderForSharedLinkHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public FindFolderForSharedLinkHeaders build() {
      return new FindFolderForSharedLinkHeaders(this);
    }
  }
}
