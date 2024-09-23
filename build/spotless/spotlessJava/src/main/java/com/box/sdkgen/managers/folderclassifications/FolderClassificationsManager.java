package com.box.sdkgen.managers.folderclassifications;

import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;

import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import com.box.sdkgen.networking.network.NetworkSession;
import com.box.sdkgen.schemas.classification.Classification;
import com.box.sdkgen.serialization.json.JsonManager;
import java.util.List;
import java.util.Map;

public class FolderClassificationsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public FolderClassificationsManager() {
    this.networkSession = new NetworkSession();
  }

  protected FolderClassificationsManager(FolderClassificationsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public Classification getClassificationOnFolder(String folderId) {
    return getClassificationOnFolder(folderId, new GetClassificationOnFolderHeaders());
  }

  public Classification getClassificationOnFolder(
      String folderId, GetClassificationOnFolderHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/folders/",
                        convertToString(folderId),
                        "/metadata/enterprise/securityClassification-6VMVochwUWo"))
                .method("GET")
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), Classification.class);
  }

  public Classification addClassificationToFolder(String folderId) {
    return addClassificationToFolder(
        folderId,
        new AddClassificationToFolderRequestBody(),
        new AddClassificationToFolderHeaders());
  }

  public Classification addClassificationToFolder(
      String folderId, AddClassificationToFolderRequestBody requestBody) {
    return addClassificationToFolder(folderId, requestBody, new AddClassificationToFolderHeaders());
  }

  public Classification addClassificationToFolder(
      String folderId, AddClassificationToFolderHeaders headers) {
    return addClassificationToFolder(folderId, new AddClassificationToFolderRequestBody(), headers);
  }

  public Classification addClassificationToFolder(
      String folderId,
      AddClassificationToFolderRequestBody requestBody,
      AddClassificationToFolderHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/folders/",
                        convertToString(folderId),
                        "/metadata/enterprise/securityClassification-6VMVochwUWo"))
                .method("POST")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), Classification.class);
  }

  public Classification updateClassificationOnFolder(
      String folderId, List<UpdateClassificationOnFolderRequestBody> requestBody) {
    return updateClassificationOnFolder(
        folderId, requestBody, new UpdateClassificationOnFolderHeaders());
  }

  public Classification updateClassificationOnFolder(
      String folderId,
      List<UpdateClassificationOnFolderRequestBody> requestBody,
      UpdateClassificationOnFolderHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/folders/",
                        convertToString(folderId),
                        "/metadata/enterprise/securityClassification-6VMVochwUWo"))
                .method("PUT")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json-patch+json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), Classification.class);
  }

  public void deleteClassificationFromFolder(String folderId) {
    deleteClassificationFromFolder(folderId, new DeleteClassificationFromFolderHeaders());
  }

  public void deleteClassificationFromFolder(
      String folderId, DeleteClassificationFromFolderHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/folders/",
                        convertToString(folderId),
                        "/metadata/enterprise/securityClassification-6VMVochwUWo"))
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

  public static class FolderClassificationsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public FolderClassificationsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public FolderClassificationsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public FolderClassificationsManager build() {
      return new FolderClassificationsManager(this);
    }
  }
}
