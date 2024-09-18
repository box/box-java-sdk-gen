package com.box.sdkgen.managers.downloads;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
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

public class DownloadsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public DownloadsManager() {
    this.networkSession = new NetworkSession();
  }

  protected DownloadsManager(DownloadsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public ByteStream downloadFile(String fileId) {
    return downloadFile(fileId, new DownloadFileQueryParams(), new DownloadFileHeaders());
  }

  public ByteStream downloadFile(String fileId, DownloadFileQueryParams queryParams) {
    return downloadFile(fileId, queryParams, new DownloadFileHeaders());
  }

  public ByteStream downloadFile(String fileId, DownloadFileHeaders headers) {
    return downloadFile(fileId, new DownloadFileQueryParams(), headers);
  }

  public ByteStream downloadFile(String fileId, DownloadFileQueryParams queryParams, DownloadFileHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("version", convertToString(queryParams.getVersion())), entryOf("access_token", convertToString(queryParams.getAccessToken()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(entryOf("range", convertToString(headers.getRange())), entryOf("boxapi", convertToString(headers.getBoxapi()))), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "/content")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("binary").auth(this.auth).networkSession(this.networkSession).build());
    return response.getContent();
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class DownloadsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public DownloadsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public DownloadsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public DownloadsManager build() {
      return new DownloadsManager(this);
    }

  }

}
