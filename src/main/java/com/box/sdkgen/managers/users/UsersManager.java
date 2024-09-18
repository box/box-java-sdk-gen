package com.box.sdkgen.managers.users;

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
import com.box.sdkgen.schemas.users.Users;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.userfull.UserFull;
import com.box.sdkgen.schemas.trackingcode.TrackingCode;
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

public class UsersManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public UsersManager() {
    this.networkSession = new NetworkSession();
  }

  protected UsersManager(UsersManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public Users getUsers() {
    return getUsers(new GetUsersQueryParams(), new GetUsersHeaders());
  }

  public Users getUsers(GetUsersQueryParams queryParams) {
    return getUsers(queryParams, new GetUsersHeaders());
  }

  public Users getUsers(GetUsersHeaders headers) {
    return getUsers(new GetUsersQueryParams(), headers);
  }

  public Users getUsers(GetUsersQueryParams queryParams, GetUsersHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("filter_term", convertToString(queryParams.getFilterTerm())), entryOf("user_type", convertToString(queryParams.getUserType())), entryOf("external_app_user_id", convertToString(queryParams.getExternalAppUserId())), entryOf("fields", convertToString(queryParams.getFields())), entryOf("offset", convertToString(queryParams.getOffset())), entryOf("limit", convertToString(queryParams.getLimit())), entryOf("usemarker", convertToString(queryParams.getUsemarker())), entryOf("marker", convertToString(queryParams.getMarker()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/users")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), Users.class);
  }

  public UserFull createUser(CreateUserRequestBody requestBody) {
    return createUser(requestBody, new CreateUserQueryParams(), new CreateUserHeaders());
  }

  public UserFull createUser(CreateUserRequestBody requestBody, CreateUserQueryParams queryParams) {
    return createUser(requestBody, queryParams, new CreateUserHeaders());
  }

  public UserFull createUser(CreateUserRequestBody requestBody, CreateUserHeaders headers) {
    return createUser(requestBody, new CreateUserQueryParams(), headers);
  }

  public UserFull createUser(CreateUserRequestBody requestBody, CreateUserQueryParams queryParams, CreateUserHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/users")).method("POST").params(queryParamsMap).headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), UserFull.class);
  }

  public UserFull getUserMe() {
    return getUserMe(new GetUserMeQueryParams(), new GetUserMeHeaders());
  }

  public UserFull getUserMe(GetUserMeQueryParams queryParams) {
    return getUserMe(queryParams, new GetUserMeHeaders());
  }

  public UserFull getUserMe(GetUserMeHeaders headers) {
    return getUserMe(new GetUserMeQueryParams(), headers);
  }

  public UserFull getUserMe(GetUserMeQueryParams queryParams, GetUserMeHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/users/me")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), UserFull.class);
  }

  public UserFull getUserById(String userId) {
    return getUserById(userId, new GetUserByIdQueryParams(), new GetUserByIdHeaders());
  }

  public UserFull getUserById(String userId, GetUserByIdQueryParams queryParams) {
    return getUserById(userId, queryParams, new GetUserByIdHeaders());
  }

  public UserFull getUserById(String userId, GetUserByIdHeaders headers) {
    return getUserById(userId, new GetUserByIdQueryParams(), headers);
  }

  public UserFull getUserById(String userId, GetUserByIdQueryParams queryParams, GetUserByIdHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/users/", convertToString(userId))).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), UserFull.class);
  }

  public UserFull updateUserById(String userId) {
    return updateUserById(userId, new UpdateUserByIdRequestBody(), new UpdateUserByIdQueryParams(), new UpdateUserByIdHeaders());
  }

  public UserFull updateUserById(String userId, UpdateUserByIdRequestBody requestBody) {
    return updateUserById(userId, requestBody, new UpdateUserByIdQueryParams(), new UpdateUserByIdHeaders());
  }

  public UserFull updateUserById(String userId, UpdateUserByIdQueryParams queryParams) {
    return updateUserById(userId, new UpdateUserByIdRequestBody(), queryParams, new UpdateUserByIdHeaders());
  }

  public UserFull updateUserById(String userId, UpdateUserByIdRequestBody requestBody, UpdateUserByIdQueryParams queryParams) {
    return updateUserById(userId, requestBody, queryParams, new UpdateUserByIdHeaders());
  }

  public UserFull updateUserById(String userId, UpdateUserByIdHeaders headers) {
    return updateUserById(userId, new UpdateUserByIdRequestBody(), new UpdateUserByIdQueryParams(), headers);
  }

  public UserFull updateUserById(String userId, UpdateUserByIdRequestBody requestBody, UpdateUserByIdHeaders headers) {
    return updateUserById(userId, requestBody, new UpdateUserByIdQueryParams(), headers);
  }

  public UserFull updateUserById(String userId, UpdateUserByIdQueryParams queryParams, UpdateUserByIdHeaders headers) {
    return updateUserById(userId, new UpdateUserByIdRequestBody(), queryParams, headers);
  }

  public UserFull updateUserById(String userId, UpdateUserByIdRequestBody requestBody, UpdateUserByIdQueryParams queryParams, UpdateUserByIdHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("fields", convertToString(queryParams.getFields()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/users/", convertToString(userId))).method("PUT").params(queryParamsMap).headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), UserFull.class);
  }

  public void deleteUserById(String userId) {
    deleteUserById(userId, new DeleteUserByIdQueryParams(), new DeleteUserByIdHeaders());
  }

  public void deleteUserById(String userId, DeleteUserByIdQueryParams queryParams) {
    deleteUserById(userId, queryParams, new DeleteUserByIdHeaders());
  }

  public void deleteUserById(String userId, DeleteUserByIdHeaders headers) {
    deleteUserById(userId, new DeleteUserByIdQueryParams(), headers);
  }

  public void deleteUserById(String userId, DeleteUserByIdQueryParams queryParams, DeleteUserByIdHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("notify", convertToString(queryParams.getNotify())), entryOf("force", convertToString(queryParams.getForce()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/users/", convertToString(userId))).method("DELETE").params(queryParamsMap).headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class UsersManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public UsersManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public UsersManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public UsersManager build() {
      return new UsersManager(this);
    }

  }

}
