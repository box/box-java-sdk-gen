package com.box.sdkgen.managers.storagepolicyassignments;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.storagepolicyassignments.StoragePolicyAssignments;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.storagepolicyassignment.StoragePolicyAssignment;
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

public enum CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField {
  USER("user"),
  ENTERPRISE("enterprise");

  private final String value;

  CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class CreateStoragePolicyAssignmentRequestBodyAssignedToTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField>> {

    public CreateStoragePolicyAssignmentRequestBodyAssignedToTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField>(value, v)).orElse(new EnumWrapper<CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField>(value));
    }

  }

  public static class CreateStoragePolicyAssignmentRequestBodyAssignedToTypeFieldSerializer extends JsonSerializer<EnumWrapper<CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField>> {

    public CreateStoragePolicyAssignmentRequestBodyAssignedToTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
