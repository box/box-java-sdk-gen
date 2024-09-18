package com.box.sdkgen.schemas.appitem;

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

public enum AppItemTypeField {
  APP_ITEM("app_item");

  private final String value;

  AppItemTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class AppItemTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<AppItemTypeField>> {

    public AppItemTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<AppItemTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(AppItemTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<AppItemTypeField>(value, v)).orElse(new EnumWrapper<AppItemTypeField>(value));
    }

  }

  public static class AppItemTypeFieldSerializer extends JsonSerializer<EnumWrapper<AppItemTypeField>> {

    public AppItemTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<AppItemTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
