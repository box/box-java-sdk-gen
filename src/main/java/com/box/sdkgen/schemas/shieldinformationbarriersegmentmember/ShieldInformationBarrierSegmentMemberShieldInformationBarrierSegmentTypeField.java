package com.box.sdkgen.schemas.shieldinformationbarriersegmentmember;

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
import com.box.sdkgen.schemas.shieldinformationbarriersegmentmemberbase.ShieldInformationBarrierSegmentMemberBaseTypeField;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentmemberbase.ShieldInformationBarrierSegmentMemberBase;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentmembermini.ShieldInformationBarrierSegmentMemberMini;
import com.box.sdkgen.schemas.shieldinformationbarrierbase.ShieldInformationBarrierBase;
import com.box.sdkgen.schemas.userbase.UserBase;

public enum ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField {
  SHIELD_INFORMATION_BARRIER_SEGMENT("shield_information_barrier_segment");

  private final String value;

  ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField>> {

    public ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField>(value, v)).orElse(new EnumWrapper<ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField>(value));
    }

  }

  public static class ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeFieldSerializer extends JsonSerializer<EnumWrapper<ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField>> {

    public ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
