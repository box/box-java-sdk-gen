package com.box.sdkgen.schemas.metadatatemplate;

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

public enum MetadataTemplateFieldsTypeField {
  STRING("string"),
  FLOAT("float"),
  DATE("date"),
  ENUM("enum"),
  MULTISELECT("multiSelect"),
  INTEGER("integer");

  private final String value;

  MetadataTemplateFieldsTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class MetadataTemplateFieldsTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<MetadataTemplateFieldsTypeField>> {

    public MetadataTemplateFieldsTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<MetadataTemplateFieldsTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(MetadataTemplateFieldsTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<MetadataTemplateFieldsTypeField>(value, v)).orElse(new EnumWrapper<MetadataTemplateFieldsTypeField>(value));
    }

  }

  public static class MetadataTemplateFieldsTypeFieldSerializer extends JsonSerializer<EnumWrapper<MetadataTemplateFieldsTypeField>> {

    public MetadataTemplateFieldsTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<MetadataTemplateFieldsTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
