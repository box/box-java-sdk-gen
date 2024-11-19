package com.box.sdkgen.managers.metadatatemplates;

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
import com.box.sdkgen.schemas.metadatatemplate.MetadataTemplate;
import com.box.sdkgen.schemas.metadatatemplates.MetadataTemplates;
import com.box.sdkgen.serialization.json.JsonManager;
import java.util.List;
import java.util.Map;

public class MetadataTemplatesManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public MetadataTemplatesManager() {
    this.networkSession = new NetworkSession();
  }

  protected MetadataTemplatesManager(MetadataTemplatesManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public MetadataTemplates getMetadataTemplatesByInstanceId(
      GetMetadataTemplatesByInstanceIdQueryParams queryParams) {
    return getMetadataTemplatesByInstanceId(
        queryParams, new GetMetadataTemplatesByInstanceIdHeaders());
  }

  public MetadataTemplates getMetadataTemplatesByInstanceId(
      GetMetadataTemplatesByInstanceIdQueryParams queryParams,
      GetMetadataTemplatesByInstanceIdHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(
            mapOf(
                entryOf(
                    "metadata_instance_id", convertToString(queryParams.getMetadataInstanceId())),
                entryOf("marker", convertToString(queryParams.getMarker())),
                entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/metadata_templates"))
                .method("GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), MetadataTemplates.class);
  }

  public MetadataTemplate getMetadataTemplate(GetMetadataTemplateScope scope, String templateKey) {
    return getMetadataTemplate(scope, templateKey, new GetMetadataTemplateHeaders());
  }

  public MetadataTemplate getMetadataTemplate(
      GetMetadataTemplateScope scope, String templateKey, GetMetadataTemplateHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/metadata_templates/",
                        convertToString(scope),
                        "/",
                        convertToString(templateKey),
                        "/schema"))
                .method("GET")
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), MetadataTemplate.class);
  }

  public MetadataTemplate updateMetadataTemplate(
      UpdateMetadataTemplateScope scope,
      String templateKey,
      List<UpdateMetadataTemplateRequestBody> requestBody) {
    return updateMetadataTemplate(
        scope, templateKey, requestBody, new UpdateMetadataTemplateHeaders());
  }

  public MetadataTemplate updateMetadataTemplate(
      UpdateMetadataTemplateScope scope,
      String templateKey,
      List<UpdateMetadataTemplateRequestBody> requestBody,
      UpdateMetadataTemplateHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/metadata_templates/",
                        convertToString(scope),
                        "/",
                        convertToString(templateKey),
                        "/schema"))
                .method("PUT")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json-patch+json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), MetadataTemplate.class);
  }

  public void deleteMetadataTemplate(DeleteMetadataTemplateScope scope, String templateKey) {
    deleteMetadataTemplate(scope, templateKey, new DeleteMetadataTemplateHeaders());
  }

  public void deleteMetadataTemplate(
      DeleteMetadataTemplateScope scope,
      String templateKey,
      DeleteMetadataTemplateHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/metadata_templates/",
                        convertToString(scope),
                        "/",
                        convertToString(templateKey),
                        "/schema"))
                .method("DELETE")
                .headers(headersMap)
                .responseFormat(null)
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
  }

  public MetadataTemplate getMetadataTemplateById(String templateId) {
    return getMetadataTemplateById(templateId, new GetMetadataTemplateByIdHeaders());
  }

  public MetadataTemplate getMetadataTemplateById(
      String templateId, GetMetadataTemplateByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/metadata_templates/",
                        convertToString(templateId)))
                .method("GET")
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), MetadataTemplate.class);
  }

  public MetadataTemplates getGlobalMetadataTemplates() {
    return getGlobalMetadataTemplates(
        new GetGlobalMetadataTemplatesQueryParams(), new GetGlobalMetadataTemplatesHeaders());
  }

  public MetadataTemplates getGlobalMetadataTemplates(
      GetGlobalMetadataTemplatesQueryParams queryParams) {
    return getGlobalMetadataTemplates(queryParams, new GetGlobalMetadataTemplatesHeaders());
  }

  public MetadataTemplates getGlobalMetadataTemplates(GetGlobalMetadataTemplatesHeaders headers) {
    return getGlobalMetadataTemplates(new GetGlobalMetadataTemplatesQueryParams(), headers);
  }

  public MetadataTemplates getGlobalMetadataTemplates(
      GetGlobalMetadataTemplatesQueryParams queryParams,
      GetGlobalMetadataTemplatesHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(
            mapOf(
                entryOf("marker", convertToString(queryParams.getMarker())),
                entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/metadata_templates/global"))
                .method("GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), MetadataTemplates.class);
  }

  public MetadataTemplates getEnterpriseMetadataTemplates() {
    return getEnterpriseMetadataTemplates(
        new GetEnterpriseMetadataTemplatesQueryParams(),
        new GetEnterpriseMetadataTemplatesHeaders());
  }

  public MetadataTemplates getEnterpriseMetadataTemplates(
      GetEnterpriseMetadataTemplatesQueryParams queryParams) {
    return getEnterpriseMetadataTemplates(queryParams, new GetEnterpriseMetadataTemplatesHeaders());
  }

  public MetadataTemplates getEnterpriseMetadataTemplates(
      GetEnterpriseMetadataTemplatesHeaders headers) {
    return getEnterpriseMetadataTemplates(new GetEnterpriseMetadataTemplatesQueryParams(), headers);
  }

  public MetadataTemplates getEnterpriseMetadataTemplates(
      GetEnterpriseMetadataTemplatesQueryParams queryParams,
      GetEnterpriseMetadataTemplatesHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(
            mapOf(
                entryOf("marker", convertToString(queryParams.getMarker())),
                entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/metadata_templates/enterprise"))
                .method("GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), MetadataTemplates.class);
  }

  public MetadataTemplate createMetadataTemplate(CreateMetadataTemplateRequestBody requestBody) {
    return createMetadataTemplate(requestBody, new CreateMetadataTemplateHeaders());
  }

  public MetadataTemplate createMetadataTemplate(
      CreateMetadataTemplateRequestBody requestBody, CreateMetadataTemplateHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/metadata_templates/schema"))
                .method("POST")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), MetadataTemplate.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class MetadataTemplatesManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public MetadataTemplatesManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public MetadataTemplatesManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public MetadataTemplatesManager build() {
      return new MetadataTemplatesManager(this);
    }
  }
}
