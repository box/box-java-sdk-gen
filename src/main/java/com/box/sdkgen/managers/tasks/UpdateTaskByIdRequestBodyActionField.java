package com.box.sdkgen.managers.tasks;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum UpdateTaskByIdRequestBodyActionField {
  REVIEW("review"),
  COMPLETE("complete");

  private final String value;

  UpdateTaskByIdRequestBodyActionField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class UpdateTaskByIdRequestBodyActionFieldDeserializer
      extends JsonDeserializer<EnumWrapper<UpdateTaskByIdRequestBodyActionField>> {

    public UpdateTaskByIdRequestBodyActionFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<UpdateTaskByIdRequestBodyActionField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(UpdateTaskByIdRequestBodyActionField.values())
          .filter(v -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(v -> new EnumWrapper<UpdateTaskByIdRequestBodyActionField>(value, v))
          .orElse(new EnumWrapper<UpdateTaskByIdRequestBodyActionField>(value));
    }
  }

  public static class UpdateTaskByIdRequestBodyActionFieldSerializer
      extends JsonSerializer<EnumWrapper<UpdateTaskByIdRequestBodyActionField>> {

    public UpdateTaskByIdRequestBodyActionFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<UpdateTaskByIdRequestBodyActionField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
