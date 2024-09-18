package com.box.sdkgen.managers.events;

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
import java.util.List;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.realtimeservers.RealtimeServers;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.events.Events;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;

public enum GetEventsQueryParamsStreamTypeField {
  ALL("all"),
  CHANGES("changes"),
  SYNC("sync"),
  ADMIN_LOGS("admin_logs"),
  ADMIN_LOGS_STREAMING("admin_logs_streaming");

  private final String value;

  GetEventsQueryParamsStreamTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class GetEventsQueryParamsStreamTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<GetEventsQueryParamsStreamTypeField>> {

    public GetEventsQueryParamsStreamTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<GetEventsQueryParamsStreamTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(GetEventsQueryParamsStreamTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<GetEventsQueryParamsStreamTypeField>(value, v)).orElse(new EnumWrapper<GetEventsQueryParamsStreamTypeField>(value));
    }

  }

  public static class GetEventsQueryParamsStreamTypeFieldSerializer extends JsonSerializer<EnumWrapper<GetEventsQueryParamsStreamTypeField>> {

    public GetEventsQueryParamsStreamTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<GetEventsQueryParamsStreamTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
