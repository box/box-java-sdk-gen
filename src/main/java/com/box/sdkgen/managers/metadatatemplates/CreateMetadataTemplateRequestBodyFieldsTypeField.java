package com.box.sdkgen.managers.metadatatemplates;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum CreateMetadataTemplateRequestBodyFieldsTypeField {
  STRING("string"),
  FLOAT("float"),
  DATE("date"),
  ENUM("enum"),
  MULTISELECT("multiSelect");

  private final String value;

  CreateMetadataTemplateRequestBodyFieldsTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CreateMetadataTemplateRequestBodyFieldsTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<CreateMetadataTemplateRequestBodyFieldsTypeField>> {

    public CreateMetadataTemplateRequestBodyFieldsTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CreateMetadataTemplateRequestBodyFieldsTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CreateMetadataTemplateRequestBodyFieldsTypeField.values())
          .filter(v -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(v -> new EnumWrapper<CreateMetadataTemplateRequestBodyFieldsTypeField>(value, v))
          .orElse(new EnumWrapper<CreateMetadataTemplateRequestBodyFieldsTypeField>(value));
    }
  }

  public static class CreateMetadataTemplateRequestBodyFieldsTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<CreateMetadataTemplateRequestBodyFieldsTypeField>> {

    public CreateMetadataTemplateRequestBodyFieldsTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<CreateMetadataTemplateRequestBodyFieldsTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
