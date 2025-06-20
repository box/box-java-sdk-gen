package com.box.sdkgen.schemas.v2025r0.hubcollaborationv2025r0;

import com.box.sdkgen.internal.SerializableObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public
class HubCollaborationV2025R0AcceptanceRequirementsStatusTwoFactorAuthenticationRequirementField
    extends SerializableObject {

  @JsonProperty("enterprise_has_two_factor_auth_enabled")
  protected Boolean enterpriseHasTwoFactorAuthEnabled;

  @JsonProperty("user_has_two_factor_authentication_enabled")
  protected Boolean userHasTwoFactorAuthenticationEnabled;

  public
  HubCollaborationV2025R0AcceptanceRequirementsStatusTwoFactorAuthenticationRequirementField() {
    super();
  }

  protected
  HubCollaborationV2025R0AcceptanceRequirementsStatusTwoFactorAuthenticationRequirementField(
      Builder builder) {
    super();
    this.enterpriseHasTwoFactorAuthEnabled = builder.enterpriseHasTwoFactorAuthEnabled;
    this.userHasTwoFactorAuthenticationEnabled = builder.userHasTwoFactorAuthenticationEnabled;
  }

  public Boolean getEnterpriseHasTwoFactorAuthEnabled() {
    return enterpriseHasTwoFactorAuthEnabled;
  }

  public Boolean getUserHasTwoFactorAuthenticationEnabled() {
    return userHasTwoFactorAuthenticationEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HubCollaborationV2025R0AcceptanceRequirementsStatusTwoFactorAuthenticationRequirementField
        casted =
            (HubCollaborationV2025R0AcceptanceRequirementsStatusTwoFactorAuthenticationRequirementField)
                o;
    return Objects.equals(
            enterpriseHasTwoFactorAuthEnabled, casted.enterpriseHasTwoFactorAuthEnabled)
        && Objects.equals(
            userHasTwoFactorAuthenticationEnabled, casted.userHasTwoFactorAuthenticationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enterpriseHasTwoFactorAuthEnabled, userHasTwoFactorAuthenticationEnabled);
  }

  @Override
  public String toString() {
    return "HubCollaborationV2025R0AcceptanceRequirementsStatusTwoFactorAuthenticationRequirementField{"
        + "enterpriseHasTwoFactorAuthEnabled='"
        + enterpriseHasTwoFactorAuthEnabled
        + '\''
        + ", "
        + "userHasTwoFactorAuthenticationEnabled='"
        + userHasTwoFactorAuthenticationEnabled
        + '\''
        + "}";
  }

  public static class Builder {

    protected Boolean enterpriseHasTwoFactorAuthEnabled;

    protected Boolean userHasTwoFactorAuthenticationEnabled;

    public Builder enterpriseHasTwoFactorAuthEnabled(Boolean enterpriseHasTwoFactorAuthEnabled) {
      this.enterpriseHasTwoFactorAuthEnabled = enterpriseHasTwoFactorAuthEnabled;
      return this;
    }

    public Builder userHasTwoFactorAuthenticationEnabled(
        Boolean userHasTwoFactorAuthenticationEnabled) {
      this.userHasTwoFactorAuthenticationEnabled = userHasTwoFactorAuthenticationEnabled;
      return this;
    }

    public
    HubCollaborationV2025R0AcceptanceRequirementsStatusTwoFactorAuthenticationRequirementField
        build() {
      return new HubCollaborationV2025R0AcceptanceRequirementsStatusTwoFactorAuthenticationRequirementField(
          this);
    }
  }
}
