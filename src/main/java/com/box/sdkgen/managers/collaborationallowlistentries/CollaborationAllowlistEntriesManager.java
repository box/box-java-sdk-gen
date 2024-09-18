package com.box.sdkgen.managers.collaborationallowlistentries;

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
import com.box.sdkgen.schemas.collaborationallowlistentries.CollaborationAllowlistEntries;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.collaborationallowlistentry.CollaborationAllowlistEntry;
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

public class CollaborationAllowlistEntriesManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public CollaborationAllowlistEntriesManager() {
    this.networkSession = new NetworkSession();
  }

  protected CollaborationAllowlistEntriesManager(CollaborationAllowlistEntriesManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public CollaborationAllowlistEntries getCollaborationWhitelistEntries() {
    return getCollaborationWhitelistEntries(new GetCollaborationWhitelistEntriesQueryParams(), new GetCollaborationWhitelistEntriesHeaders());
  }

  public CollaborationAllowlistEntries getCollaborationWhitelistEntries(GetCollaborationWhitelistEntriesQueryParams queryParams) {
    return getCollaborationWhitelistEntries(queryParams, new GetCollaborationWhitelistEntriesHeaders());
  }

  public CollaborationAllowlistEntries getCollaborationWhitelistEntries(GetCollaborationWhitelistEntriesHeaders headers) {
    return getCollaborationWhitelistEntries(new GetCollaborationWhitelistEntriesQueryParams(), headers);
  }

  public CollaborationAllowlistEntries getCollaborationWhitelistEntries(GetCollaborationWhitelistEntriesQueryParams queryParams, GetCollaborationWhitelistEntriesHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("marker", convertToString(queryParams.getMarker())), entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/collaboration_whitelist_entries")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), CollaborationAllowlistEntries.class);
  }

  public CollaborationAllowlistEntry createCollaborationWhitelistEntry(CreateCollaborationWhitelistEntryRequestBody requestBody) {
    return createCollaborationWhitelistEntry(requestBody, new CreateCollaborationWhitelistEntryHeaders());
  }

  public CollaborationAllowlistEntry createCollaborationWhitelistEntry(CreateCollaborationWhitelistEntryRequestBody requestBody, CreateCollaborationWhitelistEntryHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/collaboration_whitelist_entries")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), CollaborationAllowlistEntry.class);
  }

  public CollaborationAllowlistEntry getCollaborationWhitelistEntryById(String collaborationWhitelistEntryId) {
    return getCollaborationWhitelistEntryById(collaborationWhitelistEntryId, new GetCollaborationWhitelistEntryByIdHeaders());
  }

  public CollaborationAllowlistEntry getCollaborationWhitelistEntryById(String collaborationWhitelistEntryId, GetCollaborationWhitelistEntryByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/collaboration_whitelist_entries/", convertToString(collaborationWhitelistEntryId))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), CollaborationAllowlistEntry.class);
  }

  public void deleteCollaborationWhitelistEntryById(String collaborationWhitelistEntryId) {
    deleteCollaborationWhitelistEntryById(collaborationWhitelistEntryId, new DeleteCollaborationWhitelistEntryByIdHeaders());
  }

  public void deleteCollaborationWhitelistEntryById(String collaborationWhitelistEntryId, DeleteCollaborationWhitelistEntryByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/collaboration_whitelist_entries/", convertToString(collaborationWhitelistEntryId))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class CollaborationAllowlistEntriesManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public CollaborationAllowlistEntriesManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public CollaborationAllowlistEntriesManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public CollaborationAllowlistEntriesManager build() {
      return new CollaborationAllowlistEntriesManager(this);
    }

  }

}
