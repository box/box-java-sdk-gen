package com.box.sdkgen.managers.termsofserviceuserstatuses;

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
import com.box.sdkgen.schemas.termsofserviceuserstatuses.TermsOfServiceUserStatuses;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.termsofserviceuserstatus.TermsOfServiceUserStatus;
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

public class TermsOfServiceUserStatusesManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public TermsOfServiceUserStatusesManager() {
    this.networkSession = new NetworkSession();
  }

  protected TermsOfServiceUserStatusesManager(TermsOfServiceUserStatusesManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public TermsOfServiceUserStatuses getTermsOfServiceUserStatuses(GetTermsOfServiceUserStatusesQueryParams queryParams) {
    return getTermsOfServiceUserStatuses(queryParams, new GetTermsOfServiceUserStatusesHeaders());
  }

  public TermsOfServiceUserStatuses getTermsOfServiceUserStatuses(GetTermsOfServiceUserStatusesQueryParams queryParams, GetTermsOfServiceUserStatusesHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("tos_id", convertToString(queryParams.getTosId())), entryOf("user_id", convertToString(queryParams.getUserId()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/terms_of_service_user_statuses")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), TermsOfServiceUserStatuses.class);
  }

  public TermsOfServiceUserStatus createTermsOfServiceStatusForUser(CreateTermsOfServiceStatusForUserRequestBody requestBody) {
    return createTermsOfServiceStatusForUser(requestBody, new CreateTermsOfServiceStatusForUserHeaders());
  }

  public TermsOfServiceUserStatus createTermsOfServiceStatusForUser(CreateTermsOfServiceStatusForUserRequestBody requestBody, CreateTermsOfServiceStatusForUserHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/terms_of_service_user_statuses")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), TermsOfServiceUserStatus.class);
  }

  public TermsOfServiceUserStatus updateTermsOfServiceStatusForUserById(String termsOfServiceUserStatusId, UpdateTermsOfServiceStatusForUserByIdRequestBody requestBody) {
    return updateTermsOfServiceStatusForUserById(termsOfServiceUserStatusId, requestBody, new UpdateTermsOfServiceStatusForUserByIdHeaders());
  }

  public TermsOfServiceUserStatus updateTermsOfServiceStatusForUserById(String termsOfServiceUserStatusId, UpdateTermsOfServiceStatusForUserByIdRequestBody requestBody, UpdateTermsOfServiceStatusForUserByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/terms_of_service_user_statuses/", convertToString(termsOfServiceUserStatusId))).method("PUT").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), TermsOfServiceUserStatus.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class TermsOfServiceUserStatusesManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public TermsOfServiceUserStatusesManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public TermsOfServiceUserStatusesManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public TermsOfServiceUserStatusesManager build() {
      return new TermsOfServiceUserStatusesManager(this);
    }

  }

}
