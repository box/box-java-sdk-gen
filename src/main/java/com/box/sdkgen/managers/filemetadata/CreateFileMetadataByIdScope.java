package com.box.sdkgen.managers.filemetadata;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum CreateFileMetadataByIdScope {
  GLOBAL("global"),
  ENTERPRISE("enterprise");

  private final String value;

  CreateFileMetadataByIdScope(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CreateFileMetadataByIdScopeDeserializer
      extends JsonDeserializer<EnumWrapper<CreateFileMetadataByIdScope>> {

    public CreateFileMetadataByIdScopeDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CreateFileMetadataByIdScope> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CreateFileMetadataByIdScope.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<CreateFileMetadataByIdScope>(value, v))
          .orElse(new EnumWrapper<CreateFileMetadataByIdScope>(value));
    }
  }

  public static class CreateFileMetadataByIdScopeSerializer
      extends JsonSerializer<EnumWrapper<CreateFileMetadataByIdScope>> {

    public CreateFileMetadataByIdScopeSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<CreateFileMetadataByIdScope> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
