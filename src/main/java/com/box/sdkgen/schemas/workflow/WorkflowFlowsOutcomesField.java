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

public class WorkflowFlowsOutcomesField {

  protected String id;

  @JsonDeserialize(using = WorkflowFlowsOutcomesTypeField.WorkflowFlowsOutcomesTypeFieldDeserializer.class)
  @JsonSerialize(using = WorkflowFlowsOutcomesTypeField.WorkflowFlowsOutcomesTypeFieldSerializer.class)
  protected EnumWrapper<WorkflowFlowsOutcomesTypeField> type;

  protected String name;

  @JsonDeserialize(using = WorkflowFlowsOutcomesActionTypeField.WorkflowFlowsOutcomesActionTypeFieldDeserializer.class)
  @JsonSerialize(using = WorkflowFlowsOutcomesActionTypeField.WorkflowFlowsOutcomesActionTypeFieldSerializer.class)
  @JsonProperty("action_type")
  protected EnumWrapper<WorkflowFlowsOutcomesActionTypeField> actionType;

  @JsonProperty("if_rejected")
  protected List<WorkflowFlowsOutcomesIfRejectedField> ifRejected;

  public WorkflowFlowsOutcomesField() {
  }

  protected WorkflowFlowsOutcomesField(WorkflowFlowsOutcomesFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
    this.name = builder.name;
    this.actionType = builder.actionType;
    this.ifRejected = builder.ifRejected;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<WorkflowFlowsOutcomesTypeField> getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public EnumWrapper<WorkflowFlowsOutcomesActionTypeField> getActionType() {
    return actionType;
  }

  public List<WorkflowFlowsOutcomesIfRejectedField> getIfRejected() {
    return ifRejected;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowFlowsOutcomesField casted = (WorkflowFlowsOutcomesField) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type) &&
      Objects.equals(name, casted.name) &&
      Objects.equals(actionType, casted.actionType) &&
      Objects.equals(ifRejected, casted.ifRejected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type, name, actionType, ifRejected
    );
  }

  @Override
  public String toString() {
    return "WorkflowFlowsOutcomesField{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + ", " + "name='" + name + '\'' + ", " + "actionType='" + actionType + '\'' + ", " + "ifRejected='" + ifRejected + '\'' + "}";
  }

  public static class WorkflowFlowsOutcomesFieldBuilder {

    protected String id;

    protected EnumWrapper<WorkflowFlowsOutcomesTypeField> type;

    protected String name;

    protected EnumWrapper<WorkflowFlowsOutcomesActionTypeField> actionType;

    protected List<WorkflowFlowsOutcomesIfRejectedField> ifRejected;

    public WorkflowFlowsOutcomesFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public WorkflowFlowsOutcomesFieldBuilder type(WorkflowFlowsOutcomesTypeField type) {
      this.type = new EnumWrapper<WorkflowFlowsOutcomesTypeField>(type.getValue(), type);
      return this;
    }

    public WorkflowFlowsOutcomesFieldBuilder name(String name) {
      this.name = name;
      return this;
    }

    public WorkflowFlowsOutcomesFieldBuilder actionType(WorkflowFlowsOutcomesActionTypeField actionType) {
      this.actionType = new EnumWrapper<WorkflowFlowsOutcomesActionTypeField>(actionType.getValue(), actionType);
      return this;
    }

    public WorkflowFlowsOutcomesFieldBuilder ifRejected(List<WorkflowFlowsOutcomesIfRejectedField> ifRejected) {
      this.ifRejected = ifRejected;
      return this;
    }

    public WorkflowFlowsOutcomesField build() {
      return new WorkflowFlowsOutcomesField(this);
    }

  }

}
