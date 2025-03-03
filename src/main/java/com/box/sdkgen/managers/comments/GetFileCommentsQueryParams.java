package com.box.sdkgen.managers.comments;

import java.util.List;

public class GetFileCommentsQueryParams {

  public List<String> fields;

  public Long limit;

  public Long offset;

  public GetFileCommentsQueryParams() {}

  protected GetFileCommentsQueryParams(GetFileCommentsQueryParamsBuilder builder) {
    this.fields = builder.fields;
    this.limit = builder.limit;
    this.offset = builder.offset;
  }

  public List<String> getFields() {
    return fields;
  }

  public Long getLimit() {
    return limit;
  }

  public Long getOffset() {
    return offset;
  }

  public static class GetFileCommentsQueryParamsBuilder {

    protected List<String> fields;

    protected Long limit;

    protected Long offset;

    public GetFileCommentsQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public GetFileCommentsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetFileCommentsQueryParamsBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public GetFileCommentsQueryParams build() {
      return new GetFileCommentsQueryParams(this);
    }
  }
}
