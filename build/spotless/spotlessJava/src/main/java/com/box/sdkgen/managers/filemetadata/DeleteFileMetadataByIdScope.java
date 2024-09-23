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

public enum DeleteFileMetadataByIdScope {
  GLOBAL("global"),
  ENTERPRISE("enterprise");

  private final String value;

  DeleteFileMetadataByIdScope(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class DeleteFileMetadataByIdScopeDeserializer
      extends JsonDeserializer<EnumWrapper<DeleteFileMetadataByIdScope>> {

    public DeleteFileMetadataByIdScopeDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<DeleteFileMetadataByIdScope> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(DeleteFileMetadataByIdScope.values())
          .filter(v -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(v -> new EnumWrapper<DeleteFileMetadataByIdScope>(value, v))
          .orElse(new EnumWrapper<DeleteFileMetadataByIdScope>(value));
    }
  }

  public static class DeleteFileMetadataByIdScopeSerializer
      extends JsonSerializer<EnumWrapper<DeleteFileMetadataByIdScope>> {

    public DeleteFileMetadataByIdScopeSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<DeleteFileMetadataByIdScope> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
