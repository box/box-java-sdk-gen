package com.box.sdkgen.managers.fileversionretentions;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.fileversionretentions.FileVersionRetentions;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.fileversionretention.FileVersionRetention;
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

public class FileVersionRetentionsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public FileVersionRetentionsManager() {
    this.networkSession = new NetworkSession();
  }

  protected FileVersionRetentionsManager(FileVersionRetentionsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public FileVersionRetentions getFileVersionRetentions() {
    return getFileVersionRetentions(new GetFileVersionRetentionsQueryParams(), new GetFileVersionRetentionsHeaders());
  }

  public FileVersionRetentions getFileVersionRetentions(GetFileVersionRetentionsQueryParams queryParams) {
    return getFileVersionRetentions(queryParams, new GetFileVersionRetentionsHeaders());
  }

  public FileVersionRetentions getFileVersionRetentions(GetFileVersionRetentionsHeaders headers) {
    return getFileVersionRetentions(new GetFileVersionRetentionsQueryParams(), headers);
  }

  public FileVersionRetentions getFileVersionRetentions(GetFileVersionRetentionsQueryParams queryParams, GetFileVersionRetentionsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("file_id", convertToString(queryParams.getFileId())), entryOf("file_version_id", convertToString(queryParams.getFileVersionId())), entryOf("policy_id", convertToString(queryParams.getPolicyId())), entryOf("disposition_action", convertToString(queryParams.getDispositionAction())), entryOf("disposition_before", convertToString(queryParams.getDispositionBefore())), entryOf("disposition_after", convertToString(queryParams.getDispositionAfter())), entryOf("limit", convertToString(queryParams.getLimit())), entryOf("marker", convertToString(queryParams.getMarker()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/file_version_retentions")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileVersionRetentions.class);
  }

  public FileVersionRetention getFileVersionRetentionById(String fileVersionRetentionId) {
    return getFileVersionRetentionById(fileVersionRetentionId, new GetFileVersionRetentionByIdHeaders());
  }

  public FileVersionRetention getFileVersionRetentionById(String fileVersionRetentionId, GetFileVersionRetentionByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/file_version_retentions/", convertToString(fileVersionRetentionId))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileVersionRetention.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class FileVersionRetentionsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public FileVersionRetentionsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public FileVersionRetentionsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public FileVersionRetentionsManager build() {
      return new FileVersionRetentionsManager(this);
    }

  }

}
