package com.box.sdkgen.schemas.workflow;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.workflowmini.WorkflowMiniTypeField;
import com.box.sdkgen.schemas.workflowmini.WorkflowMini;
import com.box.sdkgen.schemas.userbase.UserBase;

public enum WorkflowFlowsTriggerTypeField {
  TRIGGER("trigger");

  private final String value;

  WorkflowFlowsTriggerTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class WorkflowFlowsTriggerTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<WorkflowFlowsTriggerTypeField>> {

    public WorkflowFlowsTriggerTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<WorkflowFlowsTriggerTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(WorkflowFlowsTriggerTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<WorkflowFlowsTriggerTypeField>(value, v)).orElse(new EnumWrapper<WorkflowFlowsTriggerTypeField>(value));
    }

  }

  public static class WorkflowFlowsTriggerTypeFieldSerializer extends JsonSerializer<EnumWrapper<WorkflowFlowsTriggerTypeField>> {

    public WorkflowFlowsTriggerTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<WorkflowFlowsTriggerTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
