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

public class CreateWebhookRequestBodyTargetField {

  protected String id;

  @JsonDeserialize(using = CreateWebhookRequestBodyTargetTypeField.CreateWebhookRequestBodyTargetTypeFieldDeserializer.class)
  @JsonSerialize(using = CreateWebhookRequestBodyTargetTypeField.CreateWebhookRequestBodyTargetTypeFieldSerializer.class)
  protected EnumWrapper<CreateWebhookRequestBodyTargetTypeField> type;

  public CreateWebhookRequestBodyTargetField() {
  }

  protected CreateWebhookRequestBodyTargetField(CreateWebhookRequestBodyTargetFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<CreateWebhookRequestBodyTargetTypeField> getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebhookRequestBodyTargetField casted = (CreateWebhookRequestBodyTargetField) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type
    );
  }

  @Override
  public String toString() {
    return "CreateWebhookRequestBodyTargetField{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class CreateWebhookRequestBodyTargetFieldBuilder {

    protected String id;

    protected EnumWrapper<CreateWebhookRequestBodyTargetTypeField> type;

    public CreateWebhookRequestBodyTargetFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public CreateWebhookRequestBodyTargetFieldBuilder type(CreateWebhookRequestBodyTargetTypeField type) {
      this.type = new EnumWrapper<CreateWebhookRequestBodyTargetTypeField>(type.getValue(), type);
      return this;
    }

    public CreateWebhookRequestBodyTargetField build() {
      return new CreateWebhookRequestBodyTargetField(this);
    }

  }

}
