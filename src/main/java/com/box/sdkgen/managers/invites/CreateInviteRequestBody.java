package com.box.sdkgen.managers.invites;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.invite.Invite;
import com.box.sdkgen.schemas.clienterror.ClientError;
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

public class CreateInviteRequestBody {

  protected final CreateInviteRequestBodyEnterpriseField enterprise;

  @JsonProperty("actionable_by")
  protected final CreateInviteRequestBodyActionableByField actionableBy;

  public CreateInviteRequestBody(@JsonProperty("enterprise") CreateInviteRequestBodyEnterpriseField enterprise, @JsonProperty("actionable_by") CreateInviteRequestBodyActionableByField actionableBy) {
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
    return Objects.equals(enterprise, casted.enterprise) &&
      Objects.equals(actionableBy, casted.actionableBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      enterprise, actionableBy
    );
  }

  @Override
  public String toString() {
    return "CreateInviteRequestBody{" + "enterprise='" + enterprise + '\'' + ", " + "actionableBy='" + actionableBy + '\'' + "}";
  }

}
