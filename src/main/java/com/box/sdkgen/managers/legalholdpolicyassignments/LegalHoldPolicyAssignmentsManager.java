package com.box.sdkgen.managers.legalholdpolicyassignments;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.legalholdpolicyassignments.LegalHoldPolicyAssignments;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.legalholdpolicyassignment.LegalHoldPolicyAssignment;
import com.box.sdkgen.schemas.filesonhold.FilesOnHold;
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

public class LegalHoldPolicyAssignmentsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public LegalHoldPolicyAssignmentsManager() {
    this.networkSession = new NetworkSession();
  }

  protected LegalHoldPolicyAssignmentsManager(LegalHoldPolicyAssignmentsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public LegalHoldPolicyAssignments getLegalHoldPolicyAssignments(GetLegalHoldPolicyAssignmentsQueryParams queryParams) {
    return getLegalHoldPolicyAssignments(queryParams, new GetLegalHoldPolicyAssignmentsHeaders());
  }

  public LegalHoldPolicyAssignments getLegalHoldPolicyAssignments(GetLegalHoldPolicyAssignmentsQueryParams queryParams, GetLegalHoldPolicyAssignmentsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("policy_id", convertToString(queryParams.getPolicyId())), entryOf("assign_to_type", convertToString(queryParams.getAssignToType())), entryOf("assign_to_id", convertToString(queryParams.getAssignToId())), entryOf("marker", convertToString(queryParams.getMarker())), entryOf("limit", convertToString(queryParams.getLimit())), entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/legal_hold_policy_assignments")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), LegalHoldPolicyAssignments.class);
  }

  public LegalHoldPolicyAssignment createLegalHoldPolicyAssignment(CreateLegalHoldPolicyAssignmentRequestBody requestBody) {
    return createLegalHoldPolicyAssignment(requestBody, new CreateLegalHoldPolicyAssignmentHeaders());
  }

  public LegalHoldPolicyAssignment createLegalHoldPolicyAssignment(CreateLegalHoldPolicyAssignmentRequestBody requestBody, CreateLegalHoldPolicyAssignmentHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/legal_hold_policy_assignments")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), LegalHoldPolicyAssignment.class);
  }

  public LegalHoldPolicyAssignment getLegalHoldPolicyAssignmentById(String legalHoldPolicyAssignmentId) {
    return getLegalHoldPolicyAssignmentById(legalHoldPolicyAssignmentId, new GetLegalHoldPolicyAssignmentByIdHeaders());
  }

  public LegalHoldPolicyAssignment getLegalHoldPolicyAssignmentById(String legalHoldPolicyAssignmentId, GetLegalHoldPolicyAssignmentByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/legal_hold_policy_assignments/", convertToString(legalHoldPolicyAssignmentId))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), LegalHoldPolicyAssignment.class);
  }

  public void deleteLegalHoldPolicyAssignmentById(String legalHoldPolicyAssignmentId) {
    deleteLegalHoldPolicyAssignmentById(legalHoldPolicyAssignmentId, new DeleteLegalHoldPolicyAssignmentByIdHeaders());
  }

  public void deleteLegalHoldPolicyAssignmentById(String legalHoldPolicyAssignmentId, DeleteLegalHoldPolicyAssignmentByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/legal_hold_policy_assignments/", convertToString(legalHoldPolicyAssignmentId))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public FilesOnHold getLegalHoldPolicyAssignmentFileOnHold(String legalHoldPolicyAssignmentId) {
    return getLegalHoldPolicyAssignmentFileOnHold(legalHoldPolicyAssignmentId, new GetLegalHoldPolicyAssignmentFileOnHoldQueryParams(), new GetLegalHoldPolicyAssignmentFileOnHoldHeaders());
  }

  public FilesOnHold getLegalHoldPolicyAssignmentFileOnHold(String legalHoldPolicyAssignmentId, GetLegalHoldPolicyAssignmentFileOnHoldQueryParams queryParams) {
    return getLegalHoldPolicyAssignmentFileOnHold(legalHoldPolicyAssignmentId, queryParams, new GetLegalHoldPolicyAssignmentFileOnHoldHeaders());
  }

  public FilesOnHold getLegalHoldPolicyAssignmentFileOnHold(String legalHoldPolicyAssignmentId, GetLegalHoldPolicyAssignmentFileOnHoldHeaders headers) {
    return getLegalHoldPolicyAssignmentFileOnHold(legalHoldPolicyAssignmentId, new GetLegalHoldPolicyAssignmentFileOnHoldQueryParams(), headers);
  }

  public FilesOnHold getLegalHoldPolicyAssignmentFileOnHold(String legalHoldPolicyAssignmentId, GetLegalHoldPolicyAssignmentFileOnHoldQueryParams queryParams, GetLegalHoldPolicyAssignmentFileOnHoldHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("marker", convertToString(queryParams.getMarker())), entryOf("limit", convertToString(queryParams.getLimit())), entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/legal_hold_policy_assignments/", convertToString(legalHoldPolicyAssignmentId), "/files_on_hold")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), FilesOnHold.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class LegalHoldPolicyAssignmentsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public LegalHoldPolicyAssignmentsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public LegalHoldPolicyAssignmentsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public LegalHoldPolicyAssignmentsManager build() {
      return new LegalHoldPolicyAssignmentsManager(this);
    }

  }

}
