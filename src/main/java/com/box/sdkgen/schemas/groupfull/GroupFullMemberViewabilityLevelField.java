package com.box.sdkgen.schemas.groupfull;

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
import com.box.sdkgen.schemas.groupbase.GroupBaseTypeField;
import com.box.sdkgen.schemas.groupbase.GroupBase;
import com.box.sdkgen.schemas.groupmini.GroupMiniGroupTypeField;
import com.box.sdkgen.schemas.groupmini.GroupMini;
import com.box.sdkgen.schemas.group.Group;

public enum GroupFullMemberViewabilityLevelField {
  ADMINS_ONLY("admins_only"),
  ADMINS_AND_MEMBERS("admins_and_members"),
  ALL_MANAGED_USERS("all_managed_users");

  private final String value;

  GroupFullMemberViewabilityLevelField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class GroupFullMemberViewabilityLevelFieldDeserializer extends JsonDeserializer<EnumWrapper<GroupFullMemberViewabilityLevelField>> {

    public GroupFullMemberViewabilityLevelFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<GroupFullMemberViewabilityLevelField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(GroupFullMemberViewabilityLevelField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<GroupFullMemberViewabilityLevelField>(value, v)).orElse(new EnumWrapper<GroupFullMemberViewabilityLevelField>(value));
    }

  }

  public static class GroupFullMemberViewabilityLevelFieldSerializer extends JsonSerializer<EnumWrapper<GroupFullMemberViewabilityLevelField>> {

    public GroupFullMemberViewabilityLevelFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<GroupFullMemberViewabilityLevelField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
