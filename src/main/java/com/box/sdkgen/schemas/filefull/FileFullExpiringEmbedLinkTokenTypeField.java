package com.box.sdkgen.schemas.filefull;

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
import java.util.List;
import java.util.Map;
import com.box.sdkgen.schemas.filebase.FileBaseTypeField;
import com.box.sdkgen.schemas.filebase.FileBase;
import com.box.sdkgen.schemas.fileversionmini.FileVersionMini;
import com.box.sdkgen.schemas.filemini.FileMini;
import com.box.sdkgen.schemas.file.FilePathCollectionField;
import com.box.sdkgen.schemas.file.FileSharedLinkField;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.file.FileItemStatusField;
import com.box.sdkgen.schemas.file.File;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.fileorfolderscope.FileOrFolderScope;
import com.box.sdkgen.schemas.metadatafull.MetadataFull;

public enum FileFullExpiringEmbedLinkTokenTypeField {
  BEARER("bearer");

  private final String value;

  FileFullExpiringEmbedLinkTokenTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class FileFullExpiringEmbedLinkTokenTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<FileFullExpiringEmbedLinkTokenTypeField>> {

    public FileFullExpiringEmbedLinkTokenTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<FileFullExpiringEmbedLinkTokenTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(FileFullExpiringEmbedLinkTokenTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<FileFullExpiringEmbedLinkTokenTypeField>(value, v)).orElse(new EnumWrapper<FileFullExpiringEmbedLinkTokenTypeField>(value));
    }

  }

  public static class FileFullExpiringEmbedLinkTokenTypeFieldSerializer extends JsonSerializer<EnumWrapper<FileFullExpiringEmbedLinkTokenTypeField>> {

    public FileFullExpiringEmbedLinkTokenTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<FileFullExpiringEmbedLinkTokenTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
