package com.box.sdkgen.managers.avatars;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import java.util.Arrays;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.useravatar.UserAvatar;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.box.sdkgen.networking.fetch.MultipartItem;
import com.fasterxml.jackson.databind.JsonNode;

public class AvatarsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public AvatarsManager() {
    this.networkSession = new NetworkSession();
  }

  protected AvatarsManager(AvatarsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public ByteStream getUserAvatar(String userId) {
    return getUserAvatar(userId, new GetUserAvatarHeaders());
  }

  public ByteStream getUserAvatar(String userId, GetUserAvatarHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/users/", convertToString(userId), "/avatar")).method("GET").headers(headersMap).responseFormat("binary").auth(this.auth).networkSession(this.networkSession).build());
    return response.getContent();
  }

  public UserAvatar createUserAvatar(String userId, CreateUserAvatarRequestBody requestBody) {
    return createUserAvatar(userId, requestBody, new CreateUserAvatarHeaders());
  }

  public UserAvatar createUserAvatar(String userId, CreateUserAvatarRequestBody requestBody, CreateUserAvatarHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/users/", convertToString(userId), "/avatar")).method("POST").headers(headersMap).multipartData(Arrays.asList(new MultipartItem.MultipartItemBuilder("pic").fileStream(requestBody.getPic()).fileName(requestBody.getPicFileName()).contentType(requestBody.getPicContentType()).build())).contentType("multipart/form-data").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), UserAvatar.class);
  }

  public void deleteUserAvatar(String userId) {
    deleteUserAvatar(userId, new DeleteUserAvatarHeaders());
  }

  public void deleteUserAvatar(String userId, DeleteUserAvatarHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/users/", convertToString(userId), "/avatar")).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class AvatarsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public AvatarsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public AvatarsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public AvatarsManager build() {
      return new AvatarsManager(this);
    }

  }

}
