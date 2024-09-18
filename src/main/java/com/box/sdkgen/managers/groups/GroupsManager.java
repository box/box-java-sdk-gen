package com.box.sdkgen.managers.groups;

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
import com.box.sdkgen.schemas.groups.Groups;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.groupfull.GroupFull;
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

public class GroupsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public GroupsManager() {
    this.networkSession = new NetworkSession();
  }

  protected GroupsManager(GroupsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public Groups getGroups() {
    return getGroups(new GetGroupsQueryParams(), new GetGroupsHeaders());
  }

  public Groups getGroups(GetGroupsQueryParams queryParams) {
    return getGroups(queryParams, new GetGroupsHeaders());
  }

  public Groups getGroups(GetGroupsHeaders headers) {
    return getGroups(new GetGroupsQueryParams(), headers);
  }

  public Groups getGroups(GetGroupsQueryParams queryParams, GetGroupsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("filter_term", convertToString(queryParams.getFilterTerm())), entryOf("fields", convertToString(queryParams.getFields())), entryOf("limit", convertToString(queryParams.getLimit())), entryOf("offset", convertToString(queryParams.getOffset()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/groups")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), Groups.class);
  }

  public GroupFull createGroup(CreateGroupRequestBody requestBody) {
    return createGroup(requestBody, new CreateGroupQueryParams(), new CreateGroupHeaders());
  }

  public GroupFull createGroup(CreateGroupRequestBody requestBody, CreateGroupQueryParams queryParams) {
    return createGroup(requestBody, queryParams, new CreateGroupHeaders());
  }

  public GroupFull createGroup(CreateGroupRequestBody requestBody, CreateGroupHeaders headers) {
    return createGroup(requestBody, new CreateGroupQueryParams(), headers);
  }

  public GroupFull createGroup(CreateGroupRequestBody requestBody, CreateGroupQueryParams queryParams, CreateGroupHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/groups")).method("POST").params(queryParamsMap).headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), GroupFull.class);
  }

  public GroupFull getGroupById(String groupId) {
    return getGroupById(groupId, new GetGroupByIdQueryParams(), new GetGroupByIdHeaders());
  }

  public GroupFull getGroupById(String groupId, GetGroupByIdQueryParams queryParams) {
    return getGroupById(groupId, queryParams, new GetGroupByIdHeaders());
  }

  public GroupFull getGroupById(String groupId, GetGroupByIdHeaders headers) {
    return getGroupById(groupId, new GetGroupByIdQueryParams(), headers);
  }

  public GroupFull getGroupById(String groupId, GetGroupByIdQueryParams queryParams, GetGroupByIdHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/groups/", convertToString(groupId))).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), GroupFull.class);
  }

  public GroupFull updateGroupById(String groupId) {
    return updateGroupById(groupId, new UpdateGroupByIdRequestBody(), new UpdateGroupByIdQueryParams(), new UpdateGroupByIdHeaders());
  }

  public GroupFull updateGroupById(String groupId, UpdateGroupByIdRequestBody requestBody) {
    return updateGroupById(groupId, requestBody, new UpdateGroupByIdQueryParams(), new UpdateGroupByIdHeaders());
  }

  public GroupFull updateGroupById(String groupId, UpdateGroupByIdQueryParams queryParams) {
    return updateGroupById(groupId, new UpdateGroupByIdRequestBody(), queryParams, new UpdateGroupByIdHeaders());
  }

  public GroupFull updateGroupById(String groupId, UpdateGroupByIdRequestBody requestBody, UpdateGroupByIdQueryParams queryParams) {
    return updateGroupById(groupId, requestBody, queryParams, new UpdateGroupByIdHeaders());
  }

  public GroupFull updateGroupById(String groupId, UpdateGroupByIdHeaders headers) {
    return updateGroupById(groupId, new UpdateGroupByIdRequestBody(), new UpdateGroupByIdQueryParams(), headers);
  }

  public GroupFull updateGroupById(String groupId, UpdateGroupByIdRequestBody requestBody, UpdateGroupByIdHeaders headers) {
    return updateGroupById(groupId, requestBody, new UpdateGroupByIdQueryParams(), headers);
  }

  public GroupFull updateGroupById(String groupId, UpdateGroupByIdQueryParams queryParams, UpdateGroupByIdHeaders headers) {
    return updateGroupById(groupId, new UpdateGroupByIdRequestBody(), queryParams, headers);
  }

  public GroupFull updateGroupById(String groupId, UpdateGroupByIdRequestBody requestBody, UpdateGroupByIdQueryParams queryParams, UpdateGroupByIdHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/groups/", convertToString(groupId))).method("PUT").params(queryParamsMap).headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), GroupFull.class);
  }

  public void deleteGroupById(String groupId) {
    deleteGroupById(groupId, new DeleteGroupByIdHeaders());
  }

  public void deleteGroupById(String groupId, DeleteGroupByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/groups/", convertToString(groupId))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class GroupsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public GroupsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public GroupsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public GroupsManager build() {
      return new GroupsManager(this);
    }

  }

}
