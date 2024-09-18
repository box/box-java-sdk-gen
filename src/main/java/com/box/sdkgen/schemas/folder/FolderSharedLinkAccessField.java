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

public enum FolderSharedLinkAccessField {
  OPEN("open"),
  COMPANY("company"),
  COLLABORATORS("collaborators");

  private final String value;

  FolderSharedLinkAccessField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class FolderSharedLinkAccessFieldDeserializer extends JsonDeserializer<EnumWrapper<FolderSharedLinkAccessField>> {

    public FolderSharedLinkAccessFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<FolderSharedLinkAccessField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(FolderSharedLinkAccessField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<FolderSharedLinkAccessField>(value, v)).orElse(new EnumWrapper<FolderSharedLinkAccessField>(value));
    }

  }

  public static class FolderSharedLinkAccessFieldSerializer extends JsonSerializer<EnumWrapper<FolderSharedLinkAccessField>> {

    public FolderSharedLinkAccessFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<FolderSharedLinkAccessField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
