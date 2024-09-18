package com.box.sdkgen.managers.fileversionretentions;

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
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.fileversionretentions.FileVersionRetentions;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.fileversionretention.FileVersionRetention;
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

public enum GetFileVersionRetentionsQueryParamsDispositionActionField {
  PERMANENTLY_DELETE("permanently_delete"),
  REMOVE_RETENTION("remove_retention");

  private final String value;

  GetFileVersionRetentionsQueryParamsDispositionActionField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class GetFileVersionRetentionsQueryParamsDispositionActionFieldDeserializer extends JsonDeserializer<EnumWrapper<GetFileVersionRetentionsQueryParamsDispositionActionField>> {

    public GetFileVersionRetentionsQueryParamsDispositionActionFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<GetFileVersionRetentionsQueryParamsDispositionActionField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(GetFileVersionRetentionsQueryParamsDispositionActionField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<GetFileVersionRetentionsQueryParamsDispositionActionField>(value, v)).orElse(new EnumWrapper<GetFileVersionRetentionsQueryParamsDispositionActionField>(value));
    }

  }

  public static class GetFileVersionRetentionsQueryParamsDispositionActionFieldSerializer extends JsonSerializer<EnumWrapper<GetFileVersionRetentionsQueryParamsDispositionActionField>> {

    public GetFileVersionRetentionsQueryParamsDispositionActionFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<GetFileVersionRetentionsQueryParamsDispositionActionField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
