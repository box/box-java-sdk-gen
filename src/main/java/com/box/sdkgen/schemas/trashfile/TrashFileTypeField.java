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

public enum TrashFileTypeField {
  FILE("file");

  private final String value;

  TrashFileTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class TrashFileTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<TrashFileTypeField>> {

    public TrashFileTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<TrashFileTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(TrashFileTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<TrashFileTypeField>(value, v)).orElse(new EnumWrapper<TrashFileTypeField>(value));
    }

  }

  public static class TrashFileTypeFieldSerializer extends JsonSerializer<EnumWrapper<TrashFileTypeField>> {

    public TrashFileTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<TrashFileTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
