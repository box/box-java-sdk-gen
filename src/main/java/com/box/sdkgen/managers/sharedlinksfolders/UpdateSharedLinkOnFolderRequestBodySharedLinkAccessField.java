package com.box.sdkgen.managers.sharedlinksfolders;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.box.sdkgen.serialization.json.Valuable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum UpdateSharedLinkOnFolderRequestBodySharedLinkAccessField implements Valuable {
  OPEN("open"),
  COMPANY("company"),
  COLLABORATORS("collaborators");

  private final String value;

  UpdateSharedLinkOnFolderRequestBodySharedLinkAccessField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class UpdateSharedLinkOnFolderRequestBodySharedLinkAccessFieldDeserializer
      extends JsonDeserializer<
          EnumWrapper<UpdateSharedLinkOnFolderRequestBodySharedLinkAccessField>> {

    public UpdateSharedLinkOnFolderRequestBodySharedLinkAccessFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<UpdateSharedLinkOnFolderRequestBodySharedLinkAccessField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(UpdateSharedLinkOnFolderRequestBodySharedLinkAccessField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(
              (v) ->
                  new EnumWrapper<UpdateSharedLinkOnFolderRequestBodySharedLinkAccessField>(
                      value, v))
          .orElse(new EnumWrapper<UpdateSharedLinkOnFolderRequestBodySharedLinkAccessField>(value));
    }
  }

  public static class UpdateSharedLinkOnFolderRequestBodySharedLinkAccessFieldSerializer
      extends JsonSerializer<
          EnumWrapper<UpdateSharedLinkOnFolderRequestBodySharedLinkAccessField>> {

    public UpdateSharedLinkOnFolderRequestBodySharedLinkAccessFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<UpdateSharedLinkOnFolderRequestBodySharedLinkAccessField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
