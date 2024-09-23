package com.box.sdkgen.managers.collaborationallowlistexempttargets;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateCollaborationWhitelistExemptTargetRequestBody {

  protected final CreateCollaborationWhitelistExemptTargetRequestBodyUserField user;

  public CreateCollaborationWhitelistExemptTargetRequestBody(
      @JsonProperty("user") CreateCollaborationWhitelistExemptTargetRequestBodyUserField user) {
    this.user = user;
  }

  public CreateCollaborationWhitelistExemptTargetRequestBodyUserField getUser() {
    return user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCollaborationWhitelistExemptTargetRequestBody casted =
        (CreateCollaborationWhitelistExemptTargetRequestBody) o;
    return Objects.equals(user, casted.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user);
  }

  @Override
  public String toString() {
    return "CreateCollaborationWhitelistExemptTargetRequestBody{" + "user='" + user + '\'' + "}";
  }
}
