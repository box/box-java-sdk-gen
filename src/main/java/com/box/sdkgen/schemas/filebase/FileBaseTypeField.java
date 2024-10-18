package com.box.sdkgen.schemas.filebase;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum FileBaseTypeField {
  FILE("file");

  private final String value;

  FileBaseTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class FileBaseTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<FileBaseTypeField>> {

    public FileBaseTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<FileBaseTypeField> deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(FileBaseTypeField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<FileBaseTypeField>(value, v))
          .orElse(new EnumWrapper<FileBaseTypeField>(value));
    }
  }

  public static class FileBaseTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<FileBaseTypeField>> {

    public FileBaseTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<FileBaseTypeField> value, JsonGenerator gen, SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
