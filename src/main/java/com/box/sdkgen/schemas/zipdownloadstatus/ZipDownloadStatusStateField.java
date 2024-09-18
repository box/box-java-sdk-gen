package com.box.sdkgen.schemas.zipdownloadstatus;

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

public enum ZipDownloadStatusStateField {
  IN_PROGRESS("in_progress"),
  FAILED("failed"),
  SUCCEEDED("succeeded");

  private final String value;

  ZipDownloadStatusStateField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class ZipDownloadStatusStateFieldDeserializer extends JsonDeserializer<EnumWrapper<ZipDownloadStatusStateField>> {

    public ZipDownloadStatusStateFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<ZipDownloadStatusStateField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(ZipDownloadStatusStateField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<ZipDownloadStatusStateField>(value, v)).orElse(new EnumWrapper<ZipDownloadStatusStateField>(value));
    }

  }

  public static class ZipDownloadStatusStateFieldSerializer extends JsonSerializer<EnumWrapper<ZipDownloadStatusStateField>> {

    public ZipDownloadStatusStateFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<ZipDownloadStatusStateField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
