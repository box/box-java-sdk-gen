package com.box.sdkgen.schemas.rolevariable;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public enum RoleVariableVariableTypeField {
  COLLABORATOR_ROLE("collaborator_role");

  private final String value;

  RoleVariableVariableTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class RoleVariableVariableTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<RoleVariableVariableTypeField>> {

    public RoleVariableVariableTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<RoleVariableVariableTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(RoleVariableVariableTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<RoleVariableVariableTypeField>(value, v)).orElse(new EnumWrapper<RoleVariableVariableTypeField>(value));
    }

  }

  public static class RoleVariableVariableTypeFieldSerializer extends JsonSerializer<EnumWrapper<RoleVariableVariableTypeField>> {

    public RoleVariableVariableTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<RoleVariableVariableTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
