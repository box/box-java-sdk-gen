package com.box.sdkgen.managers.workflows;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.workflows.Workflows;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.outcome.Outcome;
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

public class WorkflowsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public WorkflowsManager() {
    this.networkSession = new NetworkSession();
  }

  protected WorkflowsManager(WorkflowsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public Workflows getWorkflows(GetWorkflowsQueryParams queryParams) {
    return getWorkflows(queryParams, new GetWorkflowsHeaders());
  }

  public Workflows getWorkflows(GetWorkflowsQueryParams queryParams, GetWorkflowsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("folder_id", convertToString(queryParams.getFolderId())), entryOf("trigger_type", convertToString(queryParams.getTriggerType())), entryOf("limit", convertToString(queryParams.getLimit())), entryOf("marker", convertToString(queryParams.getMarker()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/workflows")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), Workflows.class);
  }

  public void startWorkflow(String workflowId, StartWorkflowRequestBody requestBody) {
    startWorkflow(workflowId, requestBody, new StartWorkflowHeaders());
  }

  public void startWorkflow(String workflowId, StartWorkflowRequestBody requestBody, StartWorkflowHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/workflows/", convertToString(workflowId), "/start")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class WorkflowsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public WorkflowsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public WorkflowsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public WorkflowsManager build() {
      return new WorkflowsManager(this);
    }

  }

}
