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

public class GetEnterpriseDevicePinnersQueryParams {

  public String marker;

  public Long limit;

  public EnumWrapper<GetEnterpriseDevicePinnersQueryParamsDirectionField> direction;

  public GetEnterpriseDevicePinnersQueryParams() {
  }

  protected GetEnterpriseDevicePinnersQueryParams(GetEnterpriseDevicePinnersQueryParamsBuilder builder) {
    this.marker = builder.marker;
    this.limit = builder.limit;
    this.direction = builder.direction;
  }

  public String getMarker() {
    return marker;
  }

  public Long getLimit() {
    return limit;
  }

  public EnumWrapper<GetEnterpriseDevicePinnersQueryParamsDirectionField> getDirection() {
    return direction;
  }

  public static class GetEnterpriseDevicePinnersQueryParamsBuilder {

    protected String marker;

    protected Long limit;

    protected EnumWrapper<GetEnterpriseDevicePinnersQueryParamsDirectionField> direction;

    public GetEnterpriseDevicePinnersQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetEnterpriseDevicePinnersQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetEnterpriseDevicePinnersQueryParamsBuilder direction(GetEnterpriseDevicePinnersQueryParamsDirectionField direction) {
      this.direction = new EnumWrapper<GetEnterpriseDevicePinnersQueryParamsDirectionField>(direction.getValue(), direction);
      return this;
    }

    public GetEnterpriseDevicePinnersQueryParams build() {
      return new GetEnterpriseDevicePinnersQueryParams(this);
    }

  }

}
