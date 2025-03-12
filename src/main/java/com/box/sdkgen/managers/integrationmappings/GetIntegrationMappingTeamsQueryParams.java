package com.box.sdkgen.managers.integrationmappings;

import com.box.sdkgen.serialization.json.EnumWrapper;

public class GetIntegrationMappingTeamsQueryParams {

  public EnumWrapper<GetIntegrationMappingTeamsQueryParamsPartnerItemTypeField> partnerItemType;

  public String partnerItemId;

  public String boxItemId;

  public EnumWrapper<GetIntegrationMappingTeamsQueryParamsBoxItemTypeField> boxItemType;

  public GetIntegrationMappingTeamsQueryParams() {}

  protected GetIntegrationMappingTeamsQueryParams(
      GetIntegrationMappingTeamsQueryParamsBuilder builder) {
    this.partnerItemType = builder.partnerItemType;
    this.partnerItemId = builder.partnerItemId;
    this.boxItemId = builder.boxItemId;
    this.boxItemType = builder.boxItemType;
  }

  public EnumWrapper<GetIntegrationMappingTeamsQueryParamsPartnerItemTypeField>
      getPartnerItemType() {
    return partnerItemType;
  }

  public String getPartnerItemId() {
    return partnerItemId;
  }

  public String getBoxItemId() {
    return boxItemId;
  }

  public EnumWrapper<GetIntegrationMappingTeamsQueryParamsBoxItemTypeField> getBoxItemType() {
    return boxItemType;
  }

  public static class GetIntegrationMappingTeamsQueryParamsBuilder {

    protected EnumWrapper<GetIntegrationMappingTeamsQueryParamsPartnerItemTypeField>
        partnerItemType;

    protected String partnerItemId;

    protected String boxItemId;

    protected EnumWrapper<GetIntegrationMappingTeamsQueryParamsBoxItemTypeField> boxItemType;

    public GetIntegrationMappingTeamsQueryParamsBuilder partnerItemType(
        GetIntegrationMappingTeamsQueryParamsPartnerItemTypeField partnerItemType) {
      this.partnerItemType =
          new EnumWrapper<GetIntegrationMappingTeamsQueryParamsPartnerItemTypeField>(
              partnerItemType);
      return this;
    }

    public GetIntegrationMappingTeamsQueryParamsBuilder partnerItemType(
        EnumWrapper<GetIntegrationMappingTeamsQueryParamsPartnerItemTypeField> partnerItemType) {
      this.partnerItemType = partnerItemType;
      return this;
    }

    public GetIntegrationMappingTeamsQueryParamsBuilder partnerItemId(String partnerItemId) {
      this.partnerItemId = partnerItemId;
      return this;
    }

    public GetIntegrationMappingTeamsQueryParamsBuilder boxItemId(String boxItemId) {
      this.boxItemId = boxItemId;
      return this;
    }

    public GetIntegrationMappingTeamsQueryParamsBuilder boxItemType(
        GetIntegrationMappingTeamsQueryParamsBoxItemTypeField boxItemType) {
      this.boxItemType =
          new EnumWrapper<GetIntegrationMappingTeamsQueryParamsBoxItemTypeField>(boxItemType);
      return this;
    }

    public GetIntegrationMappingTeamsQueryParamsBuilder boxItemType(
        EnumWrapper<GetIntegrationMappingTeamsQueryParamsBoxItemTypeField> boxItemType) {
      this.boxItemType = boxItemType;
      return this;
    }

    public GetIntegrationMappingTeamsQueryParams build() {
      return new GetIntegrationMappingTeamsQueryParams(this);
    }
  }
}
