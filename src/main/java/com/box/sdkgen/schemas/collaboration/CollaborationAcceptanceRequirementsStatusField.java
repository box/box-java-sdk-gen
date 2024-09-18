package com.box.sdkgen.schemas.collaboration;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.fileorfolderorweblink.FileOrFolderOrWebLink;
import com.box.sdkgen.schemas.appitem.AppItem;
import com.box.sdkgen.schemas.groupminiorusercollaborations.GroupMiniOrUserCollaborations;
import com.box.sdkgen.schemas.usercollaborations.UserCollaborations;
import com.box.sdkgen.schemas.termsofservicebase.TermsOfServiceBase;

public class CollaborationAcceptanceRequirementsStatusField {

  @JsonProperty("terms_of_service_requirement")
  protected CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementField termsOfServiceRequirement;

  @JsonProperty("strong_password_requirement")
  protected CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementField strongPasswordRequirement;

  @JsonProperty("two_factor_authentication_requirement")
  protected CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirementField twoFactorAuthenticationRequirement;

  public CollaborationAcceptanceRequirementsStatusField() {
  }

  protected CollaborationAcceptanceRequirementsStatusField(CollaborationAcceptanceRequirementsStatusFieldBuilder builder) {
    this.termsOfServiceRequirement = builder.termsOfServiceRequirement;
    this.strongPasswordRequirement = builder.strongPasswordRequirement;
    this.twoFactorAuthenticationRequirement = builder.twoFactorAuthenticationRequirement;
  }

  public CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementField getTermsOfServiceRequirement() {
    return termsOfServiceRequirement;
  }

  public CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementField getStrongPasswordRequirement() {
    return strongPasswordRequirement;
  }

  public CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirementField getTwoFactorAuthenticationRequirement() {
    return twoFactorAuthenticationRequirement;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollaborationAcceptanceRequirementsStatusField casted = (CollaborationAcceptanceRequirementsStatusField) o;
    return Objects.equals(termsOfServiceRequirement, casted.termsOfServiceRequirement) &&
      Objects.equals(strongPasswordRequirement, casted.strongPasswordRequirement) &&
      Objects.equals(twoFactorAuthenticationRequirement, casted.twoFactorAuthenticationRequirement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      termsOfServiceRequirement, strongPasswordRequirement, twoFactorAuthenticationRequirement
    );
  }

  @Override
  public String toString() {
    return "CollaborationAcceptanceRequirementsStatusField{" + "termsOfServiceRequirement='" + termsOfServiceRequirement + '\'' + ", " + "strongPasswordRequirement='" + strongPasswordRequirement + '\'' + ", " + "twoFactorAuthenticationRequirement='" + twoFactorAuthenticationRequirement + '\'' + "}";
  }

  public static class CollaborationAcceptanceRequirementsStatusFieldBuilder {

    protected CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementField termsOfServiceRequirement;

    protected CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementField strongPasswordRequirement;

    protected CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirementField twoFactorAuthenticationRequirement;

    public CollaborationAcceptanceRequirementsStatusFieldBuilder termsOfServiceRequirement(CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementField termsOfServiceRequirement) {
      this.termsOfServiceRequirement = termsOfServiceRequirement;
      return this;
    }

    public CollaborationAcceptanceRequirementsStatusFieldBuilder strongPasswordRequirement(CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementField strongPasswordRequirement) {
      this.strongPasswordRequirement = strongPasswordRequirement;
      return this;
    }

    public CollaborationAcceptanceRequirementsStatusFieldBuilder twoFactorAuthenticationRequirement(CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirementField twoFactorAuthenticationRequirement) {
      this.twoFactorAuthenticationRequirement = twoFactorAuthenticationRequirement;
      return this;
    }

    public CollaborationAcceptanceRequirementsStatusField build() {
      return new CollaborationAcceptanceRequirementsStatusField(this);
    }

  }

}
