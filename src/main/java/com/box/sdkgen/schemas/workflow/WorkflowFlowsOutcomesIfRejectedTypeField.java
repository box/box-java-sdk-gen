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

public enum WorkflowFlowsOutcomesIfRejectedTypeField {
  OUTCOME("outcome");

  private final String value;

  WorkflowFlowsOutcomesIfRejectedTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class WorkflowFlowsOutcomesIfRejectedTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<WorkflowFlowsOutcomesIfRejectedTypeField>> {

    public WorkflowFlowsOutcomesIfRejectedTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<WorkflowFlowsOutcomesIfRejectedTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(WorkflowFlowsOutcomesIfRejectedTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<WorkflowFlowsOutcomesIfRejectedTypeField>(value, v)).orElse(new EnumWrapper<WorkflowFlowsOutcomesIfRejectedTypeField>(value));
    }

  }

  public static class WorkflowFlowsOutcomesIfRejectedTypeFieldSerializer extends JsonSerializer<EnumWrapper<WorkflowFlowsOutcomesIfRejectedTypeField>> {

    public WorkflowFlowsOutcomesIfRejectedTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<WorkflowFlowsOutcomesIfRejectedTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
