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

public enum GetSlackIntegrationMappingQueryParamsBoxItemTypeField {
  FOLDER("folder");

  private final String value;

  GetSlackIntegrationMappingQueryParamsBoxItemTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class GetSlackIntegrationMappingQueryParamsBoxItemTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField>> {

    public GetSlackIntegrationMappingQueryParamsBoxItemTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(GetSlackIntegrationMappingQueryParamsBoxItemTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField>(value, v)).orElse(new EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField>(value));
    }

  }

  public static class GetSlackIntegrationMappingQueryParamsBoxItemTypeFieldSerializer extends JsonSerializer<EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField>> {

    public GetSlackIntegrationMappingQueryParamsBoxItemTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
