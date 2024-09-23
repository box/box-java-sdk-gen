package com.box.sdkgen.managers.sharedlinksweblinks;

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
import com.box.sdkgen.schemas.weblink.WebLink;
import com.box.sdkgen.serialization.json.JsonManager;
import java.util.Map;

public class SharedLinksWebLinksManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public SharedLinksWebLinksManager() {
    this.networkSession = new NetworkSession();
  }

  protected SharedLinksWebLinksManager(SharedLinksWebLinksManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public WebLink findWebLinkForSharedLink(FindWebLinkForSharedLinkHeaders headers) {
    return findWebLinkForSharedLink(headers, new FindWebLinkForSharedLinkQueryParams());
  }

  public WebLink findWebLinkForSharedLink(
      FindWebLinkForSharedLinkHeaders headers, FindWebLinkForSharedLinkQueryParams queryParams) {
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
                        "/2.0/shared_items#web_links"))
                .method("GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), WebLink.class);
  }

  public WebLink getSharedLinkForWebLink(
      String webLinkId, GetSharedLinkForWebLinkQueryParams queryParams) {
    return getSharedLinkForWebLink(webLinkId, queryParams, new GetSharedLinkForWebLinkHeaders());
  }

  public WebLink getSharedLinkForWebLink(
      String webLinkId,
      GetSharedLinkForWebLinkQueryParams queryParams,
      GetSharedLinkForWebLinkHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/web_links/",
                        convertToString(webLinkId),
                        "#get_shared_link"))
                .method("GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), WebLink.class);
  }

  public WebLink addShareLinkToWebLink(
      String webLinkId, AddShareLinkToWebLinkQueryParams queryParams) {
    return addShareLinkToWebLink(
        webLinkId,
        queryParams,
        new AddShareLinkToWebLinkRequestBody(),
        new AddShareLinkToWebLinkHeaders());
  }

  public WebLink addShareLinkToWebLink(
      String webLinkId,
      AddShareLinkToWebLinkQueryParams queryParams,
      AddShareLinkToWebLinkRequestBody requestBody) {
    return addShareLinkToWebLink(
        webLinkId, queryParams, requestBody, new AddShareLinkToWebLinkHeaders());
  }

  public WebLink addShareLinkToWebLink(
      String webLinkId,
      AddShareLinkToWebLinkQueryParams queryParams,
      AddShareLinkToWebLinkHeaders headers) {
    return addShareLinkToWebLink(
        webLinkId, queryParams, new AddShareLinkToWebLinkRequestBody(), headers);
  }

  public WebLink addShareLinkToWebLink(
      String webLinkId,
      AddShareLinkToWebLinkQueryParams queryParams,
      AddShareLinkToWebLinkRequestBody requestBody,
      AddShareLinkToWebLinkHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/web_links/",
                        convertToString(webLinkId),
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
    return JsonManager.deserialize(response.getData(), WebLink.class);
  }

  public WebLink updateSharedLinkOnWebLink(
      String webLinkId, UpdateSharedLinkOnWebLinkQueryParams queryParams) {
    return updateSharedLinkOnWebLink(
        webLinkId,
        queryParams,
        new UpdateSharedLinkOnWebLinkRequestBody(),
        new UpdateSharedLinkOnWebLinkHeaders());
  }

  public WebLink updateSharedLinkOnWebLink(
      String webLinkId,
      UpdateSharedLinkOnWebLinkQueryParams queryParams,
      UpdateSharedLinkOnWebLinkRequestBody requestBody) {
    return updateSharedLinkOnWebLink(
        webLinkId, queryParams, requestBody, new UpdateSharedLinkOnWebLinkHeaders());
  }

  public WebLink updateSharedLinkOnWebLink(
      String webLinkId,
      UpdateSharedLinkOnWebLinkQueryParams queryParams,
      UpdateSharedLinkOnWebLinkHeaders headers) {
    return updateSharedLinkOnWebLink(
        webLinkId, queryParams, new UpdateSharedLinkOnWebLinkRequestBody(), headers);
  }

  public WebLink updateSharedLinkOnWebLink(
      String webLinkId,
      UpdateSharedLinkOnWebLinkQueryParams queryParams,
      UpdateSharedLinkOnWebLinkRequestBody requestBody,
      UpdateSharedLinkOnWebLinkHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/web_links/",
                        convertToString(webLinkId),
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
    return JsonManager.deserialize(response.getData(), WebLink.class);
  }

  public WebLink removeSharedLinkFromWebLink(
      String webLinkId, RemoveSharedLinkFromWebLinkQueryParams queryParams) {
    return removeSharedLinkFromWebLink(
        webLinkId,
        queryParams,
        new RemoveSharedLinkFromWebLinkRequestBody(),
        new RemoveSharedLinkFromWebLinkHeaders());
  }

  public WebLink removeSharedLinkFromWebLink(
      String webLinkId,
      RemoveSharedLinkFromWebLinkQueryParams queryParams,
      RemoveSharedLinkFromWebLinkRequestBody requestBody) {
    return removeSharedLinkFromWebLink(
        webLinkId, queryParams, requestBody, new RemoveSharedLinkFromWebLinkHeaders());
  }

  public WebLink removeSharedLinkFromWebLink(
      String webLinkId,
      RemoveSharedLinkFromWebLinkQueryParams queryParams,
      RemoveSharedLinkFromWebLinkHeaders headers) {
    return removeSharedLinkFromWebLink(
        webLinkId, queryParams, new RemoveSharedLinkFromWebLinkRequestBody(), headers);
  }

  public WebLink removeSharedLinkFromWebLink(
      String webLinkId,
      RemoveSharedLinkFromWebLinkQueryParams queryParams,
      RemoveSharedLinkFromWebLinkRequestBody requestBody,
      RemoveSharedLinkFromWebLinkHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/web_links/",
                        convertToString(webLinkId),
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
    return JsonManager.deserialize(response.getData(), WebLink.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class SharedLinksWebLinksManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public SharedLinksWebLinksManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public SharedLinksWebLinksManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public SharedLinksWebLinksManager build() {
      return new SharedLinksWebLinksManager(this);
    }
  }
}
