package com.box.sdkgen.schemas.filerequestcopyrequest;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum FileRequestCopyRequestFolderTypeField {
  FOLDER("folder");

  private final String value;

  FileRequestCopyRequestFolderTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class FileRequestCopyRequestFolderTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<FileRequestCopyRequestFolderTypeField>> {

    public FileRequestCopyRequestFolderTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<FileRequestCopyRequestFolderTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(FileRequestCopyRequestFolderTypeField.values())
          .filter(v -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(v -> new EnumWrapper<FileRequestCopyRequestFolderTypeField>(value, v))
          .orElse(new EnumWrapper<FileRequestCopyRequestFolderTypeField>(value));
    }
  }

  public static class FileRequestCopyRequestFolderTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<FileRequestCopyRequestFolderTypeField>> {

    public FileRequestCopyRequestFolderTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<FileRequestCopyRequestFolderTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
