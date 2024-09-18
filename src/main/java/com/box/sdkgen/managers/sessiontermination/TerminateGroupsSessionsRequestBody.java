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

public class TerminateGroupsSessionsRequestBody {

  @JsonProperty("group_ids")
  protected final List<String> groupIds;

  public TerminateGroupsSessionsRequestBody(@JsonProperty("group_ids") List<String> groupIds) {
    this.groupIds = groupIds;
  }

  public List<String> getGroupIds() {
    return groupIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminateGroupsSessionsRequestBody casted = (TerminateGroupsSessionsRequestBody) o;
    return Objects.equals(groupIds, casted.groupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      groupIds
    );
  }

  @Override
  public String toString() {
    return "TerminateGroupsSessionsRequestBody{" + "groupIds='" + groupIds + '\'' + "}";
  }

}
