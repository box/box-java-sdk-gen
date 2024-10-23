package com.box.sdkgen.schemas.commentbase;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum CommentBaseTypeField {
  COMMENT("comment");

  private final String value;

  CommentBaseTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CommentBaseTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<CommentBaseTypeField>> {

    public CommentBaseTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CommentBaseTypeField> deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CommentBaseTypeField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<CommentBaseTypeField>(value, v))
          .orElse(new EnumWrapper<CommentBaseTypeField>(value));
    }
  }

  public static class CommentBaseTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<CommentBaseTypeField>> {

    public CommentBaseTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<CommentBaseTypeField> value, JsonGenerator gen, SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
