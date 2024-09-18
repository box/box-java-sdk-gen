package com.box.sdkgen.schemas.skillinvocation;

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
import com.box.sdkgen.schemas.fileorfolder.FileOrFolder;
import com.box.sdkgen.schemas.event.Event;

public enum SkillInvocationSkillTypeField {
  SKILL("skill");

  private final String value;

  SkillInvocationSkillTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class SkillInvocationSkillTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<SkillInvocationSkillTypeField>> {

    public SkillInvocationSkillTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<SkillInvocationSkillTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(SkillInvocationSkillTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<SkillInvocationSkillTypeField>(value, v)).orElse(new EnumWrapper<SkillInvocationSkillTypeField>(value));
    }

  }

  public static class SkillInvocationSkillTypeFieldSerializer extends JsonSerializer<EnumWrapper<SkillInvocationSkillTypeField>> {

    public SkillInvocationSkillTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<SkillInvocationSkillTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
