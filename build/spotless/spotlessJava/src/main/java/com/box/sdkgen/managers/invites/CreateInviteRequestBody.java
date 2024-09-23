package com.box.sdkgen.managers.invites;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateInviteRequestBody {

  protected final CreateInviteRequestBodyEnterpriseField enterprise;

  @JsonProperty("actionable_by")
  protected final CreateInviteRequestBodyActionableByField actionableBy;

  public CreateInviteRequestBody(
      @JsonProperty("enterprise") CreateInviteRequestBodyEnterpriseField enterprise,
      @JsonProperty("actionable_by") CreateInviteRequestBodyActionableByField actionableBy) {
    this.enterprise = enterprise;
    this.actionableBy = actionableBy;
  }

  public CreateInviteRequestBodyEnterpriseField getEnterprise() {
    return enterprise;
  }

  public CreateInviteRequestBodyActionableByField getActionableBy() {
    return actionableBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInviteRequestBody casted = (CreateInviteRequestBody) o;
    return Objects.equals(enterprise, casted.enterprise)
        && Objects.equals(actionableBy, casted.actionableBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enterprise, actionableBy);
  }

  @Override
  public String toString() {
    return "CreateInviteRequestBody{"
        + "enterprise='"
        + enterprise
        + '\''
        + ", "
        + "actionableBy='"
        + actionableBy
        + '\''
        + "}";
  }
}
