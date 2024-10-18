package com.box.sdkgen.schemas.weblink;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum WebLinkSharedLinkEffectiveAccessField {
  OPEN("open"),
  COMPANY("company"),
  COLLABORATORS("collaborators");

  private final String value;

  WebLinkSharedLinkEffectiveAccessField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class WebLinkSharedLinkEffectiveAccessFieldDeserializer
      extends JsonDeserializer<EnumWrapper<WebLinkSharedLinkEffectiveAccessField>> {

    public WebLinkSharedLinkEffectiveAccessFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<WebLinkSharedLinkEffectiveAccessField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(WebLinkSharedLinkEffectiveAccessField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<WebLinkSharedLinkEffectiveAccessField>(value, v))
          .orElse(new EnumWrapper<WebLinkSharedLinkEffectiveAccessField>(value));
    }
  }

  public static class WebLinkSharedLinkEffectiveAccessFieldSerializer
      extends JsonSerializer<EnumWrapper<WebLinkSharedLinkEffectiveAccessField>> {

    public WebLinkSharedLinkEffectiveAccessFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<WebLinkSharedLinkEffectiveAccessField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
