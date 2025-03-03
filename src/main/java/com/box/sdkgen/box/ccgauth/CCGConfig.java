package com.box.sdkgen.box.ccgauth;

import com.box.sdkgen.box.tokenstorage.InMemoryTokenStorage;
import com.box.sdkgen.box.tokenstorage.TokenStorage;

public class CCGConfig {

  public final String clientId;

  public final String clientSecret;

  public String enterpriseId;

  public String userId;

  public TokenStorage tokenStorage;

  public CCGConfig(String clientId, String clientSecret) {
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.tokenStorage = new InMemoryTokenStorage();
  }

  protected CCGConfig(CCGConfigBuilder builder) {
    this.clientId = builder.clientId;
    this.clientSecret = builder.clientSecret;
    this.enterpriseId = builder.enterpriseId;
    this.userId = builder.userId;
    this.tokenStorage = builder.tokenStorage;
  }

  public String getClientId() {
    return clientId;
  }

  public String getClientSecret() {
    return clientSecret;
  }

  public String getEnterpriseId() {
    return enterpriseId;
  }

  public String getUserId() {
    return userId;
  }

  public TokenStorage getTokenStorage() {
    return tokenStorage;
  }

  public static class CCGConfigBuilder {

    protected final String clientId;

    protected final String clientSecret;

    protected String enterpriseId;

    protected String userId;

    protected TokenStorage tokenStorage;

    public CCGConfigBuilder(String clientId, String clientSecret) {
      this.clientId = clientId;
      this.clientSecret = clientSecret;
      this.tokenStorage = new InMemoryTokenStorage();
    }

    public CCGConfigBuilder enterpriseId(String enterpriseId) {
      this.enterpriseId = enterpriseId;
      return this;
    }

    public CCGConfigBuilder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public CCGConfigBuilder tokenStorage(TokenStorage tokenStorage) {
      this.tokenStorage = tokenStorage;
      return this;
    }

    public CCGConfig build() {
      return new CCGConfig(this);
    }
  }
}
