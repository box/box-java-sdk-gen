package com.box.sdkgen.managers.memberships;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.groupmemberships.GroupMemberships;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.groupmembership.GroupMembership;
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

public class MembershipsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public MembershipsManager() {
    this.networkSession = new NetworkSession();
  }

  protected MembershipsManager(MembershipsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public GroupMemberships getUserMemberships(String userId) {
    return getUserMemberships(userId, new GetUserMembershipsQueryParams(), new GetUserMembershipsHeaders());
  }

  public GroupMemberships getUserMemberships(String userId, GetUserMembershipsQueryParams queryParams) {
    return getUserMemberships(userId, queryParams, new GetUserMembershipsHeaders());
  }

  public GroupMemberships getUserMemberships(String userId, GetUserMembershipsHeaders headers) {
    return getUserMemberships(userId, new GetUserMembershipsQueryParams(), headers);
  }

  public GroupMemberships getUserMemberships(String userId, GetUserMembershipsQueryParams queryParams, GetUserMembershipsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("limit", convertToString(queryParams.getLimit())), entryOf("offset", convertToString(queryParams.getOffset()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/users/", convertToString(userId), "/memberships")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), GroupMemberships.class);
  }

  public GroupMemberships getGroupMemberships(String groupId) {
    return getGroupMemberships(groupId, new GetGroupMembershipsQueryParams(), new GetGroupMembershipsHeaders());
  }

  public GroupMemberships getGroupMemberships(String groupId, GetGroupMembershipsQueryParams queryParams) {
    return getGroupMemberships(groupId, queryParams, new GetGroupMembershipsHeaders());
  }

  public GroupMemberships getGroupMemberships(String groupId, GetGroupMembershipsHeaders headers) {
    return getGroupMemberships(groupId, new GetGroupMembershipsQueryParams(), headers);
  }

  public GroupMemberships getGroupMemberships(String groupId, GetGroupMembershipsQueryParams queryParams, GetGroupMembershipsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("limit", convertToString(queryParams.getLimit())), entryOf("offset", convertToString(queryParams.getOffset()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/groups/", convertToString(groupId), "/memberships")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), GroupMemberships.class);
  }

  public GroupMembership createGroupMembership(CreateGroupMembershipRequestBody requestBody) {
    return createGroupMembership(requestBody, new CreateGroupMembershipQueryParams(), new CreateGroupMembershipHeaders());
  }

  public GroupMembership createGroupMembership(CreateGroupMembershipRequestBody requestBody, CreateGroupMembershipQueryParams queryParams) {
    return createGroupMembership(requestBody, queryParams, new CreateGroupMembershipHeaders());
  }

  public GroupMembership createGroupMembership(CreateGroupMembershipRequestBody requestBody, CreateGroupMembershipHeaders headers) {
    return createGroupMembership(requestBody, new CreateGroupMembershipQueryParams(), headers);
  }

  public GroupMembership createGroupMembership(CreateGroupMembershipRequestBody requestBody, CreateGroupMembershipQueryParams queryParams, CreateGroupMembershipHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/group_memberships")).method("POST").params(queryParamsMap).headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), GroupMembership.class);
  }

  public GroupMembership getGroupMembershipById(String groupMembershipId) {
    return getGroupMembershipById(groupMembershipId, new GetGroupMembershipByIdQueryParams(), new GetGroupMembershipByIdHeaders());
  }

  public GroupMembership getGroupMembershipById(String groupMembershipId, GetGroupMembershipByIdQueryParams queryParams) {
    return getGroupMembershipById(groupMembershipId, queryParams, new GetGroupMembershipByIdHeaders());
  }

  public GroupMembership getGroupMembershipById(String groupMembershipId, GetGroupMembershipByIdHeaders headers) {
    return getGroupMembershipById(groupMembershipId, new GetGroupMembershipByIdQueryParams(), headers);
  }

  public GroupMembership getGroupMembershipById(String groupMembershipId, GetGroupMembershipByIdQueryParams queryParams, GetGroupMembershipByIdHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/group_memberships/", convertToString(groupMembershipId))).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), GroupMembership.class);
  }

  public GroupMembership updateGroupMembershipById(String groupMembershipId) {
    return updateGroupMembershipById(groupMembershipId, new UpdateGroupMembershipByIdRequestBody(), new UpdateGroupMembershipByIdQueryParams(), new UpdateGroupMembershipByIdHeaders());
  }

  public GroupMembership updateGroupMembershipById(String groupMembershipId, UpdateGroupMembershipByIdRequestBody requestBody) {
    return updateGroupMembershipById(groupMembershipId, requestBody, new UpdateGroupMembershipByIdQueryParams(), new UpdateGroupMembershipByIdHeaders());
  }

  public GroupMembership updateGroupMembershipById(String groupMembershipId, UpdateGroupMembershipByIdQueryParams queryParams) {
    return updateGroupMembershipById(groupMembershipId, new UpdateGroupMembershipByIdRequestBody(), queryParams, new UpdateGroupMembershipByIdHeaders());
  }

  public GroupMembership updateGroupMembershipById(String groupMembershipId, UpdateGroupMembershipByIdRequestBody requestBody, UpdateGroupMembershipByIdQueryParams queryParams) {
    return updateGroupMembershipById(groupMembershipId, requestBody, queryParams, new UpdateGroupMembershipByIdHeaders());
  }

  public GroupMembership updateGroupMembershipById(String groupMembershipId, UpdateGroupMembershipByIdHeaders headers) {
    return updateGroupMembershipById(groupMembershipId, new UpdateGroupMembershipByIdRequestBody(), new UpdateGroupMembershipByIdQueryParams(), headers);
  }

  public GroupMembership updateGroupMembershipById(String groupMembershipId, UpdateGroupMembershipByIdRequestBody requestBody, UpdateGroupMembershipByIdHeaders headers) {
    return updateGroupMembershipById(groupMembershipId, requestBody, new UpdateGroupMembershipByIdQueryParams(), headers);
  }

  public GroupMembership updateGroupMembershipById(String groupMembershipId, UpdateGroupMembershipByIdQueryParams queryParams, UpdateGroupMembershipByIdHeaders headers) {
    return updateGroupMembershipById(groupMembershipId, new UpdateGroupMembershipByIdRequestBody(), queryParams, headers);
  }

  public GroupMembership updateGroupMembershipById(String groupMembershipId, UpdateGroupMembershipByIdRequestBody requestBody, UpdateGroupMembershipByIdQueryParams queryParams, UpdateGroupMembershipByIdHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/group_memberships/", convertToString(groupMembershipId))).method("PUT").params(queryParamsMap).headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), GroupMembership.class);
  }

  public void deleteGroupMembershipById(String groupMembershipId) {
    deleteGroupMembershipById(groupMembershipId, new DeleteGroupMembershipByIdHeaders());
  }

  public void deleteGroupMembershipById(String groupMembershipId, DeleteGroupMembershipByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/group_memberships/", convertToString(groupMembershipId))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class MembershipsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public MembershipsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public MembershipsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public MembershipsManager build() {
      return new MembershipsManager(this);
    }

  }

}
