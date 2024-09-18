package com.box.sdkgen.managers.termsofserviceuserstatuses;

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
import com.box.sdkgen.schemas.termsofserviceuserstatuses.TermsOfServiceUserStatuses;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.termsofserviceuserstatus.TermsOfServiceUserStatus;
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

public enum CreateTermsOfServiceStatusForUserRequestBodyTosTypeField {
  TERMS_OF_SERVICE("terms_of_service");

  private final String value;

  CreateTermsOfServiceStatusForUserRequestBodyTosTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CreateTermsOfServiceStatusForUserRequestBodyTosTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyTosTypeField>> {

    public CreateTermsOfServiceStatusForUserRequestBodyTosTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyTosTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CreateTermsOfServiceStatusForUserRequestBodyTosTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyTosTypeField>(value, v)).orElse(new EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyTosTypeField>(value));
    }

  }

  public static class CreateTermsOfServiceStatusForUserRequestBodyTosTypeFieldSerializer extends JsonSerializer<EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyTosTypeField>> {

    public CreateTermsOfServiceStatusForUserRequestBodyTosTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyTosTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
