package com.box.sdkgen.managers.fileversionlegalholds;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.fileversionlegalhold.FileVersionLegalHold;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.fileversionlegalholds.FileVersionLegalHolds;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.fasterxml.jackson.databind.JsonNode;

public class FileVersionLegalHoldsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public FileVersionLegalHoldsManager() {
    this.networkSession = new NetworkSession();
  }

  protected FileVersionLegalHoldsManager(FileVersionLegalHoldsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public FileVersionLegalHold getFileVersionLegalHoldById(String fileVersionLegalHoldId) {
    return getFileVersionLegalHoldById(fileVersionLegalHoldId, new GetFileVersionLegalHoldByIdHeaders());
  }

  public FileVersionLegalHold getFileVersionLegalHoldById(String fileVersionLegalHoldId, GetFileVersionLegalHoldByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/file_version_legal_holds/", convertToString(fileVersionLegalHoldId))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileVersionLegalHold.class);
  }

  public FileVersionLegalHolds getFileVersionLegalHolds(GetFileVersionLegalHoldsQueryParams queryParams) {
    return getFileVersionLegalHolds(queryParams, new GetFileVersionLegalHoldsHeaders());
  }

  public FileVersionLegalHolds getFileVersionLegalHolds(GetFileVersionLegalHoldsQueryParams queryParams, GetFileVersionLegalHoldsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("policy_id", convertToString(queryParams.getPolicyId())), entryOf("marker", convertToString(queryParams.getMarker())), entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/file_version_legal_holds")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileVersionLegalHolds.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class FileVersionLegalHoldsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public FileVersionLegalHoldsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public FileVersionLegalHoldsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public FileVersionLegalHoldsManager build() {
      return new FileVersionLegalHoldsManager(this);
    }

  }

}
