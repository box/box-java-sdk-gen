package com.box.sdkgen.schemas.uploadsession;

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

public enum UploadSessionTypeField {
  UPLOAD_SESSION("upload_session");

  private final String value;

  UploadSessionTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class UploadSessionTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<UploadSessionTypeField>> {

    public UploadSessionTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<UploadSessionTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(UploadSessionTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<UploadSessionTypeField>(value, v)).orElse(new EnumWrapper<UploadSessionTypeField>(value));
    }

  }

  public static class UploadSessionTypeFieldSerializer extends JsonSerializer<EnumWrapper<UploadSessionTypeField>> {

    public UploadSessionTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<UploadSessionTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
