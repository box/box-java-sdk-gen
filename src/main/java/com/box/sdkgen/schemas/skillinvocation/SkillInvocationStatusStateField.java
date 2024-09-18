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

public enum SkillInvocationStatusStateField {
  INVOKED("invoked"),
  PROCESSING("processing"),
  SUCCESS("success"),
  TRANSIENT_FAILURE("transient_failure"),
  PERMANENT_FAILURE("permanent_failure");

  private final String value;

  SkillInvocationStatusStateField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class SkillInvocationStatusStateFieldDeserializer extends JsonDeserializer<EnumWrapper<SkillInvocationStatusStateField>> {

    public SkillInvocationStatusStateFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<SkillInvocationStatusStateField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(SkillInvocationStatusStateField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<SkillInvocationStatusStateField>(value, v)).orElse(new EnumWrapper<SkillInvocationStatusStateField>(value));
    }

  }

  public static class SkillInvocationStatusStateFieldSerializer extends JsonSerializer<EnumWrapper<SkillInvocationStatusStateField>> {

    public SkillInvocationStatusStateFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<SkillInvocationStatusStateField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
