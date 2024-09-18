package com.box.sdkgen.managers.fileversionlegalholds;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.fileversionlegalhold.FileVersionLegalHold;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.fileversionlegalholds.FileVersionLegalHolds;
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

public class GetFileVersionLegalHoldsQueryParams {

  public final String policyId;

  public String marker;

  public Long limit;

  public GetFileVersionLegalHoldsQueryParams(String policyId) {
    this.policyId = policyId;
  }

  protected GetFileVersionLegalHoldsQueryParams(GetFileVersionLegalHoldsQueryParamsBuilder builder) {
    this.policyId = builder.policyId;
    this.marker = builder.marker;
    this.limit = builder.limit;
  }

  public String getPolicyId() {
    return policyId;
  }

  public String getMarker() {
    return marker;
  }

  public Long getLimit() {
    return limit;
  }

  public static class GetFileVersionLegalHoldsQueryParamsBuilder {

    protected final String policyId;

    protected String marker;

    protected Long limit;

    public GetFileVersionLegalHoldsQueryParamsBuilder(String policyId) {
      this.policyId = policyId;
    }

    public GetFileVersionLegalHoldsQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetFileVersionLegalHoldsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetFileVersionLegalHoldsQueryParams build() {
      return new GetFileVersionLegalHoldsQueryParams(this);
    }

  }

}
