package com.box.sdkgen.schemas.collaboratorvariable;

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
import java.util.List;

public enum CollaboratorVariableTypeField {
  VARIABLE("variable");

  private final String value;

  CollaboratorVariableTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CollaboratorVariableTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<CollaboratorVariableTypeField>> {

    public CollaboratorVariableTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CollaboratorVariableTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CollaboratorVariableTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<CollaboratorVariableTypeField>(value, v)).orElse(new EnumWrapper<CollaboratorVariableTypeField>(value));
    }

  }

  public static class CollaboratorVariableTypeFieldSerializer extends JsonSerializer<EnumWrapper<CollaboratorVariableTypeField>> {

    public CollaboratorVariableTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<CollaboratorVariableTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
