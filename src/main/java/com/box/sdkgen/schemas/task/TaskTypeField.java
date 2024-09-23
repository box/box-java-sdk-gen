package com.box.sdkgen.schemas.task;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum TaskTypeField {
  TASK("task");

  private final String value;

  TaskTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class TaskTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<TaskTypeField>> {

    public TaskTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<TaskTypeField> deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(TaskTypeField.values())
          .filter(v -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(v -> new EnumWrapper<TaskTypeField>(value, v))
          .orElse(new EnumWrapper<TaskTypeField>(value));
    }
  }

  public static class TaskTypeFieldSerializer extends JsonSerializer<EnumWrapper<TaskTypeField>> {

    public TaskTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<TaskTypeField> value, JsonGenerator gen, SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
