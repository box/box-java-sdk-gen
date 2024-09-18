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

public enum CollaboratorVariableVariableTypeField {
  USER_LIST("user_list");

  private final String value;

  CollaboratorVariableVariableTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CollaboratorVariableVariableTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<CollaboratorVariableVariableTypeField>> {

    public CollaboratorVariableVariableTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CollaboratorVariableVariableTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CollaboratorVariableVariableTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<CollaboratorVariableVariableTypeField>(value, v)).orElse(new EnumWrapper<CollaboratorVariableVariableTypeField>(value));
    }

  }

  public static class CollaboratorVariableVariableTypeFieldSerializer extends JsonSerializer<EnumWrapper<CollaboratorVariableVariableTypeField>> {

    public CollaboratorVariableVariableTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<CollaboratorVariableVariableTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
