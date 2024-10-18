package com.box.sdkgen.managers.workflows;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum StartWorkflowRequestBodyFilesTypeField {
  FILE("file");

  private final String value;

  StartWorkflowRequestBodyFilesTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class StartWorkflowRequestBodyFilesTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<StartWorkflowRequestBodyFilesTypeField>> {

    public StartWorkflowRequestBodyFilesTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<StartWorkflowRequestBodyFilesTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(StartWorkflowRequestBodyFilesTypeField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<StartWorkflowRequestBodyFilesTypeField>(value, v))
          .orElse(new EnumWrapper<StartWorkflowRequestBodyFilesTypeField>(value));
    }
  }

  public static class StartWorkflowRequestBodyFilesTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<StartWorkflowRequestBodyFilesTypeField>> {

    public StartWorkflowRequestBodyFilesTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<StartWorkflowRequestBodyFilesTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
