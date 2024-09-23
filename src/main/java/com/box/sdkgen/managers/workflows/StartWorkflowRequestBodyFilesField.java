package com.box.sdkgen.managers.workflows;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class StartWorkflowRequestBodyFilesField {

  @JsonDeserialize(
      using =
          StartWorkflowRequestBodyFilesTypeField.StartWorkflowRequestBodyFilesTypeFieldDeserializer
              .class)
  @JsonSerialize(
      using =
          StartWorkflowRequestBodyFilesTypeField.StartWorkflowRequestBodyFilesTypeFieldSerializer
              .class)
  protected EnumWrapper<StartWorkflowRequestBodyFilesTypeField> type;

  protected String id;

  public StartWorkflowRequestBodyFilesField() {}

  protected StartWorkflowRequestBodyFilesField(StartWorkflowRequestBodyFilesFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<StartWorkflowRequestBodyFilesTypeField> getType() {
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
    StartWorkflowRequestBodyFilesField casted = (StartWorkflowRequestBodyFilesField) o;
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "StartWorkflowRequestBodyFilesField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + "}";
  }

  public static class StartWorkflowRequestBodyFilesFieldBuilder {

    protected EnumWrapper<StartWorkflowRequestBodyFilesTypeField> type;

    protected String id;

    public StartWorkflowRequestBodyFilesFieldBuilder type(
        StartWorkflowRequestBodyFilesTypeField type) {
      this.type = new EnumWrapper<StartWorkflowRequestBodyFilesTypeField>(type.getValue(), type);
      return this;
    }

    public StartWorkflowRequestBodyFilesFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public StartWorkflowRequestBodyFilesField build() {
      return new StartWorkflowRequestBodyFilesField(this);
    }
  }
}
