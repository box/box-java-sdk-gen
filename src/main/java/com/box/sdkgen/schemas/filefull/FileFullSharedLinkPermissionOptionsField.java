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

public enum FileFullSharedLinkPermissionOptionsField {
  CAN_PREVIEW("can_preview"),
  CAN_DOWNLOAD("can_download"),
  CAN_EDIT("can_edit");

  private final String value;

  FileFullSharedLinkPermissionOptionsField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class FileFullSharedLinkPermissionOptionsFieldDeserializer extends JsonDeserializer<EnumWrapper<FileFullSharedLinkPermissionOptionsField>> {

    public FileFullSharedLinkPermissionOptionsFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<FileFullSharedLinkPermissionOptionsField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(FileFullSharedLinkPermissionOptionsField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<FileFullSharedLinkPermissionOptionsField>(value, v)).orElse(new EnumWrapper<FileFullSharedLinkPermissionOptionsField>(value));
    }

  }

  public static class FileFullSharedLinkPermissionOptionsFieldSerializer extends JsonSerializer<EnumWrapper<FileFullSharedLinkPermissionOptionsField>> {

    public FileFullSharedLinkPermissionOptionsFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<FileFullSharedLinkPermissionOptionsField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
