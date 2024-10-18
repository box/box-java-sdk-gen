package com.box.sdkgen.schemas.aitextgen;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum AiTextGenItemsTypeField {
  FILE("file");

  private final String value;

  AiTextGenItemsTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class AiTextGenItemsTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<AiTextGenItemsTypeField>> {

    public AiTextGenItemsTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<AiTextGenItemsTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(AiTextGenItemsTypeField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<AiTextGenItemsTypeField>(value, v))
          .orElse(new EnumWrapper<AiTextGenItemsTypeField>(value));
    }
  }

  public static class AiTextGenItemsTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<AiTextGenItemsTypeField>> {

    public AiTextGenItemsTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<AiTextGenItemsTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
