package com.box.sdkgen.managers.listcollaborations;

import java.util.List;
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
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.collaborations.Collaborations;
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

public class ListCollaborationsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public ListCollaborationsManager() {
    this.networkSession = new NetworkSession();
  }

  protected ListCollaborationsManager(ListCollaborationsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public Collaborations getFileCollaborations(String fileId) {
    return getFileCollaborations(fileId, new GetFileCollaborationsQueryParams(), new GetFileCollaborationsHeaders());
  }

  public Collaborations getFileCollaborations(String fileId, GetFileCollaborationsQueryParams queryParams) {
    return getFileCollaborations(fileId, queryParams, new GetFileCollaborationsHeaders());
  }

  public Collaborations getFileCollaborations(String fileId, GetFileCollaborationsHeaders headers) {
    return getFileCollaborations(fileId, new GetFileCollaborationsQueryParams(), headers);
  }

  public Collaborations getFileCollaborations(String fileId, GetFileCollaborationsQueryParams queryParams, GetFileCollaborationsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields())), entryOf("limit", convertToString(queryParams.getLimit())), entryOf("marker", convertToString(queryParams.getMarker()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "/collaborations")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), Collaborations.class);
  }

  public Collaborations getFolderCollaborations(String folderId) {
    return getFolderCollaborations(folderId, new GetFolderCollaborationsQueryParams(), new GetFolderCollaborationsHeaders());
  }

  public Collaborations getFolderCollaborations(String folderId, GetFolderCollaborationsQueryParams queryParams) {
    return getFolderCollaborations(folderId, queryParams, new GetFolderCollaborationsHeaders());
  }

  public Collaborations getFolderCollaborations(String folderId, GetFolderCollaborationsHeaders headers) {
    return getFolderCollaborations(folderId, new GetFolderCollaborationsQueryParams(), headers);
  }

  public Collaborations getFolderCollaborations(String folderId, GetFolderCollaborationsQueryParams queryParams, GetFolderCollaborationsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/folders/", convertToString(folderId), "/collaborations")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), Collaborations.class);
  }

  public Collaborations getCollaborations(GetCollaborationsQueryParams queryParams) {
    return getCollaborations(queryParams, new GetCollaborationsHeaders());
  }

  public Collaborations getCollaborations(GetCollaborationsQueryParams queryParams, GetCollaborationsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("status", convertToString(queryParams.getStatus())), entryOf("fields", convertToString(queryParams.getFields())), entryOf("offset", convertToString(queryParams.getOffset())), entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/collaborations")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), Collaborations.class);
  }

  public Collaborations getGroupCollaborations(String groupId) {
    return getGroupCollaborations(groupId, new GetGroupCollaborationsQueryParams(), new GetGroupCollaborationsHeaders());
  }

  public Collaborations getGroupCollaborations(String groupId, GetGroupCollaborationsQueryParams queryParams) {
    return getGroupCollaborations(groupId, queryParams, new GetGroupCollaborationsHeaders());
  }

  public Collaborations getGroupCollaborations(String groupId, GetGroupCollaborationsHeaders headers) {
    return getGroupCollaborations(groupId, new GetGroupCollaborationsQueryParams(), headers);
  }

  public Collaborations getGroupCollaborations(String groupId, GetGroupCollaborationsQueryParams queryParams, GetGroupCollaborationsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("limit", convertToString(queryParams.getLimit())), entryOf("offset", convertToString(queryParams.getOffset()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/groups/", convertToString(groupId), "/collaborations")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), Collaborations.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class ListCollaborationsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public ListCollaborationsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public ListCollaborationsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public ListCollaborationsManager build() {
      return new ListCollaborationsManager(this);
    }

  }

}
