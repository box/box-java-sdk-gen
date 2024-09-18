package com.box.sdkgen.managers.search;

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
import com.box.sdkgen.schemas.metadataqueryresults.MetadataQueryResults;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.metadataquery.MetadataQuery;
import com.box.sdkgen.schemas.searchresultsorsearchresultswithsharedlinks.SearchResultsOrSearchResultsWithSharedLinks;
import com.box.sdkgen.schemas.metadatafilter.MetadataFilter;
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

public enum SearchForContentQueryParamsTrashContentField {
  NON_TRASHED_ONLY("non_trashed_only"),
  TRASHED_ONLY("trashed_only"),
  ALL_ITEMS("all_items");

  private final String value;

  SearchForContentQueryParamsTrashContentField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class SearchForContentQueryParamsTrashContentFieldDeserializer extends JsonDeserializer<EnumWrapper<SearchForContentQueryParamsTrashContentField>> {

    public SearchForContentQueryParamsTrashContentFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<SearchForContentQueryParamsTrashContentField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(SearchForContentQueryParamsTrashContentField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<SearchForContentQueryParamsTrashContentField>(value, v)).orElse(new EnumWrapper<SearchForContentQueryParamsTrashContentField>(value));
    }

  }

  public static class SearchForContentQueryParamsTrashContentFieldSerializer extends JsonSerializer<EnumWrapper<SearchForContentQueryParamsTrashContentField>> {

    public SearchForContentQueryParamsTrashContentFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<SearchForContentQueryParamsTrashContentField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
