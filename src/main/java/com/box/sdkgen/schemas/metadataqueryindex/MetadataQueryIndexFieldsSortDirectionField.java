package com.box.sdkgen.schemas.metadataqueryindex;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum MetadataQueryIndexFieldsSortDirectionField {
  ASC("asc"),
  DESC("desc");

  private final String value;

  MetadataQueryIndexFieldsSortDirectionField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class MetadataQueryIndexFieldsSortDirectionFieldDeserializer
      extends JsonDeserializer<EnumWrapper<MetadataQueryIndexFieldsSortDirectionField>> {

    public MetadataQueryIndexFieldsSortDirectionFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<MetadataQueryIndexFieldsSortDirectionField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(MetadataQueryIndexFieldsSortDirectionField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<MetadataQueryIndexFieldsSortDirectionField>(value, v))
          .orElse(new EnumWrapper<MetadataQueryIndexFieldsSortDirectionField>(value));
    }
  }

  public static class MetadataQueryIndexFieldsSortDirectionFieldSerializer
      extends JsonSerializer<EnumWrapper<MetadataQueryIndexFieldsSortDirectionField>> {

    public MetadataQueryIndexFieldsSortDirectionFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<MetadataQueryIndexFieldsSortDirectionField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
