package com.box.sdkgen.managers.files;

import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.filefull.FileFull;
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

public class FilesManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public FilesManager() {
    this.networkSession = new NetworkSession();
  }

  protected FilesManager(FilesManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public FileFull getFileById(String fileId) {
    return getFileById(fileId, new GetFileByIdQueryParams(), new GetFileByIdHeaders());
  }

  public FileFull getFileById(String fileId, GetFileByIdQueryParams queryParams) {
    return getFileById(fileId, queryParams, new GetFileByIdHeaders());
  }

  public FileFull getFileById(String fileId, GetFileByIdHeaders headers) {
    return getFileById(fileId, new GetFileByIdQueryParams(), headers);
  }

  public FileFull getFileById(String fileId, GetFileByIdQueryParams queryParams, GetFileByIdHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(entryOf("if-none-match", convertToString(headers.getIfNoneMatch())), entryOf("boxapi", convertToString(headers.getBoxapi())), entryOf("x-rep-hints", convertToString(headers.getXRepHints()))), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId))).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileFull.class);
  }

  public FileFull updateFileById(String fileId) {
    return updateFileById(fileId, new UpdateFileByIdRequestBody(), new UpdateFileByIdQueryParams(), new UpdateFileByIdHeaders());
  }

  public FileFull updateFileById(String fileId, UpdateFileByIdRequestBody requestBody) {
    return updateFileById(fileId, requestBody, new UpdateFileByIdQueryParams(), new UpdateFileByIdHeaders());
  }

  public FileFull updateFileById(String fileId, UpdateFileByIdQueryParams queryParams) {
    return updateFileById(fileId, new UpdateFileByIdRequestBody(), queryParams, new UpdateFileByIdHeaders());
  }

  public FileFull updateFileById(String fileId, UpdateFileByIdRequestBody requestBody, UpdateFileByIdQueryParams queryParams) {
    return updateFileById(fileId, requestBody, queryParams, new UpdateFileByIdHeaders());
  }

  public FileFull updateFileById(String fileId, UpdateFileByIdHeaders headers) {
    return updateFileById(fileId, new UpdateFileByIdRequestBody(), new UpdateFileByIdQueryParams(), headers);
  }

  public FileFull updateFileById(String fileId, UpdateFileByIdRequestBody requestBody, UpdateFileByIdHeaders headers) {
    return updateFileById(fileId, requestBody, new UpdateFileByIdQueryParams(), headers);
  }

  public FileFull updateFileById(String fileId, UpdateFileByIdQueryParams queryParams, UpdateFileByIdHeaders headers) {
    return updateFileById(fileId, new UpdateFileByIdRequestBody(), queryParams, headers);
  }

  public FileFull updateFileById(String fileId, UpdateFileByIdRequestBody requestBody, UpdateFileByIdQueryParams queryParams, UpdateFileByIdHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(entryOf("if-match", convertToString(headers.getIfMatch()))), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId))).method("PUT").params(queryParamsMap).headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileFull.class);
  }

  public void deleteFileById(String fileId) {
    deleteFileById(fileId, new DeleteFileByIdHeaders());
  }

  public void deleteFileById(String fileId, DeleteFileByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(entryOf("if-match", convertToString(headers.getIfMatch()))), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public FileFull copyFile(String fileId, CopyFileRequestBody requestBody) {
    return copyFile(fileId, requestBody, new CopyFileQueryParams(), new CopyFileHeaders());
  }

  public FileFull copyFile(String fileId, CopyFileRequestBody requestBody, CopyFileQueryParams queryParams) {
    return copyFile(fileId, requestBody, queryParams, new CopyFileHeaders());
  }

  public FileFull copyFile(String fileId, CopyFileRequestBody requestBody, CopyFileHeaders headers) {
    return copyFile(fileId, requestBody, new CopyFileQueryParams(), headers);
  }

  public FileFull copyFile(String fileId, CopyFileRequestBody requestBody, CopyFileQueryParams queryParams, CopyFileHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "/copy")).method("POST").params(queryParamsMap).headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileFull.class);
  }

  public ByteStream getFileThumbnailById(String fileId, GetFileThumbnailByIdExtension extension) {
    return getFileThumbnailById(fileId, extension, new GetFileThumbnailByIdQueryParams(), new GetFileThumbnailByIdHeaders());
  }

  public ByteStream getFileThumbnailById(String fileId, GetFileThumbnailByIdExtension extension, GetFileThumbnailByIdQueryParams queryParams) {
    return getFileThumbnailById(fileId, extension, queryParams, new GetFileThumbnailByIdHeaders());
  }

  public ByteStream getFileThumbnailById(String fileId, GetFileThumbnailByIdExtension extension, GetFileThumbnailByIdHeaders headers) {
    return getFileThumbnailById(fileId, extension, new GetFileThumbnailByIdQueryParams(), headers);
  }

  public ByteStream getFileThumbnailById(String fileId, GetFileThumbnailByIdExtension extension, GetFileThumbnailByIdQueryParams queryParams, GetFileThumbnailByIdHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("min_height", convertToString(queryParams.getMinHeight())), entryOf("min_width", convertToString(queryParams.getMinWidth())), entryOf("max_height", convertToString(queryParams.getMaxHeight())), entryOf("max_width", convertToString(queryParams.getMaxWidth()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "/thumbnail.", convertToString(extension))).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("binary").auth(this.auth).networkSession(this.networkSession).build());
    return response.getContent();
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class FilesManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public FilesManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public FilesManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public FilesManager build() {
      return new FilesManager(this);
    }

  }

}
