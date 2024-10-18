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

public enum ClassificationTemplateFieldsTypeField {
  ENUM("enum");

  private final String value;

  ClassificationTemplateFieldsTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class ClassificationTemplateFieldsTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<ClassificationTemplateFieldsTypeField>> {

    public ClassificationTemplateFieldsTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<ClassificationTemplateFieldsTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(ClassificationTemplateFieldsTypeField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<ClassificationTemplateFieldsTypeField>(value, v))
          .orElse(new EnumWrapper<ClassificationTemplateFieldsTypeField>(value));
    }
  }

  public static class ClassificationTemplateFieldsTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<ClassificationTemplateFieldsTypeField>> {

    public ClassificationTemplateFieldsTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<ClassificationTemplateFieldsTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
