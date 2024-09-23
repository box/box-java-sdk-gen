package com.box.sdkgen.schemas.workflow;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class WorkflowFlowsTriggerScopeObjectField {

  @JsonDeserialize(
      using =
          WorkflowFlowsTriggerScopeObjectTypeField
              .WorkflowFlowsTriggerScopeObjectTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          WorkflowFlowsTriggerScopeObjectTypeField
              .WorkflowFlowsTriggerScopeObjectTypeFieldSerializer.class)
  protected EnumWrapper<WorkflowFlowsTriggerScopeObjectTypeField> type;

  protected String id;

  public WorkflowFlowsTriggerScopeObjectField() {}

  protected WorkflowFlowsTriggerScopeObjectField(
      WorkflowFlowsTriggerScopeObjectFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<WorkflowFlowsTriggerScopeObjectTypeField> getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowFlowsTriggerScopeObjectField casted = (WorkflowFlowsTriggerScopeObjectField) o;
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "WorkflowFlowsTriggerScopeObjectField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + "}";
  }

  public static class WorkflowFlowsTriggerScopeObjectFieldBuilder {

    protected EnumWrapper<WorkflowFlowsTriggerScopeObjectTypeField> type;

    protected String id;

    public WorkflowFlowsTriggerScopeObjectFieldBuilder type(
        WorkflowFlowsTriggerScopeObjectTypeField type) {
      this.type = new EnumWrapper<WorkflowFlowsTriggerScopeObjectTypeField>(type.getValue(), type);
      return this;
    }

    public WorkflowFlowsTriggerScopeObjectFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public WorkflowFlowsTriggerScopeObjectField build() {
      return new WorkflowFlowsTriggerScopeObjectField(this);
    }
  }
}
