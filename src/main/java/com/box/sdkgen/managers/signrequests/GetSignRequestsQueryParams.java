package com.box.sdkgen.managers.signrequests;

public class GetSignRequestsQueryParams {

  public String marker;

  public Long limit;

  public GetSignRequestsQueryParams() {}

  protected GetSignRequestsQueryParams(GetSignRequestsQueryParamsBuilder builder) {
    this.marker = builder.marker;
    this.limit = builder.limit;
  }

  public String getMarker() {
    return marker;
  }

  public Long getLimit() {
    return limit;
  }

  public static class GetSignRequestsQueryParamsBuilder {

    protected String marker;

    protected Long limit;

    public GetSignRequestsQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetSignRequestsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetSignRequestsQueryParams build() {
      return new GetSignRequestsQueryParams(this);
    }
  }
}
