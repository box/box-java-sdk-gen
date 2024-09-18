package com.box.sdkgen.managers.transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.folderfull.FolderFull;
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

public class TransferManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public TransferManager() {
    this.networkSession = new NetworkSession();
  }

  protected TransferManager(TransferManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public FolderFull transferOwnedFolder(String userId, TransferOwnedFolderRequestBody requestBody) {
    return transferOwnedFolder(userId, requestBody, new TransferOwnedFolderQueryParams(), new TransferOwnedFolderHeaders());
  }

  public FolderFull transferOwnedFolder(String userId, TransferOwnedFolderRequestBody requestBody, TransferOwnedFolderQueryParams queryParams) {
    return transferOwnedFolder(userId, requestBody, queryParams, new TransferOwnedFolderHeaders());
  }

  public FolderFull transferOwnedFolder(String userId, TransferOwnedFolderRequestBody requestBody, TransferOwnedFolderHeaders headers) {
    return transferOwnedFolder(userId, requestBody, new TransferOwnedFolderQueryParams(), headers);
  }

  public FolderFull transferOwnedFolder(String userId, TransferOwnedFolderRequestBody requestBody, TransferOwnedFolderQueryParams queryParams, TransferOwnedFolderHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields())), entryOf("notify", convertToString(queryParams.getNotify()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/users/", convertToString(userId), "/folders/0")).method("PUT").params(queryParamsMap).headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FolderFull.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class TransferManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public TransferManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public TransferManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public TransferManager build() {
      return new TransferManager(this);
    }

  }

}
