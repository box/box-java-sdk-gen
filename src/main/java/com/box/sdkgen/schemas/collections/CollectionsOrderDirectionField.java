package com.box.sdkgen.schemas.collections;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.collection.Collection;

public enum CollectionsOrderDirectionField {
  ASC("ASC"),
  DESC("DESC");

  private final String value;

  CollectionsOrderDirectionField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CollectionsOrderDirectionFieldDeserializer extends JsonDeserializer<EnumWrapper<CollectionsOrderDirectionField>> {

    public CollectionsOrderDirectionFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CollectionsOrderDirectionField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CollectionsOrderDirectionField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<CollectionsOrderDirectionField>(value, v)).orElse(new EnumWrapper<CollectionsOrderDirectionField>(value));
    }

  }

  public static class CollectionsOrderDirectionFieldSerializer extends JsonSerializer<EnumWrapper<CollectionsOrderDirectionField>> {

    public CollectionsOrderDirectionFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<CollectionsOrderDirectionField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
