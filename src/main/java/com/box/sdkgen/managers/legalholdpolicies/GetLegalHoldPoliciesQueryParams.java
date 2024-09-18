package com.box.sdkgen.managers.legalholdpolicies;

import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.legalholdpolicies.LegalHoldPolicies;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.legalholdpolicy.LegalHoldPolicy;
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

public class GetLegalHoldPoliciesQueryParams {

  public String policyName;

  public List<String> fields;

  public String marker;

  public Long limit;

  public GetLegalHoldPoliciesQueryParams() {
  }

  protected GetLegalHoldPoliciesQueryParams(GetLegalHoldPoliciesQueryParamsBuilder builder) {
    this.policyName = builder.policyName;
    this.fields = builder.fields;
    this.marker = builder.marker;
    this.limit = builder.limit;
  }

  public String getPolicyName() {
    return policyName;
  }

  public List<String> getFields() {
    return fields;
  }

  public String getMarker() {
    return marker;
  }

  public Long getLimit() {
    return limit;
  }

  public static class GetLegalHoldPoliciesQueryParamsBuilder {

    protected String policyName;

    protected List<String> fields;

    protected String marker;

    protected Long limit;

    public GetLegalHoldPoliciesQueryParamsBuilder policyName(String policyName) {
      this.policyName = policyName;
      return this;
    }

    public GetLegalHoldPoliciesQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public GetLegalHoldPoliciesQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetLegalHoldPoliciesQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetLegalHoldPoliciesQueryParams build() {
      return new GetLegalHoldPoliciesQueryParams(this);
    }

  }

}
