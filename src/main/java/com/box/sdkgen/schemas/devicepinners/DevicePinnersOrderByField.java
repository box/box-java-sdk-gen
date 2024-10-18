package com.box.sdkgen.schemas.devicepinners;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum DevicePinnersOrderByField {
  ID("id");

  private final String value;

  DevicePinnersOrderByField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class DevicePinnersOrderByFieldDeserializer
      extends JsonDeserializer<EnumWrapper<DevicePinnersOrderByField>> {

    public DevicePinnersOrderByFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<DevicePinnersOrderByField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(DevicePinnersOrderByField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<DevicePinnersOrderByField>(value, v))
          .orElse(new EnumWrapper<DevicePinnersOrderByField>(value));
    }
  }

  public static class DevicePinnersOrderByFieldSerializer
      extends JsonSerializer<EnumWrapper<DevicePinnersOrderByField>> {

    public DevicePinnersOrderByFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<DevicePinnersOrderByField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
