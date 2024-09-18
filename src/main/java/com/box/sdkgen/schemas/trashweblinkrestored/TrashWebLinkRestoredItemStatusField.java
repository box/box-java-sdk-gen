package com.box.sdkgen.schemas.trashweblinkrestored;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.usermini.UserMini;

public enum TrashWebLinkRestoredItemStatusField {
  ACTIVE("active"),
  TRASHED("trashed"),
  DELETED("deleted");

  private final String value;

  TrashWebLinkRestoredItemStatusField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class TrashWebLinkRestoredItemStatusFieldDeserializer extends JsonDeserializer<EnumWrapper<TrashWebLinkRestoredItemStatusField>> {

    public TrashWebLinkRestoredItemStatusFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<TrashWebLinkRestoredItemStatusField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(TrashWebLinkRestoredItemStatusField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<TrashWebLinkRestoredItemStatusField>(value, v)).orElse(new EnumWrapper<TrashWebLinkRestoredItemStatusField>(value));
    }

  }

  public static class TrashWebLinkRestoredItemStatusFieldSerializer extends JsonSerializer<EnumWrapper<TrashWebLinkRestoredItemStatusField>> {

    public TrashWebLinkRestoredItemStatusFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<TrashWebLinkRestoredItemStatusField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
