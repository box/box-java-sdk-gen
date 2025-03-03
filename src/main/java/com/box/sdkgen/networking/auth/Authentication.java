package com.box.sdkgen.networking.auth;

import com.box.sdkgen.networking.network.NetworkSession;
import com.box.sdkgen.schemas.accesstoken.AccessToken;
import java.util.List;

public interface Authentication {

  AccessToken retrieveToken(NetworkSession networkSession);

  AccessToken refreshToken(NetworkSession networkSession);

  String retrieveAuthorizationHeader(NetworkSession networkSession);

  void revokeToken(NetworkSession networkSession);

  AccessToken downscopeToken(
      List<String> scopes, String resource, String sharedLink, NetworkSession networkSession);
}
