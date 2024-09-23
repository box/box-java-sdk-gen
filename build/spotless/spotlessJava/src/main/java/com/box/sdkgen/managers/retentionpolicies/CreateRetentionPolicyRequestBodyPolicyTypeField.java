package com.box.sdkgen.managers.retentionpolicies;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum CreateRetentionPolicyRequestBodyPolicyTypeField {
  FINITE("finite"),
  INDEFINITE("indefinite");

  private final String value;

  CreateRetentionPolicyRequestBodyPolicyTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CreateRetentionPolicyRequestBodyPolicyTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<CreateRetentionPolicyRequestBodyPolicyTypeField>> {

    public CreateRetentionPolicyRequestBodyPolicyTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CreateRetentionPolicyRequestBodyPolicyTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CreateRetentionPolicyRequestBodyPolicyTypeField.values())
          .filter(v -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(v -> new EnumWrapper<CreateRetentionPolicyRequestBodyPolicyTypeField>(value, v))
          .orElse(new EnumWrapper<CreateRetentionPolicyRequestBodyPolicyTypeField>(value));
    }
  }

  public static class CreateRetentionPolicyRequestBodyPolicyTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<CreateRetentionPolicyRequestBodyPolicyTypeField>> {

    public CreateRetentionPolicyRequestBodyPolicyTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<CreateRetentionPolicyRequestBodyPolicyTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
