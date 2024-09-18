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

public enum ClassificationTemplateFieldsDisplayNameField {
  CLASSIFICATION("Classification");

  private final String value;

  ClassificationTemplateFieldsDisplayNameField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class ClassificationTemplateFieldsDisplayNameFieldDeserializer extends JsonDeserializer<EnumWrapper<ClassificationTemplateFieldsDisplayNameField>> {

    public ClassificationTemplateFieldsDisplayNameFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<ClassificationTemplateFieldsDisplayNameField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(ClassificationTemplateFieldsDisplayNameField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<ClassificationTemplateFieldsDisplayNameField>(value, v)).orElse(new EnumWrapper<ClassificationTemplateFieldsDisplayNameField>(value));
    }

  }

  public static class ClassificationTemplateFieldsDisplayNameFieldSerializer extends JsonSerializer<EnumWrapper<ClassificationTemplateFieldsDisplayNameField>> {

    public ClassificationTemplateFieldsDisplayNameFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<ClassificationTemplateFieldsDisplayNameField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
