package com.box.sdkgen.managers.filerequests;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.filerequest.FileRequest;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.filerequestupdaterequest.FileRequestUpdateRequest;
import com.box.sdkgen.schemas.filerequestcopyrequest.FileRequestCopyRequest;
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

public class FileRequestsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public FileRequestsManager() {
    this.networkSession = new NetworkSession();
  }

  protected FileRequestsManager(FileRequestsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public FileRequest getFileRequestById(String fileRequestId) {
    return getFileRequestById(fileRequestId, new GetFileRequestByIdHeaders());
  }

  public FileRequest getFileRequestById(String fileRequestId, GetFileRequestByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/file_requests/", convertToString(fileRequestId))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileRequest.class);
  }

  public FileRequest updateFileRequestById(String fileRequestId, FileRequestUpdateRequest requestBody) {
    return updateFileRequestById(fileRequestId, requestBody, new UpdateFileRequestByIdHeaders());
  }

  public FileRequest updateFileRequestById(String fileRequestId, FileRequestUpdateRequest requestBody, UpdateFileRequestByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(entryOf("if-match", convertToString(headers.getIfMatch()))), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/file_requests/", convertToString(fileRequestId))).method("PUT").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileRequest.class);
  }

  public void deleteFileRequestById(String fileRequestId) {
    deleteFileRequestById(fileRequestId, new DeleteFileRequestByIdHeaders());
  }

  public void deleteFileRequestById(String fileRequestId, DeleteFileRequestByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/file_requests/", convertToString(fileRequestId))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public FileRequest createFileRequestCopy(String fileRequestId, FileRequestCopyRequest requestBody) {
    return createFileRequestCopy(fileRequestId, requestBody, new CreateFileRequestCopyHeaders());
  }

  public FileRequest createFileRequestCopy(String fileRequestId, FileRequestCopyRequest requestBody, CreateFileRequestCopyHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/file_requests/", convertToString(fileRequestId), "/copy")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileRequest.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class FileRequestsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public FileRequestsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public FileRequestsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public FileRequestsManager build() {
      return new FileRequestsManager(this);
    }

  }

}
