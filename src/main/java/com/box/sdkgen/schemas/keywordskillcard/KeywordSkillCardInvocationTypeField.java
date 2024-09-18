package com.box.sdkgen.schemas.keywordskillcard;

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
import java.util.List;

public enum KeywordSkillCardInvocationTypeField {
  SKILL_INVOCATION("skill_invocation");

  private final String value;

  KeywordSkillCardInvocationTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class KeywordSkillCardInvocationTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<KeywordSkillCardInvocationTypeField>> {

    public KeywordSkillCardInvocationTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<KeywordSkillCardInvocationTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(KeywordSkillCardInvocationTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<KeywordSkillCardInvocationTypeField>(value, v)).orElse(new EnumWrapper<KeywordSkillCardInvocationTypeField>(value));
    }

  }

  public static class KeywordSkillCardInvocationTypeFieldSerializer extends JsonSerializer<EnumWrapper<KeywordSkillCardInvocationTypeField>> {

    public KeywordSkillCardInvocationTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<KeywordSkillCardInvocationTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
