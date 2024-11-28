package com.box.sdkgen.managers.files;

import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;

import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.fetchoptions.FetchOptions;
import com.box.sdkgen.networking.fetchoptions.ResponseFormat;
import com.box.sdkgen.networking.fetchresponse.FetchResponse;
import com.box.sdkgen.networking.network.NetworkSession;
import com.box.sdkgen.schemas.filefull.FileFull;
import com.box.sdkgen.serialization.json.JsonManager;
import java.io.InputStream;
import java.util.Map;

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

  public FileFull getFileById(
      String fileId, GetFileByIdQueryParams queryParams, GetFileByIdHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap =
        prepareParams(
            mergeMaps(
                mapOf(
                    entryOf("if-none-match", convertToString(headers.getIfNoneMatch())),
                    entryOf("boxapi", convertToString(headers.getBoxapi())),
                    entryOf("x-rep-hints", convertToString(headers.getXRepHints()))),
                headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/files/",
                        convertToString(fileId)),
                    "GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat(ResponseFormat.JSON)
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), FileFull.class);
  }

  public FileFull updateFileById(String fileId) {
    return updateFileById(
        fileId,
        new UpdateFileByIdRequestBody(),
        new UpdateFileByIdQueryParams(),
        new UpdateFileByIdHeaders());
  }

  public FileFull updateFileById(String fileId, UpdateFileByIdRequestBody requestBody) {
    return updateFileById(
        fileId, requestBody, new UpdateFileByIdQueryParams(), new UpdateFileByIdHeaders());
  }

  public FileFull updateFileById(String fileId, UpdateFileByIdQueryParams queryParams) {
    return updateFileById(
        fileId, new UpdateFileByIdRequestBody(), queryParams, new UpdateFileByIdHeaders());
  }

  public FileFull updateFileById(
      String fileId, UpdateFileByIdRequestBody requestBody, UpdateFileByIdQueryParams queryParams) {
    return updateFileById(fileId, requestBody, queryParams, new UpdateFileByIdHeaders());
  }

  public FileFull updateFileById(String fileId, UpdateFileByIdHeaders headers) {
    return updateFileById(
        fileId, new UpdateFileByIdRequestBody(), new UpdateFileByIdQueryParams(), headers);
  }

  public FileFull updateFileById(
      String fileId, UpdateFileByIdRequestBody requestBody, UpdateFileByIdHeaders headers) {
    return updateFileById(fileId, requestBody, new UpdateFileByIdQueryParams(), headers);
  }

  public FileFull updateFileById(
      String fileId, UpdateFileByIdQueryParams queryParams, UpdateFileByIdHeaders headers) {
    return updateFileById(fileId, new UpdateFileByIdRequestBody(), queryParams, headers);
  }

  public FileFull updateFileById(
      String fileId,
      UpdateFileByIdRequestBody requestBody,
      UpdateFileByIdQueryParams queryParams,
      UpdateFileByIdHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap =
        prepareParams(
            mergeMaps(
                mapOf(entryOf("if-match", convertToString(headers.getIfMatch()))),
                headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/files/",
                        convertToString(fileId)),
                    "PUT")
                .params(queryParamsMap)
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat(ResponseFormat.JSON)
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), FileFull.class);
  }

  public void deleteFileById(String fileId) {
    deleteFileById(fileId, new DeleteFileByIdHeaders());
  }

  public void deleteFileById(String fileId, DeleteFileByIdHeaders headers) {
    Map<String, String> headersMap =
        prepareParams(
            mergeMaps(
                mapOf(entryOf("if-match", convertToString(headers.getIfMatch()))),
                headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/files/",
                        convertToString(fileId)),
                    "DELETE")
                .headers(headersMap)
                .responseFormat(ResponseFormat.NO_CONTENT)
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
  }

  public FileFull copyFile(String fileId, CopyFileRequestBody requestBody) {
    return copyFile(fileId, requestBody, new CopyFileQueryParams(), new CopyFileHeaders());
  }

  public FileFull copyFile(
      String fileId, CopyFileRequestBody requestBody, CopyFileQueryParams queryParams) {
    return copyFile(fileId, requestBody, queryParams, new CopyFileHeaders());
  }

  public FileFull copyFile(
      String fileId, CopyFileRequestBody requestBody, CopyFileHeaders headers) {
    return copyFile(fileId, requestBody, new CopyFileQueryParams(), headers);
  }

  public FileFull copyFile(
      String fileId,
      CopyFileRequestBody requestBody,
      CopyFileQueryParams queryParams,
      CopyFileHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/files/",
                        convertToString(fileId),
                        "/copy"),
                    "POST")
                .params(queryParamsMap)
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat(ResponseFormat.JSON)
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), FileFull.class);
  }

  public InputStream getFileThumbnailById(String fileId, GetFileThumbnailByIdExtension extension) {
    return getFileThumbnailById(
        fileId,
        extension,
        new GetFileThumbnailByIdQueryParams(),
        new GetFileThumbnailByIdHeaders());
  }

  public InputStream getFileThumbnailById(
      String fileId,
      GetFileThumbnailByIdExtension extension,
      GetFileThumbnailByIdQueryParams queryParams) {
    return getFileThumbnailById(fileId, extension, queryParams, new GetFileThumbnailByIdHeaders());
  }

  public InputStream getFileThumbnailById(
      String fileId, GetFileThumbnailByIdExtension extension, GetFileThumbnailByIdHeaders headers) {
    return getFileThumbnailById(fileId, extension, new GetFileThumbnailByIdQueryParams(), headers);
  }

  public InputStream getFileThumbnailById(
      String fileId,
      GetFileThumbnailByIdExtension extension,
      GetFileThumbnailByIdQueryParams queryParams,
      GetFileThumbnailByIdHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(
            mapOf(
                entryOf("min_height", convertToString(queryParams.getMinHeight())),
                entryOf("min_width", convertToString(queryParams.getMinWidth())),
                entryOf("max_height", convertToString(queryParams.getMaxHeight())),
                entryOf("max_width", convertToString(queryParams.getMaxWidth()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/files/",
                        convertToString(fileId),
                        "/thumbnail.",
                        convertToString(extension)),
                    "GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat(ResponseFormat.BINARY)
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    if (convertToString(response.getStatus()).equals("202")) {
      return null;
    }
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
