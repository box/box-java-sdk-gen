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
import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.termsofservicebase.TermsOfServiceBaseTypeField;
import com.box.sdkgen.schemas.termsofservicebase.TermsOfServiceBase;

public enum TermsOfServiceStatusField {
  ENABLED("enabled"),
  DISABLED("disabled");

  private final String value;

  TermsOfServiceStatusField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class TermsOfServiceStatusFieldDeserializer extends JsonDeserializer<EnumWrapper<TermsOfServiceStatusField>> {

    public TermsOfServiceStatusFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<TermsOfServiceStatusField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(TermsOfServiceStatusField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<TermsOfServiceStatusField>(value, v)).orElse(new EnumWrapper<TermsOfServiceStatusField>(value));
    }

  }

  public static class TermsOfServiceStatusFieldSerializer extends JsonSerializer<EnumWrapper<TermsOfServiceStatusField>> {

    public TermsOfServiceStatusFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<TermsOfServiceStatusField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
