package com.box.sdkgen.schemas.collaborations;

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
import com.box.sdkgen.schemas.collaboration.Collaboration;

public enum CollaborationsOrderDirectionField {
  ASC("ASC"),
  DESC("DESC");

  private final String value;

  CollaborationsOrderDirectionField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CollaborationsOrderDirectionFieldDeserializer extends JsonDeserializer<EnumWrapper<CollaborationsOrderDirectionField>> {

    public CollaborationsOrderDirectionFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CollaborationsOrderDirectionField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CollaborationsOrderDirectionField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<CollaborationsOrderDirectionField>(value, v)).orElse(new EnumWrapper<CollaborationsOrderDirectionField>(value));
    }

  }

  public static class CollaborationsOrderDirectionFieldSerializer extends JsonSerializer<EnumWrapper<CollaborationsOrderDirectionField>> {

    public CollaborationsOrderDirectionFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<CollaborationsOrderDirectionField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
