package com.box.sdkgen.managers.storagepolicyassignments;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.storagepolicyassignments.StoragePolicyAssignments;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.storagepolicyassignment.StoragePolicyAssignment;
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

public class StoragePolicyAssignmentsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public StoragePolicyAssignmentsManager() {
    this.networkSession = new NetworkSession();
  }

  protected StoragePolicyAssignmentsManager(StoragePolicyAssignmentsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public StoragePolicyAssignments getStoragePolicyAssignments(GetStoragePolicyAssignmentsQueryParams queryParams) {
    return getStoragePolicyAssignments(queryParams, new GetStoragePolicyAssignmentsHeaders());
  }

  public StoragePolicyAssignments getStoragePolicyAssignments(GetStoragePolicyAssignmentsQueryParams queryParams, GetStoragePolicyAssignmentsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("marker", convertToString(queryParams.getMarker())), entryOf("resolved_for_type", convertToString(queryParams.getResolvedForType())), entryOf("resolved_for_id", convertToString(queryParams.getResolvedForId()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/storage_policy_assignments")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), StoragePolicyAssignments.class);
  }

  public StoragePolicyAssignment createStoragePolicyAssignment(CreateStoragePolicyAssignmentRequestBody requestBody) {
    return createStoragePolicyAssignment(requestBody, new CreateStoragePolicyAssignmentHeaders());
  }

  public StoragePolicyAssignment createStoragePolicyAssignment(CreateStoragePolicyAssignmentRequestBody requestBody, CreateStoragePolicyAssignmentHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/storage_policy_assignments")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), StoragePolicyAssignment.class);
  }

  public StoragePolicyAssignment getStoragePolicyAssignmentById(String storagePolicyAssignmentId) {
    return getStoragePolicyAssignmentById(storagePolicyAssignmentId, new GetStoragePolicyAssignmentByIdHeaders());
  }

  public StoragePolicyAssignment getStoragePolicyAssignmentById(String storagePolicyAssignmentId, GetStoragePolicyAssignmentByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/storage_policy_assignments/", convertToString(storagePolicyAssignmentId))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), StoragePolicyAssignment.class);
  }

  public StoragePolicyAssignment updateStoragePolicyAssignmentById(String storagePolicyAssignmentId, UpdateStoragePolicyAssignmentByIdRequestBody requestBody) {
    return updateStoragePolicyAssignmentById(storagePolicyAssignmentId, requestBody, new UpdateStoragePolicyAssignmentByIdHeaders());
  }

  public StoragePolicyAssignment updateStoragePolicyAssignmentById(String storagePolicyAssignmentId, UpdateStoragePolicyAssignmentByIdRequestBody requestBody, UpdateStoragePolicyAssignmentByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/storage_policy_assignments/", convertToString(storagePolicyAssignmentId))).method("PUT").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), StoragePolicyAssignment.class);
  }

  public void deleteStoragePolicyAssignmentById(String storagePolicyAssignmentId) {
    deleteStoragePolicyAssignmentById(storagePolicyAssignmentId, new DeleteStoragePolicyAssignmentByIdHeaders());
  }

  public void deleteStoragePolicyAssignmentById(String storagePolicyAssignmentId, DeleteStoragePolicyAssignmentByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/storage_policy_assignments/", convertToString(storagePolicyAssignmentId))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class StoragePolicyAssignmentsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public StoragePolicyAssignmentsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public StoragePolicyAssignmentsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public StoragePolicyAssignmentsManager build() {
      return new StoragePolicyAssignmentsManager(this);
    }

  }

}
