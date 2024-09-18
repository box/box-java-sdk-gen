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

public class CreateWebhookRequestBody {

  protected final CreateWebhookRequestBodyTargetField target;

  protected final String address;

  protected final List<CreateWebhookRequestBodyTriggersField> triggers;

  public CreateWebhookRequestBody(@JsonProperty("target") CreateWebhookRequestBodyTargetField target, @JsonProperty("address") String address, @JsonProperty("triggers") List<CreateWebhookRequestBodyTriggersField> triggers) {
    this.target = target;
    this.address = address;
    this.triggers = triggers;
  }

  public CreateWebhookRequestBodyTargetField getTarget() {
    return target;
  }

  public String getAddress() {
    return address;
  }

  public List<CreateWebhookRequestBodyTriggersField> getTriggers() {
    return triggers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebhookRequestBody casted = (CreateWebhookRequestBody) o;
    return Objects.equals(target, casted.target) &&
      Objects.equals(address, casted.address) &&
      Objects.equals(triggers, casted.triggers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      target, address, triggers
    );
  }

  @Override
  public String toString() {
    return "CreateWebhookRequestBody{" + "target='" + target + '\'' + ", " + "address='" + address + '\'' + ", " + "triggers='" + triggers + '\'' + "}";
  }

}
