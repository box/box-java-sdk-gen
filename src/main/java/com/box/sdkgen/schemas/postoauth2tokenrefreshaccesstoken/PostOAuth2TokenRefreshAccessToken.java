package com.box.sdkgen.schemas.postoauth2tokenrefreshaccesstoken;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class PostOAuth2TokenRefreshAccessToken {

  @JsonDeserialize(
      using =
          PostOAuth2TokenRefreshAccessTokenGrantTypeField
              .PostOAuth2TokenRefreshAccessTokenGrantTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          PostOAuth2TokenRefreshAccessTokenGrantTypeField
              .PostOAuth2TokenRefreshAccessTokenGrantTypeFieldSerializer.class)
  @JsonProperty("grant_type")
  protected EnumWrapper<PostOAuth2TokenRefreshAccessTokenGrantTypeField> grantType;

  @JsonProperty("client_id")
  protected final String clientId;

  @JsonProperty("client_secret")
  protected final String clientSecret;

  @JsonProperty("refresh_token")
  protected final String refreshToken;

  public PostOAuth2TokenRefreshAccessToken(
      @JsonProperty("client_id") String clientId,
      @JsonProperty("client_secret") String clientSecret,
      @JsonProperty("refresh_token") String refreshToken) {
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.refreshToken = refreshToken;
    this.grantType =
        new EnumWrapper<PostOAuth2TokenRefreshAccessTokenGrantTypeField>(
            PostOAuth2TokenRefreshAccessTokenGrantTypeField.REFRESH_TOKEN.getValue(),
            PostOAuth2TokenRefreshAccessTokenGrantTypeField.REFRESH_TOKEN);
  }

  protected PostOAuth2TokenRefreshAccessToken(PostOAuth2TokenRefreshAccessTokenBuilder builder) {
    this.grantType = builder.grantType;
    this.clientId = builder.clientId;
    this.clientSecret = builder.clientSecret;
    this.refreshToken = builder.refreshToken;
  }

  public EnumWrapper<PostOAuth2TokenRefreshAccessTokenGrantTypeField> getGrantType() {
    return grantType;
  }

  public String getClientId() {
    return clientId;
  }

  public String getClientSecret() {
    return clientSecret;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostOAuth2TokenRefreshAccessToken casted = (PostOAuth2TokenRefreshAccessToken) o;
    return Objects.equals(grantType, casted.grantType)
        && Objects.equals(clientId, casted.clientId)
        && Objects.equals(clientSecret, casted.clientSecret)
        && Objects.equals(refreshToken, casted.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType, clientId, clientSecret, refreshToken);
  }

  @Override
  public String toString() {
    return "PostOAuth2TokenRefreshAccessToken{"
        + "grantType='"
        + grantType
        + '\''
        + ", "
        + "clientId='"
        + clientId
        + '\''
        + ", "
        + "clientSecret='"
        + clientSecret
        + '\''
        + ", "
        + "refreshToken='"
        + refreshToken
        + '\''
        + "}";
  }

  public static class PostOAuth2TokenRefreshAccessTokenBuilder {

    protected EnumWrapper<PostOAuth2TokenRefreshAccessTokenGrantTypeField> grantType;

    protected final String clientId;

    protected final String clientSecret;

    protected final String refreshToken;

    public PostOAuth2TokenRefreshAccessTokenBuilder(
        String clientId, String clientSecret, String refreshToken) {
      this.clientId = clientId;
      this.clientSecret = clientSecret;
      this.refreshToken = refreshToken;
      this.grantType =
          new EnumWrapper<PostOAuth2TokenRefreshAccessTokenGrantTypeField>(
              PostOAuth2TokenRefreshAccessTokenGrantTypeField.REFRESH_TOKEN.getValue(),
              PostOAuth2TokenRefreshAccessTokenGrantTypeField.REFRESH_TOKEN);
    }

    public PostOAuth2TokenRefreshAccessTokenBuilder grantType(
        EnumWrapper<PostOAuth2TokenRefreshAccessTokenGrantTypeField> grantType) {
      this.grantType = grantType;
      return this;
    }

    public PostOAuth2TokenRefreshAccessTokenBuilder grantType(
        PostOAuth2TokenRefreshAccessTokenGrantTypeField grantType) {
      this.grantType =
          new EnumWrapper<PostOAuth2TokenRefreshAccessTokenGrantTypeField>(
              grantType.getValue(), grantType);
      return this;
    }

    public PostOAuth2TokenRefreshAccessToken build() {
      return new PostOAuth2TokenRefreshAccessToken(this);
    }
  }
}
