package com.box.sdkgen.managers.integrationmappings;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.integrationmappings.IntegrationMappings;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.integrationmapping.IntegrationMapping;
import com.box.sdkgen.schemas.integrationmappingslackcreaterequest.IntegrationMappingSlackCreateRequest;
import com.box.sdkgen.schemas.integrationmappingboxitemslack.IntegrationMappingBoxItemSlack;
import com.box.sdkgen.schemas.integrationmappingslackoptions.IntegrationMappingSlackOptions;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;

public class GetSlackIntegrationMappingQueryParams {

  public String marker;

  public Long limit;

  public EnumWrapper<GetSlackIntegrationMappingQueryParamsPartnerItemTypeField> partnerItemType;

  public String partnerItemId;

  public String boxItemId;

  public EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField> boxItemType;

  public Boolean isManuallyCreated;

  public GetSlackIntegrationMappingQueryParams() {
  }

  protected GetSlackIntegrationMappingQueryParams(GetSlackIntegrationMappingQueryParamsBuilder builder) {
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

  public EnumWrapper<GetSlackIntegrationMappingQueryParamsPartnerItemTypeField> getPartnerItemType() {
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

    protected EnumWrapper<GetSlackIntegrationMappingQueryParamsPartnerItemTypeField> partnerItemType;

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

    public GetSlackIntegrationMappingQueryParamsBuilder partnerItemType(GetSlackIntegrationMappingQueryParamsPartnerItemTypeField partnerItemType) {
      this.partnerItemType = new EnumWrapper<GetSlackIntegrationMappingQueryParamsPartnerItemTypeField>(partnerItemType.getValue(), partnerItemType);
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

    public GetSlackIntegrationMappingQueryParamsBuilder boxItemType(GetSlackIntegrationMappingQueryParamsBoxItemTypeField boxItemType) {
      this.boxItemType = new EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField>(boxItemType.getValue(), boxItemType);
      return this;
    }

    public GetSlackIntegrationMappingQueryParamsBuilder isManuallyCreated(Boolean isManuallyCreated) {
      this.isManuallyCreated = isManuallyCreated;
      return this;
    }

    public GetSlackIntegrationMappingQueryParams build() {
      return new GetSlackIntegrationMappingQueryParams(this);
    }

  }

}
