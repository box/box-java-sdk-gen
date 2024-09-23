package com.box.sdkgen.managers.classifications;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum CreateClassificationTemplateRequestBodyFieldsTypeField {
  ENUM("enum");

  private final String value;

  CreateClassificationTemplateRequestBodyFieldsTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CreateClassificationTemplateRequestBodyFieldsTypeFieldDeserializer
      extends JsonDeserializer<
          EnumWrapper<CreateClassificationTemplateRequestBodyFieldsTypeField>> {

    public CreateClassificationTemplateRequestBodyFieldsTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CreateClassificationTemplateRequestBodyFieldsTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CreateClassificationTemplateRequestBodyFieldsTypeField.values())
          .filter(v -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(
              v ->
                  new EnumWrapper<CreateClassificationTemplateRequestBodyFieldsTypeField>(value, v))
          .orElse(new EnumWrapper<CreateClassificationTemplateRequestBodyFieldsTypeField>(value));
    }
  }

  public static class CreateClassificationTemplateRequestBodyFieldsTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<CreateClassificationTemplateRequestBodyFieldsTypeField>> {

    public CreateClassificationTemplateRequestBodyFieldsTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<CreateClassificationTemplateRequestBodyFieldsTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
