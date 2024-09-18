package com.box.sdkgen.managers.shieldinformationbarriers;

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
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.shieldinformationbarrier.ShieldInformationBarrier;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.shieldinformationbarriers.ShieldInformationBarriers;
import com.box.sdkgen.schemas.enterprisebase.EnterpriseBase;
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

public enum UpdateShieldInformationBarrierStatusRequestBodyStatusField {
  PENDING("pending"),
  DISABLED("disabled");

  private final String value;

  UpdateShieldInformationBarrierStatusRequestBodyStatusField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class UpdateShieldInformationBarrierStatusRequestBodyStatusFieldDeserializer extends JsonDeserializer<EnumWrapper<UpdateShieldInformationBarrierStatusRequestBodyStatusField>> {

    public UpdateShieldInformationBarrierStatusRequestBodyStatusFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<UpdateShieldInformationBarrierStatusRequestBodyStatusField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(UpdateShieldInformationBarrierStatusRequestBodyStatusField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<UpdateShieldInformationBarrierStatusRequestBodyStatusField>(value, v)).orElse(new EnumWrapper<UpdateShieldInformationBarrierStatusRequestBodyStatusField>(value));
    }

  }

  public static class UpdateShieldInformationBarrierStatusRequestBodyStatusFieldSerializer extends JsonSerializer<EnumWrapper<UpdateShieldInformationBarrierStatusRequestBodyStatusField>> {

    public UpdateShieldInformationBarrierStatusRequestBodyStatusFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<UpdateShieldInformationBarrierStatusRequestBodyStatusField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
