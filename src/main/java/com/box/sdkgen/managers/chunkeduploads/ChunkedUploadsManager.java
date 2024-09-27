package com.box.sdkgen.managers.chunkeduploads;

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
import com.box.sdkgen.schemas.files.Files;
import com.box.sdkgen.schemas.uploadedpart.UploadedPart;
import com.box.sdkgen.schemas.uploadparts.UploadParts;
import com.box.sdkgen.schemas.uploadsession.UploadSession;
import com.box.sdkgen.serialization.json.JsonManager;
import java.io.InputStream;
import java.util.Map;

public class ChunkedUploadsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public ChunkedUploadsManager() {
    this.networkSession = new NetworkSession();
  }

  protected ChunkedUploadsManager(ChunkedUploadsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public UploadSession createFileUploadSession(CreateFileUploadSessionRequestBody requestBody) {
    return createFileUploadSession(requestBody, new CreateFileUploadSessionHeaders());
  }

  public UploadSession createFileUploadSession(
      CreateFileUploadSessionRequestBody requestBody, CreateFileUploadSessionHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getUploadUrl(),
                        "/2.0/files/upload_sessions"))
                .method("POST")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), UploadSession.class);
  }

  public UploadSession createFileUploadSessionForExistingFile(
      String fileId, CreateFileUploadSessionForExistingFileRequestBody requestBody) {
    return createFileUploadSessionForExistingFile(
        fileId, requestBody, new CreateFileUploadSessionForExistingFileHeaders());
  }

  public UploadSession createFileUploadSessionForExistingFile(
      String fileId,
      CreateFileUploadSessionForExistingFileRequestBody requestBody,
      CreateFileUploadSessionForExistingFileHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getUploadUrl(),
                        "/2.0/files/",
                        convertToString(fileId),
                        "/upload_sessions"))
                .method("POST")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), UploadSession.class);
  }

  public UploadSession getFileUploadSessionByUrl(String url) {
    return getFileUploadSessionByUrl(url, new GetFileUploadSessionByUrlHeaders());
  }

  public UploadSession getFileUploadSessionByUrl(
      String url, GetFileUploadSessionByUrlHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(url)
                .method("GET")
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), UploadSession.class);
  }

  public UploadSession getFileUploadSessionById(String uploadSessionId) {
    return getFileUploadSessionById(uploadSessionId, new GetFileUploadSessionByIdHeaders());
  }

  public UploadSession getFileUploadSessionById(
      String uploadSessionId, GetFileUploadSessionByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getUploadUrl(),
                        "/2.0/files/upload_sessions/",
                        convertToString(uploadSessionId)))
                .method("GET")
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), UploadSession.class);
  }

  public UploadedPart uploadFilePartByUrl(
      String url, InputStream requestBody, UploadFilePartByUrlHeaders headers) {
    Map<String, String> headersMap =
        prepareParams(
            mergeMaps(
                mapOf(
                    entryOf("digest", convertToString(headers.getDigest())),
                    entryOf("content-range", convertToString(headers.getContentRange()))),
                headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(url)
                .method("PUT")
                .headers(headersMap)
                .fileStream(requestBody)
                .contentType("application/octet-stream")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), UploadedPart.class);
  }

  public UploadedPart uploadFilePart(
      String uploadSessionId, InputStream requestBody, UploadFilePartHeaders headers) {
    Map<String, String> headersMap =
        prepareParams(
            mergeMaps(
                mapOf(
                    entryOf("digest", convertToString(headers.getDigest())),
                    entryOf("content-range", convertToString(headers.getContentRange()))),
                headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getUploadUrl(),
                        "/2.0/files/upload_sessions/",
                        convertToString(uploadSessionId)))
                .method("PUT")
                .headers(headersMap)
                .fileStream(requestBody)
                .contentType("application/octet-stream")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), UploadedPart.class);
  }

  public void deleteFileUploadSessionByUrl(String url) {
    deleteFileUploadSessionByUrl(url, new DeleteFileUploadSessionByUrlHeaders());
  }

  public void deleteFileUploadSessionByUrl(
      String url, DeleteFileUploadSessionByUrlHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(url)
                .method("DELETE")
                .headers(headersMap)
                .responseFormat(null)
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
  }

  public void deleteFileUploadSessionById(String uploadSessionId) {
    deleteFileUploadSessionById(uploadSessionId, new DeleteFileUploadSessionByIdHeaders());
  }

  public void deleteFileUploadSessionById(
      String uploadSessionId, DeleteFileUploadSessionByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getUploadUrl(),
                        "/2.0/files/upload_sessions/",
                        convertToString(uploadSessionId)))
                .method("DELETE")
                .headers(headersMap)
                .responseFormat(null)
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
  }

  public UploadParts getFileUploadSessionPartsByUrl(String url) {
    return getFileUploadSessionPartsByUrl(
        url,
        new GetFileUploadSessionPartsByUrlQueryParams(),
        new GetFileUploadSessionPartsByUrlHeaders());
  }

  public UploadParts getFileUploadSessionPartsByUrl(
      String url, GetFileUploadSessionPartsByUrlQueryParams queryParams) {
    return getFileUploadSessionPartsByUrl(
        url, queryParams, new GetFileUploadSessionPartsByUrlHeaders());
  }

  public UploadParts getFileUploadSessionPartsByUrl(
      String url, GetFileUploadSessionPartsByUrlHeaders headers) {
    return getFileUploadSessionPartsByUrl(
        url, new GetFileUploadSessionPartsByUrlQueryParams(), headers);
  }

  public UploadParts getFileUploadSessionPartsByUrl(
      String url,
      GetFileUploadSessionPartsByUrlQueryParams queryParams,
      GetFileUploadSessionPartsByUrlHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(
            mapOf(
                entryOf("offset", convertToString(queryParams.getOffset())),
                entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(url)
                .method("GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), UploadParts.class);
  }

  public UploadParts getFileUploadSessionParts(String uploadSessionId) {
    return getFileUploadSessionParts(
        uploadSessionId,
        new GetFileUploadSessionPartsQueryParams(),
        new GetFileUploadSessionPartsHeaders());
  }

  public UploadParts getFileUploadSessionParts(
      String uploadSessionId, GetFileUploadSessionPartsQueryParams queryParams) {
    return getFileUploadSessionParts(
        uploadSessionId, queryParams, new GetFileUploadSessionPartsHeaders());
  }

  public UploadParts getFileUploadSessionParts(
      String uploadSessionId, GetFileUploadSessionPartsHeaders headers) {
    return getFileUploadSessionParts(
        uploadSessionId, new GetFileUploadSessionPartsQueryParams(), headers);
  }

  public UploadParts getFileUploadSessionParts(
      String uploadSessionId,
      GetFileUploadSessionPartsQueryParams queryParams,
      GetFileUploadSessionPartsHeaders headers) {
    Map<String, String> queryParamsMap =
        prepareParams(
            mapOf(
                entryOf("offset", convertToString(queryParams.getOffset())),
                entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getUploadUrl(),
                        "/2.0/files/upload_sessions/",
                        convertToString(uploadSessionId),
                        "/parts"))
                .method("GET")
                .params(queryParamsMap)
                .headers(headersMap)
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), UploadParts.class);
  }

  public Files createFileUploadSessionCommitByUrl(
      String url,
      CreateFileUploadSessionCommitByUrlRequestBody requestBody,
      CreateFileUploadSessionCommitByUrlHeaders headers) {
    Map<String, String> headersMap =
        prepareParams(
            mergeMaps(
                mapOf(
                    entryOf("digest", convertToString(headers.getDigest())),
                    entryOf("if-match", convertToString(headers.getIfMatch())),
                    entryOf("if-none-match", convertToString(headers.getIfNoneMatch()))),
                headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(url)
                .method("POST")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), Files.class);
  }

  public Files createFileUploadSessionCommit(
      String uploadSessionId,
      CreateFileUploadSessionCommitRequestBody requestBody,
      CreateFileUploadSessionCommitHeaders headers) {
    Map<String, String> headersMap =
        prepareParams(
            mergeMaps(
                mapOf(
                    entryOf("digest", convertToString(headers.getDigest())),
                    entryOf("if-match", convertToString(headers.getIfMatch())),
                    entryOf("if-none-match", convertToString(headers.getIfNoneMatch()))),
                headers.getExtraHeaders()));
    FetchResponse response =
        fetch(
            new FetchOptions.FetchOptionsBuilder(
                    String.join(
                        "",
                        this.networkSession.getBaseUrls().getUploadUrl(),
                        "/2.0/files/upload_sessions/",
                        convertToString(uploadSessionId),
                        "/commit"))
                .method("POST")
                .headers(headersMap)
                .data(JsonManager.serialize(requestBody))
                .contentType("application/json")
                .responseFormat("json")
                .auth(this.auth)
                .networkSession(this.networkSession)
                .build());
    return JsonManager.deserialize(response.getData(), Files.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class ChunkedUploadsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public ChunkedUploadsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public ChunkedUploadsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public ChunkedUploadsManager build() {
      return new ChunkedUploadsManager(this);
    }
  }
}
