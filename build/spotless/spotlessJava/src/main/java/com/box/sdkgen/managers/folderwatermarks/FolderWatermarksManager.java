package com.box.sdkgen.managers.folderwatermarks;

import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;

import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import com.box.sdkgen.networking.network.NetworkSession;
import com.box.sdkgen.schemas.watermark.Watermark;
import com.box.sdkgen.serialization.json.JsonManager;
import java.util.Map;

public class FolderWatermarksManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public FolderWatermarksManager() {
    this.networkSession = new NetworkSession();
  }

  protected FolderWatermarksManager(FolderWatermarksManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public Watermark getFolderWatermark(String folderId) {
    return getFolderWatermark(folderId, new GetFolderWatermarkHeaders());
  }

  public Watermark getFolderWatermark(String folderId, GetFolderWatermarkHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/folders/",
                        convertToString(folderId),
                        "/watermark"))
                .method("GET")
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), Watermark.class);
  }

  public Watermark updateFolderWatermark(
      String folderId, UpdateFolderWatermarkRequestBody requestBody) {
    return updateFolderWatermark(folderId, requestBody, new UpdateFolderWatermarkHeaders());
  }

  public Watermark updateFolderWatermark(
      String folderId,
      UpdateFolderWatermarkRequestBody requestBody,
      UpdateFolderWatermarkHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/folders/",
                        convertToString(folderId),
                        "/watermark"))
                .method("PUT")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), Watermark.class);
  }

  public void deleteFolderWatermark(String folderId) {
    deleteFolderWatermark(folderId, new DeleteFolderWatermarkHeaders());
  }

  public void deleteFolderWatermark(String folderId, DeleteFolderWatermarkHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/folders/",
                        convertToString(folderId),
                        "/watermark"))
                .method("DELETE")
                .headers(headersMap)
                .responseFormat(null)
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class FolderWatermarksManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public FolderWatermarksManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public FolderWatermarksManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public FolderWatermarksManager build() {
      return new FolderWatermarksManager(this);
    }
  }
}
