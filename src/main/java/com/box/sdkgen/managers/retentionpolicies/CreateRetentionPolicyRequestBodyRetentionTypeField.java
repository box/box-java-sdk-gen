package com.box.sdkgen.managers.retentionpolicies;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.retentionpolicies.RetentionPolicies;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.retentionpolicy.RetentionPolicy;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.userbase.UserBase;
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

public enum CreateRetentionPolicyRequestBodyRetentionTypeField {
  MODIFIABLE("modifiable"),
  NON_MODIFIABLE("non_modifiable");

  private final String value;

  CreateRetentionPolicyRequestBodyRetentionTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CreateRetentionPolicyRequestBodyRetentionTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<CreateRetentionPolicyRequestBodyRetentionTypeField>> {

    public CreateRetentionPolicyRequestBodyRetentionTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CreateRetentionPolicyRequestBodyRetentionTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CreateRetentionPolicyRequestBodyRetentionTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<CreateRetentionPolicyRequestBodyRetentionTypeField>(value, v)).orElse(new EnumWrapper<CreateRetentionPolicyRequestBodyRetentionTypeField>(value));
    }

  }

  public static class CreateRetentionPolicyRequestBodyRetentionTypeFieldSerializer extends JsonSerializer<EnumWrapper<CreateRetentionPolicyRequestBodyRetentionTypeField>> {

    public CreateRetentionPolicyRequestBodyRetentionTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<CreateRetentionPolicyRequestBodyRetentionTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
