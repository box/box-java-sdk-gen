package com.box.sdkgen.managers.taskassignments;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateTaskAssignmentRequestBody {

  protected final CreateTaskAssignmentRequestBodyTaskField task;

  @JsonProperty("assign_to")
  protected final CreateTaskAssignmentRequestBodyAssignToField assignTo;

  public CreateTaskAssignmentRequestBody(
      @JsonProperty("task") CreateTaskAssignmentRequestBodyTaskField task,
      @JsonProperty("assign_to") CreateTaskAssignmentRequestBodyAssignToField assignTo) {
    this.task = task;
    this.assignTo = assignTo;
  }

  public CreateTaskAssignmentRequestBodyTaskField getTask() {
    return task;
  }

  public CreateTaskAssignmentRequestBodyAssignToField getAssignTo() {
    return assignTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTaskAssignmentRequestBody casted = (CreateTaskAssignmentRequestBody) o;
    return Objects.equals(task, casted.task) && Objects.equals(assignTo, casted.assignTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(task, assignTo);
  }

  @Override
  public String toString() {
    return "CreateTaskAssignmentRequestBody{"
        + "task='"
        + task
        + '\''
        + ", "
        + "assignTo='"
        + assignTo
        + '\''
        + "}";
  }
}
