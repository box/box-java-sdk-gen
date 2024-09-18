package com.box.sdkgen.managers.shieldinformationbarriers;

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
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.shieldinformationbarrier.ShieldInformationBarrier;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.shieldinformationbarriers.ShieldInformationBarriers;
import com.box.sdkgen.schemas.enterprisebase.EnterpriseBase;
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

public class ShieldInformationBarriersManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public ShieldInformationBarriersManager() {
    this.networkSession = new NetworkSession();
  }

  protected ShieldInformationBarriersManager(ShieldInformationBarriersManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public ShieldInformationBarrier getShieldInformationBarrierById(String shieldInformationBarrierId) {
    return getShieldInformationBarrierById(shieldInformationBarrierId, new GetShieldInformationBarrierByIdHeaders());
  }

  public ShieldInformationBarrier getShieldInformationBarrierById(String shieldInformationBarrierId, GetShieldInformationBarrierByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/shield_information_barriers/", convertToString(shieldInformationBarrierId))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), ShieldInformationBarrier.class);
  }

  public ShieldInformationBarrier updateShieldInformationBarrierStatus(UpdateShieldInformationBarrierStatusRequestBody requestBody) {
    return updateShieldInformationBarrierStatus(requestBody, new UpdateShieldInformationBarrierStatusHeaders());
  }

  public ShieldInformationBarrier updateShieldInformationBarrierStatus(UpdateShieldInformationBarrierStatusRequestBody requestBody, UpdateShieldInformationBarrierStatusHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/shield_information_barriers/change_status")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), ShieldInformationBarrier.class);
  }

  public ShieldInformationBarriers getShieldInformationBarriers() {
    return getShieldInformationBarriers(new GetShieldInformationBarriersQueryParams(), new GetShieldInformationBarriersHeaders());
  }

  public ShieldInformationBarriers getShieldInformationBarriers(GetShieldInformationBarriersQueryParams queryParams) {
    return getShieldInformationBarriers(queryParams, new GetShieldInformationBarriersHeaders());
  }

  public ShieldInformationBarriers getShieldInformationBarriers(GetShieldInformationBarriersHeaders headers) {
    return getShieldInformationBarriers(new GetShieldInformationBarriersQueryParams(), headers);
  }

  public ShieldInformationBarriers getShieldInformationBarriers(GetShieldInformationBarriersQueryParams queryParams, GetShieldInformationBarriersHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("marker", convertToString(queryParams.getMarker())), entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/shield_information_barriers")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), ShieldInformationBarriers.class);
  }

  public ShieldInformationBarrier createShieldInformationBarrier(CreateShieldInformationBarrierRequestBody requestBody) {
    return createShieldInformationBarrier(requestBody, new CreateShieldInformationBarrierHeaders());
  }

  public ShieldInformationBarrier createShieldInformationBarrier(CreateShieldInformationBarrierRequestBody requestBody, CreateShieldInformationBarrierHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/shield_information_barriers")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), ShieldInformationBarrier.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class ShieldInformationBarriersManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public ShieldInformationBarriersManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public ShieldInformationBarriersManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public ShieldInformationBarriersManager build() {
      return new ShieldInformationBarriersManager(this);
    }

  }

}
