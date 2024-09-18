package com.box.sdkgen.managers.signrequests;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.signrequest.SignRequest;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.signrequests.SignRequests;
import com.box.sdkgen.schemas.signrequestcreaterequest.SignRequestCreateRequest;
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

public class SignRequestsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public SignRequestsManager() {
    this.networkSession = new NetworkSession();
  }

  protected SignRequestsManager(SignRequestsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public SignRequest cancelSignRequest(String signRequestId) {
    return cancelSignRequest(signRequestId, new CancelSignRequestHeaders());
  }

  public SignRequest cancelSignRequest(String signRequestId, CancelSignRequestHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/sign_requests/", convertToString(signRequestId), "/cancel")).method("POST").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), SignRequest.class);
  }

  public void resendSignRequest(String signRequestId) {
    resendSignRequest(signRequestId, new ResendSignRequestHeaders());
  }

  public void resendSignRequest(String signRequestId, ResendSignRequestHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/sign_requests/", convertToString(signRequestId), "/resend")).method("POST").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public SignRequest getSignRequestById(String signRequestId) {
    return getSignRequestById(signRequestId, new GetSignRequestByIdHeaders());
  }

  public SignRequest getSignRequestById(String signRequestId, GetSignRequestByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/sign_requests/", convertToString(signRequestId))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), SignRequest.class);
  }

  public SignRequests getSignRequests() {
    return getSignRequests(new GetSignRequestsQueryParams(), new GetSignRequestsHeaders());
  }

  public SignRequests getSignRequests(GetSignRequestsQueryParams queryParams) {
    return getSignRequests(queryParams, new GetSignRequestsHeaders());
  }

  public SignRequests getSignRequests(GetSignRequestsHeaders headers) {
    return getSignRequests(new GetSignRequestsQueryParams(), headers);
  }

  public SignRequests getSignRequests(GetSignRequestsQueryParams queryParams, GetSignRequestsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("marker", convertToString(queryParams.getMarker())), entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/sign_requests")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), SignRequests.class);
  }

  public SignRequest createSignRequest(SignRequestCreateRequest requestBody) {
    return createSignRequest(requestBody, new CreateSignRequestHeaders());
  }

  public SignRequest createSignRequest(SignRequestCreateRequest requestBody, CreateSignRequestHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/sign_requests")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), SignRequest.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class SignRequestsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public SignRequestsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public SignRequestsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public SignRequestsManager build() {
      return new SignRequestsManager(this);
    }

  }

}
