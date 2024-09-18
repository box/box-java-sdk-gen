package com.box.sdkgen.managers.sharedlinksfiles;

import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.filefull.FileFull;
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

public class SharedLinksFilesManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public SharedLinksFilesManager() {
    this.networkSession = new NetworkSession();
  }

  protected SharedLinksFilesManager(SharedLinksFilesManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public FileFull findFileForSharedLink(FindFileForSharedLinkHeaders headers) {
    return findFileForSharedLink(headers, new FindFileForSharedLinkQueryParams());
  }

  public FileFull findFileForSharedLink(FindFileForSharedLinkHeaders headers, FindFileForSharedLinkQueryParams queryParams) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(entryOf("if-none-match", convertToString(headers.getIfNoneMatch())), entryOf("boxapi", convertToString(headers.getBoxapi()))), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/shared_items")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileFull.class);
  }

  public FileFull getSharedLinkForFile(String fileId, GetSharedLinkForFileQueryParams queryParams) {
    return getSharedLinkForFile(fileId, queryParams, new GetSharedLinkForFileHeaders());
  }

  public FileFull getSharedLinkForFile(String fileId, GetSharedLinkForFileQueryParams queryParams, GetSharedLinkForFileHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "#get_shared_link")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileFull.class);
  }

  public FileFull addShareLinkToFile(String fileId, AddShareLinkToFileQueryParams queryParams) {
    return addShareLinkToFile(fileId, queryParams, new AddShareLinkToFileRequestBody(), new AddShareLinkToFileHeaders());
  }

  public FileFull addShareLinkToFile(String fileId, AddShareLinkToFileQueryParams queryParams, AddShareLinkToFileRequestBody requestBody) {
    return addShareLinkToFile(fileId, queryParams, requestBody, new AddShareLinkToFileHeaders());
  }

  public FileFull addShareLinkToFile(String fileId, AddShareLinkToFileQueryParams queryParams, AddShareLinkToFileHeaders headers) {
    return addShareLinkToFile(fileId, queryParams, new AddShareLinkToFileRequestBody(), headers);
  }

  public FileFull addShareLinkToFile(String fileId, AddShareLinkToFileQueryParams queryParams, AddShareLinkToFileRequestBody requestBody, AddShareLinkToFileHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "#add_shared_link")).method("PUT").params(queryParamsMap).headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileFull.class);
  }

  public FileFull updateSharedLinkOnFile(String fileId, UpdateSharedLinkOnFileQueryParams queryParams) {
    return updateSharedLinkOnFile(fileId, queryParams, new UpdateSharedLinkOnFileRequestBody(), new UpdateSharedLinkOnFileHeaders());
  }

  public FileFull updateSharedLinkOnFile(String fileId, UpdateSharedLinkOnFileQueryParams queryParams, UpdateSharedLinkOnFileRequestBody requestBody) {
    return updateSharedLinkOnFile(fileId, queryParams, requestBody, new UpdateSharedLinkOnFileHeaders());
  }

  public FileFull updateSharedLinkOnFile(String fileId, UpdateSharedLinkOnFileQueryParams queryParams, UpdateSharedLinkOnFileHeaders headers) {
    return updateSharedLinkOnFile(fileId, queryParams, new UpdateSharedLinkOnFileRequestBody(), headers);
  }

  public FileFull updateSharedLinkOnFile(String fileId, UpdateSharedLinkOnFileQueryParams queryParams, UpdateSharedLinkOnFileRequestBody requestBody, UpdateSharedLinkOnFileHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "#update_shared_link")).method("PUT").params(queryParamsMap).headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileFull.class);
  }

  public FileFull removeSharedLinkFromFile(String fileId, RemoveSharedLinkFromFileQueryParams queryParams) {
    return removeSharedLinkFromFile(fileId, queryParams, new RemoveSharedLinkFromFileRequestBody(), new RemoveSharedLinkFromFileHeaders());
  }

  public FileFull removeSharedLinkFromFile(String fileId, RemoveSharedLinkFromFileQueryParams queryParams, RemoveSharedLinkFromFileRequestBody requestBody) {
    return removeSharedLinkFromFile(fileId, queryParams, requestBody, new RemoveSharedLinkFromFileHeaders());
  }

  public FileFull removeSharedLinkFromFile(String fileId, RemoveSharedLinkFromFileQueryParams queryParams, RemoveSharedLinkFromFileHeaders headers) {
    return removeSharedLinkFromFile(fileId, queryParams, new RemoveSharedLinkFromFileRequestBody(), headers);
  }

  public FileFull removeSharedLinkFromFile(String fileId, RemoveSharedLinkFromFileQueryParams queryParams, RemoveSharedLinkFromFileRequestBody requestBody, RemoveSharedLinkFromFileHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/files/", convertToString(fileId), "#remove_shared_link")).method("PUT").params(queryParamsMap).headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FileFull.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class SharedLinksFilesManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public SharedLinksFilesManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public SharedLinksFilesManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public SharedLinksFilesManager build() {
      return new SharedLinksFilesManager(this);
    }

  }

}
