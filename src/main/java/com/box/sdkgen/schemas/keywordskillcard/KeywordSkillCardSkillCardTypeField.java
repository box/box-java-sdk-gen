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

public enum KeywordSkillCardSkillCardTypeField {
  KEYWORD("keyword");

  private final String value;

  KeywordSkillCardSkillCardTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class KeywordSkillCardSkillCardTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<KeywordSkillCardSkillCardTypeField>> {

    public KeywordSkillCardSkillCardTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<KeywordSkillCardSkillCardTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(KeywordSkillCardSkillCardTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<KeywordSkillCardSkillCardTypeField>(value, v)).orElse(new EnumWrapper<KeywordSkillCardSkillCardTypeField>(value));
    }

  }

  public static class KeywordSkillCardSkillCardTypeFieldSerializer extends JsonSerializer<EnumWrapper<KeywordSkillCardSkillCardTypeField>> {

    public KeywordSkillCardSkillCardTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<KeywordSkillCardSkillCardTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
