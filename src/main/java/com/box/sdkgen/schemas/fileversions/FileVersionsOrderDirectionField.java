package com.box.sdkgen.schemas.fileversions;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.fileversionfull.FileVersionFull;

public enum FileVersionsOrderDirectionField {
  ASC("ASC"),
  DESC("DESC");

  private final String value;

  FileVersionsOrderDirectionField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class FileVersionsOrderDirectionFieldDeserializer extends JsonDeserializer<EnumWrapper<FileVersionsOrderDirectionField>> {

    public FileVersionsOrderDirectionFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<FileVersionsOrderDirectionField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(FileVersionsOrderDirectionField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<FileVersionsOrderDirectionField>(value, v)).orElse(new EnumWrapper<FileVersionsOrderDirectionField>(value));
    }

  }

  public static class FileVersionsOrderDirectionFieldSerializer extends JsonSerializer<EnumWrapper<FileVersionsOrderDirectionField>> {

    public FileVersionsOrderDirectionFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<FileVersionsOrderDirectionField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
