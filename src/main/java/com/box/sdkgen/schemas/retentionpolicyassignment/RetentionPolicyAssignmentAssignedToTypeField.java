package com.box.sdkgen.schemas.retentionpolicyassignment;

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
import com.box.sdkgen.schemas.retentionpolicymini.RetentionPolicyMini;
import com.box.sdkgen.schemas.usermini.UserMini;

public enum RetentionPolicyAssignmentAssignedToTypeField {
  FOLDER("folder"),
  ENTERPRISE("enterprise"),
  METADATA_TEMPLATE("metadata_template");

  private final String value;

  RetentionPolicyAssignmentAssignedToTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class RetentionPolicyAssignmentAssignedToTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<RetentionPolicyAssignmentAssignedToTypeField>> {

    public RetentionPolicyAssignmentAssignedToTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<RetentionPolicyAssignmentAssignedToTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(RetentionPolicyAssignmentAssignedToTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<RetentionPolicyAssignmentAssignedToTypeField>(value, v)).orElse(new EnumWrapper<RetentionPolicyAssignmentAssignedToTypeField>(value));
    }

  }

  public static class RetentionPolicyAssignmentAssignedToTypeFieldSerializer extends JsonSerializer<EnumWrapper<RetentionPolicyAssignmentAssignedToTypeField>> {

    public RetentionPolicyAssignmentAssignedToTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<RetentionPolicyAssignmentAssignedToTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
