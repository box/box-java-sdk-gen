package com.box.sdkgen.schemas.retentionpolicy;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.box.sdkgen.serialization.json.Valuable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum RetentionPolicyPolicyTypeField implements Valuable {
  FINITE("finite"),
  INDEFINITE("indefinite");

  private final String value;

  RetentionPolicyPolicyTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class RetentionPolicyPolicyTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<RetentionPolicyPolicyTypeField>> {

    public RetentionPolicyPolicyTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<RetentionPolicyPolicyTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(RetentionPolicyPolicyTypeField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<RetentionPolicyPolicyTypeField>(value, v))
          .orElse(new EnumWrapper<RetentionPolicyPolicyTypeField>(value));
    }
  }

  public static class RetentionPolicyPolicyTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<RetentionPolicyPolicyTypeField>> {

    public RetentionPolicyPolicyTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<RetentionPolicyPolicyTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
