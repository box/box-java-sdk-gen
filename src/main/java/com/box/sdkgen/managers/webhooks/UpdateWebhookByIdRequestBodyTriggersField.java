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

public enum UpdateWebhookByIdRequestBodyTriggersField {
  FILE_UPLOADED("FILE.UPLOADED"),
  FILE_PREVIEWED("FILE.PREVIEWED"),
  FILE_DOWNLOADED("FILE.DOWNLOADED"),
  FILE_TRASHED("FILE.TRASHED"),
  FILE_DELETED("FILE.DELETED"),
  FILE_RESTORED("FILE.RESTORED"),
  FILE_COPIED("FILE.COPIED"),
  FILE_MOVED("FILE.MOVED"),
  FILE_LOCKED("FILE.LOCKED"),
  FILE_UNLOCKED("FILE.UNLOCKED"),
  FILE_RENAMED("FILE.RENAMED"),
  COMMENT_CREATED("COMMENT.CREATED"),
  COMMENT_UPDATED("COMMENT.UPDATED"),
  COMMENT_DELETED("COMMENT.DELETED"),
  TASK_ASSIGNMENT_CREATED("TASK_ASSIGNMENT.CREATED"),
  TASK_ASSIGNMENT_UPDATED("TASK_ASSIGNMENT.UPDATED"),
  METADATA_INSTANCE_CREATED("METADATA_INSTANCE.CREATED"),
  METADATA_INSTANCE_UPDATED("METADATA_INSTANCE.UPDATED"),
  METADATA_INSTANCE_DELETED("METADATA_INSTANCE.DELETED"),
  FOLDER_CREATED("FOLDER.CREATED"),
  FOLDER_RENAMED("FOLDER.RENAMED"),
  FOLDER_DOWNLOADED("FOLDER.DOWNLOADED"),
  FOLDER_RESTORED("FOLDER.RESTORED"),
  FOLDER_DELETED("FOLDER.DELETED"),
  FOLDER_COPIED("FOLDER.COPIED"),
  FOLDER_MOVED("FOLDER.MOVED"),
  FOLDER_TRASHED("FOLDER.TRASHED"),
  WEBHOOK_DELETED("WEBHOOK.DELETED"),
  COLLABORATION_CREATED("COLLABORATION.CREATED"),
  COLLABORATION_ACCEPTED("COLLABORATION.ACCEPTED"),
  COLLABORATION_REJECTED("COLLABORATION.REJECTED"),
  COLLABORATION_REMOVED("COLLABORATION.REMOVED"),
  COLLABORATION_UPDATED("COLLABORATION.UPDATED"),
  SHARED_LINK_DELETED("SHARED_LINK.DELETED"),
  SHARED_LINK_CREATED("SHARED_LINK.CREATED"),
  SHARED_LINK_UPDATED("SHARED_LINK.UPDATED"),
  SIGN_REQUEST_COMPLETED("SIGN_REQUEST.COMPLETED"),
  SIGN_REQUEST_DECLINED("SIGN_REQUEST.DECLINED"),
  SIGN_REQUEST_EXPIRED("SIGN_REQUEST.EXPIRED"),
  SIGN_REQUEST_SIGNER_EMAIL_BOUNCED("SIGN_REQUEST.SIGNER_EMAIL_BOUNCED");

  private final String value;

  UpdateWebhookByIdRequestBodyTriggersField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class UpdateWebhookByIdRequestBodyTriggersFieldDeserializer extends JsonDeserializer<EnumWrapper<UpdateWebhookByIdRequestBodyTriggersField>> {

    public UpdateWebhookByIdRequestBodyTriggersFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<UpdateWebhookByIdRequestBodyTriggersField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(UpdateWebhookByIdRequestBodyTriggersField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<UpdateWebhookByIdRequestBodyTriggersField>(value, v)).orElse(new EnumWrapper<UpdateWebhookByIdRequestBodyTriggersField>(value));
    }

  }

  public static class UpdateWebhookByIdRequestBodyTriggersFieldSerializer extends JsonSerializer<EnumWrapper<UpdateWebhookByIdRequestBodyTriggersField>> {

    public UpdateWebhookByIdRequestBodyTriggersFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<UpdateWebhookByIdRequestBodyTriggersField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
