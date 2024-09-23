package com.box.sdkgen.schemas.zipdownloadrequest;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum ZipDownloadRequestItemsTypeField {
  FILE("file"),
  FOLDER("folder");

  private final String value;

  ZipDownloadRequestItemsTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class ZipDownloadRequestItemsTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<ZipDownloadRequestItemsTypeField>> {

    public ZipDownloadRequestItemsTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<ZipDownloadRequestItemsTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(ZipDownloadRequestItemsTypeField.values())
          .filter(v -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(v -> new EnumWrapper<ZipDownloadRequestItemsTypeField>(value, v))
          .orElse(new EnumWrapper<ZipDownloadRequestItemsTypeField>(value));
    }
  }

  public static class ZipDownloadRequestItemsTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<ZipDownloadRequestItemsTypeField>> {

    public ZipDownloadRequestItemsTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<ZipDownloadRequestItemsTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
