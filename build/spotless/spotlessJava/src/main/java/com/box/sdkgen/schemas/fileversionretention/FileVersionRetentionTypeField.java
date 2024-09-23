package com.box.sdkgen.schemas.fileversionretention;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum FileVersionRetentionTypeField {
  FILE_VERSION_RETENTION("file_version_retention");

  private final String value;

  FileVersionRetentionTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class FileVersionRetentionTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<FileVersionRetentionTypeField>> {

    public FileVersionRetentionTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<FileVersionRetentionTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(FileVersionRetentionTypeField.values())
          .filter(v -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(v -> new EnumWrapper<FileVersionRetentionTypeField>(value, v))
          .orElse(new EnumWrapper<FileVersionRetentionTypeField>(value));
    }
  }

  public static class FileVersionRetentionTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<FileVersionRetentionTypeField>> {

    public FileVersionRetentionTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<FileVersionRetentionTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
