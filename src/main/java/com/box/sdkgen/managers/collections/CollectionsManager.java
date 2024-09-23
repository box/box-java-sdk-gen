package com.box.sdkgen.managers.collections;

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
import com.box.sdkgen.schemas.collections.Collections;
import com.box.sdkgen.schemas.items.Items;
import com.box.sdkgen.serialization.json.JsonManager;
import java.util.Map;

public class CollectionsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public CollectionsManager() {
    this.networkSession = new NetworkSession();
  }

  protected CollectionsManager(CollectionsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public Collections getCollections() {
    return getCollections(new GetCollectionsQueryParams(), new GetCollectionsHeaders());
  }

  public Collections getCollections(GetCollectionsQueryParams queryParams) {
    return getCollections(queryParams, new GetCollectionsHeaders());
  }

  public Collections getCollections(GetCollectionsHeaders headers) {
    return getCollections(new GetCollectionsQueryParams(), headers);
  }

  public Collections getCollections(
      GetCollectionsQueryParams queryParams, GetCollectionsHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(
            mapOf(
                entryOf("fields", convertToString(queryParams.getFields())),
                entryOf("offset", convertToString(queryParams.getOffset())),
                entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/collections"))
                .method("GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), Collections.class);
  }

  public Items getCollectionItems(String collectionId) {
    return getCollectionItems(
        collectionId, new GetCollectionItemsQueryParams(), new GetCollectionItemsHeaders());
  }

  public Items getCollectionItems(String collectionId, GetCollectionItemsQueryParams queryParams) {
    return getCollectionItems(collectionId, queryParams, new GetCollectionItemsHeaders());
  }

  public Items getCollectionItems(String collectionId, GetCollectionItemsHeaders headers) {
    return getCollectionItems(collectionId, new GetCollectionItemsQueryParams(), headers);
  }

  public Items getCollectionItems(
      String collectionId,
      GetCollectionItemsQueryParams queryParams,
      GetCollectionItemsHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(
            mapOf(
                entryOf("fields", convertToString(queryParams.getFields())),
                entryOf("offset", convertToString(queryParams.getOffset())),
                entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/collections/",
                        convertToString(collectionId),
                        "/items"))
                .method("GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), Items.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class CollectionsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public CollectionsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public CollectionsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public CollectionsManager build() {
      return new CollectionsManager(this);
    }
  }
}
