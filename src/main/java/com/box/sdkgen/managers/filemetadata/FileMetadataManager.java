package com.box.sdkgen.managers.filemetadata;

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

public class FileMetadataManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public FileMetadataManager() {
    this.networkSession = new NetworkSession();
  }

  protected FileMetadataManager(FileMetadataManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public Metadatas getFileMetadata(String fileId) {
    return getFileMetadata(fileId, new GetFileMetadataHeaders());
  }

  public Metadatas getFileMetadata(String fileId, GetFileMetadataHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "/metadata")).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), Metadatas.class);
  }

  public MetadataFull getFileMetadataById(String fileId, GetFileMetadataByIdScope scope, String templateKey) {
    return getFileMetadataById(fileId, scope, templateKey, new GetFileMetadataByIdHeaders());
  }

  public MetadataFull getFileMetadataById(String fileId, GetFileMetadataByIdScope scope, String templateKey, GetFileMetadataByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "/metadata/", convertToString(scope), "/", convertToString(templateKey))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), MetadataFull.class);
  }

  public MetadataFull createFileMetadataById(String fileId, CreateFileMetadataByIdScope scope, String templateKey, Map<String, String> requestBody) {
    return createFileMetadataById(fileId, scope, templateKey, requestBody, new CreateFileMetadataByIdHeaders());
  }

  public MetadataFull createFileMetadataById(String fileId, CreateFileMetadataByIdScope scope, String templateKey, Map<String, String> requestBody, CreateFileMetadataByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "/metadata/", convertToString(scope), "/", convertToString(templateKey))).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), MetadataFull.class);
  }

  public MetadataFull updateFileMetadataById(String fileId, UpdateFileMetadataByIdScope scope, String templateKey, List<UpdateFileMetadataByIdRequestBody> requestBody) {
    return updateFileMetadataById(fileId, scope, templateKey, requestBody, new UpdateFileMetadataByIdHeaders());
  }

  public MetadataFull updateFileMetadataById(String fileId, UpdateFileMetadataByIdScope scope, String templateKey, List<UpdateFileMetadataByIdRequestBody> requestBody, UpdateFileMetadataByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "/metadata/", convertToString(scope), "/", convertToString(templateKey))).method("PUT").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json-patch+json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), MetadataFull.class);
  }

  public void deleteFileMetadataById(String fileId, DeleteFileMetadataByIdScope scope, String templateKey) {
    deleteFileMetadataById(fileId, scope, templateKey, new DeleteFileMetadataByIdHeaders());
  }

  public void deleteFileMetadataById(String fileId, DeleteFileMetadataByIdScope scope, String templateKey, DeleteFileMetadataByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "/metadata/", convertToString(scope), "/", convertToString(templateKey))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class FileMetadataManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public FileMetadataManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public FileMetadataManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public FileMetadataManager build() {
      return new FileMetadataManager(this);
    }

  }

}
