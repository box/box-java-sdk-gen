package com.box.sdkgen.managers.workflows;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.workflows.Workflows;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.outcome.Outcome;
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

public enum StartWorkflowRequestBodyFilesTypeField {
  FILE("file");

  private final String value;

  StartWorkflowRequestBodyFilesTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class StartWorkflowRequestBodyFilesTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<StartWorkflowRequestBodyFilesTypeField>> {

    public StartWorkflowRequestBodyFilesTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<StartWorkflowRequestBodyFilesTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(StartWorkflowRequestBodyFilesTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<StartWorkflowRequestBodyFilesTypeField>(value, v)).orElse(new EnumWrapper<StartWorkflowRequestBodyFilesTypeField>(value));
    }

  }

  public static class StartWorkflowRequestBodyFilesTypeFieldSerializer extends JsonSerializer<EnumWrapper<StartWorkflowRequestBodyFilesTypeField>> {

    public StartWorkflowRequestBodyFilesTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<StartWorkflowRequestBodyFilesTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
