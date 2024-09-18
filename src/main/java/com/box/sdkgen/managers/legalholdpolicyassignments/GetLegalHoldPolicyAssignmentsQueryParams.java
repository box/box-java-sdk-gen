package com.box.sdkgen.managers.legalholdpolicyassignments;

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
import com.box.sdkgen.schemas.legalholdpolicyassignments.LegalHoldPolicyAssignments;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.legalholdpolicyassignment.LegalHoldPolicyAssignment;
import com.box.sdkgen.schemas.filesonhold.FilesOnHold;
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

public class GetLegalHoldPolicyAssignmentsQueryParams {

  public final String policyId;

  public EnumWrapper<GetLegalHoldPolicyAssignmentsQueryParamsAssignToTypeField> assignToType;

  public String assignToId;

  public String marker;

  public Long limit;

  public List<String> fields;

  public GetLegalHoldPolicyAssignmentsQueryParams(String policyId) {
    this.policyId = policyId;
  }

  protected GetLegalHoldPolicyAssignmentsQueryParams(GetLegalHoldPolicyAssignmentsQueryParamsBuilder builder) {
    this.policyId = builder.policyId;
    this.assignToType = builder.assignToType;
    this.assignToId = builder.assignToId;
    this.marker = builder.marker;
    this.limit = builder.limit;
    this.fields = builder.fields;
  }

  public String getPolicyId() {
    return policyId;
  }

  public EnumWrapper<GetLegalHoldPolicyAssignmentsQueryParamsAssignToTypeField> getAssignToType() {
    return assignToType;
  }

  public String getAssignToId() {
    return assignToId;
  }

  public String getMarker() {
    return marker;
  }

  public Long getLimit() {
    return limit;
  }

  public List<String> getFields() {
    return fields;
  }

  public static class GetLegalHoldPolicyAssignmentsQueryParamsBuilder {

    protected final String policyId;

    protected EnumWrapper<GetLegalHoldPolicyAssignmentsQueryParamsAssignToTypeField> assignToType;

    protected String assignToId;

    protected String marker;

    protected Long limit;

    protected List<String> fields;

    public GetLegalHoldPolicyAssignmentsQueryParamsBuilder(String policyId) {
      this.policyId = policyId;
    }

    public GetLegalHoldPolicyAssignmentsQueryParamsBuilder assignToType(GetLegalHoldPolicyAssignmentsQueryParamsAssignToTypeField assignToType) {
      this.assignToType = new EnumWrapper<GetLegalHoldPolicyAssignmentsQueryParamsAssignToTypeField>(assignToType.getValue(), assignToType);
      return this;
    }

    public GetLegalHoldPolicyAssignmentsQueryParamsBuilder assignToId(String assignToId) {
      this.assignToId = assignToId;
      return this;
    }

    public GetLegalHoldPolicyAssignmentsQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetLegalHoldPolicyAssignmentsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetLegalHoldPolicyAssignmentsQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public GetLegalHoldPolicyAssignmentsQueryParams build() {
      return new GetLegalHoldPolicyAssignmentsQueryParams(this);
    }

  }

}
