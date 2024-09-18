package com.box.sdkgen.managers.webhooks;

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
import com.box.sdkgen.schemas.webhooks.Webhooks;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.webhook.Webhook;
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

public enum CreateWebhookRequestBodyTargetTypeField {
  FILE("file"),
  FOLDER("folder");

  private final String value;

  CreateWebhookRequestBodyTargetTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CreateWebhookRequestBodyTargetTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<CreateWebhookRequestBodyTargetTypeField>> {

    public CreateWebhookRequestBodyTargetTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CreateWebhookRequestBodyTargetTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CreateWebhookRequestBodyTargetTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<CreateWebhookRequestBodyTargetTypeField>(value, v)).orElse(new EnumWrapper<CreateWebhookRequestBodyTargetTypeField>(value));
    }

  }

  public static class CreateWebhookRequestBodyTargetTypeFieldSerializer extends JsonSerializer<EnumWrapper<CreateWebhookRequestBodyTargetTypeField>> {

    public CreateWebhookRequestBodyTargetTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<CreateWebhookRequestBodyTargetTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
