package com.box.sdkgen.managers.listcollaborations;

import java.util.List;

public class GetFolderCollaborationsQueryParams {

  public List<String> fields;

  public GetFolderCollaborationsQueryParams() {}

  protected GetFolderCollaborationsQueryParams(GetFolderCollaborationsQueryParamsBuilder builder) {
    this.fields = builder.fields;
  }

  public List<String> getFields() {
    return fields;
  }

  public static class GetFolderCollaborationsQueryParamsBuilder {

    protected List<String> fields;

    public GetFolderCollaborationsQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public GetFolderCollaborationsQueryParams build() {
      return new GetFolderCollaborationsQueryParams(this);
    }
  }
}
