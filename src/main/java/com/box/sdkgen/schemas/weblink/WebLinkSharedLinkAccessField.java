package com.box.sdkgen.schemas.weblink;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.weblinkbase.WebLinkBaseTypeField;
import com.box.sdkgen.schemas.weblinkbase.WebLinkBase;
import com.box.sdkgen.schemas.weblinkmini.WebLinkMini;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.usermini.UserMini;

public enum WebLinkSharedLinkAccessField {
  OPEN("open"),
  COMPANY("company"),
  COLLABORATORS("collaborators");

  private final String value;

  WebLinkSharedLinkAccessField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class WebLinkSharedLinkAccessFieldDeserializer extends JsonDeserializer<EnumWrapper<WebLinkSharedLinkAccessField>> {

    public WebLinkSharedLinkAccessFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<WebLinkSharedLinkAccessField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(WebLinkSharedLinkAccessField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<WebLinkSharedLinkAccessField>(value, v)).orElse(new EnumWrapper<WebLinkSharedLinkAccessField>(value));
    }

  }

  public static class WebLinkSharedLinkAccessFieldSerializer extends JsonSerializer<EnumWrapper<WebLinkSharedLinkAccessField>> {

    public WebLinkSharedLinkAccessFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<WebLinkSharedLinkAccessField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
