package com.box.sdkgen.managers.groups;

import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
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
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.groups.Groups;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.groupfull.GroupFull;
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

public enum UpdateGroupByIdRequestBodyMemberViewabilityLevelField {
  ADMINS_ONLY("admins_only"),
  ADMINS_AND_MEMBERS("admins_and_members"),
  ALL_MANAGED_USERS("all_managed_users");

  private final String value;

  UpdateGroupByIdRequestBodyMemberViewabilityLevelField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class UpdateGroupByIdRequestBodyMemberViewabilityLevelFieldDeserializer extends JsonDeserializer<EnumWrapper<UpdateGroupByIdRequestBodyMemberViewabilityLevelField>> {

    public UpdateGroupByIdRequestBodyMemberViewabilityLevelFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<UpdateGroupByIdRequestBodyMemberViewabilityLevelField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(UpdateGroupByIdRequestBodyMemberViewabilityLevelField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<UpdateGroupByIdRequestBodyMemberViewabilityLevelField>(value, v)).orElse(new EnumWrapper<UpdateGroupByIdRequestBodyMemberViewabilityLevelField>(value));
    }

  }

  public static class UpdateGroupByIdRequestBodyMemberViewabilityLevelFieldSerializer extends JsonSerializer<EnumWrapper<UpdateGroupByIdRequestBodyMemberViewabilityLevelField>> {

    public UpdateGroupByIdRequestBodyMemberViewabilityLevelFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<UpdateGroupByIdRequestBodyMemberViewabilityLevelField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
