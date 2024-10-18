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

public enum UpdateFolderByIdRequestBodyFolderUploadEmailAccessField {
  OPEN("open"),
  COLLABORATORS("collaborators");

  private final String value;

  UpdateFolderByIdRequestBodyFolderUploadEmailAccessField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class UpdateFolderByIdRequestBodyFolderUploadEmailAccessFieldDeserializer
      extends JsonDeserializer<
          EnumWrapper<UpdateFolderByIdRequestBodyFolderUploadEmailAccessField>> {

    public UpdateFolderByIdRequestBodyFolderUploadEmailAccessFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<UpdateFolderByIdRequestBodyFolderUploadEmailAccessField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(UpdateFolderByIdRequestBodyFolderUploadEmailAccessField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(
              (v) ->
                  new EnumWrapper<UpdateFolderByIdRequestBodyFolderUploadEmailAccessField>(
                      value, v))
          .orElse(new EnumWrapper<UpdateFolderByIdRequestBodyFolderUploadEmailAccessField>(value));
    }
  }

  public static class UpdateFolderByIdRequestBodyFolderUploadEmailAccessFieldSerializer
      extends JsonSerializer<EnumWrapper<UpdateFolderByIdRequestBodyFolderUploadEmailAccessField>> {

    public UpdateFolderByIdRequestBodyFolderUploadEmailAccessFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<UpdateFolderByIdRequestBodyFolderUploadEmailAccessField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
