package com.box.sdkgen.managers.integrationmappings;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.box.sdkgen.serialization.json.Valuable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum GetIntegrationMappingTeamsQueryParamsBoxItemTypeField implements Valuable {
  FOLDER("folder");

  private final String value;

  GetIntegrationMappingTeamsQueryParamsBoxItemTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class GetIntegrationMappingTeamsQueryParamsBoxItemTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<GetIntegrationMappingTeamsQueryParamsBoxItemTypeField>> {

    public GetIntegrationMappingTeamsQueryParamsBoxItemTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<GetIntegrationMappingTeamsQueryParamsBoxItemTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(GetIntegrationMappingTeamsQueryParamsBoxItemTypeField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(EnumWrapper::new)
          .orElse(new EnumWrapper<GetIntegrationMappingTeamsQueryParamsBoxItemTypeField>(value));
    }
  }

  public static class GetIntegrationMappingTeamsQueryParamsBoxItemTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<GetIntegrationMappingTeamsQueryParamsBoxItemTypeField>> {

    public GetIntegrationMappingTeamsQueryParamsBoxItemTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<GetIntegrationMappingTeamsQueryParamsBoxItemTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
