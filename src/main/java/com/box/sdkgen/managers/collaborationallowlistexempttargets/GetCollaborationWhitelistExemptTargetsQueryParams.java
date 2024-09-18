package com.box.sdkgen.managers.collaborationallowlistexempttargets;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.collaborationallowlistexempttargets.CollaborationAllowlistExemptTargets;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.collaborationallowlistexempttarget.CollaborationAllowlistExemptTarget;
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

public class GetCollaborationWhitelistExemptTargetsQueryParams {

  public String marker;

  public Long limit;

  public GetCollaborationWhitelistExemptTargetsQueryParams() {
  }

  protected GetCollaborationWhitelistExemptTargetsQueryParams(GetCollaborationWhitelistExemptTargetsQueryParamsBuilder builder) {
    this.marker = builder.marker;
    this.limit = builder.limit;
  }

  public String getMarker() {
    return marker;
  }

  public Long getLimit() {
    return limit;
  }

  public static class GetCollaborationWhitelistExemptTargetsQueryParamsBuilder {

    protected String marker;

    protected Long limit;

    public GetCollaborationWhitelistExemptTargetsQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetCollaborationWhitelistExemptTargetsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetCollaborationWhitelistExemptTargetsQueryParams build() {
      return new GetCollaborationWhitelistExemptTargetsQueryParams(this);
    }

  }

}
