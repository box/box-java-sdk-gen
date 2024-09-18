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

public class GetUserAvatarHeaders {

  public Map<String, String> extraHeaders;

  public GetUserAvatarHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetUserAvatarHeaders(GetUserAvatarHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetUserAvatarHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetUserAvatarHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetUserAvatarHeaders build() {
      return new GetUserAvatarHeaders(this);
    }

  }

}
