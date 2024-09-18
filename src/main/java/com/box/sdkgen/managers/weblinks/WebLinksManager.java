package com.box.sdkgen.managers.weblinks;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.weblink.WebLink;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;

public class WebLinksManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public WebLinksManager() {
    this.networkSession = new NetworkSession();
  }

  protected WebLinksManager(WebLinksManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public WebLink createWebLink(CreateWebLinkRequestBody requestBody) {
    return createWebLink(requestBody, new CreateWebLinkHeaders());
  }

  public WebLink createWebLink(CreateWebLinkRequestBody requestBody, CreateWebLinkHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/web_links")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), WebLink.class);
  }

  public WebLink getWebLinkById(String webLinkId) {
    return getWebLinkById(webLinkId, new GetWebLinkByIdHeaders());
  }

  public WebLink getWebLinkById(String webLinkId, GetWebLinkByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(entryOf("boxapi", convertToString(headers.getBoxapi()))), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/web_links/", convertToString(webLinkId))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), WebLink.class);
  }

  public WebLink updateWebLinkById(String webLinkId) {
    return updateWebLinkById(webLinkId, new UpdateWebLinkByIdRequestBody(), new UpdateWebLinkByIdHeaders());
  }

  public WebLink updateWebLinkById(String webLinkId, UpdateWebLinkByIdRequestBody requestBody) {
    return updateWebLinkById(webLinkId, requestBody, new UpdateWebLinkByIdHeaders());
  }

  public WebLink updateWebLinkById(String webLinkId, UpdateWebLinkByIdHeaders headers) {
    return updateWebLinkById(webLinkId, new UpdateWebLinkByIdRequestBody(), headers);
  }

  public WebLink updateWebLinkById(String webLinkId, UpdateWebLinkByIdRequestBody requestBody, UpdateWebLinkByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/web_links/", convertToString(webLinkId))).method("PUT").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), WebLink.class);
  }

  public void deleteWebLinkById(String webLinkId) {
    deleteWebLinkById(webLinkId, new DeleteWebLinkByIdHeaders());
  }

  public void deleteWebLinkById(String webLinkId, DeleteWebLinkByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/web_links/", convertToString(webLinkId))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class WebLinksManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public WebLinksManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public WebLinksManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public WebLinksManager build() {
      return new WebLinksManager(this);
    }

  }

}
