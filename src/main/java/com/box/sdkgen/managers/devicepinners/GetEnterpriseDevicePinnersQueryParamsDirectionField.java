package com.box.sdkgen.managers.devicepinners;

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
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.devicepinner.DevicePinner;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.devicepinners.DevicePinners;
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

public enum GetEnterpriseDevicePinnersQueryParamsDirectionField {
  ASC("ASC"),
  DESC("DESC");

  private final String value;

  GetEnterpriseDevicePinnersQueryParamsDirectionField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class GetEnterpriseDevicePinnersQueryParamsDirectionFieldDeserializer extends JsonDeserializer<EnumWrapper<GetEnterpriseDevicePinnersQueryParamsDirectionField>> {

    public GetEnterpriseDevicePinnersQueryParamsDirectionFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<GetEnterpriseDevicePinnersQueryParamsDirectionField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(GetEnterpriseDevicePinnersQueryParamsDirectionField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<GetEnterpriseDevicePinnersQueryParamsDirectionField>(value, v)).orElse(new EnumWrapper<GetEnterpriseDevicePinnersQueryParamsDirectionField>(value));
    }

  }

  public static class GetEnterpriseDevicePinnersQueryParamsDirectionFieldSerializer extends JsonSerializer<EnumWrapper<GetEnterpriseDevicePinnersQueryParamsDirectionField>> {

    public GetEnterpriseDevicePinnersQueryParamsDirectionFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<GetEnterpriseDevicePinnersQueryParamsDirectionField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
