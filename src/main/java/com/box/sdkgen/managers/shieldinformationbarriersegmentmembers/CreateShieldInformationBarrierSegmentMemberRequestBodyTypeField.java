package com.box.sdkgen.managers.shieldinformationbarriersegmentmembers;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentmember.ShieldInformationBarrierSegmentMember;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentmembers.ShieldInformationBarrierSegmentMembers;
import com.box.sdkgen.schemas.shieldinformationbarrierbase.ShieldInformationBarrierBase;
import com.box.sdkgen.schemas.userbase.UserBase;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.fasterxml.jackson.databind.JsonNode;

public enum CreateShieldInformationBarrierSegmentMemberRequestBodyTypeField {
  SHIELD_INFORMATION_BARRIER_SEGMENT_MEMBER("shield_information_barrier_segment_member");

  private final String value;

  CreateShieldInformationBarrierSegmentMemberRequestBodyTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CreateShieldInformationBarrierSegmentMemberRequestBodyTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<CreateShieldInformationBarrierSegmentMemberRequestBodyTypeField>> {

    public CreateShieldInformationBarrierSegmentMemberRequestBodyTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CreateShieldInformationBarrierSegmentMemberRequestBodyTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CreateShieldInformationBarrierSegmentMemberRequestBodyTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<CreateShieldInformationBarrierSegmentMemberRequestBodyTypeField>(value, v)).orElse(new EnumWrapper<CreateShieldInformationBarrierSegmentMemberRequestBodyTypeField>(value));
    }

  }

  public static class CreateShieldInformationBarrierSegmentMemberRequestBodyTypeFieldSerializer extends JsonSerializer<EnumWrapper<CreateShieldInformationBarrierSegmentMemberRequestBodyTypeField>> {

    public CreateShieldInformationBarrierSegmentMemberRequestBodyTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<CreateShieldInformationBarrierSegmentMemberRequestBodyTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
