package com.box.sdkgen.managers.groups;

import java.util.List;

public class GetGroupByIdQueryParams {

  public List<String> fields;

  public GetGroupByIdQueryParams() {}

  protected GetGroupByIdQueryParams(GetGroupByIdQueryParamsBuilder builder) {
    this.fields = builder.fields;
  }

  public List<String> getFields() {
    return fields;
  }

  public static class GetGroupByIdQueryParamsBuilder {

    protected List<String> fields;

    public GetGroupByIdQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public GetGroupByIdQueryParams build() {
      return new GetGroupByIdQueryParams(this);
    }
  }
}
