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

public enum StartWorkflowRequestBodyTypeField {
  WORKFLOW_PARAMETERS("workflow_parameters");

  private final String value;

  StartWorkflowRequestBodyTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class StartWorkflowRequestBodyTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<StartWorkflowRequestBodyTypeField>> {

    public StartWorkflowRequestBodyTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<StartWorkflowRequestBodyTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(StartWorkflowRequestBodyTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<StartWorkflowRequestBodyTypeField>(value, v)).orElse(new EnumWrapper<StartWorkflowRequestBodyTypeField>(value));
    }

  }

  public static class StartWorkflowRequestBodyTypeFieldSerializer extends JsonSerializer<EnumWrapper<StartWorkflowRequestBodyTypeField>> {

    public StartWorkflowRequestBodyTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<StartWorkflowRequestBodyTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
