package com.box.sdkgen.schemas.trashweblink;

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
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.usermini.UserMini;

public enum TrashWebLinkItemStatusField {
  ACTIVE("active"),
  TRASHED("trashed"),
  DELETED("deleted");

  private final String value;

  TrashWebLinkItemStatusField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class TrashWebLinkItemStatusFieldDeserializer extends JsonDeserializer<EnumWrapper<TrashWebLinkItemStatusField>> {

    public TrashWebLinkItemStatusFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<TrashWebLinkItemStatusField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(TrashWebLinkItemStatusField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<TrashWebLinkItemStatusField>(value, v)).orElse(new EnumWrapper<TrashWebLinkItemStatusField>(value));
    }

  }

  public static class TrashWebLinkItemStatusFieldSerializer extends JsonSerializer<EnumWrapper<TrashWebLinkItemStatusField>> {

    public TrashWebLinkItemStatusFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<TrashWebLinkItemStatusField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
