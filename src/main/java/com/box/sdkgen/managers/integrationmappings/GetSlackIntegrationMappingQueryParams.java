package com.box.sdkgen.managers.integrationmappings;

import com.box.sdkgen.serialization.json.EnumWrapper;

public class GetSlackIntegrationMappingQueryParams {

  public String marker;

  public Long limit;

  public EnumWrapper<GetSlackIntegrationMappingQueryParamsPartnerItemTypeField> partnerItemType;

  public String partnerItemId;

  public String boxItemId;

  public EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField> boxItemType;

  public Boolean isManuallyCreated;

  public GetSlackIntegrationMappingQueryParams() {}

  protected GetSlackIntegrationMappingQueryParams(
      GetSlackIntegrationMappingQueryParamsBuilder builder) {
    this.marker = builder.marker;
    this.limit = builder.limit;
    this.partnerItemType = builder.partnerItemType;
    this.partnerItemId = builder.partnerItemId;
    this.boxItemId = builder.boxItemId;
    this.boxItemType = builder.boxItemType;
    this.isManuallyCreated = builder.isManuallyCreated;
  }

  public String getMarker() {
    return marker;
  }

  public Long getLimit() {
    return limit;
  }

  public EnumWrapper<GetSlackIntegrationMappingQueryParamsPartnerItemTypeField>
      getPartnerItemType() {
    return partnerItemType;
  }

  public String getPartnerItemId() {
    return partnerItemId;
  }

  public String getBoxItemId() {
    return boxItemId;
  }

  public EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField> getBoxItemType() {
    return boxItemType;
  }

  public Boolean getIsManuallyCreated() {
    return isManuallyCreated;
  }

  public static class GetSlackIntegrationMappingQueryParamsBuilder {

    protected String marker;

    protected Long limit;

    protected EnumWrapper<GetSlackIntegrationMappingQueryParamsPartnerItemTypeField>
        partnerItemType;

    protected String partnerItemId;

    protected String boxItemId;

    protected EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField> boxItemType;

    protected Boolean isManuallyCreated;

    public GetSlackIntegrationMappingQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetSlackIntegrationMappingQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetSlackIntegrationMappingQueryParamsBuilder partnerItemType(
        GetSlackIntegrationMappingQueryParamsPartnerItemTypeField partnerItemType) {
      this.partnerItemType =
          new EnumWrapper<GetSlackIntegrationMappingQueryParamsPartnerItemTypeField>(
              partnerItemType);
      return this;
    }

    public GetSlackIntegrationMappingQueryParamsBuilder partnerItemType(
        EnumWrapper<GetSlackIntegrationMappingQueryParamsPartnerItemTypeField> partnerItemType) {
      this.partnerItemType = partnerItemType;
      return this;
    }

    public GetSlackIntegrationMappingQueryParamsBuilder partnerItemId(String partnerItemId) {
      this.partnerItemId = partnerItemId;
      return this;
    }

    public GetSlackIntegrationMappingQueryParamsBuilder boxItemId(String boxItemId) {
      this.boxItemId = boxItemId;
      return this;
    }

    public GetSlackIntegrationMappingQueryParamsBuilder boxItemType(
        GetSlackIntegrationMappingQueryParamsBoxItemTypeField boxItemType) {
      this.boxItemType =
          new EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField>(boxItemType);
      return this;
    }

    public GetSlackIntegrationMappingQueryParamsBuilder boxItemType(
        EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField> boxItemType) {
      this.boxItemType = boxItemType;
      return this;
    }

    public GetSlackIntegrationMappingQueryParamsBuilder isManuallyCreated(
        Boolean isManuallyCreated) {
      this.isManuallyCreated = isManuallyCreated;
      return this;
    }

    public GetSlackIntegrationMappingQueryParams build() {
      return new GetSlackIntegrationMappingQueryParams(this);
    }
  }
}
