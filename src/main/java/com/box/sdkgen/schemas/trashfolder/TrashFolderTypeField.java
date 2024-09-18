package com.box.sdkgen.schemas.trashfolder;

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
import java.util.List;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.foldermini.FolderMini;

public enum TrashFolderTypeField {
  FOLDER("folder");

  private final String value;

  TrashFolderTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class TrashFolderTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<TrashFolderTypeField>> {

    public TrashFolderTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<TrashFolderTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(TrashFolderTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<TrashFolderTypeField>(value, v)).orElse(new EnumWrapper<TrashFolderTypeField>(value));
    }

  }

  public static class TrashFolderTypeFieldSerializer extends JsonSerializer<EnumWrapper<TrashFolderTypeField>> {

    public TrashFolderTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<TrashFolderTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
