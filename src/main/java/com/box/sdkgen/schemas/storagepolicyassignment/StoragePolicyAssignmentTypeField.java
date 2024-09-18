package com.box.sdkgen.schemas.storagepolicyassignment;

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
import com.box.sdkgen.schemas.storagepolicymini.StoragePolicyMini;

public enum StoragePolicyAssignmentTypeField {
  STORAGE_POLICY_ASSIGNMENT("storage_policy_assignment");

  private final String value;

  StoragePolicyAssignmentTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class StoragePolicyAssignmentTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<StoragePolicyAssignmentTypeField>> {

    public StoragePolicyAssignmentTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<StoragePolicyAssignmentTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(StoragePolicyAssignmentTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<StoragePolicyAssignmentTypeField>(value, v)).orElse(new EnumWrapper<StoragePolicyAssignmentTypeField>(value));
    }

  }

  public static class StoragePolicyAssignmentTypeFieldSerializer extends JsonSerializer<EnumWrapper<StoragePolicyAssignmentTypeField>> {

    public StoragePolicyAssignmentTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<StoragePolicyAssignmentTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
