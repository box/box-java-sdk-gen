package com.box.sdkgen.managers.trasheditems;

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
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.items.Items;
import com.box.sdkgen.schemas.clienterror.ClientError;
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

public enum GetTrashedItemsQueryParamsSortField {
  NAME("name"),
  DATE("date"),
  SIZE("size");

  private final String value;

  GetTrashedItemsQueryParamsSortField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class GetTrashedItemsQueryParamsSortFieldDeserializer extends JsonDeserializer<EnumWrapper<GetTrashedItemsQueryParamsSortField>> {

    public GetTrashedItemsQueryParamsSortFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<GetTrashedItemsQueryParamsSortField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(GetTrashedItemsQueryParamsSortField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<GetTrashedItemsQueryParamsSortField>(value, v)).orElse(new EnumWrapper<GetTrashedItemsQueryParamsSortField>(value));
    }

  }

  public static class GetTrashedItemsQueryParamsSortFieldSerializer extends JsonSerializer<EnumWrapper<GetTrashedItemsQueryParamsSortField>> {

    public GetTrashedItemsQueryParamsSortFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<GetTrashedItemsQueryParamsSortField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
