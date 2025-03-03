package com.box.sdkgen.managers.listcollaborations;

import java.util.List;

public class GetFolderCollaborationsQueryParams {

  public List<String> fields;

  public Long limit;

  public String marker;

  public GetFolderCollaborationsQueryParams() {}

  protected GetFolderCollaborationsQueryParams(GetFolderCollaborationsQueryParamsBuilder builder) {
    this.fields = builder.fields;
    this.limit = builder.limit;
    this.marker = builder.marker;
  }

  public List<String> getFields() {
    return fields;
  }

  public Long getLimit() {
    return limit;
  }

  public String getMarker() {
    return marker;
  }

  public static class GetFolderCollaborationsQueryParamsBuilder {

    protected List<String> fields;

    protected Long limit;

    protected String marker;

    public GetFolderCollaborationsQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public GetFolderCollaborationsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetFolderCollaborationsQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetFolderCollaborationsQueryParams build() {
      return new GetFolderCollaborationsQueryParams(this);
    }
  }
}
