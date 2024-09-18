package com.box.sdkgen.managers.foldermetadata;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import java.util.List;
import com.box.sdkgen.schemas.metadatas.Metadatas;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.metadatafull.MetadataFull;
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

public class FolderMetadataManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public FolderMetadataManager() {
    this.networkSession = new NetworkSession();
  }

  protected FolderMetadataManager(FolderMetadataManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public Metadatas getFolderMetadata(String folderId) {
    return getFolderMetadata(folderId, new GetFolderMetadataHeaders());
  }

  public Metadatas getFolderMetadata(String folderId, GetFolderMetadataHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/folders/", convertToString(folderId), "/metadata")).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), Metadatas.class);
  }

  public MetadataFull getFolderMetadataById(String folderId, GetFolderMetadataByIdScope scope, String templateKey) {
    return getFolderMetadataById(folderId, scope, templateKey, new GetFolderMetadataByIdHeaders());
  }

  public MetadataFull getFolderMetadataById(String folderId, GetFolderMetadataByIdScope scope, String templateKey, GetFolderMetadataByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/folders/", convertToString(folderId), "/metadata/", convertToString(scope), "/", convertToString(templateKey))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), MetadataFull.class);
  }

  public MetadataFull createFolderMetadataById(String folderId, CreateFolderMetadataByIdScope scope, String templateKey, Map<String, String> requestBody) {
    return createFolderMetadataById(folderId, scope, templateKey, requestBody, new CreateFolderMetadataByIdHeaders());
  }

  public MetadataFull createFolderMetadataById(String folderId, CreateFolderMetadataByIdScope scope, String templateKey, Map<String, String> requestBody, CreateFolderMetadataByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/folders/", convertToString(folderId), "/metadata/", convertToString(scope), "/", convertToString(templateKey))).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), MetadataFull.class);
  }

  public MetadataFull updateFolderMetadataById(String folderId, UpdateFolderMetadataByIdScope scope, String templateKey, List<UpdateFolderMetadataByIdRequestBody> requestBody) {
    return updateFolderMetadataById(folderId, scope, templateKey, requestBody, new UpdateFolderMetadataByIdHeaders());
  }

  public MetadataFull updateFolderMetadataById(String folderId, UpdateFolderMetadataByIdScope scope, String templateKey, List<UpdateFolderMetadataByIdRequestBody> requestBody, UpdateFolderMetadataByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/folders/", convertToString(folderId), "/metadata/", convertToString(scope), "/", convertToString(templateKey))).method("PUT").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json-patch+json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), MetadataFull.class);
  }

  public void deleteFolderMetadataById(String folderId, DeleteFolderMetadataByIdScope scope, String templateKey) {
    deleteFolderMetadataById(folderId, scope, templateKey, new DeleteFolderMetadataByIdHeaders());
  }

  public void deleteFolderMetadataById(String folderId, DeleteFolderMetadataByIdScope scope, String templateKey, DeleteFolderMetadataByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/folders/", convertToString(folderId), "/metadata/", convertToString(scope), "/", convertToString(templateKey))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class FolderMetadataManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public FolderMetadataManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public FolderMetadataManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public FolderMetadataManager build() {
      return new FolderMetadataManager(this);
    }

  }

}
