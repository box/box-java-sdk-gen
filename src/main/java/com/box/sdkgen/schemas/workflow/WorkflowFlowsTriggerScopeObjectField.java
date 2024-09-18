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

public class WorkflowFlowsTriggerScopeObjectField {

  @JsonDeserialize(using = WorkflowFlowsTriggerScopeObjectTypeField.WorkflowFlowsTriggerScopeObjectTypeFieldDeserializer.class)
  @JsonSerialize(using = WorkflowFlowsTriggerScopeObjectTypeField.WorkflowFlowsTriggerScopeObjectTypeFieldSerializer.class)
  protected EnumWrapper<WorkflowFlowsTriggerScopeObjectTypeField> type;

  protected String id;

  public WorkflowFlowsTriggerScopeObjectField() {
  }

  protected WorkflowFlowsTriggerScopeObjectField(WorkflowFlowsTriggerScopeObjectFieldBuilder builder) {
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
    return Objects.equals(type, casted.type) &&
      Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, id
    );
  }

  @Override
  public String toString() {
    return "WorkflowFlowsTriggerScopeObjectField{" + "type='" + type + '\'' + ", " + "id='" + id + '\'' + "}";
  }

  public static class WorkflowFlowsTriggerScopeObjectFieldBuilder {

    protected EnumWrapper<WorkflowFlowsTriggerScopeObjectTypeField> type;

    protected String id;

    public WorkflowFlowsTriggerScopeObjectFieldBuilder type(WorkflowFlowsTriggerScopeObjectTypeField type) {
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
