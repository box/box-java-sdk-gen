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

public enum AuthorizeUserQueryParamsResponseTypeField {
  CODE("code");

  private final String value;

  AuthorizeUserQueryParamsResponseTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class AuthorizeUserQueryParamsResponseTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<AuthorizeUserQueryParamsResponseTypeField>> {

    public AuthorizeUserQueryParamsResponseTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<AuthorizeUserQueryParamsResponseTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(AuthorizeUserQueryParamsResponseTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<AuthorizeUserQueryParamsResponseTypeField>(value, v)).orElse(new EnumWrapper<AuthorizeUserQueryParamsResponseTypeField>(value));
    }

  }

  public static class AuthorizeUserQueryParamsResponseTypeFieldSerializer extends JsonSerializer<EnumWrapper<AuthorizeUserQueryParamsResponseTypeField>> {

    public AuthorizeUserQueryParamsResponseTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<AuthorizeUserQueryParamsResponseTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
