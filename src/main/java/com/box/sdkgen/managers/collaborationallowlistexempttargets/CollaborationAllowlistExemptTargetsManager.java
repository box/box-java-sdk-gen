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

public class CollaborationAllowlistExemptTargetsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public CollaborationAllowlistExemptTargetsManager() {
    this.networkSession = new NetworkSession();
  }

  protected CollaborationAllowlistExemptTargetsManager(CollaborationAllowlistExemptTargetsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public CollaborationAllowlistExemptTargets getCollaborationWhitelistExemptTargets() {
    return getCollaborationWhitelistExemptTargets(new GetCollaborationWhitelistExemptTargetsQueryParams(), new GetCollaborationWhitelistExemptTargetsHeaders());
  }

  public CollaborationAllowlistExemptTargets getCollaborationWhitelistExemptTargets(GetCollaborationWhitelistExemptTargetsQueryParams queryParams) {
    return getCollaborationWhitelistExemptTargets(queryParams, new GetCollaborationWhitelistExemptTargetsHeaders());
  }

  public CollaborationAllowlistExemptTargets getCollaborationWhitelistExemptTargets(GetCollaborationWhitelistExemptTargetsHeaders headers) {
    return getCollaborationWhitelistExemptTargets(new GetCollaborationWhitelistExemptTargetsQueryParams(), headers);
  }

  public CollaborationAllowlistExemptTargets getCollaborationWhitelistExemptTargets(GetCollaborationWhitelistExemptTargetsQueryParams queryParams, GetCollaborationWhitelistExemptTargetsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("marker", convertToString(queryParams.getMarker())), entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/collaboration_whitelist_exempt_targets")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), CollaborationAllowlistExemptTargets.class);
  }

  public CollaborationAllowlistExemptTarget createCollaborationWhitelistExemptTarget(CreateCollaborationWhitelistExemptTargetRequestBody requestBody) {
    return createCollaborationWhitelistExemptTarget(requestBody, new CreateCollaborationWhitelistExemptTargetHeaders());
  }

  public CollaborationAllowlistExemptTarget createCollaborationWhitelistExemptTarget(CreateCollaborationWhitelistExemptTargetRequestBody requestBody, CreateCollaborationWhitelistExemptTargetHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/collaboration_whitelist_exempt_targets")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), CollaborationAllowlistExemptTarget.class);
  }

  public CollaborationAllowlistExemptTarget getCollaborationWhitelistExemptTargetById(String collaborationWhitelistExemptTargetId) {
    return getCollaborationWhitelistExemptTargetById(collaborationWhitelistExemptTargetId, new GetCollaborationWhitelistExemptTargetByIdHeaders());
  }

  public CollaborationAllowlistExemptTarget getCollaborationWhitelistExemptTargetById(String collaborationWhitelistExemptTargetId, GetCollaborationWhitelistExemptTargetByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/collaboration_whitelist_exempt_targets/", convertToString(collaborationWhitelistExemptTargetId))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), CollaborationAllowlistExemptTarget.class);
  }

  public void deleteCollaborationWhitelistExemptTargetById(String collaborationWhitelistExemptTargetId) {
    deleteCollaborationWhitelistExemptTargetById(collaborationWhitelistExemptTargetId, new DeleteCollaborationWhitelistExemptTargetByIdHeaders());
  }

  public void deleteCollaborationWhitelistExemptTargetById(String collaborationWhitelistExemptTargetId, DeleteCollaborationWhitelistExemptTargetByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/collaboration_whitelist_exempt_targets/", convertToString(collaborationWhitelistExemptTargetId))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class CollaborationAllowlistExemptTargetsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public CollaborationAllowlistExemptTargetsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public CollaborationAllowlistExemptTargetsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public CollaborationAllowlistExemptTargetsManager build() {
      return new CollaborationAllowlistExemptTargetsManager(this);
    }

  }

}
