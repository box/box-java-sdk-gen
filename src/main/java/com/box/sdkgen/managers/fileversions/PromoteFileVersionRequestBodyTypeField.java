package com.box.sdkgen.managers.fileversions;

import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.fileversions.FileVersions;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.fileversionfull.FileVersionFull;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;

public enum PromoteFileVersionRequestBodyTypeField {
  FILE_VERSION("file_version");

  private final String value;

  PromoteFileVersionRequestBodyTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class PromoteFileVersionRequestBodyTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<PromoteFileVersionRequestBodyTypeField>> {

    public PromoteFileVersionRequestBodyTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<PromoteFileVersionRequestBodyTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(PromoteFileVersionRequestBodyTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<PromoteFileVersionRequestBodyTypeField>(value, v)).orElse(new EnumWrapper<PromoteFileVersionRequestBodyTypeField>(value));
    }

  }

  public static class PromoteFileVersionRequestBodyTypeFieldSerializer extends JsonSerializer<EnumWrapper<PromoteFileVersionRequestBodyTypeField>> {

    public PromoteFileVersionRequestBodyTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<PromoteFileVersionRequestBodyTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
