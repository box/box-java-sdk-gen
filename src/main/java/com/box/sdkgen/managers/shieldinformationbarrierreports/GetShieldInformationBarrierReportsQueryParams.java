package com.box.sdkgen.managers.shieldinformationbarrierreports;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.shieldinformationbarrierreports.ShieldInformationBarrierReports;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.shieldinformationbarrierreport.ShieldInformationBarrierReport;
import com.box.sdkgen.schemas.shieldinformationbarrierreference.ShieldInformationBarrierReference;
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

public class GetShieldInformationBarrierReportsQueryParams {

  public final String shieldInformationBarrierId;

  public String marker;

  public Long limit;

  public GetShieldInformationBarrierReportsQueryParams(String shieldInformationBarrierId) {
    this.shieldInformationBarrierId = shieldInformationBarrierId;
  }

  protected GetShieldInformationBarrierReportsQueryParams(GetShieldInformationBarrierReportsQueryParamsBuilder builder) {
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

  public static class GetShieldInformationBarrierReportsQueryParamsBuilder {

    protected final String shieldInformationBarrierId;

    protected String marker;

    protected Long limit;

    public GetShieldInformationBarrierReportsQueryParamsBuilder(String shieldInformationBarrierId) {
      this.shieldInformationBarrierId = shieldInformationBarrierId;
    }

    public GetShieldInformationBarrierReportsQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetShieldInformationBarrierReportsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetShieldInformationBarrierReportsQueryParams build() {
      return new GetShieldInformationBarrierReportsQueryParams(this);
    }

  }

}
