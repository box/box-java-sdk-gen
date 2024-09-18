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

public class SearchManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public SearchManager() {
    this.networkSession = new NetworkSession();
  }

  protected SearchManager(SearchManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public MetadataQueryResults searchByMetadataQuery(MetadataQuery requestBody) {
    return searchByMetadataQuery(requestBody, new SearchByMetadataQueryHeaders());
  }

  public MetadataQueryResults searchByMetadataQuery(MetadataQuery requestBody, SearchByMetadataQueryHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/metadata_queries/execute_read")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), MetadataQueryResults.class);
  }

  public SearchResultsOrSearchResultsWithSharedLinks searchForContent() {
    return searchForContent(new SearchForContentQueryParams(), new SearchForContentHeaders());
  }

  public SearchResultsOrSearchResultsWithSharedLinks searchForContent(SearchForContentQueryParams queryParams) {
    return searchForContent(queryParams, new SearchForContentHeaders());
  }

  public SearchResultsOrSearchResultsWithSharedLinks searchForContent(SearchForContentHeaders headers) {
    return searchForContent(new SearchForContentQueryParams(), headers);
  }

  public SearchResultsOrSearchResultsWithSharedLinks searchForContent(SearchForContentQueryParams queryParams, SearchForContentHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("query", convertToString(queryParams.getQuery())), entryOf("scope", convertToString(queryParams.getScope())), entryOf("file_extensions", convertToString(queryParams.getFileExtensions())), entryOf("created_at_range", convertToString(queryParams.getCreatedAtRange())), entryOf("updated_at_range", convertToString(queryParams.getUpdatedAtRange())), entryOf("size_range", convertToString(queryParams.getSizeRange())), entryOf("owner_user_ids", convertToString(queryParams.getOwnerUserIds())), entryOf("recent_updater_user_ids", convertToString(queryParams.getRecentUpdaterUserIds())), entryOf("ancestor_folder_ids", convertToString(queryParams.getAncestorFolderIds())), entryOf("content_types", convertToString(queryParams.getContentTypes())), entryOf("type", convertToString(queryParams.getType())), entryOf("trash_content", convertToString(queryParams.getTrashContent())), entryOf("mdfilters", convertToString(queryParams.getMdfilters())), entryOf("sort", convertToString(queryParams.getSort())), entryOf("direction", convertToString(queryParams.getDirection())), entryOf("limit", convertToString(queryParams.getLimit())), entryOf("include_recent_shared_links", convertToString(queryParams.getIncludeRecentSharedLinks())), entryOf("fields", convertToString(queryParams.getFields())), entryOf("offset", convertToString(queryParams.getOffset())), entryOf("deleted_user_ids", convertToString(queryParams.getDeletedUserIds())), entryOf("deleted_at_range", convertToString(queryParams.getDeletedAtRange()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/search")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), SearchResultsOrSearchResultsWithSharedLinks.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class SearchManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public SearchManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public SearchManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public SearchManager build() {
      return new SearchManager(this);
    }

  }

}
