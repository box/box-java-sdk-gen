package com.box.sdkgen.managers.foldermetadata;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetFolderMetadataByIdHeaders {

  public Map<String, String> extraHeaders;

  public GetFolderMetadataByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetFolderMetadataByIdHeaders(GetFolderMetadataByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetFolderMetadataByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetFolderMetadataByIdHeadersBuilder() {
      this.extraHeaders = mapOf();
    }

    public GetFolderMetadataByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetFolderMetadataByIdHeaders build() {
      return new GetFolderMetadataByIdHeaders(this);
    }
  }
}
