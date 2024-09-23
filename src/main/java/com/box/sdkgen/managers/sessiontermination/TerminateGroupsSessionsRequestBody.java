package com.box.sdkgen.managers.sessiontermination;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class TerminateGroupsSessionsRequestBody {

  @JsonProperty("group_ids")
  protected final List<String> groupIds;

  public TerminateGroupsSessionsRequestBody(@JsonProperty("group_ids") List<String> groupIds) {
    this.groupIds = groupIds;
  }

  public List<String> getGroupIds() {
    return groupIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminateGroupsSessionsRequestBody casted = (TerminateGroupsSessionsRequestBody) o;
    return Objects.equals(groupIds, casted.groupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupIds);
  }

  @Override
  public String toString() {
    return "TerminateGroupsSessionsRequestBody{" + "groupIds='" + groupIds + '\'' + "}";
  }
}
