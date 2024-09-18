package com.box.sdkgen.schemas.templatesignerinput;

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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.signrequestprefilltag.SignRequestPrefillTag;

public enum TemplateSignerInputTypeField {
  SIGNATURE("signature"),
  DATE("date"),
  TEXT("text"),
  CHECKBOX("checkbox"),
  ATTACHMENT("attachment"),
  RADIO("radio"),
  DROPDOWN("dropdown");

  private final String value;

  TemplateSignerInputTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class TemplateSignerInputTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<TemplateSignerInputTypeField>> {

    public TemplateSignerInputTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<TemplateSignerInputTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(TemplateSignerInputTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<TemplateSignerInputTypeField>(value, v)).orElse(new EnumWrapper<TemplateSignerInputTypeField>(value));
    }

  }

  public static class TemplateSignerInputTypeFieldSerializer extends JsonSerializer<EnumWrapper<TemplateSignerInputTypeField>> {

    public TemplateSignerInputTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<TemplateSignerInputTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
