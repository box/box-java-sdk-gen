package com.box.sdkgen.schemas.uploadparts;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.uploadpart.UploadPart;

public enum UploadPartsOrderDirectionField {
  ASC("ASC"),
  DESC("DESC");

  private final String value;

  UploadPartsOrderDirectionField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class UploadPartsOrderDirectionFieldDeserializer extends JsonDeserializer<EnumWrapper<UploadPartsOrderDirectionField>> {

    public UploadPartsOrderDirectionFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<UploadPartsOrderDirectionField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(UploadPartsOrderDirectionField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<UploadPartsOrderDirectionField>(value, v)).orElse(new EnumWrapper<UploadPartsOrderDirectionField>(value));
    }

  }

  public static class UploadPartsOrderDirectionFieldSerializer extends JsonSerializer<EnumWrapper<UploadPartsOrderDirectionField>> {

    public UploadPartsOrderDirectionFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<UploadPartsOrderDirectionField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
