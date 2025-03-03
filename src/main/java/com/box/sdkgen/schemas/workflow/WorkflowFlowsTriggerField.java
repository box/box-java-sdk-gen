package com.box.sdkgen.schemas.workflow;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import java.util.Objects;

public class WorkflowFlowsTriggerField extends SerializableObject {

  @JsonDeserialize(
      using = WorkflowFlowsTriggerTypeField.WorkflowFlowsTriggerTypeFieldDeserializer.class)
  @JsonSerialize(
      using = WorkflowFlowsTriggerTypeField.WorkflowFlowsTriggerTypeFieldSerializer.class)
  protected EnumWrapper<WorkflowFlowsTriggerTypeField> type;

  @JsonDeserialize(
      using =
          WorkflowFlowsTriggerTriggerTypeField.WorkflowFlowsTriggerTriggerTypeFieldDeserializer
              .class)
  @JsonSerialize(
      using =
          WorkflowFlowsTriggerTriggerTypeField.WorkflowFlowsTriggerTriggerTypeFieldSerializer.class)
  @JsonProperty("trigger_type")
  protected EnumWrapper<WorkflowFlowsTriggerTriggerTypeField> triggerType;

  protected List<WorkflowFlowsTriggerScopeField> scope;

  public WorkflowFlowsTriggerField() {
    super();
  }

  protected WorkflowFlowsTriggerField(WorkflowFlowsTriggerFieldBuilder builder) {
    super();
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
    return Objects.equals(type, casted.type)
        && Objects.equals(triggerType, casted.triggerType)
        && Objects.equals(scope, casted.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, triggerType, scope);
  }

  @Override
  public String toString() {
    return "WorkflowFlowsTriggerField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "triggerType='"
        + triggerType
        + '\''
        + ", "
        + "scope='"
        + scope
        + '\''
        + "}";
  }

  public static class WorkflowFlowsTriggerFieldBuilder {

    protected EnumWrapper<WorkflowFlowsTriggerTypeField> type;

    protected EnumWrapper<WorkflowFlowsTriggerTriggerTypeField> triggerType;

    protected List<WorkflowFlowsTriggerScopeField> scope;

    public WorkflowFlowsTriggerFieldBuilder type(WorkflowFlowsTriggerTypeField type) {
      this.type = new EnumWrapper<WorkflowFlowsTriggerTypeField>(type);
      return this;
    }

    public WorkflowFlowsTriggerFieldBuilder type(EnumWrapper<WorkflowFlowsTriggerTypeField> type) {
      this.type = type;
      return this;
    }

    public WorkflowFlowsTriggerFieldBuilder triggerType(
        WorkflowFlowsTriggerTriggerTypeField triggerType) {
      this.triggerType = new EnumWrapper<WorkflowFlowsTriggerTriggerTypeField>(triggerType);
      return this;
    }

    public WorkflowFlowsTriggerFieldBuilder triggerType(
        EnumWrapper<WorkflowFlowsTriggerTriggerTypeField> triggerType) {
      this.triggerType = triggerType;
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
