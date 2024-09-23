package com.box.sdkgen.managers.memberships;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateGroupMembershipRequestBodyGroupField {

  protected final String id;

  public CreateGroupMembershipRequestBodyGroupField(@JsonProperty("id") String id) {
    this.id = id;
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
    CreateGroupMembershipRequestBodyGroupField casted =
        (CreateGroupMembershipRequestBodyGroupField) o;
    return Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "CreateGroupMembershipRequestBodyGroupField{" + "id='" + id + '\'' + "}";
  }
}
