package com.box.sdkgen.managers.retentionpolicyassignments;

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
import com.box.sdkgen.schemas.retentionpolicyassignments.RetentionPolicyAssignments;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.retentionpolicyassignment.RetentionPolicyAssignment;
import com.box.sdkgen.schemas.filesunderretention.FilesUnderRetention;
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

public class GetRetentionPolicyAssignmentsQueryParams {

  public EnumWrapper<GetRetentionPolicyAssignmentsQueryParamsTypeField> type;

  public List<String> fields;

  public String marker;

  public Long limit;

  public GetRetentionPolicyAssignmentsQueryParams() {
  }

  protected GetRetentionPolicyAssignmentsQueryParams(GetRetentionPolicyAssignmentsQueryParamsBuilder builder) {
    this.type = builder.type;
    this.fields = builder.fields;
    this.marker = builder.marker;
    this.limit = builder.limit;
  }

  public EnumWrapper<GetRetentionPolicyAssignmentsQueryParamsTypeField> getType() {
    return type;
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

  public static class GetRetentionPolicyAssignmentsQueryParamsBuilder {

    protected EnumWrapper<GetRetentionPolicyAssignmentsQueryParamsTypeField> type;

    protected List<String> fields;

    protected String marker;

    protected Long limit;

    public GetRetentionPolicyAssignmentsQueryParamsBuilder type(GetRetentionPolicyAssignmentsQueryParamsTypeField type) {
      this.type = new EnumWrapper<GetRetentionPolicyAssignmentsQueryParamsTypeField>(type.getValue(), type);
      return this;
    }

    public GetRetentionPolicyAssignmentsQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public GetRetentionPolicyAssignmentsQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetRetentionPolicyAssignmentsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetRetentionPolicyAssignmentsQueryParams build() {
      return new GetRetentionPolicyAssignmentsQueryParams(this);
    }

  }

}
