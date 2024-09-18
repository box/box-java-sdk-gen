package com.box.sdkgen.schemas.zipdownload;

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

public enum ZipDownloadNameConflictsTypeField {
  FILE("file"),
  FOLDER("folder");

  private final String value;

  ZipDownloadNameConflictsTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class ZipDownloadNameConflictsTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<ZipDownloadNameConflictsTypeField>> {

    public ZipDownloadNameConflictsTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<ZipDownloadNameConflictsTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(ZipDownloadNameConflictsTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<ZipDownloadNameConflictsTypeField>(value, v)).orElse(new EnumWrapper<ZipDownloadNameConflictsTypeField>(value));
    }

  }

  public static class ZipDownloadNameConflictsTypeFieldSerializer extends JsonSerializer<EnumWrapper<ZipDownloadNameConflictsTypeField>> {

    public ZipDownloadNameConflictsTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<ZipDownloadNameConflictsTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
