package com.box.sdkgen.schemas.shieldinformationbarrier;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum ShieldInformationBarrierTypeField {
  SHIELD_INFORMATION_BARRIER("shield_information_barrier");

  private final String value;

  ShieldInformationBarrierTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class ShieldInformationBarrierTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<ShieldInformationBarrierTypeField>> {

    public ShieldInformationBarrierTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<ShieldInformationBarrierTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(ShieldInformationBarrierTypeField.values())
          .filter(v -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(v -> new EnumWrapper<ShieldInformationBarrierTypeField>(value, v))
          .orElse(new EnumWrapper<ShieldInformationBarrierTypeField>(value));
    }
  }

  public static class ShieldInformationBarrierTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<ShieldInformationBarrierTypeField>> {

    public ShieldInformationBarrierTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<ShieldInformationBarrierTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
