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

public enum DeleteMetadataTemplateScope {
  GLOBAL("global"),
  ENTERPRISE("enterprise");

  private final String value;

  DeleteMetadataTemplateScope(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class DeleteMetadataTemplateScopeDeserializer
      extends JsonDeserializer<EnumWrapper<DeleteMetadataTemplateScope>> {

    public DeleteMetadataTemplateScopeDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<DeleteMetadataTemplateScope> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(DeleteMetadataTemplateScope.values())
          .filter(v -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(v -> new EnumWrapper<DeleteMetadataTemplateScope>(value, v))
          .orElse(new EnumWrapper<DeleteMetadataTemplateScope>(value));
    }
  }

  public static class DeleteMetadataTemplateScopeSerializer
      extends JsonSerializer<EnumWrapper<DeleteMetadataTemplateScope>> {

    public DeleteMetadataTemplateScopeSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<DeleteMetadataTemplateScope> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
