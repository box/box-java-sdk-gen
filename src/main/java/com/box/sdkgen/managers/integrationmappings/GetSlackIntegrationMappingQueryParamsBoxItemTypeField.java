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

public enum GetSlackIntegrationMappingQueryParamsBoxItemTypeField {
  FOLDER("folder");

  private final String value;

  GetSlackIntegrationMappingQueryParamsBoxItemTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class GetSlackIntegrationMappingQueryParamsBoxItemTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField>> {

    public GetSlackIntegrationMappingQueryParamsBoxItemTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(GetSlackIntegrationMappingQueryParamsBoxItemTypeField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(
              (v) ->
                  new EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField>(value, v))
          .orElse(new EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField>(value));
    }
  }

  public static class GetSlackIntegrationMappingQueryParamsBoxItemTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField>> {

    public GetSlackIntegrationMappingQueryParamsBoxItemTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<GetSlackIntegrationMappingQueryParamsBoxItemTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
