package com.box.sdkgen.managers.fileclassifications;

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

public class FileClassificationsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public FileClassificationsManager() {
    this.networkSession = new NetworkSession();
  }

  protected FileClassificationsManager(FileClassificationsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public Classification getClassificationOnFile(String fileId) {
    return getClassificationOnFile(fileId, new GetClassificationOnFileHeaders());
  }

  public Classification getClassificationOnFile(
      String fileId, GetClassificationOnFileHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/files/",
                        convertToString(fileId),
                        "/metadata/enterprise/securityClassification-6VMVochwUWo"))
                .method("GET")
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), Classification.class);
  }

  public Classification addClassificationToFile(String fileId) {
    return addClassificationToFile(
        fileId, new AddClassificationToFileRequestBody(), new AddClassificationToFileHeaders());
  }

  public Classification addClassificationToFile(
      String fileId, AddClassificationToFileRequestBody requestBody) {
    return addClassificationToFile(fileId, requestBody, new AddClassificationToFileHeaders());
  }

  public Classification addClassificationToFile(
      String fileId, AddClassificationToFileHeaders headers) {
    return addClassificationToFile(fileId, new AddClassificationToFileRequestBody(), headers);
  }

  public Classification addClassificationToFile(
      String fileId,
      AddClassificationToFileRequestBody requestBody,
      AddClassificationToFileHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/files/",
                        convertToString(fileId),
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

  public Classification updateClassificationOnFile(
      String fileId, List<UpdateClassificationOnFileRequestBody> requestBody) {
    return updateClassificationOnFile(fileId, requestBody, new UpdateClassificationOnFileHeaders());
  }

  public Classification updateClassificationOnFile(
      String fileId,
      List<UpdateClassificationOnFileRequestBody> requestBody,
      UpdateClassificationOnFileHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/files/",
                        convertToString(fileId),
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

  public void deleteClassificationFromFile(String fileId) {
    deleteClassificationFromFile(fileId, new DeleteClassificationFromFileHeaders());
  }

  public void deleteClassificationFromFile(
      String fileId, DeleteClassificationFromFileHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/files/",
                        convertToString(fileId),
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

  public static class FileClassificationsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public FileClassificationsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public FileClassificationsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public FileClassificationsManager build() {
      return new FileClassificationsManager(this);
    }
  }
}
