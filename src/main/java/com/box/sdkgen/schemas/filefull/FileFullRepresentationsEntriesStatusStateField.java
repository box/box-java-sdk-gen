package com.box.sdkgen.schemas.filefull;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum FileFullRepresentationsEntriesStatusStateField {
  SUCCESS("success"),
  VIEWABLE("viewable"),
  PENDING("pending"),
  NONE("none");

  private final String value;

  FileFullRepresentationsEntriesStatusStateField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class FileFullRepresentationsEntriesStatusStateFieldDeserializer
      extends JsonDeserializer<EnumWrapper<FileFullRepresentationsEntriesStatusStateField>> {

    public FileFullRepresentationsEntriesStatusStateFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<FileFullRepresentationsEntriesStatusStateField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(FileFullRepresentationsEntriesStatusStateField.values())
          .filter(v -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(v -> new EnumWrapper<FileFullRepresentationsEntriesStatusStateField>(value, v))
          .orElse(new EnumWrapper<FileFullRepresentationsEntriesStatusStateField>(value));
    }
  }

  public static class FileFullRepresentationsEntriesStatusStateFieldSerializer
      extends JsonSerializer<EnumWrapper<FileFullRepresentationsEntriesStatusStateField>> {

    public FileFullRepresentationsEntriesStatusStateFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<FileFullRepresentationsEntriesStatusStateField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
