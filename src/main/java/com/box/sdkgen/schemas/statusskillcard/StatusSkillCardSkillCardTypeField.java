package com.box.sdkgen.schemas.statusskillcard;

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

public enum StatusSkillCardSkillCardTypeField {
  STATUS("status");

  private final String value;

  StatusSkillCardSkillCardTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class StatusSkillCardSkillCardTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<StatusSkillCardSkillCardTypeField>> {

    public StatusSkillCardSkillCardTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<StatusSkillCardSkillCardTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(StatusSkillCardSkillCardTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<StatusSkillCardSkillCardTypeField>(value, v)).orElse(new EnumWrapper<StatusSkillCardSkillCardTypeField>(value));
    }

  }

  public static class StatusSkillCardSkillCardTypeFieldSerializer extends JsonSerializer<EnumWrapper<StatusSkillCardSkillCardTypeField>> {

    public StatusSkillCardSkillCardTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<StatusSkillCardSkillCardTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
