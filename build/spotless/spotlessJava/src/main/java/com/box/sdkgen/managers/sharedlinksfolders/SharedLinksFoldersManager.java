package com.box.sdkgen.managers.sharedlinksfolders;

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
import com.box.sdkgen.serialization.json.JsonManager;
import java.util.Map;

public class SharedLinksFoldersManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public SharedLinksFoldersManager() {
    this.networkSession = new NetworkSession();
  }

  protected SharedLinksFoldersManager(SharedLinksFoldersManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public FolderFull findFolderForSharedLink(FindFolderForSharedLinkHeaders headers) {
    return findFolderForSharedLink(headers, new FindFolderForSharedLinkQueryParams());
  }

  public FolderFull findFolderForSharedLink(
      FindFolderForSharedLinkHeaders headers, FindFolderForSharedLinkQueryParams queryParams) {
    Map<String, String> queryParamsMap =
        prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
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
                        "/2.0/shared_items#folders"))
                .method("GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), FolderFull.class);
  }

  public FolderFull getSharedLinkForFolder(
      String folderId, GetSharedLinkForFolderQueryParams queryParams) {
    return getSharedLinkForFolder(folderId, queryParams, new GetSharedLinkForFolderHeaders());
  }

  public FolderFull getSharedLinkForFolder(
      String folderId,
      GetSharedLinkForFolderQueryParams queryParams,
      GetSharedLinkForFolderHeaders headers) {
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
                        "#get_shared_link"))
                .method("GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), FolderFull.class);
  }

  public FolderFull addShareLinkToFolder(
      String folderId, AddShareLinkToFolderQueryParams queryParams) {
    return addShareLinkToFolder(
        folderId,
        queryParams,
        new AddShareLinkToFolderRequestBody(),
        new AddShareLinkToFolderHeaders());
  }

  public FolderFull addShareLinkToFolder(
      String folderId,
      AddShareLinkToFolderQueryParams queryParams,
      AddShareLinkToFolderRequestBody requestBody) {
    return addShareLinkToFolder(
        folderId, queryParams, requestBody, new AddShareLinkToFolderHeaders());
  }

  public FolderFull addShareLinkToFolder(
      String folderId,
      AddShareLinkToFolderQueryParams queryParams,
      AddShareLinkToFolderHeaders headers) {
    return addShareLinkToFolder(
        folderId, queryParams, new AddShareLinkToFolderRequestBody(), headers);
  }

  public FolderFull addShareLinkToFolder(
      String folderId,
      AddShareLinkToFolderQueryParams queryParams,
      AddShareLinkToFolderRequestBody requestBody,
      AddShareLinkToFolderHeaders headers) {
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
                        "#add_shared_link"))
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

  public FolderFull updateSharedLinkOnFolder(
      String folderId, UpdateSharedLinkOnFolderQueryParams queryParams) {
    return updateSharedLinkOnFolder(
        folderId,
        queryParams,
        new UpdateSharedLinkOnFolderRequestBody(),
        new UpdateSharedLinkOnFolderHeaders());
  }

  public FolderFull updateSharedLinkOnFolder(
      String folderId,
      UpdateSharedLinkOnFolderQueryParams queryParams,
      UpdateSharedLinkOnFolderRequestBody requestBody) {
    return updateSharedLinkOnFolder(
        folderId, queryParams, requestBody, new UpdateSharedLinkOnFolderHeaders());
  }

  public FolderFull updateSharedLinkOnFolder(
      String folderId,
      UpdateSharedLinkOnFolderQueryParams queryParams,
      UpdateSharedLinkOnFolderHeaders headers) {
    return updateSharedLinkOnFolder(
        folderId, queryParams, new UpdateSharedLinkOnFolderRequestBody(), headers);
  }

  public FolderFull updateSharedLinkOnFolder(
      String folderId,
      UpdateSharedLinkOnFolderQueryParams queryParams,
      UpdateSharedLinkOnFolderRequestBody requestBody,
      UpdateSharedLinkOnFolderHeaders headers) {
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
                        "#update_shared_link"))
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

  public FolderFull removeSharedLinkFromFolder(
      String folderId, RemoveSharedLinkFromFolderQueryParams queryParams) {
    return removeSharedLinkFromFolder(
        folderId,
        queryParams,
        new RemoveSharedLinkFromFolderRequestBody(),
        new RemoveSharedLinkFromFolderHeaders());
  }

  public FolderFull removeSharedLinkFromFolder(
      String folderId,
      RemoveSharedLinkFromFolderQueryParams queryParams,
      RemoveSharedLinkFromFolderRequestBody requestBody) {
    return removeSharedLinkFromFolder(
        folderId, queryParams, requestBody, new RemoveSharedLinkFromFolderHeaders());
  }

  public FolderFull removeSharedLinkFromFolder(
      String folderId,
      RemoveSharedLinkFromFolderQueryParams queryParams,
      RemoveSharedLinkFromFolderHeaders headers) {
    return removeSharedLinkFromFolder(
        folderId, queryParams, new RemoveSharedLinkFromFolderRequestBody(), headers);
  }

  public FolderFull removeSharedLinkFromFolder(
      String folderId,
      RemoveSharedLinkFromFolderQueryParams queryParams,
      RemoveSharedLinkFromFolderRequestBody requestBody,
      RemoveSharedLinkFromFolderHeaders headers) {
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
                        "#remove_shared_link"))
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

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class SharedLinksFoldersManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public SharedLinksFoldersManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public SharedLinksFoldersManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public SharedLinksFoldersManager build() {
      return new SharedLinksFoldersManager(this);
    }
  }
}
