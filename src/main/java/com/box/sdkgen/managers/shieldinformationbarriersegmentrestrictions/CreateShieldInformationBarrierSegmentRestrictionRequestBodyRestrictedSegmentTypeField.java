package com.box.sdkgen.managers.shieldinformationbarriersegmentrestrictions;

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
import com.box.sdkgen.schemas.shieldinformationbarriersegmentrestriction.ShieldInformationBarrierSegmentRestriction;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentrestrictions.ShieldInformationBarrierSegmentRestrictions;
import com.box.sdkgen.schemas.shieldinformationbarrierbase.ShieldInformationBarrierBase;
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

public enum CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField {
  SHIELD_INFORMATION_BARRIER_SEGMENT("shield_information_barrier_segment");

  private final String value;

  CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField>> {

    public CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField>(value, v)).orElse(new EnumWrapper<CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField>(value));
    }

  }

  public static class CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeFieldSerializer extends JsonSerializer<EnumWrapper<CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField>> {

    public CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
