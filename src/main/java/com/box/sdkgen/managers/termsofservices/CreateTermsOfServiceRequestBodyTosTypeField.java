package com.box.sdkgen.managers.termsofservices;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum CreateTermsOfServiceRequestBodyTosTypeField {
  EXTERNAL("external"),
  MANAGED("managed");

  private final String value;

  CreateTermsOfServiceRequestBodyTosTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CreateTermsOfServiceRequestBodyTosTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<CreateTermsOfServiceRequestBodyTosTypeField>> {

    public CreateTermsOfServiceRequestBodyTosTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CreateTermsOfServiceRequestBodyTosTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CreateTermsOfServiceRequestBodyTosTypeField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<CreateTermsOfServiceRequestBodyTosTypeField>(value, v))
          .orElse(new EnumWrapper<CreateTermsOfServiceRequestBodyTosTypeField>(value));
    }
  }

  public static class CreateTermsOfServiceRequestBodyTosTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<CreateTermsOfServiceRequestBodyTosTypeField>> {

    public CreateTermsOfServiceRequestBodyTosTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<CreateTermsOfServiceRequestBodyTosTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
