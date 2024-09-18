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

public enum ClassificationTemplateTemplateKeyField {
  SECURITYCLASSIFICATION_6VMVOCHWUWO("securityClassification-6VMVochwUWo");

  private final String value;

  ClassificationTemplateTemplateKeyField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class ClassificationTemplateTemplateKeyFieldDeserializer extends JsonDeserializer<EnumWrapper<ClassificationTemplateTemplateKeyField>> {

    public ClassificationTemplateTemplateKeyFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<ClassificationTemplateTemplateKeyField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(ClassificationTemplateTemplateKeyField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<ClassificationTemplateTemplateKeyField>(value, v)).orElse(new EnumWrapper<ClassificationTemplateTemplateKeyField>(value));
    }

  }

  public static class ClassificationTemplateTemplateKeyFieldSerializer extends JsonSerializer<EnumWrapper<ClassificationTemplateTemplateKeyField>> {

    public ClassificationTemplateTemplateKeyFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<ClassificationTemplateTemplateKeyField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
