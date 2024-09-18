package com.box.sdkgen.schemas.aiitembase;

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

public enum AiItemBaseTypeField {
  FILE("file");

  private final String value;

  AiItemBaseTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class AiItemBaseTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<AiItemBaseTypeField>> {

    public AiItemBaseTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<AiItemBaseTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(AiItemBaseTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<AiItemBaseTypeField>(value, v)).orElse(new EnumWrapper<AiItemBaseTypeField>(value));
    }

  }

  public static class AiItemBaseTypeFieldSerializer extends JsonSerializer<EnumWrapper<AiItemBaseTypeField>> {

    public AiItemBaseTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<AiItemBaseTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
