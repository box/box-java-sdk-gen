package com.box.sdkgen.managers.termsofservices;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.termsofservices.TermsOfServices;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.termsofservice.TermsOfService;
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

public class TermsOfServicesManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public TermsOfServicesManager() {
    this.networkSession = new NetworkSession();
  }

  protected TermsOfServicesManager(TermsOfServicesManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public TermsOfServices getTermsOfService() {
    return getTermsOfService(new GetTermsOfServiceQueryParams(), new GetTermsOfServiceHeaders());
  }

  public TermsOfServices getTermsOfService(GetTermsOfServiceQueryParams queryParams) {
    return getTermsOfService(queryParams, new GetTermsOfServiceHeaders());
  }

  public TermsOfServices getTermsOfService(GetTermsOfServiceHeaders headers) {
    return getTermsOfService(new GetTermsOfServiceQueryParams(), headers);
  }

  public TermsOfServices getTermsOfService(GetTermsOfServiceQueryParams queryParams, GetTermsOfServiceHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("tos_type", convertToString(queryParams.getTosType()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/terms_of_services")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), TermsOfServices.class);
  }

  public TermsOfService createTermsOfService(CreateTermsOfServiceRequestBody requestBody) {
    return createTermsOfService(requestBody, new CreateTermsOfServiceHeaders());
  }

  public TermsOfService createTermsOfService(CreateTermsOfServiceRequestBody requestBody, CreateTermsOfServiceHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/terms_of_services")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), TermsOfService.class);
  }

  public TermsOfService getTermsOfServiceById(String termsOfServiceId) {
    return getTermsOfServiceById(termsOfServiceId, new GetTermsOfServiceByIdHeaders());
  }

  public TermsOfService getTermsOfServiceById(String termsOfServiceId, GetTermsOfServiceByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/terms_of_services/", convertToString(termsOfServiceId))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), TermsOfService.class);
  }

  public TermsOfService updateTermsOfServiceById(String termsOfServiceId, UpdateTermsOfServiceByIdRequestBody requestBody) {
    return updateTermsOfServiceById(termsOfServiceId, requestBody, new UpdateTermsOfServiceByIdHeaders());
  }

  public TermsOfService updateTermsOfServiceById(String termsOfServiceId, UpdateTermsOfServiceByIdRequestBody requestBody, UpdateTermsOfServiceByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/terms_of_services/", convertToString(termsOfServiceId))).method("PUT").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), TermsOfService.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class TermsOfServicesManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public TermsOfServicesManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public TermsOfServicesManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public TermsOfServicesManager build() {
      return new TermsOfServicesManager(this);
    }

  }

}
