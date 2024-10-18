package com.box.sdkgen.schemas.storagepolicymini;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum StoragePolicyMiniTypeField {
  STORAGE_POLICY("storage_policy");

  private final String value;

  StoragePolicyMiniTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class StoragePolicyMiniTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<StoragePolicyMiniTypeField>> {

    public StoragePolicyMiniTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<StoragePolicyMiniTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(StoragePolicyMiniTypeField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<StoragePolicyMiniTypeField>(value, v))
          .orElse(new EnumWrapper<StoragePolicyMiniTypeField>(value));
    }
  }

  public static class StoragePolicyMiniTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<StoragePolicyMiniTypeField>> {

    public StoragePolicyMiniTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<StoragePolicyMiniTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
