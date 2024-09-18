package com.box.sdkgen.managers.classifications;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
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
import java.util.List;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.classificationtemplate.ClassificationTemplate;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;

public enum UpdateClassificationRequestBodyFieldKeyField {
  BOX__SECURITY__CLASSIFICATION__KEY("Box__Security__Classification__Key");

  private final String value;

  UpdateClassificationRequestBodyFieldKeyField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class UpdateClassificationRequestBodyFieldKeyFieldDeserializer extends JsonDeserializer<EnumWrapper<UpdateClassificationRequestBodyFieldKeyField>> {

    public UpdateClassificationRequestBodyFieldKeyFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<UpdateClassificationRequestBodyFieldKeyField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(UpdateClassificationRequestBodyFieldKeyField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<UpdateClassificationRequestBodyFieldKeyField>(value, v)).orElse(new EnumWrapper<UpdateClassificationRequestBodyFieldKeyField>(value));
    }

  }

  public static class UpdateClassificationRequestBodyFieldKeyFieldSerializer extends JsonSerializer<EnumWrapper<UpdateClassificationRequestBodyFieldKeyField>> {

    public UpdateClassificationRequestBodyFieldKeyFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<UpdateClassificationRequestBodyFieldKeyField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
