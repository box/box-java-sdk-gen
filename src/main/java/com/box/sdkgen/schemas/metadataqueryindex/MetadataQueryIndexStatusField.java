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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

public enum MetadataQueryIndexStatusField {
  BUILDING("building"),
  ACTIVE("active"),
  DISABLED("disabled");

  private final String value;

  MetadataQueryIndexStatusField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class MetadataQueryIndexStatusFieldDeserializer extends JsonDeserializer<EnumWrapper<MetadataQueryIndexStatusField>> {

    public MetadataQueryIndexStatusFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<MetadataQueryIndexStatusField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(MetadataQueryIndexStatusField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<MetadataQueryIndexStatusField>(value, v)).orElse(new EnumWrapper<MetadataQueryIndexStatusField>(value));
    }

  }

  public static class MetadataQueryIndexStatusFieldSerializer extends JsonSerializer<EnumWrapper<MetadataQueryIndexStatusField>> {

    public MetadataQueryIndexStatusFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<MetadataQueryIndexStatusField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
