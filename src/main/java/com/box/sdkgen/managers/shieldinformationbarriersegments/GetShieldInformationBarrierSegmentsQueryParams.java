package com.box.sdkgen.managers.shieldinformationbarriersegments;

public class GetShieldInformationBarrierSegmentsQueryParams {

  public final String shieldInformationBarrierId;

  public String marker;

  public Long limit;

  public GetShieldInformationBarrierSegmentsQueryParams(String shieldInformationBarrierId) {
    this.shieldInformationBarrierId = shieldInformationBarrierId;
  }

  protected GetShieldInformationBarrierSegmentsQueryParams(
      GetShieldInformationBarrierSegmentsQueryParamsBuilder builder) {
    this.shieldInformationBarrierId = builder.shieldInformationBarrierId;
    this.marker = builder.marker;
    this.limit = builder.limit;
  }

  public String getShieldInformationBarrierId() {
    return shieldInformationBarrierId;
  }

  public String getMarker() {
    return marker;
  }

  public Long getLimit() {
    return limit;
  }

  public static class GetShieldInformationBarrierSegmentsQueryParamsBuilder {

    protected final String shieldInformationBarrierId;

    protected String marker;

    protected Long limit;

    public GetShieldInformationBarrierSegmentsQueryParamsBuilder(
        String shieldInformationBarrierId) {
      this.shieldInformationBarrierId = shieldInformationBarrierId;
    }

    public GetShieldInformationBarrierSegmentsQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetShieldInformationBarrierSegmentsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetShieldInformationBarrierSegmentsQueryParams build() {
      return new GetShieldInformationBarrierSegmentsQueryParams(this);
    }
  }
}
