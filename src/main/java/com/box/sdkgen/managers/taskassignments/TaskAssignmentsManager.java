package com.box.sdkgen.managers.taskassignments;

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
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.taskassignments.TaskAssignments;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.taskassignment.TaskAssignment;
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

public class TaskAssignmentsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public TaskAssignmentsManager() {
    this.networkSession = new NetworkSession();
  }

  protected TaskAssignmentsManager(TaskAssignmentsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public TaskAssignments getTaskAssignments(String taskId) {
    return getTaskAssignments(taskId, new GetTaskAssignmentsHeaders());
  }

  public TaskAssignments getTaskAssignments(String taskId, GetTaskAssignmentsHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/tasks/", convertToString(taskId), "/assignments")).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), TaskAssignments.class);
  }

  public TaskAssignment createTaskAssignment(CreateTaskAssignmentRequestBody requestBody) {
    return createTaskAssignment(requestBody, new CreateTaskAssignmentHeaders());
  }

  public TaskAssignment createTaskAssignment(CreateTaskAssignmentRequestBody requestBody, CreateTaskAssignmentHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/task_assignments")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), TaskAssignment.class);
  }

  public TaskAssignment getTaskAssignmentById(String taskAssignmentId) {
    return getTaskAssignmentById(taskAssignmentId, new GetTaskAssignmentByIdHeaders());
  }

  public TaskAssignment getTaskAssignmentById(String taskAssignmentId, GetTaskAssignmentByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/task_assignments/", convertToString(taskAssignmentId))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), TaskAssignment.class);
  }

  public TaskAssignment updateTaskAssignmentById(String taskAssignmentId) {
    return updateTaskAssignmentById(taskAssignmentId, new UpdateTaskAssignmentByIdRequestBody(), new UpdateTaskAssignmentByIdHeaders());
  }

  public TaskAssignment updateTaskAssignmentById(String taskAssignmentId, UpdateTaskAssignmentByIdRequestBody requestBody) {
    return updateTaskAssignmentById(taskAssignmentId, requestBody, new UpdateTaskAssignmentByIdHeaders());
  }

  public TaskAssignment updateTaskAssignmentById(String taskAssignmentId, UpdateTaskAssignmentByIdHeaders headers) {
    return updateTaskAssignmentById(taskAssignmentId, new UpdateTaskAssignmentByIdRequestBody(), headers);
  }

  public TaskAssignment updateTaskAssignmentById(String taskAssignmentId, UpdateTaskAssignmentByIdRequestBody requestBody, UpdateTaskAssignmentByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/task_assignments/", convertToString(taskAssignmentId))).method("PUT").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), TaskAssignment.class);
  }

  public void deleteTaskAssignmentById(String taskAssignmentId) {
    deleteTaskAssignmentById(taskAssignmentId, new DeleteTaskAssignmentByIdHeaders());
  }

  public void deleteTaskAssignmentById(String taskAssignmentId, DeleteTaskAssignmentByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/task_assignments/", convertToString(taskAssignmentId))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class TaskAssignmentsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public TaskAssignmentsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public TaskAssignmentsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public TaskAssignmentsManager build() {
      return new TaskAssignmentsManager(this);
    }

  }

}
