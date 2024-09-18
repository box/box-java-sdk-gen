package com.box.sdkgen.schemas.userfull;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.userbase.UserBaseTypeField;
import com.box.sdkgen.schemas.userbase.UserBase;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.user.UserStatusField;
import com.box.sdkgen.schemas.user.UserNotificationEmailField;
import com.box.sdkgen.schemas.user.User;
import com.box.sdkgen.schemas.trackingcode.TrackingCode;

public enum UserFullRoleField {
  ADMIN("admin"),
  COADMIN("coadmin"),
  USER("user");

  private final String value;

  UserFullRoleField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class UserFullRoleFieldDeserializer extends JsonDeserializer<EnumWrapper<UserFullRoleField>> {

    public UserFullRoleFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<UserFullRoleField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(UserFullRoleField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<UserFullRoleField>(value, v)).orElse(new EnumWrapper<UserFullRoleField>(value));
    }

  }

  public static class UserFullRoleFieldSerializer extends JsonSerializer<EnumWrapper<UserFullRoleField>> {

    public UserFullRoleFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<UserFullRoleField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
