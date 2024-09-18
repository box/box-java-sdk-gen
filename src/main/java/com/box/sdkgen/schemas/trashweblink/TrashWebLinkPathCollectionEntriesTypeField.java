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

public enum TrashWebLinkPathCollectionEntriesTypeField {
  FOLDER("folder");

  private final String value;

  TrashWebLinkPathCollectionEntriesTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class TrashWebLinkPathCollectionEntriesTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<TrashWebLinkPathCollectionEntriesTypeField>> {

    public TrashWebLinkPathCollectionEntriesTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<TrashWebLinkPathCollectionEntriesTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(TrashWebLinkPathCollectionEntriesTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<TrashWebLinkPathCollectionEntriesTypeField>(value, v)).orElse(new EnumWrapper<TrashWebLinkPathCollectionEntriesTypeField>(value));
    }

  }

  public static class TrashWebLinkPathCollectionEntriesTypeFieldSerializer extends JsonSerializer<EnumWrapper<TrashWebLinkPathCollectionEntriesTypeField>> {

    public TrashWebLinkPathCollectionEntriesTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<TrashWebLinkPathCollectionEntriesTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
