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

public class AuthorizeUserQueryParams {

  public final EnumWrapper<AuthorizeUserQueryParamsResponseTypeField> responseType;

  public final String clientId;

  public String redirectUri;

  public String state;

  public String scope;

  public AuthorizeUserQueryParams(EnumWrapper<AuthorizeUserQueryParamsResponseTypeField> responseType, String clientId) {
    this.responseType = responseType;
    this.clientId = clientId;
  }

  public AuthorizeUserQueryParams(AuthorizeUserQueryParamsResponseTypeField responseType, String clientId) {
    this.responseType = new EnumWrapper<AuthorizeUserQueryParamsResponseTypeField>(responseType.getValue(), responseType);
    this.clientId = clientId;
  }

  protected AuthorizeUserQueryParams(AuthorizeUserQueryParamsBuilder builder) {
    this.responseType = builder.responseType;
    this.clientId = builder.clientId;
    this.redirectUri = builder.redirectUri;
    this.state = builder.state;
    this.scope = builder.scope;
  }

  public EnumWrapper<AuthorizeUserQueryParamsResponseTypeField> getResponseType() {
    return responseType;
  }

  public String getClientId() {
    return clientId;
  }

  public String getRedirectUri() {
    return redirectUri;
  }

  public String getState() {
    return state;
  }

  public String getScope() {
    return scope;
  }

  public static class AuthorizeUserQueryParamsBuilder {

    protected final EnumWrapper<AuthorizeUserQueryParamsResponseTypeField> responseType;

    protected final String clientId;

    protected String redirectUri;

    protected String state;

    protected String scope;

    public AuthorizeUserQueryParamsBuilder(AuthorizeUserQueryParamsResponseTypeField responseType, String clientId) {
      this.responseType = new EnumWrapper<AuthorizeUserQueryParamsResponseTypeField>(responseType.getValue(), responseType);
      this.clientId = clientId;
    }

    public AuthorizeUserQueryParamsBuilder redirectUri(String redirectUri) {
      this.redirectUri = redirectUri;
      return this;
    }

    public AuthorizeUserQueryParamsBuilder state(String state) {
      this.state = state;
      return this;
    }

    public AuthorizeUserQueryParamsBuilder scope(String scope) {
      this.scope = scope;
      return this;
    }

    public AuthorizeUserQueryParams build() {
      return new AuthorizeUserQueryParams(this);
    }

  }

}
