package com.box.sdkgen.managers.folders;

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

public enum GetFolderItemsQueryParamsDirectionField implements Valuable {
  ASC("ASC"),
  DESC("DESC");

  private final String value;

  GetFolderItemsQueryParamsDirectionField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class GetFolderItemsQueryParamsDirectionFieldDeserializer
      extends JsonDeserializer<EnumWrapper<GetFolderItemsQueryParamsDirectionField>> {

    public GetFolderItemsQueryParamsDirectionFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<GetFolderItemsQueryParamsDirectionField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(GetFolderItemsQueryParamsDirectionField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<GetFolderItemsQueryParamsDirectionField>(value, v))
          .orElse(new EnumWrapper<GetFolderItemsQueryParamsDirectionField>(value));
    }
  }

  public static class GetFolderItemsQueryParamsDirectionFieldSerializer
      extends JsonSerializer<EnumWrapper<GetFolderItemsQueryParamsDirectionField>> {

    public GetFolderItemsQueryParamsDirectionFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<GetFolderItemsQueryParamsDirectionField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
