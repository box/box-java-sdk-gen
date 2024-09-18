package com.box.sdkgen.managers.authorization;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.accesstoken.AccessToken;
import com.box.sdkgen.schemas.oauth2error.OAuth2Error;
import com.box.sdkgen.schemas.postoauth2token.PostOAuth2Token;
import com.box.sdkgen.schemas.postoauth2tokenrefreshaccesstoken.PostOAuth2TokenRefreshAccessToken;
import com.box.sdkgen.schemas.postoauth2revoke.PostOAuth2Revoke;
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

public class AuthorizationManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public AuthorizationManager() {
    this.networkSession = new NetworkSession();
  }

  protected AuthorizationManager(AuthorizationManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public void authorizeUser(AuthorizeUserQueryParams queryParams) {
    authorizeUser(queryParams, new AuthorizeUserHeaders());
  }

  public void authorizeUser(AuthorizeUserQueryParams queryParams, AuthorizeUserHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("response_type", convertToString(queryParams.getResponseType())), entryOf("client_id", convertToString(queryParams.getClientId())), entryOf("redirect_uri", convertToString(queryParams.getRedirectUri())), entryOf("state", convertToString(queryParams.getState())), entryOf("scope", convertToString(queryParams.getScope()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getOauth2Url(), "/authorize")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public AccessToken requestAccessToken(PostOAuth2Token requestBody) {
    return requestAccessToken(requestBody, new RequestAccessTokenHeaders());
  }

  public AccessToken requestAccessToken(PostOAuth2Token requestBody, RequestAccessTokenHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/oauth2/token")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/x-www-form-urlencoded").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), AccessToken.class);
  }

  public AccessToken refreshAccessToken(PostOAuth2TokenRefreshAccessToken requestBody) {
    return refreshAccessToken(requestBody, new RefreshAccessTokenHeaders());
  }

  public AccessToken refreshAccessToken(PostOAuth2TokenRefreshAccessToken requestBody, RefreshAccessTokenHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/oauth2/token#refresh")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/x-www-form-urlencoded").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), AccessToken.class);
  }

  public void revokeAccessToken(PostOAuth2Revoke requestBody) {
    revokeAccessToken(requestBody, new RevokeAccessTokenHeaders());
  }

  public void revokeAccessToken(PostOAuth2Revoke requestBody, RevokeAccessTokenHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/oauth2/revoke")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/x-www-form-urlencoded").responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class AuthorizationManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public AuthorizationManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public AuthorizationManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public AuthorizationManager build() {
      return new AuthorizationManager(this);
    }

  }

}
