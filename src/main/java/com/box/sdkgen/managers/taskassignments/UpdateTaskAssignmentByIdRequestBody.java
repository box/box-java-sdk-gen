package com.box.sdkgen.managers.taskassignments;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class UpdateTaskAssignmentByIdRequestBody extends SerializableObject {

  protected String message;

  @JsonDeserialize(
      using =
          UpdateTaskAssignmentByIdRequestBodyResolutionStateField
              .UpdateTaskAssignmentByIdRequestBodyResolutionStateFieldDeserializer.class)
  @JsonSerialize(
      using =
          UpdateTaskAssignmentByIdRequestBodyResolutionStateField
              .UpdateTaskAssignmentByIdRequestBodyResolutionStateFieldSerializer.class)
  @JsonProperty("resolution_state")
  protected EnumWrapper<UpdateTaskAssignmentByIdRequestBodyResolutionStateField> resolutionState;

  public UpdateTaskAssignmentByIdRequestBody() {
    super();
  }

  protected UpdateTaskAssignmentByIdRequestBody(
      UpdateTaskAssignmentByIdRequestBodyBuilder builder) {
    super();
    this.message = builder.message;
    this.resolutionState = builder.resolutionState;
  }

  public String getMessage() {
    return message;
  }

  public EnumWrapper<UpdateTaskAssignmentByIdRequestBodyResolutionStateField> getResolutionState() {
    return resolutionState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTaskAssignmentByIdRequestBody casted = (UpdateTaskAssignmentByIdRequestBody) o;
    return Objects.equals(message, casted.message)
        && Objects.equals(resolutionState, casted.resolutionState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, resolutionState);
  }

  @Override
  public String toString() {
    return "UpdateTaskAssignmentByIdRequestBody{"
        + "message='"
        + message
        + '\''
        + ", "
        + "resolutionState='"
        + resolutionState
        + '\''
        + "}";
  }

  public static class UpdateTaskAssignmentByIdRequestBodyBuilder {

    protected String message;

    protected EnumWrapper<UpdateTaskAssignmentByIdRequestBodyResolutionStateField> resolutionState;

    public UpdateTaskAssignmentByIdRequestBodyBuilder message(String message) {
      this.message = message;
      return this;
    }

    public UpdateTaskAssignmentByIdRequestBodyBuilder resolutionState(
        UpdateTaskAssignmentByIdRequestBodyResolutionStateField resolutionState) {
      this.resolutionState =
          new EnumWrapper<UpdateTaskAssignmentByIdRequestBodyResolutionStateField>(resolutionState);
      return this;
    }

    public UpdateTaskAssignmentByIdRequestBodyBuilder resolutionState(
        EnumWrapper<UpdateTaskAssignmentByIdRequestBodyResolutionStateField> resolutionState) {
      this.resolutionState = resolutionState;
      return this;
    }

    public UpdateTaskAssignmentByIdRequestBody build() {
      return new UpdateTaskAssignmentByIdRequestBody(this);
    }
  }
}
