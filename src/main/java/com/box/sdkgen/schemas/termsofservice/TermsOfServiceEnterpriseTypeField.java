package com.box.sdkgen.schemas.termsofservice;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum TermsOfServiceEnterpriseTypeField {
  ENTERPRISE("enterprise");

  private final String value;

  TermsOfServiceEnterpriseTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class TermsOfServiceEnterpriseTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<TermsOfServiceEnterpriseTypeField>> {

    public TermsOfServiceEnterpriseTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<TermsOfServiceEnterpriseTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(TermsOfServiceEnterpriseTypeField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<TermsOfServiceEnterpriseTypeField>(value, v))
          .orElse(new EnumWrapper<TermsOfServiceEnterpriseTypeField>(value));
    }
  }

  public static class TermsOfServiceEnterpriseTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<TermsOfServiceEnterpriseTypeField>> {

    public TermsOfServiceEnterpriseTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<TermsOfServiceEnterpriseTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
