package com.box.sdkgen.box.developertokenauth;

import com.box.sdkgen.box.errors.BoxSDKError;
import com.box.sdkgen.box.tokenstorage.InMemoryTokenStorage;
import com.box.sdkgen.box.tokenstorage.TokenStorage;
import com.box.sdkgen.managers.authorization.AuthorizationManager;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import com.box.sdkgen.schemas.accesstoken.AccessToken;
import com.box.sdkgen.schemas.postoauth2revoke.PostOAuth2Revoke;
import com.box.sdkgen.schemas.postoauth2token.PostOAuth2Token;
import com.box.sdkgen.schemas.postoauth2token.PostOAuth2TokenGrantTypeField;
import com.box.sdkgen.schemas.postoauth2token.PostOAuth2TokenSubjectTokenTypeField;
import java.util.List;

public class BoxDeveloperTokenAuth implements Authentication {

  public final String token;

  public DeveloperTokenConfig config;

  public final TokenStorage tokenStorage;

  public BoxDeveloperTokenAuth(String token) {
    this.token = token;
    this.config = new DeveloperTokenConfig();
    this.tokenStorage =
        new InMemoryTokenStorage.InMemoryTokenStorageBuilder()
            .token(new AccessToken.AccessTokenBuilder().accessToken(this.token).build())
            .build();
  }

  protected BoxDeveloperTokenAuth(BoxDeveloperTokenAuthBuilder builder) {
    this.token = builder.token;
    this.config = builder.config;
    this.tokenStorage = builder.tokenStorage;
  }

  public AccessToken retrieveToken() {
    return retrieveToken(null);
  }

  @Override
  public AccessToken retrieveToken(NetworkSession networkSession) {
    AccessToken token = this.tokenStorage.get();
    if (token == null) {
      throw new BoxSDKError("No access token is available.");
    }
    return token;
  }

  public AccessToken refreshToken() {
    return refreshToken(null);
  }

  @Override
  public AccessToken refreshToken(NetworkSession networkSession) {
    throw new BoxSDKError("Developer token has expired. Please provide a new one.");
  }

  public String retrieveAuthorizationHeader() {
    return retrieveAuthorizationHeader(null);
  }

  @Override
  public String retrieveAuthorizationHeader(NetworkSession networkSession) {
    AccessToken token = this.retrieveToken(networkSession);
    return String.join("", "Bearer ", token.getAccessToken());
  }

  public void revokeToken() {
    revokeToken(null);
  }

  @Override
  public void revokeToken(NetworkSession networkSession) {
    AccessToken token = this.tokenStorage.get();
    if (token == null) {
      return;
    }
    AuthorizationManager authManager = new AuthorizationManager();
    authManager.revokeAccessToken(
        new PostOAuth2Revoke.PostOAuth2RevokeBuilder()
            .clientId(this.config.getClientId())
            .clientSecret(this.config.getClientSecret())
            .token(token.getAccessToken())
            .build());
    this.tokenStorage.clear();
  }

  @Override
  public AccessToken downscopeToken(
      List<String> scopes, String resource, String sharedLink, NetworkSession networkSession) {
    AccessToken token = this.tokenStorage.get();
    if (token == null || token.getAccessToken() == null) {
      throw new BoxSDKError("No access token is available.");
    }
    AuthorizationManager authManager = new AuthorizationManager();
    AccessToken downscopedToken =
        authManager.requestAccessToken(
            new PostOAuth2Token.PostOAuth2TokenBuilder(
                    PostOAuth2TokenGrantTypeField.URN_IETF_PARAMS_OAUTH_GRANT_TYPE_TOKEN_EXCHANGE)
                .subjectToken(token.getAccessToken())
                .subjectTokenType(
                    PostOAuth2TokenSubjectTokenTypeField
                        .URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ACCESS_TOKEN)
                .resource(resource)
                .scope(String.join(" ", scopes))
                .boxSharedLink(sharedLink)
                .build());
    return downscopedToken;
  }

  public static class BoxDeveloperTokenAuthBuilder {

    protected final String token;

    protected DeveloperTokenConfig config;

    protected TokenStorage tokenStorage;

    public BoxDeveloperTokenAuthBuilder(String token) {
      this.token = token;
      this.config = new DeveloperTokenConfig();
      this.tokenStorage =
          new InMemoryTokenStorage.InMemoryTokenStorageBuilder()
              .token(new AccessToken.AccessTokenBuilder().accessToken(this.token).build())
              .build();
    }

    public BoxDeveloperTokenAuthBuilder config(DeveloperTokenConfig config) {
      this.config = config;
      return this;
    }

    public BoxDeveloperTokenAuthBuilder tokenStorage(TokenStorage tokenStorage) {
      this.tokenStorage = tokenStorage;
      return this;
    }

    public BoxDeveloperTokenAuth build() {
      return new BoxDeveloperTokenAuth(this);
    }
  }
}
