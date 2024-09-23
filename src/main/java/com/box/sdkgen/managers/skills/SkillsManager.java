package com.box.sdkgen.managers.skills;

import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;

import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import com.box.sdkgen.networking.network.NetworkSession;
import com.box.sdkgen.schemas.skillcardsmetadata.SkillCardsMetadata;
import com.box.sdkgen.serialization.json.JsonManager;
import java.util.List;
import java.util.Map;

public class SkillsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public SkillsManager() {
    this.networkSession = new NetworkSession();
  }

  protected SkillsManager(SkillsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public SkillCardsMetadata getBoxSkillCardsOnFile(String fileId) {
    return getBoxSkillCardsOnFile(fileId, new GetBoxSkillCardsOnFileHeaders());
  }

  public SkillCardsMetadata getBoxSkillCardsOnFile(
      String fileId, GetBoxSkillCardsOnFileHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/files/",
                        convertToString(fileId),
                        "/metadata/global/boxSkillsCards"))
                .method("GET")
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), SkillCardsMetadata.class);
  }

  public SkillCardsMetadata createBoxSkillCardsOnFile(
      String fileId, CreateBoxSkillCardsOnFileRequestBody requestBody) {
    return createBoxSkillCardsOnFile(fileId, requestBody, new CreateBoxSkillCardsOnFileHeaders());
  }

  public SkillCardsMetadata createBoxSkillCardsOnFile(
      String fileId,
      CreateBoxSkillCardsOnFileRequestBody requestBody,
      CreateBoxSkillCardsOnFileHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/files/",
                        convertToString(fileId),
                        "/metadata/global/boxSkillsCards"))
                .method("POST")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), SkillCardsMetadata.class);
  }

  public SkillCardsMetadata updateBoxSkillCardsOnFile(
      String fileId, List<UpdateBoxSkillCardsOnFileRequestBody> requestBody) {
    return updateBoxSkillCardsOnFile(fileId, requestBody, new UpdateBoxSkillCardsOnFileHeaders());
  }

  public SkillCardsMetadata updateBoxSkillCardsOnFile(
      String fileId,
      List<UpdateBoxSkillCardsOnFileRequestBody> requestBody,
      UpdateBoxSkillCardsOnFileHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/files/",
                        convertToString(fileId),
                        "/metadata/global/boxSkillsCards"))
                .method("PUT")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json-patch+json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), SkillCardsMetadata.class);
  }

  public void deleteBoxSkillCardsFromFile(String fileId) {
    deleteBoxSkillCardsFromFile(fileId, new DeleteBoxSkillCardsFromFileHeaders());
  }

  public void deleteBoxSkillCardsFromFile(
      String fileId, DeleteBoxSkillCardsFromFileHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/files/",
                        convertToString(fileId),
                        "/metadata/global/boxSkillsCards"))
                .method("DELETE")
                .headers(headersMap)
                .responseFormat(null)
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
  }

  public void updateAllSkillCardsOnFile(
      String skillId, UpdateAllSkillCardsOnFileRequestBody requestBody) {
    updateAllSkillCardsOnFile(skillId, requestBody, new UpdateAllSkillCardsOnFileHeaders());
  }

  public void updateAllSkillCardsOnFile(
      String skillId,
      UpdateAllSkillCardsOnFileRequestBody requestBody,
      UpdateAllSkillCardsOnFileHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/skill_invocations/",
                        convertToString(skillId)))
                .method("PUT")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
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

  public static class SkillsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public SkillsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public SkillsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public SkillsManager build() {
      return new SkillsManager(this);
    }
  }
}
