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

public class WorkflowFlowsTriggerField {

  @JsonDeserialize(using = WorkflowFlowsTriggerTypeField.WorkflowFlowsTriggerTypeFieldDeserializer.class)
  @JsonSerialize(using = WorkflowFlowsTriggerTypeField.WorkflowFlowsTriggerTypeFieldSerializer.class)
  protected EnumWrapper<WorkflowFlowsTriggerTypeField> type;

  @JsonDeserialize(using = WorkflowFlowsTriggerTriggerTypeField.WorkflowFlowsTriggerTriggerTypeFieldDeserializer.class)
  @JsonSerialize(using = WorkflowFlowsTriggerTriggerTypeField.WorkflowFlowsTriggerTriggerTypeFieldSerializer.class)
  @JsonProperty("trigger_type")
  protected EnumWrapper<WorkflowFlowsTriggerTriggerTypeField> triggerType;

  protected List<WorkflowFlowsTriggerScopeField> scope;

  public WorkflowFlowsTriggerField() {
  }

  protected WorkflowFlowsTriggerField(WorkflowFlowsTriggerFieldBuilder builder) {
    this.type = builder.type;
    this.triggerType = builder.triggerType;
    this.scope = builder.scope;
  }

  public EnumWrapper<WorkflowFlowsTriggerTypeField> getType() {
    return type;
  }

  public EnumWrapper<WorkflowFlowsTriggerTriggerTypeField> getTriggerType() {
    return triggerType;
  }

  public List<WorkflowFlowsTriggerScopeField> getScope() {
    return scope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowFlowsTriggerField casted = (WorkflowFlowsTriggerField) o;
    return Objects.equals(type, casted.type) &&
      Objects.equals(triggerType, casted.triggerType) &&
      Objects.equals(scope, casted.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, triggerType, scope
    );
  }

  @Override
  public String toString() {
    return "WorkflowFlowsTriggerField{" + "type='" + type + '\'' + ", " + "triggerType='" + triggerType + '\'' + ", " + "scope='" + scope + '\'' + "}";
  }

  public static class WorkflowFlowsTriggerFieldBuilder {

    protected EnumWrapper<WorkflowFlowsTriggerTypeField> type;

    protected EnumWrapper<WorkflowFlowsTriggerTriggerTypeField> triggerType;

    protected List<WorkflowFlowsTriggerScopeField> scope;

    public WorkflowFlowsTriggerFieldBuilder type(WorkflowFlowsTriggerTypeField type) {
      this.type = new EnumWrapper<WorkflowFlowsTriggerTypeField>(type.getValue(), type);
      return this;
    }

    public WorkflowFlowsTriggerFieldBuilder triggerType(WorkflowFlowsTriggerTriggerTypeField triggerType) {
      this.triggerType = new EnumWrapper<WorkflowFlowsTriggerTriggerTypeField>(triggerType.getValue(), triggerType);
      return this;
    }

    public WorkflowFlowsTriggerFieldBuilder scope(List<WorkflowFlowsTriggerScopeField> scope) {
      this.scope = scope;
      return this;
    }

    public WorkflowFlowsTriggerField build() {
      return new WorkflowFlowsTriggerField(this);
    }

  }

}
