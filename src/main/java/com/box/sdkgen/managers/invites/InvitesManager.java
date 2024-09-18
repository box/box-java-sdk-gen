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

public class InvitesManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public InvitesManager() {
    this.networkSession = new NetworkSession();
  }

  protected InvitesManager(InvitesManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public Invite createInvite(CreateInviteRequestBody requestBody) {
    return createInvite(requestBody, new CreateInviteQueryParams(), new CreateInviteHeaders());
  }

  public Invite createInvite(CreateInviteRequestBody requestBody, CreateInviteQueryParams queryParams) {
    return createInvite(requestBody, queryParams, new CreateInviteHeaders());
  }

  public Invite createInvite(CreateInviteRequestBody requestBody, CreateInviteHeaders headers) {
    return createInvite(requestBody, new CreateInviteQueryParams(), headers);
  }

  public Invite createInvite(CreateInviteRequestBody requestBody, CreateInviteQueryParams queryParams, CreateInviteHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/invites")).method("POST").params(queryParamsMap).headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), Invite.class);
  }

  public Invite getInviteById(String inviteId) {
    return getInviteById(inviteId, new GetInviteByIdQueryParams(), new GetInviteByIdHeaders());
  }

  public Invite getInviteById(String inviteId, GetInviteByIdQueryParams queryParams) {
    return getInviteById(inviteId, queryParams, new GetInviteByIdHeaders());
  }

  public Invite getInviteById(String inviteId, GetInviteByIdHeaders headers) {
    return getInviteById(inviteId, new GetInviteByIdQueryParams(), headers);
  }

  public Invite getInviteById(String inviteId, GetInviteByIdQueryParams queryParams, GetInviteByIdHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/invites/", convertToString(inviteId))).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), Invite.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class InvitesManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public InvitesManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public InvitesManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public InvitesManager build() {
      return new InvitesManager(this);
    }

  }

}
