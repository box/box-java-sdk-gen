package com.box.sdkgen.managers.downloads;

import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.writeInputStreamToOutputStream;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;

import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import com.box.sdkgen.networking.network.NetworkSession;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

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

  public InputStream downloadFile(String fileId) {
    return downloadFile(fileId, new DownloadFileQueryParams(), new DownloadFileHeaders());
  }

  public InputStream downloadFile(String fileId, DownloadFileQueryParams queryParams) {
    return downloadFile(fileId, queryParams, new DownloadFileHeaders());
  }

  public InputStream downloadFile(String fileId, DownloadFileHeaders headers) {
    return downloadFile(fileId, new DownloadFileQueryParams(), headers);
  }

  public InputStream downloadFile(
      String fileId, DownloadFileQueryParams queryParams, DownloadFileHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(
            mapOf(
                entryOf("version", convertToString(queryParams.getVersion())),
                entryOf("access_token", convertToString(queryParams.getAccessToken()))));
    Map<String, String> headersMap =
        prepareParams(
            mergeMaps(
                mapOf(
                    entryOf("range", convertToString(headers.getRange())),
                    entryOf("boxapi", convertToString(headers.getBoxapi()))),
                headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getBaseUrl(),
                        "/2.0/files/",
                        convertToString(fileId),
                        "/content"))
                .method("GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat("binary")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    if (convertToString(response.getStatus()).equals("202")) {
      return null;
    }
    return response.getContent();
  }

  public void downloadFileToOutputStream(String fileId, OutputStream outputStream) {
    downloadFileToOutputStream(
        fileId,
        outputStream,
        new DownloadFileToOutputStreamQueryParams(),
        new DownloadFileToOutputStreamHeaders());
  }

  public void downloadFileToOutputStream(
      String fileId, OutputStream outputStream, DownloadFileToOutputStreamQueryParams queryParams) {
    downloadFileToOutputStream(
        fileId, outputStream, queryParams, new DownloadFileToOutputStreamHeaders());
  }

  public void downloadFileToOutputStream(
      String fileId, OutputStream outputStream, DownloadFileToOutputStreamHeaders headers) {
    downloadFileToOutputStream(
        fileId, outputStream, new DownloadFileToOutputStreamQueryParams(), headers);
  }

  public void downloadFileToOutputStream(
      String fileId,
      OutputStream outputStream,
      DownloadFileToOutputStreamQueryParams queryParams,
      DownloadFileToOutputStreamHeaders headers) {
    InputStream downloadStream =
        this.downloadFile(
            fileId,
            new DownloadFileQueryParams.DownloadFileQueryParamsBuilder()
                .version(queryParams.getVersion())
                .accessToken(queryParams.getAccessToken())
                .build(),
            new DownloadFileHeaders.DownloadFileHeadersBuilder()
                .range(headers.getRange())
                .boxapi(headers.getBoxapi())
                .extraHeaders(headers.getExtraHeaders())
                .build());
    writeInputStreamToOutputStream(downloadStream, outputStream);
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
