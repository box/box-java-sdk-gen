package com.box.sdkgen.schemas.classificationtemplate;

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
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public enum ClassificationTemplateDisplayNameField {
  CLASSIFICATION("Classification");

  private final String value;

  ClassificationTemplateDisplayNameField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class ClassificationTemplateDisplayNameFieldDeserializer extends JsonDeserializer<EnumWrapper<ClassificationTemplateDisplayNameField>> {

    public ClassificationTemplateDisplayNameFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<ClassificationTemplateDisplayNameField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(ClassificationTemplateDisplayNameField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<ClassificationTemplateDisplayNameField>(value, v)).orElse(new EnumWrapper<ClassificationTemplateDisplayNameField>(value));
    }

  }

  public static class ClassificationTemplateDisplayNameFieldSerializer extends JsonSerializer<EnumWrapper<ClassificationTemplateDisplayNameField>> {

    public ClassificationTemplateDisplayNameFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<ClassificationTemplateDisplayNameField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
