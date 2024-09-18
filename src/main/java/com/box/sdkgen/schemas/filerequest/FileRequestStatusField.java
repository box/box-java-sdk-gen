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

public enum FileRequestStatusField {
  ACTIVE("active"),
  INACTIVE("inactive");

  private final String value;

  FileRequestStatusField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class FileRequestStatusFieldDeserializer extends JsonDeserializer<EnumWrapper<FileRequestStatusField>> {

    public FileRequestStatusFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<FileRequestStatusField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(FileRequestStatusField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<FileRequestStatusField>(value, v)).orElse(new EnumWrapper<FileRequestStatusField>(value));
    }

  }

  public static class FileRequestStatusFieldSerializer extends JsonSerializer<EnumWrapper<FileRequestStatusField>> {

    public FileRequestStatusFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<FileRequestStatusField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
