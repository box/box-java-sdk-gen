package com.box.sdkgen.managers.folders;

import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;

import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import com.box.sdkgen.networking.network.NetworkSession;
import com.box.sdkgen.schemas.folderfull.FolderFull;
import com.box.sdkgen.schemas.items.Items;
import com.box.sdkgen.serialization.json.JsonManager;
import java.util.Map;

public class FoldersManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public FoldersManager() {
    this.networkSession = new NetworkSession();
  }

  protected FoldersManager(FoldersManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public FolderFull getFolderById(String folderId) {
    return getFolderById(folderId, new GetFolderByIdQueryParams(), new GetFolderByIdHeaders());
  }

  public FolderFull getFolderById(String folderId, GetFolderByIdQueryParams queryParams) {
    return getFolderById(folderId, queryParams, new GetFolderByIdHeaders());
  }

  public FolderFull getFolderById(String folderId, GetFolderByIdHeaders headers) {
    return getFolderById(folderId, new GetFolderByIdQueryParams(), headers);
  }

  public FolderFull getFolderById(
      String folderId, GetFolderByIdQueryParams queryParams, GetFolderByIdHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(
            mapOf(
                entryOf("fields", convertToString(queryParams.getFields())),
                entryOf("sort", convertToString(queryParams.getSort())),
                entryOf("direction", convertToString(queryParams.getDirection())),
                entryOf("offset", convertToString(queryParams.getOffset())),
                entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap =
        prepareParams(
            mergeMaps(
                mapOf(
                    entryOf("if-none-match", convertToString(headers.getIfNoneMatch())),
                    entryOf("boxapi", convertToString(headers.getBoxapi()))),
                headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/folders/",
                        convertToString(folderId)))
                .method("GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), FolderFull.class);
  }

  public FolderFull updateFolderById(String folderId) {
    return updateFolderById(
        folderId,
        new UpdateFolderByIdRequestBody(),
        new UpdateFolderByIdQueryParams(),
        new UpdateFolderByIdHeaders());
  }

  public FolderFull updateFolderById(String folderId, UpdateFolderByIdRequestBody requestBody) {
    return updateFolderById(
        folderId, requestBody, new UpdateFolderByIdQueryParams(), new UpdateFolderByIdHeaders());
  }

  public FolderFull updateFolderById(String folderId, UpdateFolderByIdQueryParams queryParams) {
    return updateFolderById(
        folderId, new UpdateFolderByIdRequestBody(), queryParams, new UpdateFolderByIdHeaders());
  }

  public FolderFull updateFolderById(
      String folderId,
      UpdateFolderByIdRequestBody requestBody,
      UpdateFolderByIdQueryParams queryParams) {
    return updateFolderById(folderId, requestBody, queryParams, new UpdateFolderByIdHeaders());
  }

  public FolderFull updateFolderById(String folderId, UpdateFolderByIdHeaders headers) {
    return updateFolderById(
        folderId, new UpdateFolderByIdRequestBody(), new UpdateFolderByIdQueryParams(), headers);
  }

  public FolderFull updateFolderById(
      String folderId, UpdateFolderByIdRequestBody requestBody, UpdateFolderByIdHeaders headers) {
    return updateFolderById(folderId, requestBody, new UpdateFolderByIdQueryParams(), headers);
  }

  public FolderFull updateFolderById(
      String folderId, UpdateFolderByIdQueryParams queryParams, UpdateFolderByIdHeaders headers) {
    return updateFolderById(folderId, new UpdateFolderByIdRequestBody(), queryParams, headers);
  }

  public FolderFull updateFolderById(
      String folderId,
      UpdateFolderByIdRequestBody requestBody,
      UpdateFolderByIdQueryParams queryParams,
      UpdateFolderByIdHeaders headers) {
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
                        "/2.0/folders/",
                        convertToString(folderId)))
                .method("PUT")
                .params(queryParamsMap)
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), FolderFull.class);
  }

  public void deleteFolderById(String folderId) {
    deleteFolderById(folderId, new DeleteFolderByIdQueryParams(), new DeleteFolderByIdHeaders());
  }

  public void deleteFolderById(String folderId, DeleteFolderByIdQueryParams queryParams) {
    deleteFolderById(folderId, queryParams, new DeleteFolderByIdHeaders());
  }

  public void deleteFolderById(String folderId, DeleteFolderByIdHeaders headers) {
    deleteFolderById(folderId, new DeleteFolderByIdQueryParams(), headers);
  }

  public void deleteFolderById(
      String folderId, DeleteFolderByIdQueryParams queryParams, DeleteFolderByIdHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(mapOf(entryOf("recursive", convertToString(queryParams.getRecursive()))));
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
                        "/2.0/folders/",
                        convertToString(folderId)))
                .method("DELETE")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat(null)
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
  }

  public Items getFolderItems(String folderId) {
    return getFolderItems(folderId, new GetFolderItemsQueryParams(), new GetFolderItemsHeaders());
  }

  public Items getFolderItems(String folderId, GetFolderItemsQueryParams queryParams) {
    return getFolderItems(folderId, queryParams, new GetFolderItemsHeaders());
  }

  public Items getFolderItems(String folderId, GetFolderItemsHeaders headers) {
    return getFolderItems(folderId, new GetFolderItemsQueryParams(), headers);
  }

  public Items getFolderItems(
      String folderId, GetFolderItemsQueryParams queryParams, GetFolderItemsHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(
            mapOf(
                entryOf("fields", convertToString(queryParams.getFields())),
                entryOf("usemarker", convertToString(queryParams.getUsemarker())),
                entryOf("marker", convertToString(queryParams.getMarker())),
                entryOf("offset", convertToString(queryParams.getOffset())),
                entryOf("limit", convertToString(queryParams.getLimit())),
                entryOf("sort", convertToString(queryParams.getSort())),
                entryOf("direction", convertToString(queryParams.getDirection()))));
    Map<String, String> headersMap =
        prepareParams(
            mergeMaps(
                mapOf(entryOf("boxapi", convertToString(headers.getBoxapi()))),
                headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/folders/",
                        convertToString(folderId),
                        "/items"))
                .method("GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), Items.class);
  }

  public FolderFull createFolder(CreateFolderRequestBody requestBody) {
    return createFolder(requestBody, new CreateFolderQueryParams(), new CreateFolderHeaders());
  }

  public FolderFull createFolder(
      CreateFolderRequestBody requestBody, CreateFolderQueryParams queryParams) {
    return createFolder(requestBody, queryParams, new CreateFolderHeaders());
  }

  public FolderFull createFolder(CreateFolderRequestBody requestBody, CreateFolderHeaders headers) {
    return createFolder(requestBody, new CreateFolderQueryParams(), headers);
  }

  public FolderFull createFolder(
      CreateFolderRequestBody requestBody,
      CreateFolderQueryParams queryParams,
      CreateFolderHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/folders"))
                .method("POST")
                .params(queryParamsMap)
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), FolderFull.class);
  }

  public FolderFull copyFolder(String folderId, CopyFolderRequestBody requestBody) {
    return copyFolder(folderId, requestBody, new CopyFolderQueryParams(), new CopyFolderHeaders());
  }

  public FolderFull copyFolder(
      String folderId, CopyFolderRequestBody requestBody, CopyFolderQueryParams queryParams) {
    return copyFolder(folderId, requestBody, queryParams, new CopyFolderHeaders());
  }

  public FolderFull copyFolder(
      String folderId, CopyFolderRequestBody requestBody, CopyFolderHeaders headers) {
    return copyFolder(folderId, requestBody, new CopyFolderQueryParams(), headers);
  }

  public FolderFull copyFolder(
      String folderId,
      CopyFolderRequestBody requestBody,
      CopyFolderQueryParams queryParams,
      CopyFolderHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/folders/",
                        convertToString(folderId),
                        "/copy"))
                .method("POST")
                .params(queryParamsMap)
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), FolderFull.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class FoldersManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public FoldersManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public FoldersManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public FoldersManager build() {
      return new FoldersManager(this);
    }
  }
}
