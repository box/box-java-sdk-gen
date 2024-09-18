package com.box.sdkgen.schemas.timelineskillcard;

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

public enum TimelineSkillCardSkillTypeField {
  SERVICE("service");

  private final String value;

  TimelineSkillCardSkillTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class TimelineSkillCardSkillTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<TimelineSkillCardSkillTypeField>> {

    public TimelineSkillCardSkillTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<TimelineSkillCardSkillTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(TimelineSkillCardSkillTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<TimelineSkillCardSkillTypeField>(value, v)).orElse(new EnumWrapper<TimelineSkillCardSkillTypeField>(value));
    }

  }

  public static class TimelineSkillCardSkillTypeFieldSerializer extends JsonSerializer<EnumWrapper<TimelineSkillCardSkillTypeField>> {

    public TimelineSkillCardSkillTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<TimelineSkillCardSkillTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
