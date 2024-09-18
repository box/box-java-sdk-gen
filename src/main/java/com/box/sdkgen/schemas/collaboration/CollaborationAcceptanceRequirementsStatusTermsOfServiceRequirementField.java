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

public class CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementField {

  @JsonProperty("is_accepted")
  protected Boolean isAccepted;

  @JsonProperty("terms_of_service")
  protected TermsOfServiceBase termsOfService;

  public CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementField() {
  }

  protected CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementField(CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementFieldBuilder builder) {
    this.isAccepted = builder.isAccepted;
    this.termsOfService = builder.termsOfService;
  }

  public Boolean getIsAccepted() {
    return isAccepted;
  }

  public TermsOfServiceBase getTermsOfService() {
    return termsOfService;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementField casted = (CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementField) o;
    return Objects.equals(isAccepted, casted.isAccepted) &&
      Objects.equals(termsOfService, casted.termsOfService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      isAccepted, termsOfService
    );
  }

  @Override
  public String toString() {
    return "CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementField{" + "isAccepted='" + isAccepted + '\'' + ", " + "termsOfService='" + termsOfService + '\'' + "}";
  }

  public static class CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementFieldBuilder {

    protected Boolean isAccepted;

    protected TermsOfServiceBase termsOfService;

    public CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementFieldBuilder isAccepted(Boolean isAccepted) {
      this.isAccepted = isAccepted;
      return this;
    }

    public CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementFieldBuilder termsOfService(TermsOfServiceBase termsOfService) {
      this.termsOfService = termsOfService;
      return this;
    }

    public CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementField build() {
      return new CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementField(this);
    }

  }

}
