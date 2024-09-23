package com.box.sdkgen.schemas.workflow;

import com.box.sdkgen.schemas.userbase.UserBase;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import java.util.Objects;

public class WorkflowFlowsField {

  protected String id;

  @JsonDeserialize(using = WorkflowFlowsTypeField.WorkflowFlowsTypeFieldDeserializer.class)
  @JsonSerialize(using = WorkflowFlowsTypeField.WorkflowFlowsTypeFieldSerializer.class)
  protected EnumWrapper<WorkflowFlowsTypeField> type;

  protected WorkflowFlowsTriggerField trigger;

  protected List<WorkflowFlowsOutcomesField> outcomes;

  @JsonProperty("created_at")
  protected String createdAt;

  @JsonProperty("created_by")
  protected UserBase createdBy;

  public WorkflowFlowsField() {}

  protected WorkflowFlowsField(WorkflowFlowsFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
    this.trigger = builder.trigger;
    this.outcomes = builder.outcomes;
    this.createdAt = builder.createdAt;
    this.createdBy = builder.createdBy;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<WorkflowFlowsTypeField> getType() {
    return type;
  }

  public WorkflowFlowsTriggerField getTrigger() {
    return trigger;
  }

  public List<WorkflowFlowsOutcomesField> getOutcomes() {
    return outcomes;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public UserBase getCreatedBy() {
    return createdBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowFlowsField casted = (WorkflowFlowsField) o;
    return Objects.equals(id, casted.id)
        && Objects.equals(type, casted.type)
        && Objects.equals(trigger, casted.trigger)
        && Objects.equals(outcomes, casted.outcomes)
        && Objects.equals(createdAt, casted.createdAt)
        && Objects.equals(createdBy, casted.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, trigger, outcomes, createdAt, createdBy);
  }

  @Override
  public String toString() {
    return "WorkflowFlowsField{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + ", "
        + "trigger='"
        + trigger
        + '\''
        + ", "
        + "outcomes='"
        + outcomes
        + '\''
        + ", "
        + "createdAt='"
        + createdAt
        + '\''
        + ", "
        + "createdBy='"
        + createdBy
        + '\''
        + "}";
  }

  public static class WorkflowFlowsFieldBuilder {

    protected String id;

    protected EnumWrapper<WorkflowFlowsTypeField> type;

    protected WorkflowFlowsTriggerField trigger;

    protected List<WorkflowFlowsOutcomesField> outcomes;

    protected String createdAt;

    protected UserBase createdBy;

    public WorkflowFlowsFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public WorkflowFlowsFieldBuilder type(WorkflowFlowsTypeField type) {
      this.type = new EnumWrapper<WorkflowFlowsTypeField>(type.getValue(), type);
      return this;
    }

    public WorkflowFlowsFieldBuilder trigger(WorkflowFlowsTriggerField trigger) {
      this.trigger = trigger;
      return this;
    }

    public WorkflowFlowsFieldBuilder outcomes(List<WorkflowFlowsOutcomesField> outcomes) {
      this.outcomes = outcomes;
      return this;
    }

    public WorkflowFlowsFieldBuilder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public WorkflowFlowsFieldBuilder createdBy(UserBase createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    public WorkflowFlowsField build() {
      return new WorkflowFlowsField(this);
    }
  }
}
