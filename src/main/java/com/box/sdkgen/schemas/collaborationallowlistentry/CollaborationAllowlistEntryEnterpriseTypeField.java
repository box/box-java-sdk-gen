package com.box.sdkgen.schemas.collaborationallowlistentry;

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
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CollaborationAllowlistEntryEnterpriseTypeField {
  ENTERPRISE("enterprise");

  private final String value;

  CollaborationAllowlistEntryEnterpriseTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CollaborationAllowlistEntryEnterpriseTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<CollaborationAllowlistEntryEnterpriseTypeField>> {

    public CollaborationAllowlistEntryEnterpriseTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CollaborationAllowlistEntryEnterpriseTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CollaborationAllowlistEntryEnterpriseTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<CollaborationAllowlistEntryEnterpriseTypeField>(value, v)).orElse(new EnumWrapper<CollaborationAllowlistEntryEnterpriseTypeField>(value));
    }

  }

  public static class CollaborationAllowlistEntryEnterpriseTypeFieldSerializer extends JsonSerializer<EnumWrapper<CollaborationAllowlistEntryEnterpriseTypeField>> {

    public CollaborationAllowlistEntryEnterpriseTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<CollaborationAllowlistEntryEnterpriseTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
