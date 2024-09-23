package com.box.sdkgen.managers.classifications;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;

import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import com.box.sdkgen.networking.network.NetworkSession;
import com.box.sdkgen.schemas.classificationtemplate.ClassificationTemplate;
import com.box.sdkgen.serialization.json.JsonManager;
import java.util.List;
import java.util.Map;

public class ClassificationsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public ClassificationsManager() {
    this.networkSession = new NetworkSession();
  }

  protected ClassificationsManager(ClassificationsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public ClassificationTemplate getClassificationTemplate() {
    return getClassificationTemplate(new GetClassificationTemplateHeaders());
  }

  public ClassificationTemplate getClassificationTemplate(
      GetClassificationTemplateHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema"))
                .method("GET")
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), ClassificationTemplate.class);
  }

  public ClassificationTemplate addClassification(List<AddClassificationRequestBody> requestBody) {
    return addClassification(requestBody, new AddClassificationHeaders());
  }

  public ClassificationTemplate addClassification(
      List<AddClassificationRequestBody> requestBody, AddClassificationHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema#add"))
                .method("PUT")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), ClassificationTemplate.class);
  }

  public ClassificationTemplate updateClassification(
      List<UpdateClassificationRequestBody> requestBody) {
    return updateClassification(requestBody, new UpdateClassificationHeaders());
  }

  public ClassificationTemplate updateClassification(
      List<UpdateClassificationRequestBody> requestBody, UpdateClassificationHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema#update"))
                .method("PUT")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json-patch+json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), ClassificationTemplate.class);
  }

  public ClassificationTemplate createClassificationTemplate(
      CreateClassificationTemplateRequestBody requestBody) {
    return createClassificationTemplate(requestBody, new CreateClassificationTemplateHeaders());
  }

  public ClassificationTemplate createClassificationTemplate(
      CreateClassificationTemplateRequestBody requestBody,
      CreateClassificationTemplateHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/metadata_templates/schema#classifications"))
                .method("POST")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), ClassificationTemplate.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class ClassificationsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public ClassificationsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public ClassificationsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public ClassificationsManager build() {
      return new ClassificationsManager(this);
    }
  }
}
