package com.box.sdkgen.schemas.file;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.filebase.FileBaseTypeField;
import com.box.sdkgen.schemas.filebase.FileBase;
import com.box.sdkgen.schemas.fileversionmini.FileVersionMini;
import com.box.sdkgen.schemas.filemini.FileMini;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.usermini.UserMini;

public enum FileSharedLinkAccessField {
  OPEN("open"),
  COMPANY("company"),
  COLLABORATORS("collaborators");

  private final String value;

  FileSharedLinkAccessField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class FileSharedLinkAccessFieldDeserializer extends JsonDeserializer<EnumWrapper<FileSharedLinkAccessField>> {

    public FileSharedLinkAccessFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<FileSharedLinkAccessField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(FileSharedLinkAccessField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<FileSharedLinkAccessField>(value, v)).orElse(new EnumWrapper<FileSharedLinkAccessField>(value));
    }

  }

  public static class FileSharedLinkAccessFieldSerializer extends JsonSerializer<EnumWrapper<FileSharedLinkAccessField>> {

    public FileSharedLinkAccessFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<FileSharedLinkAccessField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
