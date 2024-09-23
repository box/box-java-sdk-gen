package com.box.sdkgen.box.developertokenauth;

import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import com.box.sdkgen.schemas.accesstoken.AccessToken;
import java.util.List;

public class BoxDeveloperTokenAuth implements Authentication {

  public final String token;

  public DeveloperTokenConfig config;

  public BoxDeveloperTokenAuth(String token) {
    this.token = token;
    this.config = new DeveloperTokenConfig();
  }

  protected BoxDeveloperTokenAuth(BoxDeveloperTokenAuthBuilder builder) {
    this.token = builder.token;
    this.config = builder.config;
  }

  @Override
  public AccessToken retrieveToken(NetworkSession networkSession) {
    return new AccessToken.AccessTokenBuilder().accessToken(token).build();
  }

  @Override
  public AccessToken refreshToken(NetworkSession networkSession) {
    return null;
  }

  @Override
  public String retrieveAuthorizationHeader(NetworkSession networkSession) {
    return "Bearer " + token;
  }

  @Override
  public void revokeToken(NetworkSession networkSession) {}

  @Override
  public AccessToken downscopeToken(
      List<String> scopes, String resource, String sharedLink, NetworkSession networkSession) {
    return null;
  }

  public static class BoxDeveloperTokenAuthBuilder {

    protected final String token;

    protected DeveloperTokenConfig config;

    public BoxDeveloperTokenAuthBuilder(String token) {
      this.token = token;
      this.config = new DeveloperTokenConfig();
    }

    public BoxDeveloperTokenAuthBuilder config(DeveloperTokenConfig config) {
      this.config = config;
      return this;
    }

    public BoxDeveloperTokenAuth build() {
      return new BoxDeveloperTokenAuth(this);
    }
  }
}
