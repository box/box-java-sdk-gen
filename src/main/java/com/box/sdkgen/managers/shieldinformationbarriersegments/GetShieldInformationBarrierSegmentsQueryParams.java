package com.box.sdkgen.managers.shieldinformationbarriersegments;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.shieldinformationbarriersegment.ShieldInformationBarrierSegment;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.shieldinformationbarriersegments.ShieldInformationBarrierSegments;
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

public class GetShieldInformationBarrierSegmentsQueryParams {

  public final String shieldInformationBarrierId;

  public String marker;

  public Long limit;

  public GetShieldInformationBarrierSegmentsQueryParams(String shieldInformationBarrierId) {
    this.shieldInformationBarrierId = shieldInformationBarrierId;
  }

  protected GetShieldInformationBarrierSegmentsQueryParams(GetShieldInformationBarrierSegmentsQueryParamsBuilder builder) {
    this.shieldInformationBarrierId = builder.shieldInformationBarrierId;
    this.marker = builder.marker;
    this.limit = builder.limit;
  }

  public String getShieldInformationBarrierId() {
    return shieldInformationBarrierId;
  }

  public String getMarker() {
    return marker;
  }

  public Long getLimit() {
    return limit;
  }

  public static class GetShieldInformationBarrierSegmentsQueryParamsBuilder {

    protected final String shieldInformationBarrierId;

    protected String marker;

    protected Long limit;

    public GetShieldInformationBarrierSegmentsQueryParamsBuilder(String shieldInformationBarrierId) {
      this.shieldInformationBarrierId = shieldInformationBarrierId;
    }

    public GetShieldInformationBarrierSegmentsQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetShieldInformationBarrierSegmentsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetShieldInformationBarrierSegmentsQueryParams build() {
      return new GetShieldInformationBarrierSegmentsQueryParams(this);
    }

  }

}
