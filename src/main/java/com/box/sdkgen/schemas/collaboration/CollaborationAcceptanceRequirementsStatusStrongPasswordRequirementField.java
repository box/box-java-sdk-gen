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

public class CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementField {

  @JsonProperty("enterprise_has_strong_password_required_for_external_users")
  protected Boolean enterpriseHasStrongPasswordRequiredForExternalUsers;

  @JsonProperty("user_has_strong_password")
  protected Boolean userHasStrongPassword;

  public CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementField() {
  }

  protected CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementField(CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementFieldBuilder builder) {
    this.enterpriseHasStrongPasswordRequiredForExternalUsers = builder.enterpriseHasStrongPasswordRequiredForExternalUsers;
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
    CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementField casted = (CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementField) o;
    return Objects.equals(enterpriseHasStrongPasswordRequiredForExternalUsers, casted.enterpriseHasStrongPasswordRequiredForExternalUsers) &&
      Objects.equals(userHasStrongPassword, casted.userHasStrongPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      enterpriseHasStrongPasswordRequiredForExternalUsers, userHasStrongPassword
    );
  }

  @Override
  public String toString() {
    return "CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementField{" + "enterpriseHasStrongPasswordRequiredForExternalUsers='" + enterpriseHasStrongPasswordRequiredForExternalUsers + '\'' + ", " + "userHasStrongPassword='" + userHasStrongPassword + '\'' + "}";
  }

  public static class CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementFieldBuilder {

    protected Boolean enterpriseHasStrongPasswordRequiredForExternalUsers;

    protected Boolean userHasStrongPassword;

    public CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementFieldBuilder enterpriseHasStrongPasswordRequiredForExternalUsers(Boolean enterpriseHasStrongPasswordRequiredForExternalUsers) {
      this.enterpriseHasStrongPasswordRequiredForExternalUsers = enterpriseHasStrongPasswordRequiredForExternalUsers;
      return this;
    }

    public CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementFieldBuilder userHasStrongPassword(Boolean userHasStrongPassword) {
      this.userHasStrongPassword = userHasStrongPassword;
      return this;
    }

    public CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementField build() {
      return new CollaborationAcceptanceRequirementsStatusStrongPasswordRequirementField(this);
    }

  }

}
