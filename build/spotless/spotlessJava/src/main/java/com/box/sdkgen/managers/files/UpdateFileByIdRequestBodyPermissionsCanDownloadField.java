package com.box.sdkgen.managers.files;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum UpdateFileByIdRequestBodyPermissionsCanDownloadField {
  OPEN("open"),
  COMPANY("company");

  private final String value;

  UpdateFileByIdRequestBodyPermissionsCanDownloadField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class UpdateFileByIdRequestBodyPermissionsCanDownloadFieldDeserializer
      extends JsonDeserializer<EnumWrapper<UpdateFileByIdRequestBodyPermissionsCanDownloadField>> {

    public UpdateFileByIdRequestBodyPermissionsCanDownloadFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<UpdateFileByIdRequestBodyPermissionsCanDownloadField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(UpdateFileByIdRequestBodyPermissionsCanDownloadField.values())
          .filter(v -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(v -> new EnumWrapper<UpdateFileByIdRequestBodyPermissionsCanDownloadField>(value, v))
          .orElse(new EnumWrapper<UpdateFileByIdRequestBodyPermissionsCanDownloadField>(value));
    }
  }

  public static class UpdateFileByIdRequestBodyPermissionsCanDownloadFieldSerializer
      extends JsonSerializer<EnumWrapper<UpdateFileByIdRequestBodyPermissionsCanDownloadField>> {

    public UpdateFileByIdRequestBodyPermissionsCanDownloadFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<UpdateFileByIdRequestBodyPermissionsCanDownloadField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
