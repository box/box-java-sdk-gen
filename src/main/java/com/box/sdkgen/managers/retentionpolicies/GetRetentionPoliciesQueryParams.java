package com.box.sdkgen.managers.retentionpolicies;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.retentionpolicies.RetentionPolicies;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.retentionpolicy.RetentionPolicy;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.userbase.UserBase;
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

public class GetRetentionPoliciesQueryParams {

  public String policyName;

  public EnumWrapper<GetRetentionPoliciesQueryParamsPolicyTypeField> policyType;

  public String createdByUserId;

  public List<String> fields;

  public Long limit;

  public String marker;

  public GetRetentionPoliciesQueryParams() {
  }

  protected GetRetentionPoliciesQueryParams(GetRetentionPoliciesQueryParamsBuilder builder) {
    this.policyName = builder.policyName;
    this.policyType = builder.policyType;
    this.createdByUserId = builder.createdByUserId;
    this.fields = builder.fields;
    this.limit = builder.limit;
    this.marker = builder.marker;
  }

  public String getPolicyName() {
    return policyName;
  }

  public EnumWrapper<GetRetentionPoliciesQueryParamsPolicyTypeField> getPolicyType() {
    return policyType;
  }

  public String getCreatedByUserId() {
    return createdByUserId;
  }

  public List<String> getFields() {
    return fields;
  }

  public Long getLimit() {
    return limit;
  }

  public String getMarker() {
    return marker;
  }

  public static class GetRetentionPoliciesQueryParamsBuilder {

    protected String policyName;

    protected EnumWrapper<GetRetentionPoliciesQueryParamsPolicyTypeField> policyType;

    protected String createdByUserId;

    protected List<String> fields;

    protected Long limit;

    protected String marker;

    public GetRetentionPoliciesQueryParamsBuilder policyName(String policyName) {
      this.policyName = policyName;
      return this;
    }

    public GetRetentionPoliciesQueryParamsBuilder policyType(GetRetentionPoliciesQueryParamsPolicyTypeField policyType) {
      this.policyType = new EnumWrapper<GetRetentionPoliciesQueryParamsPolicyTypeField>(policyType.getValue(), policyType);
      return this;
    }

    public GetRetentionPoliciesQueryParamsBuilder createdByUserId(String createdByUserId) {
      this.createdByUserId = createdByUserId;
      return this;
    }

    public GetRetentionPoliciesQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public GetRetentionPoliciesQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetRetentionPoliciesQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetRetentionPoliciesQueryParams build() {
      return new GetRetentionPoliciesQueryParams(this);
    }

  }

}
