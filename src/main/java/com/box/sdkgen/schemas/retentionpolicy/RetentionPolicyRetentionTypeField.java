package com.box.sdkgen.schemas.retentionpolicy;

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
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.retentionpolicybase.RetentionPolicyBaseTypeField;
import com.box.sdkgen.schemas.retentionpolicybase.RetentionPolicyBase;
import com.box.sdkgen.schemas.retentionpolicymini.RetentionPolicyMiniDispositionActionField;
import com.box.sdkgen.schemas.retentionpolicymini.RetentionPolicyMini;
import com.box.sdkgen.schemas.usermini.UserMini;

public enum RetentionPolicyRetentionTypeField {
  MODIFIABLE("modifiable"),
  NON_MODIFIABLE("non_modifiable");

  private final String value;

  RetentionPolicyRetentionTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class RetentionPolicyRetentionTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<RetentionPolicyRetentionTypeField>> {

    public RetentionPolicyRetentionTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<RetentionPolicyRetentionTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(RetentionPolicyRetentionTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<RetentionPolicyRetentionTypeField>(value, v)).orElse(new EnumWrapper<RetentionPolicyRetentionTypeField>(value));
    }

  }

  public static class RetentionPolicyRetentionTypeFieldSerializer extends JsonSerializer<EnumWrapper<RetentionPolicyRetentionTypeField>> {

    public RetentionPolicyRetentionTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<RetentionPolicyRetentionTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
