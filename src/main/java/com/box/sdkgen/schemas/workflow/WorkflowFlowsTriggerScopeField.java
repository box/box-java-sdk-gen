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

public class WorkflowFlowsTriggerScopeField {

  @JsonDeserialize(using = WorkflowFlowsTriggerScopeTypeField.WorkflowFlowsTriggerScopeTypeFieldDeserializer.class)
  @JsonSerialize(using = WorkflowFlowsTriggerScopeTypeField.WorkflowFlowsTriggerScopeTypeFieldSerializer.class)
  protected EnumWrapper<WorkflowFlowsTriggerScopeTypeField> type;

  protected String ref;

  protected WorkflowFlowsTriggerScopeObjectField object;

  public WorkflowFlowsTriggerScopeField() {
  }

  protected WorkflowFlowsTriggerScopeField(WorkflowFlowsTriggerScopeFieldBuilder builder) {
    this.type = builder.type;
    this.ref = builder.ref;
    this.object = builder.object;
  }

  public EnumWrapper<WorkflowFlowsTriggerScopeTypeField> getType() {
    return type;
  }

  public String getRef() {
    return ref;
  }

  public WorkflowFlowsTriggerScopeObjectField getObject() {
    return object;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowFlowsTriggerScopeField casted = (WorkflowFlowsTriggerScopeField) o;
    return Objects.equals(type, casted.type) &&
      Objects.equals(ref, casted.ref) &&
      Objects.equals(object, casted.object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, ref, object
    );
  }

  @Override
  public String toString() {
    return "WorkflowFlowsTriggerScopeField{" + "type='" + type + '\'' + ", " + "ref='" + ref + '\'' + ", " + "object='" + object + '\'' + "}";
  }

  public static class WorkflowFlowsTriggerScopeFieldBuilder {

    protected EnumWrapper<WorkflowFlowsTriggerScopeTypeField> type;

    protected String ref;

    protected WorkflowFlowsTriggerScopeObjectField object;

    public WorkflowFlowsTriggerScopeFieldBuilder type(WorkflowFlowsTriggerScopeTypeField type) {
      this.type = new EnumWrapper<WorkflowFlowsTriggerScopeTypeField>(type.getValue(), type);
      return this;
    }

    public WorkflowFlowsTriggerScopeFieldBuilder ref(String ref) {
      this.ref = ref;
      return this;
    }

    public WorkflowFlowsTriggerScopeFieldBuilder object(WorkflowFlowsTriggerScopeObjectField object) {
      this.object = object;
      return this;
    }

    public WorkflowFlowsTriggerScopeField build() {
      return new WorkflowFlowsTriggerScopeField(this);
    }

  }

}
