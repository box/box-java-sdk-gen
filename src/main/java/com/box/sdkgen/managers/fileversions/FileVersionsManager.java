package com.box.sdkgen.managers.fileversions;

import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.fileversions.FileVersions;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.fileversionfull.FileVersionFull;
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

public class FileVersionsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public FileVersionsManager() {
    this.networkSession = new NetworkSession();
  }

  protected FileVersionsManager(FileVersionsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public FileVersions getFileVersions(String fileId) {
    return getFileVersions(fileId, new GetFileVersionsQueryParams(), new GetFileVersionsHeaders());
  }

  public FileVersions getFileVersions(String fileId, GetFileVersionsQueryParams queryParams) {
    return getFileVersions(fileId, queryParams, new GetFileVersionsHeaders());
  }

  public FileVersions getFileVersions(String fileId, GetFileVersionsHeaders headers) {
    return getFileVersions(fileId, new GetFileVersionsQueryParams(), headers);
  }

  public FileVersions getFileVersions(String fileId, GetFileVersionsQueryParams queryParams, GetFileVersionsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields())), entryOf("limit", convertToString(queryParams.getLimit())), entryOf("offset", convertToString(queryParams.getOffset()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "/versions")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileVersions.class);
  }

  public FileVersionFull getFileVersionById(String fileId, String fileVersionId) {
    return getFileVersionById(fileId, fileVersionId, new GetFileVersionByIdQueryParams(), new GetFileVersionByIdHeaders());
  }

  public FileVersionFull getFileVersionById(String fileId, String fileVersionId, GetFileVersionByIdQueryParams queryParams) {
    return getFileVersionById(fileId, fileVersionId, queryParams, new GetFileVersionByIdHeaders());
  }

  public FileVersionFull getFileVersionById(String fileId, String fileVersionId, GetFileVersionByIdHeaders headers) {
    return getFileVersionById(fileId, fileVersionId, new GetFileVersionByIdQueryParams(), headers);
  }

  public FileVersionFull getFileVersionById(String fileId, String fileVersionId, GetFileVersionByIdQueryParams queryParams, GetFileVersionByIdHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "/versions/", convertToString(fileVersionId))).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileVersionFull.class);
  }

  public void deleteFileVersionById(String fileId, String fileVersionId) {
    deleteFileVersionById(fileId, fileVersionId, new DeleteFileVersionByIdHeaders());
  }

  public void deleteFileVersionById(String fileId, String fileVersionId, DeleteFileVersionByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(entryOf("if-match", convertToString(headers.getIfMatch()))), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "/versions/", convertToString(fileVersionId))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public FileVersionFull updateFileVersionById(String fileId, String fileVersionId) {
    return updateFileVersionById(fileId, fileVersionId, new UpdateFileVersionByIdRequestBody(), new UpdateFileVersionByIdHeaders());
  }

  public FileVersionFull updateFileVersionById(String fileId, String fileVersionId, UpdateFileVersionByIdRequestBody requestBody) {
    return updateFileVersionById(fileId, fileVersionId, requestBody, new UpdateFileVersionByIdHeaders());
  }

  public FileVersionFull updateFileVersionById(String fileId, String fileVersionId, UpdateFileVersionByIdHeaders headers) {
    return updateFileVersionById(fileId, fileVersionId, new UpdateFileVersionByIdRequestBody(), headers);
  }

  public FileVersionFull updateFileVersionById(String fileId, String fileVersionId, UpdateFileVersionByIdRequestBody requestBody, UpdateFileVersionByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "/versions/", convertToString(fileVersionId))).method("PUT").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileVersionFull.class);
  }

  public FileVersionFull promoteFileVersion(String fileId) {
    return promoteFileVersion(fileId, new PromoteFileVersionRequestBody(), new PromoteFileVersionQueryParams(), new PromoteFileVersionHeaders());
  }

  public FileVersionFull promoteFileVersion(String fileId, PromoteFileVersionRequestBody requestBody) {
    return promoteFileVersion(fileId, requestBody, new PromoteFileVersionQueryParams(), new PromoteFileVersionHeaders());
  }

  public FileVersionFull promoteFileVersion(String fileId, PromoteFileVersionQueryParams queryParams) {
    return promoteFileVersion(fileId, new PromoteFileVersionRequestBody(), queryParams, new PromoteFileVersionHeaders());
  }

  public FileVersionFull promoteFileVersion(String fileId, PromoteFileVersionRequestBody requestBody, PromoteFileVersionQueryParams queryParams) {
    return promoteFileVersion(fileId, requestBody, queryParams, new PromoteFileVersionHeaders());
  }

  public FileVersionFull promoteFileVersion(String fileId, PromoteFileVersionHeaders headers) {
    return promoteFileVersion(fileId, new PromoteFileVersionRequestBody(), new PromoteFileVersionQueryParams(), headers);
  }

  public FileVersionFull promoteFileVersion(String fileId, PromoteFileVersionRequestBody requestBody, PromoteFileVersionHeaders headers) {
    return promoteFileVersion(fileId, requestBody, new PromoteFileVersionQueryParams(), headers);
  }

  public FileVersionFull promoteFileVersion(String fileId, PromoteFileVersionQueryParams queryParams, PromoteFileVersionHeaders headers) {
    return promoteFileVersion(fileId, new PromoteFileVersionRequestBody(), queryParams, headers);
  }

  public FileVersionFull promoteFileVersion(String fileId, PromoteFileVersionRequestBody requestBody, PromoteFileVersionQueryParams queryParams, PromoteFileVersionHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "/versions/current")).method("POST").params(queryParamsMap).headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileVersionFull.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class FileVersionsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public FileVersionsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public FileVersionsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public FileVersionsManager build() {
      return new FileVersionsManager(this);
    }

  }

}
