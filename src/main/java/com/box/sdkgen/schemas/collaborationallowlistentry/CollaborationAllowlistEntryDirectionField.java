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

public enum CollaborationAllowlistEntryDirectionField {
  INBOUND("inbound"),
  OUTBOUND("outbound"),
  BOTH("both");

  private final String value;

  CollaborationAllowlistEntryDirectionField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CollaborationAllowlistEntryDirectionFieldDeserializer extends JsonDeserializer<EnumWrapper<CollaborationAllowlistEntryDirectionField>> {

    public CollaborationAllowlistEntryDirectionFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CollaborationAllowlistEntryDirectionField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CollaborationAllowlistEntryDirectionField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<CollaborationAllowlistEntryDirectionField>(value, v)).orElse(new EnumWrapper<CollaborationAllowlistEntryDirectionField>(value));
    }

  }

  public static class CollaborationAllowlistEntryDirectionFieldSerializer extends JsonSerializer<EnumWrapper<CollaborationAllowlistEntryDirectionField>> {

    public CollaborationAllowlistEntryDirectionFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<CollaborationAllowlistEntryDirectionField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
