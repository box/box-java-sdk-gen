package com.box.sdkgen.schemas.file;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum FileSharedLinkEffectivePermissionField {
  CAN_EDIT("can_edit"),
  CAN_DOWNLOAD("can_download"),
  CAN_PREVIEW("can_preview"),
  NO_ACCESS("no_access");

  private final String value;

  FileSharedLinkEffectivePermissionField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class FileSharedLinkEffectivePermissionFieldDeserializer
      extends JsonDeserializer<EnumWrapper<FileSharedLinkEffectivePermissionField>> {

    public FileSharedLinkEffectivePermissionFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<FileSharedLinkEffectivePermissionField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(FileSharedLinkEffectivePermissionField.values())
          .filter(v -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(v -> new EnumWrapper<FileSharedLinkEffectivePermissionField>(value, v))
          .orElse(new EnumWrapper<FileSharedLinkEffectivePermissionField>(value));
    }
  }

  public static class FileSharedLinkEffectivePermissionFieldSerializer
      extends JsonSerializer<EnumWrapper<FileSharedLinkEffectivePermissionField>> {

    public FileSharedLinkEffectivePermissionFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<FileSharedLinkEffectivePermissionField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
