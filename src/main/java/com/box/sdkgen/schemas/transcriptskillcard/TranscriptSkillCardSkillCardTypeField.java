package com.box.sdkgen.schemas.transcriptskillcard;

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

public enum TranscriptSkillCardSkillCardTypeField {
  TRANSCRIPT("transcript");

  private final String value;

  TranscriptSkillCardSkillCardTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class TranscriptSkillCardSkillCardTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<TranscriptSkillCardSkillCardTypeField>> {

    public TranscriptSkillCardSkillCardTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<TranscriptSkillCardSkillCardTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(TranscriptSkillCardSkillCardTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<TranscriptSkillCardSkillCardTypeField>(value, v)).orElse(new EnumWrapper<TranscriptSkillCardSkillCardTypeField>(value));
    }

  }

  public static class TranscriptSkillCardSkillCardTypeFieldSerializer extends JsonSerializer<EnumWrapper<TranscriptSkillCardSkillCardTypeField>> {

    public TranscriptSkillCardSkillCardTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<TranscriptSkillCardSkillCardTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
