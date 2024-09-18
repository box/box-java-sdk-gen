package com.box.sdkgen.schemas.taskassignments;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.taskassignment.TaskAssignment;

public class TaskAssignments {

  @JsonProperty("total_count")
  protected Long totalCount;

  protected List<TaskAssignment> entries;

  public TaskAssignments() {
  }

  protected TaskAssignments(TaskAssignmentsBuilder builder) {
    this.totalCount = builder.totalCount;
    this.entries = builder.entries;
  }

  public Long getTotalCount() {
    return totalCount;
  }

  public List<TaskAssignment> getEntries() {
    return entries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskAssignments casted = (TaskAssignments) o;
    return Objects.equals(totalCount, casted.totalCount) &&
      Objects.equals(entries, casted.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      totalCount, entries
    );
  }

  @Override
  public String toString() {
    return "TaskAssignments{" + "totalCount='" + totalCount + '\'' + ", " + "entries='" + entries + '\'' + "}";
  }

  public static class TaskAssignmentsBuilder {

    protected Long totalCount;

    protected List<TaskAssignment> entries;

    public TaskAssignmentsBuilder totalCount(Long totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    public TaskAssignmentsBuilder entries(List<TaskAssignment> entries) {
      this.entries = entries;
      return this;
    }

    public TaskAssignments build() {
      return new TaskAssignments(this);
    }

  }

}
