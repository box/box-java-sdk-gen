package com.box.sdkgen.schemas.user;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum UserStatusField {
  ACTIVE("active"),
  INACTIVE("inactive"),
  CANNOT_DELETE_EDIT("cannot_delete_edit"),
  CANNOT_DELETE_EDIT_UPLOAD("cannot_delete_edit_upload");

  private final String value;

  UserStatusField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class UserStatusFieldDeserializer
      extends JsonDeserializer<EnumWrapper<UserStatusField>> {

    public UserStatusFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<UserStatusField> deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(UserStatusField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<UserStatusField>(value, v))
          .orElse(new EnumWrapper<UserStatusField>(value));
    }
  }

  public static class UserStatusFieldSerializer
      extends JsonSerializer<EnumWrapper<UserStatusField>> {

    public UserStatusFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<UserStatusField> value, JsonGenerator gen, SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
