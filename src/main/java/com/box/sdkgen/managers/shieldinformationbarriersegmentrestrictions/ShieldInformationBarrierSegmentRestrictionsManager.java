package com.box.sdkgen.managers.shieldinformationbarriersegmentrestrictions;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentrestriction.ShieldInformationBarrierSegmentRestriction;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentrestrictions.ShieldInformationBarrierSegmentRestrictions;
import com.box.sdkgen.schemas.shieldinformationbarrierbase.ShieldInformationBarrierBase;
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

public class ShieldInformationBarrierSegmentRestrictionsManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public ShieldInformationBarrierSegmentRestrictionsManager() {
    this.networkSession = new NetworkSession();
  }

  protected ShieldInformationBarrierSegmentRestrictionsManager(ShieldInformationBarrierSegmentRestrictionsManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public ShieldInformationBarrierSegmentRestriction getShieldInformationBarrierSegmentRestrictionById(String shieldInformationBarrierSegmentRestrictionId) {
    return getShieldInformationBarrierSegmentRestrictionById(shieldInformationBarrierSegmentRestrictionId, new GetShieldInformationBarrierSegmentRestrictionByIdHeaders());
  }

  public ShieldInformationBarrierSegmentRestriction getShieldInformationBarrierSegmentRestrictionById(String shieldInformationBarrierSegmentRestrictionId, GetShieldInformationBarrierSegmentRestrictionByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/shield_information_barrier_segment_restrictions/", convertToString(shieldInformationBarrierSegmentRestrictionId))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), ShieldInformationBarrierSegmentRestriction.class);
  }

  public void deleteShieldInformationBarrierSegmentRestrictionById(String shieldInformationBarrierSegmentRestrictionId) {
    deleteShieldInformationBarrierSegmentRestrictionById(shieldInformationBarrierSegmentRestrictionId, new DeleteShieldInformationBarrierSegmentRestrictionByIdHeaders());
  }

  public void deleteShieldInformationBarrierSegmentRestrictionById(String shieldInformationBarrierSegmentRestrictionId, DeleteShieldInformationBarrierSegmentRestrictionByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/shield_information_barrier_segment_restrictions/", convertToString(shieldInformationBarrierSegmentRestrictionId))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public ShieldInformationBarrierSegmentRestrictions getShieldInformationBarrierSegmentRestrictions(GetShieldInformationBarrierSegmentRestrictionsQueryParams queryParams) {
    return getShieldInformationBarrierSegmentRestrictions(queryParams, new GetShieldInformationBarrierSegmentRestrictionsHeaders());
  }

  public ShieldInformationBarrierSegmentRestrictions getShieldInformationBarrierSegmentRestrictions(GetShieldInformationBarrierSegmentRestrictionsQueryParams queryParams, GetShieldInformationBarrierSegmentRestrictionsHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("shield_information_barrier_segment_id", convertToString(queryParams.getShieldInformationBarrierSegmentId())), entryOf("marker", convertToString(queryParams.getMarker())), entryOf("limit", convertToString(queryParams.getLimit()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/shield_information_barrier_segment_restrictions")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), ShieldInformationBarrierSegmentRestrictions.class);
  }

  public ShieldInformationBarrierSegmentRestriction createShieldInformationBarrierSegmentRestriction(CreateShieldInformationBarrierSegmentRestrictionRequestBody requestBody) {
    return createShieldInformationBarrierSegmentRestriction(requestBody, new CreateShieldInformationBarrierSegmentRestrictionHeaders());
  }

  public ShieldInformationBarrierSegmentRestriction createShieldInformationBarrierSegmentRestriction(CreateShieldInformationBarrierSegmentRestrictionRequestBody requestBody, CreateShieldInformationBarrierSegmentRestrictionHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/shield_information_barrier_segment_restrictions")).method("POST").headers(headersMap).data(JsonManager.serialize(requestBody)).contentType("application/json").responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), ShieldInformationBarrierSegmentRestriction.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class ShieldInformationBarrierSegmentRestrictionsManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public ShieldInformationBarrierSegmentRestrictionsManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public ShieldInformationBarrierSegmentRestrictionsManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public ShieldInformationBarrierSegmentRestrictionsManager build() {
      return new ShieldInformationBarrierSegmentRestrictionsManager(this);
    }

  }

}
