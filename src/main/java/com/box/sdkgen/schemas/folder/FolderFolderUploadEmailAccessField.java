package com.box.sdkgen.schemas.folder;

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
import com.box.sdkgen.schemas.folderbase.FolderBaseTypeField;
import com.box.sdkgen.schemas.folderbase.FolderBase;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.items.Items;

public enum FolderFolderUploadEmailAccessField {
  OPEN("open"),
  COLLABORATORS("collaborators");

  private final String value;

  FolderFolderUploadEmailAccessField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class FolderFolderUploadEmailAccessFieldDeserializer extends JsonDeserializer<EnumWrapper<FolderFolderUploadEmailAccessField>> {

    public FolderFolderUploadEmailAccessFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<FolderFolderUploadEmailAccessField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(FolderFolderUploadEmailAccessField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<FolderFolderUploadEmailAccessField>(value, v)).orElse(new EnumWrapper<FolderFolderUploadEmailAccessField>(value));
    }

  }

  public static class FolderFolderUploadEmailAccessFieldSerializer extends JsonSerializer<EnumWrapper<FolderFolderUploadEmailAccessField>> {

    public FolderFolderUploadEmailAccessFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<FolderFolderUploadEmailAccessField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
