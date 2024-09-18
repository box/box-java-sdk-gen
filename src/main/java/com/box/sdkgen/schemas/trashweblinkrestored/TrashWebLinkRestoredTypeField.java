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

public enum TrashWebLinkRestoredTypeField {
  WEB_LINK("web_link");

  private final String value;

  TrashWebLinkRestoredTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class TrashWebLinkRestoredTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<TrashWebLinkRestoredTypeField>> {

    public TrashWebLinkRestoredTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<TrashWebLinkRestoredTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(TrashWebLinkRestoredTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<TrashWebLinkRestoredTypeField>(value, v)).orElse(new EnumWrapper<TrashWebLinkRestoredTypeField>(value));
    }

  }

  public static class TrashWebLinkRestoredTypeFieldSerializer extends JsonSerializer<EnumWrapper<TrashWebLinkRestoredTypeField>> {

    public TrashWebLinkRestoredTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<TrashWebLinkRestoredTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
