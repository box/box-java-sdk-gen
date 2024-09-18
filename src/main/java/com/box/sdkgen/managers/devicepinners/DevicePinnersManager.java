package com.box.sdkgen.managers.devicepinners;

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
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.devicepinner.DevicePinner;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.devicepinners.DevicePinners;
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

public class DevicePinnersManager {

  public Authentication auth;

  public NetworkSession networkSession;

  public DevicePinnersManager() {
    this.networkSession = new NetworkSession();
  }

  protected DevicePinnersManager(DevicePinnersManagerBuilder builder) {
    this.auth = builder.auth;
    this.networkSession = builder.networkSession;
  }

  public DevicePinner getDevicePinnerById(String devicePinnerId) {
    return getDevicePinnerById(devicePinnerId, new GetDevicePinnerByIdHeaders());
  }

  public DevicePinner getDevicePinnerById(String devicePinnerId, GetDevicePinnerByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/device_pinners/", convertToString(devicePinnerId))).method("GET").headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), DevicePinner.class);
  }

  public void deleteDevicePinnerById(String devicePinnerId) {
    deleteDevicePinnerById(devicePinnerId, new DeleteDevicePinnerByIdHeaders());
  }

  public void deleteDevicePinnerById(String devicePinnerId, DeleteDevicePinnerByIdHeaders headers) {
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/device_pinners/", convertToString(devicePinnerId))).method("DELETE").headers(headersMap).responseFormat(null).auth(this.auth).networkSession(this.networkSession).build());
  }

  public DevicePinners getEnterpriseDevicePinners(String enterpriseId) {
    return getEnterpriseDevicePinners(enterpriseId, new GetEnterpriseDevicePinnersQueryParams(), new GetEnterpriseDevicePinnersHeaders());
  }

  public DevicePinners getEnterpriseDevicePinners(String enterpriseId, GetEnterpriseDevicePinnersQueryParams queryParams) {
    return getEnterpriseDevicePinners(enterpriseId, queryParams, new GetEnterpriseDevicePinnersHeaders());
  }

  public DevicePinners getEnterpriseDevicePinners(String enterpriseId, GetEnterpriseDevicePinnersHeaders headers) {
    return getEnterpriseDevicePinners(enterpriseId, new GetEnterpriseDevicePinnersQueryParams(), headers);
  }

  public DevicePinners getEnterpriseDevicePinners(String enterpriseId, GetEnterpriseDevicePinnersQueryParams queryParams, GetEnterpriseDevicePinnersHeaders headers) {
    Map<String, String> queryParamsMap = prepareParams(mapOf(entryOf("marker", convertToString(queryParams.getMarker())), entryOf("limit", convertToString(queryParams.getLimit())), entryOf("direction", convertToString(queryParams.getDirection()))));
    Map<String, String> headersMap = prepareParams(mergeMaps(mapOf(), headers.getExtraHeaders()));
    FetchResponse response = fetch(new FetchOptions.FetchOptionsBuilder(String.join("", this.networkSession.getBaseUrls().getBaseUrl(), "/2.0/enterprises/", convertToString(enterpriseId), "/device_pinners")).method("GET").params(queryParamsMap).headers(headersMap).responseFormat("json").auth(this.auth).networkSession(this.networkSession).build());
    return JsonManager.deserialize(response.getData(), DevicePinners.class);
  }

  public Authentication getAuth() {
    return auth;
  }

  public NetworkSession getNetworkSession() {
    return networkSession;
  }

  public static class DevicePinnersManagerBuilder {

    protected Authentication auth;

    protected NetworkSession networkSession;

    public DevicePinnersManagerBuilder auth(Authentication auth) {
      this.auth = auth;
      return this;
    }

    public DevicePinnersManagerBuilder networkSession(NetworkSession networkSession) {
      this.networkSession = networkSession;
      return this;
    }

    public DevicePinnersManager build() {
      return new DevicePinnersManager(this);
    }

  }

}
