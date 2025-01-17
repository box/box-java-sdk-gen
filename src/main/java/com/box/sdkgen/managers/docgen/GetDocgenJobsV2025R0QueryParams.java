package com.box.sdkgen.managers.docgen;

public class GetDocgenJobsV2025R0QueryParams {

  public String marker;

  public Long limit;

  public GetDocgenJobsV2025R0QueryParams() {}

  protected GetDocgenJobsV2025R0QueryParams(GetDocgenJobsV2025R0QueryParamsBuilder builder) {
    this.marker = builder.marker;
    this.limit = builder.limit;
  }

  public String getMarker() {
    return marker;
  }

  public Long getLimit() {
    return limit;
  }

  public static class GetDocgenJobsV2025R0QueryParamsBuilder {

    protected String marker;

    protected Long limit;

    public GetDocgenJobsV2025R0QueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetDocgenJobsV2025R0QueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetDocgenJobsV2025R0QueryParams build() {
      return new GetDocgenJobsV2025R0QueryParams(this);
    }
  }
}
