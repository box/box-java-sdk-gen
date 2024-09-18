package com.box.sdkgen.managers.tasks;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.tasks.Tasks;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.task.Task;
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

public enum CreateTaskRequestBodyCompletionRuleField {
  ALL_ASSIGNEES("all_assignees"),
  ANY_ASSIGNEE("any_assignee");

  private final String value;

  CreateTaskRequestBodyCompletionRuleField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CreateTaskRequestBodyCompletionRuleFieldDeserializer extends JsonDeserializer<EnumWrapper<CreateTaskRequestBodyCompletionRuleField>> {

    public CreateTaskRequestBodyCompletionRuleFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CreateTaskRequestBodyCompletionRuleField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CreateTaskRequestBodyCompletionRuleField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<CreateTaskRequestBodyCompletionRuleField>(value, v)).orElse(new EnumWrapper<CreateTaskRequestBodyCompletionRuleField>(value));
    }

  }

  public static class CreateTaskRequestBodyCompletionRuleFieldSerializer extends JsonSerializer<EnumWrapper<CreateTaskRequestBodyCompletionRuleField>> {

    public CreateTaskRequestBodyCompletionRuleFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<CreateTaskRequestBodyCompletionRuleField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
