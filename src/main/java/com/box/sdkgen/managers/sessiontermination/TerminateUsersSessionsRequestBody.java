package com.box.sdkgen.managers.sessiontermination;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.sessionterminationmessage.SessionTerminationMessage;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;

public class TerminateUsersSessionsRequestBody {

  @JsonProperty("user_ids")
  protected final List<String> userIds;

  @JsonProperty("user_logins")
  protected final List<String> userLogins;

  public TerminateUsersSessionsRequestBody(@JsonProperty("user_ids") List<String> userIds, @JsonProperty("user_logins") List<String> userLogins) {
    this.userIds = userIds;
    this.userLogins = userLogins;
  }

  public List<String> getUserIds() {
    return userIds;
  }

  public List<String> getUserLogins() {
    return userLogins;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminateUsersSessionsRequestBody casted = (TerminateUsersSessionsRequestBody) o;
    return Objects.equals(userIds, casted.userIds) &&
      Objects.equals(userLogins, casted.userLogins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      userIds, userLogins
    );
  }

  @Override
  public String toString() {
    return "TerminateUsersSessionsRequestBody{" + "userIds='" + userIds + '\'' + ", " + "userLogins='" + userLogins + '\'' + "}";
  }

}
