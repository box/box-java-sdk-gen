package com.box.sdkgen.schemas.groupmembership;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.groupmini.GroupMini;

public enum GroupMembershipTypeField {
  GROUP_MEMBERSHIP("group_membership");

  private final String value;

  GroupMembershipTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class GroupMembershipTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<GroupMembershipTypeField>> {

    public GroupMembershipTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<GroupMembershipTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(GroupMembershipTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<GroupMembershipTypeField>(value, v)).orElse(new EnumWrapper<GroupMembershipTypeField>(value));
    }

  }

  public static class GroupMembershipTypeFieldSerializer extends JsonSerializer<EnumWrapper<GroupMembershipTypeField>> {

    public GroupMembershipTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<GroupMembershipTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
