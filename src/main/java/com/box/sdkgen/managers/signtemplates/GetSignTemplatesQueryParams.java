package com.box.sdkgen.managers.signtemplates;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.signtemplates.SignTemplates;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.signtemplate.SignTemplate;
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

public class GetSignTemplatesQueryParams {

  public String marker;

  public Long limit;

  public GetSignTemplatesQueryParams() {
  }

  protected GetSignTemplatesQueryParams(GetSignTemplatesQueryParamsBuilder builder) {
    this.marker = builder.marker;
    this.limit = builder.limit;
  }

  public String getMarker() {
    return marker;
  }

  public Long getLimit() {
    return limit;
  }

  public static class GetSignTemplatesQueryParamsBuilder {

    protected String marker;

    protected Long limit;

    public GetSignTemplatesQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetSignTemplatesQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetSignTemplatesQueryParams build() {
      return new GetSignTemplatesQueryParams(this);
    }

  }

}
