package com.box.sdkgen.managers.usercollaborations;

import java.util.List;
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
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.collaboration.Collaboration;
import com.box.sdkgen.schemas.clienterror.ClientError;
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

public enum CreateCollaborationRequestBodyAccessibleByTypeField {
  USER("user"),
  GROUP("group");

  private final String value;

  CreateCollaborationRequestBodyAccessibleByTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CreateCollaborationRequestBodyAccessibleByTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<CreateCollaborationRequestBodyAccessibleByTypeField>> {

    public CreateCollaborationRequestBodyAccessibleByTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CreateCollaborationRequestBodyAccessibleByTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CreateCollaborationRequestBodyAccessibleByTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<CreateCollaborationRequestBodyAccessibleByTypeField>(value, v)).orElse(new EnumWrapper<CreateCollaborationRequestBodyAccessibleByTypeField>(value));
    }

  }

  public static class CreateCollaborationRequestBodyAccessibleByTypeFieldSerializer extends JsonSerializer<EnumWrapper<CreateCollaborationRequestBodyAccessibleByTypeField>> {

    public CreateCollaborationRequestBodyAccessibleByTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<CreateCollaborationRequestBodyAccessibleByTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
