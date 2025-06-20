package com.box.sdkgen.schemas.v2025r0.hubcollaborationv2025r0;

import com.box.sdkgen.internal.SerializableObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class HubCollaborationV2025R0AcceptanceRequirementsStatusStrongPasswordRequirementField
    extends SerializableObject {

  @JsonProperty("enterprise_has_strong_password_required_for_external_users")
  protected Boolean enterpriseHasStrongPasswordRequiredForExternalUsers;

  @JsonProperty("user_has_strong_password")
  protected Boolean userHasStrongPassword;

  public HubCollaborationV2025R0AcceptanceRequirementsStatusStrongPasswordRequirementField() {
    super();
  }

  protected HubCollaborationV2025R0AcceptanceRequirementsStatusStrongPasswordRequirementField(
      Builder builder) {
    super();
    this.enterpriseHasStrongPasswordRequiredForExternalUsers =
        builder.enterpriseHasStrongPasswordRequiredForExternalUsers;
    this.userHasStrongPassword = builder.userHasStrongPassword;
  }

  public Boolean getEnterpriseHasStrongPasswordRequiredForExternalUsers() {
    return enterpriseHasStrongPasswordRequiredForExternalUsers;
  }

  public Boolean getUserHasStrongPassword() {
    return userHasStrongPassword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HubCollaborationV2025R0AcceptanceRequirementsStatusStrongPasswordRequirementField casted =
        (HubCollaborationV2025R0AcceptanceRequirementsStatusStrongPasswordRequirementField) o;
    return Objects.equals(
            enterpriseHasStrongPasswordRequiredForExternalUsers,
            casted.enterpriseHasStrongPasswordRequiredForExternalUsers)
        && Objects.equals(userHasStrongPassword, casted.userHasStrongPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enterpriseHasStrongPasswordRequiredForExternalUsers, userHasStrongPassword);
  }

  @Override
  public String toString() {
    return "HubCollaborationV2025R0AcceptanceRequirementsStatusStrongPasswordRequirementField{"
        + "enterpriseHasStrongPasswordRequiredForExternalUsers='"
        + enterpriseHasStrongPasswordRequiredForExternalUsers
        + '\''
        + ", "
        + "userHasStrongPassword='"
        + userHasStrongPassword
        + '\''
        + "}";
  }

  public static class Builder {

    protected Boolean enterpriseHasStrongPasswordRequiredForExternalUsers;

    protected Boolean userHasStrongPassword;

    public Builder enterpriseHasStrongPasswordRequiredForExternalUsers(
        Boolean enterpriseHasStrongPasswordRequiredForExternalUsers) {
      this.enterpriseHasStrongPasswordRequiredForExternalUsers =
          enterpriseHasStrongPasswordRequiredForExternalUsers;
      return this;
    }

    public Builder userHasStrongPassword(Boolean userHasStrongPassword) {
      this.userHasStrongPassword = userHasStrongPassword;
      return this;
    }

    public HubCollaborationV2025R0AcceptanceRequirementsStatusStrongPasswordRequirementField
        build() {
      return new HubCollaborationV2025R0AcceptanceRequirementsStatusStrongPasswordRequirementField(
          this);
    }
  }
}
