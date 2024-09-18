package com.box.sdkgen.managers.emailaliases;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.emailaliases.EmailAliases;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.emailalias.EmailAlias;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.fasterxml.jackson.databind.JsonNode;

public class EmailAliasesManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public EmailAliasesManager() {
    this.networkSession = new NetworkSession();
  }

  protected EmailAliasesManager(EmailAliasesManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public EmailAliases getUserEmailAliases(String userId) {
    return getUserEmailAliases(userId, new GetUserEmailAliasesHeaders());
  }

  public EmailAliases getUserEmailAliases(String userId, GetUserEmailAliasesHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/users/", convertToString(userId), "/email_aliases")).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), EmailAliases.class);
  }

  public EmailAlias createUserEmailAlias(String userId, CreateUserEmailAliasRequestBody requestBody) {
    return createUserEmailAlias(userId, requestBody, new CreateUserEmailAliasHeaders());
  }

  public EmailAlias createUserEmailAlias(String userId, CreateUserEmailAliasRequestBody requestBody, CreateUserEmailAliasHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/users/", convertToString(userId), "/email_aliases")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), EmailAlias.class);
  }

  public void deleteUserEmailAliasById(String userId, String emailAliasId) {
    deleteUserEmailAliasById(userId, emailAliasId, new DeleteUserEmailAliasByIdHeaders());
  }

  public void deleteUserEmailAliasById(String userId, String emailAliasId, DeleteUserEmailAliasByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/users/", convertToString(userId), "/email_aliases/", convertToString(emailAliasId))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class EmailAliasesManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public EmailAliasesManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public EmailAliasesManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public EmailAliasesManager build() {
      return new EmailAliasesManager(this);
    }

  }

}
