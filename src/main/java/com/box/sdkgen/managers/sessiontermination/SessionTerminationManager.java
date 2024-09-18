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

public class SessionTerminationManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public SessionTerminationManager() {
    this.networkSession = new NetworkSession();
  }

  protected SessionTerminationManager(SessionTerminationManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public SessionTerminationMessage terminateUsersSessions(TerminateUsersSessionsRequestBody requestBody) {
    return terminateUsersSessions(requestBody, new TerminateUsersSessionsHeaders());
  }

  public SessionTerminationMessage terminateUsersSessions(TerminateUsersSessionsRequestBody requestBody, TerminateUsersSessionsHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/users/terminate_sessions")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), SessionTerminationMessage.class);
  }

  public SessionTerminationMessage terminateGroupsSessions(TerminateGroupsSessionsRequestBody requestBody) {
    return terminateGroupsSessions(requestBody, new TerminateGroupsSessionsHeaders());
  }

  public SessionTerminationMessage terminateGroupsSessions(TerminateGroupsSessionsRequestBody requestBody, TerminateGroupsSessionsHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/groups/terminate_sessions")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), SessionTerminationMessage.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class SessionTerminationManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public SessionTerminationManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public SessionTerminationManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public SessionTerminationManager build() {
      return new SessionTerminationManager(this);
    }

  }

}
