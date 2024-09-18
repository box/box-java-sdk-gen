package com.box.sdkgen.schemas.shieldinformationbarrierreport;

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
import com.box.sdkgen.schemas.shieldinformationbarrierreportbase.ShieldInformationBarrierReportBaseTypeField;
import com.box.sdkgen.schemas.shieldinformationbarrierreportbase.ShieldInformationBarrierReportBase;
import com.box.sdkgen.schemas.shieldinformationbarrierreference.ShieldInformationBarrierReference;
import com.box.sdkgen.schemas.shieldinformationbarrierreportdetails.ShieldInformationBarrierReportDetails;
import com.box.sdkgen.schemas.userbase.UserBase;

public enum ShieldInformationBarrierReportStatusField {
  PENDING("pending"),
  ERROR("error"),
  DONE("done"),
  CANCELLED("cancelled");

  private final String value;

  ShieldInformationBarrierReportStatusField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class ShieldInformationBarrierReportStatusFieldDeserializer extends JsonDeserializer<EnumWrapper<ShieldInformationBarrierReportStatusField>> {

    public ShieldInformationBarrierReportStatusFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<ShieldInformationBarrierReportStatusField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(ShieldInformationBarrierReportStatusField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<ShieldInformationBarrierReportStatusField>(value, v)).orElse(new EnumWrapper<ShieldInformationBarrierReportStatusField>(value));
    }

  }

  public static class ShieldInformationBarrierReportStatusFieldSerializer extends JsonSerializer<EnumWrapper<ShieldInformationBarrierReportStatusField>> {

    public ShieldInformationBarrierReportStatusFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<ShieldInformationBarrierReportStatusField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
