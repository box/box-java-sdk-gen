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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.enterprisebase.EnterpriseBase;
import com.box.sdkgen.schemas.userbase.UserBase;

public enum ShieldInformationBarrierStatusField {
  DRAFT("draft"),
  PENDING("pending"),
  DISABLED("disabled"),
  ENABLED("enabled"),
  INVALID("invalid");

  private final String value;

  ShieldInformationBarrierStatusField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class ShieldInformationBarrierStatusFieldDeserializer extends JsonDeserializer<EnumWrapper<ShieldInformationBarrierStatusField>> {

    public ShieldInformationBarrierStatusFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<ShieldInformationBarrierStatusField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(ShieldInformationBarrierStatusField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<ShieldInformationBarrierStatusField>(value, v)).orElse(new EnumWrapper<ShieldInformationBarrierStatusField>(value));
    }

  }

  public static class ShieldInformationBarrierStatusFieldSerializer extends JsonSerializer<EnumWrapper<ShieldInformationBarrierStatusField>> {

    public ShieldInformationBarrierStatusFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<ShieldInformationBarrierStatusField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
