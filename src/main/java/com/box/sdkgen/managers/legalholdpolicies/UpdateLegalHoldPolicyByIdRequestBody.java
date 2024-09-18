package com.box.sdkgen.managers.legalholdpolicies;

import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.legalholdpolicies.LegalHoldPolicies;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.legalholdpolicy.LegalHoldPolicy;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;

public class UpdateLegalHoldPolicyByIdRequestBody {

  @JsonProperty("policy_name")
  protected String policyName;

  protected String description;

  @JsonProperty("release_notes")
  protected String releaseNotes;

  public UpdateLegalHoldPolicyByIdRequestBody() {
  }

  protected UpdateLegalHoldPolicyByIdRequestBody(UpdateLegalHoldPolicyByIdRequestBodyBuilder builder) {
    this.policyName = builder.policyName;
    this.description = builder.description;
    this.releaseNotes = builder.releaseNotes;
  }

  public String getPolicyName() {
    return policyName;
  }

  public String getDescription() {
    return description;
  }

  public String getReleaseNotes() {
    return releaseNotes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLegalHoldPolicyByIdRequestBody casted = (UpdateLegalHoldPolicyByIdRequestBody) o;
    return Objects.equals(policyName, casted.policyName) &&
      Objects.equals(description, casted.description) &&
      Objects.equals(releaseNotes, casted.releaseNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      policyName, description, releaseNotes
    );
  }

  @Override
  public String toString() {
    return "UpdateLegalHoldPolicyByIdRequestBody{" + "policyName='" + policyName + '\'' + ", " + "description='" + description + '\'' + ", " + "releaseNotes='" + releaseNotes + '\'' + "}";
  }

  public static class UpdateLegalHoldPolicyByIdRequestBodyBuilder {

    protected String policyName;

    protected String description;

    protected String releaseNotes;

    public UpdateLegalHoldPolicyByIdRequestBodyBuilder policyName(String policyName) {
      this.policyName = policyName;
      return this;
    }

    public UpdateLegalHoldPolicyByIdRequestBodyBuilder description(String description) {
      this.description = description;
      return this;
    }

    public UpdateLegalHoldPolicyByIdRequestBodyBuilder releaseNotes(String releaseNotes) {
      this.releaseNotes = releaseNotes;
      return this;
    }

    public UpdateLegalHoldPolicyByIdRequestBody build() {
      return new UpdateLegalHoldPolicyByIdRequestBody(this);
    }

  }

}
