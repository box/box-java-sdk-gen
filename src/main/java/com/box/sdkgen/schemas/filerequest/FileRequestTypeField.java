package com.box.sdkgen.schemas.filerequest;

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
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.usermini.UserMini;

public enum FileRequestTypeField {
  FILE_REQUEST("file_request");

  private final String value;

  FileRequestTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class FileRequestTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<FileRequestTypeField>> {

    public FileRequestTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<FileRequestTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(FileRequestTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<FileRequestTypeField>(value, v)).orElse(new EnumWrapper<FileRequestTypeField>(value));
    }

  }

  public static class FileRequestTypeFieldSerializer extends JsonSerializer<EnumWrapper<FileRequestTypeField>> {

    public FileRequestTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<FileRequestTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
