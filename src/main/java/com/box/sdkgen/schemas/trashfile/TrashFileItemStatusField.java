package com.box.sdkgen.schemas.trashfile;

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
import com.box.sdkgen.schemas.fileversionmini.FileVersionMini;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.foldermini.FolderMini;

public enum TrashFileItemStatusField {
  ACTIVE("active"),
  TRASHED("trashed"),
  DELETED("deleted");

  private final String value;

  TrashFileItemStatusField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class TrashFileItemStatusFieldDeserializer extends JsonDeserializer<EnumWrapper<TrashFileItemStatusField>> {

    public TrashFileItemStatusFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<TrashFileItemStatusField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(TrashFileItemStatusField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<TrashFileItemStatusField>(value, v)).orElse(new EnumWrapper<TrashFileItemStatusField>(value));
    }

  }

  public static class TrashFileItemStatusFieldSerializer extends JsonSerializer<EnumWrapper<TrashFileItemStatusField>> {

    public TrashFileItemStatusFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<TrashFileItemStatusField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
