package com.box.sdkgen.box.jwtauth;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class JwtConfigAppSettings {

  @JsonProperty("clientID")
  protected final String clientId;

  protected final String clientSecret;

  protected final JwtConfigAppSettingsAppAuth appAuth;

  public JwtConfigAppSettings(
      @JsonProperty("clientID") String clientId,
      @JsonProperty("clientSecret") String clientSecret,
      @JsonProperty("appAuth") JwtConfigAppSettingsAppAuth appAuth) {
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.appAuth = appAuth;
  }

  public String getClientId() {
    return clientId;
  }

  public String getClientSecret() {
    return clientSecret;
  }

  public JwtConfigAppSettingsAppAuth getAppAuth() {
    return appAuth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JwtConfigAppSettings casted = (JwtConfigAppSettings) o;
    return Objects.equals(clientId, casted.clientId)
        && Objects.equals(clientSecret, casted.clientSecret)
        && Objects.equals(appAuth, casted.appAuth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, appAuth);
  }

  @Override
  public String toString() {
    return "JwtConfigAppSettings{"
        + "clientId='"
        + clientId
        + '\''
        + ", "
        + "clientSecret='"
        + clientSecret
        + '\''
        + ", "
        + "appAuth='"
        + appAuth
        + '\''
        + "}";
  }
}
