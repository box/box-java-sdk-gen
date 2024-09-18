package com.box.sdkgen.managers.folderlocks;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.folderlocks.FolderLocks;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.folderlock.FolderLock;
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

public class FolderLocksManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public FolderLocksManager() {
    this.networkSession = new NetworkSession();
  }

  protected FolderLocksManager(FolderLocksManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public FolderLocks getFolderLocks(GetFolderLocksQueryParams queryParams) {
    return getFolderLocks(queryParams, new GetFolderLocksHeaders());
  }

  public FolderLocks getFolderLocks(GetFolderLocksQueryParams queryParams, GetFolderLocksHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("folder_id", convertToString(queryParams.getFolderId()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/folder_locks")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FolderLocks.class);
  }

  public FolderLock createFolderLock(CreateFolderLockRequestBody requestBody) {
    return createFolderLock(requestBody, new CreateFolderLockHeaders());
  }

  public FolderLock createFolderLock(CreateFolderLockRequestBody requestBody, CreateFolderLockHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/folder_locks")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FolderLock.class);
  }

  public void deleteFolderLockById(String folderLockId) {
    deleteFolderLockById(folderLockId, new DeleteFolderLockByIdHeaders());
  }

  public void deleteFolderLockById(String folderLockId, DeleteFolderLockByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/folder_locks/", convertToString(folderLockId))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class FolderLocksManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public FolderLocksManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public FolderLocksManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public FolderLocksManager build() {
      return new FolderLocksManager(this);
    }

  }

}
