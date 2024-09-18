package com.box.sdkgen.managers.storagepolicies;

import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.storagepolicies.StoragePolicies;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.storagepolicy.StoragePolicy;
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

public class StoragePoliciesManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public StoragePoliciesManager() {
    this.networkSession = new NetworkSession();
  }

  protected StoragePoliciesManager(StoragePoliciesManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public StoragePolicies getStoragePolicies() {
    return getStoragePolicies(new GetStoragePoliciesQueryParams(), new GetStoragePoliciesHeaders());
  }

  public StoragePolicies getStoragePolicies(GetStoragePoliciesQueryParams queryParams) {
    return getStoragePolicies(queryParams, new GetStoragePoliciesHeaders());
  }

  public StoragePolicies getStoragePolicies(GetStoragePoliciesHeaders headers) {
    return getStoragePolicies(new GetStoragePoliciesQueryParams(), headers);
  }

  public StoragePolicies getStoragePolicies(GetStoragePoliciesQueryParams queryParams, GetStoragePoliciesHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields())), entryOf("marker", convertToString(queryParams.getMarker())), entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/storage_policies")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), StoragePolicies.class);
  }

  public StoragePolicy getStoragePolicyById(String storagePolicyId) {
    return getStoragePolicyById(storagePolicyId, new GetStoragePolicyByIdHeaders());
  }

  public StoragePolicy getStoragePolicyById(String storagePolicyId, GetStoragePolicyByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/storage_policies/", convertToString(storagePolicyId))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), StoragePolicy.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class StoragePoliciesManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public StoragePoliciesManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public StoragePoliciesManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public StoragePoliciesManager build() {
      return new StoragePoliciesManager(this);
    }

  }

}
