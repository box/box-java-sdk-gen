package com.box.sdkgen.managers.signtemplates;

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
import com.box.sdkgen.schemas.signtemplate.SignTemplate;
import com.box.sdkgen.schemas.signtemplates.SignTemplates;
import com.box.sdkgen.serialization.json.JsonManager;
import java.util.Map;

public class SignTemplatesManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public SignTemplatesManager() {
    this.networkSession = new NetworkSession();
  }

  protected SignTemplatesManager(SignTemplatesManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public SignTemplates getSignTemplates() {
    return getSignTemplates(new GetSignTemplatesQueryParams(), new GetSignTemplatesHeaders());
  }

  public SignTemplates getSignTemplates(GetSignTemplatesQueryParams queryParams) {
    return getSignTemplates(queryParams, new GetSignTemplatesHeaders());
  }

  public SignTemplates getSignTemplates(GetSignTemplatesHeaders headers) {
    return getSignTemplates(new GetSignTemplatesQueryParams(), headers);
  }

  public SignTemplates getSignTemplates(
      GetSignTemplatesQueryParams queryParams, GetSignTemplatesHeaders headers) {
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
                        "", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/sign_templates"),
                    "GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat(ResponseFormat.JSON)
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), SignTemplates.class);
  }

  public SignTemplate getSignTemplateById(String templateId) {
    return getSignTemplateById(templateId, new GetSignTemplateByIdHeaders());
  }

  public SignTemplate getSignTemplateById(String templateId, GetSignTemplateByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/sign_templates/",
                        convertToString(templateId)),
                    "GET")
                .headers(headersMap)
                .responseFormat(ResponseFormat.JSON)
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), SignTemplate.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class SignTemplatesManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public SignTemplatesManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public SignTemplatesManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public SignTemplatesManager build() {
      return new SignTemplatesManager(this);
    }
  }
}
