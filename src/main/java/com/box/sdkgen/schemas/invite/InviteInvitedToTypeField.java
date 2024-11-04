package com.box.sdkgen.schemas.invite;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.box.sdkgen.serialization.json.Valuable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum InviteInvitedToTypeField implements Valuable {
  ENTERPRISE("enterprise");

  private final String value;

  InviteInvitedToTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class InviteInvitedToTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<InviteInvitedToTypeField>> {

    public InviteInvitedToTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<InviteInvitedToTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(InviteInvitedToTypeField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<InviteInvitedToTypeField>(value, v))
          .orElse(new EnumWrapper<InviteInvitedToTypeField>(value));
    }
  }

  public static class InviteInvitedToTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<InviteInvitedToTypeField>> {

    public InviteInvitedToTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<InviteInvitedToTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
