package com.box.sdkgen.managers.folders;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum CreateFolderRequestBodyFolderUploadEmailAccessField {
  OPEN("open"),
  COLLABORATORS("collaborators");

  private final String value;

  CreateFolderRequestBodyFolderUploadEmailAccessField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CreateFolderRequestBodyFolderUploadEmailAccessFieldDeserializer
      extends JsonDeserializer<EnumWrapper<CreateFolderRequestBodyFolderUploadEmailAccessField>> {

    public CreateFolderRequestBodyFolderUploadEmailAccessFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CreateFolderRequestBodyFolderUploadEmailAccessField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CreateFolderRequestBodyFolderUploadEmailAccessField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(
              (v) -> new EnumWrapper<CreateFolderRequestBodyFolderUploadEmailAccessField>(value, v))
          .orElse(new EnumWrapper<CreateFolderRequestBodyFolderUploadEmailAccessField>(value));
    }
  }

  public static class CreateFolderRequestBodyFolderUploadEmailAccessFieldSerializer
      extends JsonSerializer<EnumWrapper<CreateFolderRequestBodyFolderUploadEmailAccessField>> {

    public CreateFolderRequestBodyFolderUploadEmailAccessFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<CreateFolderRequestBodyFolderUploadEmailAccessField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
