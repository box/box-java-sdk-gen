package com.box.sdkgen.managers.folders;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetFolderByIdHeaders {

  public String ifNoneMatch;

  public String boxapi;

  public Map<String, String> extraHeaders;

  public GetFolderByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetFolderByIdHeaders(GetFolderByIdHeadersBuilder builder) {
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

  public static class GetFolderByIdHeadersBuilder {

    protected String ifNoneMatch;

    protected String boxapi;

    protected Map<String, String> extraHeaders;

    public GetFolderByIdHeadersBuilder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }

    public GetFolderByIdHeadersBuilder boxapi(String boxapi) {
      this.boxapi = boxapi;
      return this;
    }

    public GetFolderByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetFolderByIdHeaders build() {
      return new GetFolderByIdHeaders(this);
    }
  }
}
