package com.box.sdkgen.managers.folderclassifications;

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
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import java.util.List;
import com.box.sdkgen.schemas.classification.Classification;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.fasterxml.jackson.databind.JsonNode;

public enum UpdateClassificationOnFolderRequestBodyPathField {
  _BOX__SECURITY__CLASSIFICATION__KEY("/Box__Security__Classification__Key");

  private final String value;

  UpdateClassificationOnFolderRequestBodyPathField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class UpdateClassificationOnFolderRequestBodyPathFieldDeserializer extends JsonDeserializer<EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField>> {

    public UpdateClassificationOnFolderRequestBodyPathFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(UpdateClassificationOnFolderRequestBodyPathField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField>(value, v)).orElse(new EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField>(value));
    }

  }

  public static class UpdateClassificationOnFolderRequestBodyPathFieldSerializer extends JsonSerializer<EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField>> {

    public UpdateClassificationOnFolderRequestBodyPathFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
