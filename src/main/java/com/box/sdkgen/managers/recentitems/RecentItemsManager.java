package com.box.sdkgen.managers.recentitems;

import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.recentitems.RecentItems;
import com.box.sdkgen.schemas.clienterror.ClientError;
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

public class RecentItemsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public RecentItemsManager() {
    this.networkSession = new NetworkSession();
  }

  protected RecentItemsManager(RecentItemsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public RecentItems getRecentItems() {
    return getRecentItems(new GetRecentItemsQueryParams(), new GetRecentItemsHeaders());
  }

  public RecentItems getRecentItems(GetRecentItemsQueryParams queryParams) {
    return getRecentItems(queryParams, new GetRecentItemsHeaders());
  }

  public RecentItems getRecentItems(GetRecentItemsHeaders headers) {
    return getRecentItems(new GetRecentItemsQueryParams(), headers);
  }

  public RecentItems getRecentItems(GetRecentItemsQueryParams queryParams, GetRecentItemsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields())), entryOf("limit", convertToString(queryParams.getLimit())), entryOf("marker", convertToString(queryParams.getMarker()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/recent_items")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), RecentItems.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class RecentItemsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public RecentItemsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public RecentItemsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public RecentItemsManager build() {
      return new RecentItemsManager(this);
    }

  }

}
