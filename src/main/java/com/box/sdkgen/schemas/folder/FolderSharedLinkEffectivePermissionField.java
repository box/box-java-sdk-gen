package com.box.sdkgen.schemas.folder;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum FolderSharedLinkEffectivePermissionField {
  CAN_EDIT("can_edit"),
  CAN_DOWNLOAD("can_download"),
  CAN_PREVIEW("can_preview"),
  NO_ACCESS("no_access");

  private final String value;

  FolderSharedLinkEffectivePermissionField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class FolderSharedLinkEffectivePermissionFieldDeserializer
      extends JsonDeserializer<EnumWrapper<FolderSharedLinkEffectivePermissionField>> {

    public FolderSharedLinkEffectivePermissionFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<FolderSharedLinkEffectivePermissionField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(FolderSharedLinkEffectivePermissionField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<FolderSharedLinkEffectivePermissionField>(value, v))
          .orElse(new EnumWrapper<FolderSharedLinkEffectivePermissionField>(value));
    }
  }

  public static class FolderSharedLinkEffectivePermissionFieldSerializer
      extends JsonSerializer<EnumWrapper<FolderSharedLinkEffectivePermissionField>> {

    public FolderSharedLinkEffectivePermissionFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<FolderSharedLinkEffectivePermissionField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
