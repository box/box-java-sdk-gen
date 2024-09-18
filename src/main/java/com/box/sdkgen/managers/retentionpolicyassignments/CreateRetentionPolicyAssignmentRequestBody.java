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

public class CreateRetentionPolicyAssignmentRequestBody {

  @JsonProperty("policy_id")
  protected final String policyId;

  @JsonProperty("assign_to")
  protected final CreateRetentionPolicyAssignmentRequestBodyAssignToField assignTo;

  @JsonProperty("filter_fields")
  protected List<CreateRetentionPolicyAssignmentRequestBodyFilterFieldsField> filterFields;

  @JsonProperty("start_date_field")
  protected String startDateField;

  public CreateRetentionPolicyAssignmentRequestBody(@JsonProperty("policy_id") String policyId, @JsonProperty("assign_to") CreateRetentionPolicyAssignmentRequestBodyAssignToField assignTo) {
    this.policyId = policyId;
    this.assignTo = assignTo;
  }

  protected CreateRetentionPolicyAssignmentRequestBody(CreateRetentionPolicyAssignmentRequestBodyBuilder builder) {
    this.policyId = builder.policyId;
    this.assignTo = builder.assignTo;
    this.filterFields = builder.filterFields;
    this.startDateField = builder.startDateField;
  }

  public String getPolicyId() {
    return policyId;
  }

  public CreateRetentionPolicyAssignmentRequestBodyAssignToField getAssignTo() {
    return assignTo;
  }

  public List<CreateRetentionPolicyAssignmentRequestBodyFilterFieldsField> getFilterFields() {
    return filterFields;
  }

  public String getStartDateField() {
    return startDateField;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRetentionPolicyAssignmentRequestBody casted = (CreateRetentionPolicyAssignmentRequestBody) o;
    return Objects.equals(policyId, casted.policyId) &&
      Objects.equals(assignTo, casted.assignTo) &&
      Objects.equals(filterFields, casted.filterFields) &&
      Objects.equals(startDateField, casted.startDateField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      policyId, assignTo, filterFields, startDateField
    );
  }

  @Override
  public String toString() {
    return "CreateRetentionPolicyAssignmentRequestBody{" + "policyId='" + policyId + '\'' + ", " + "assignTo='" + assignTo + '\'' + ", " + "filterFields='" + filterFields + '\'' + ", " + "startDateField='" + startDateField + '\'' + "}";
  }

  public static class CreateRetentionPolicyAssignmentRequestBodyBuilder {

    protected final String policyId;

    protected final CreateRetentionPolicyAssignmentRequestBodyAssignToField assignTo;

    protected List<CreateRetentionPolicyAssignmentRequestBodyFilterFieldsField> filterFields;

    protected String startDateField;

    public CreateRetentionPolicyAssignmentRequestBodyBuilder(String policyId, CreateRetentionPolicyAssignmentRequestBodyAssignToField assignTo) {
      this.policyId = policyId;
      this.assignTo = assignTo;
    }

    public CreateRetentionPolicyAssignmentRequestBodyBuilder filterFields(List<CreateRetentionPolicyAssignmentRequestBodyFilterFieldsField> filterFields) {
      this.filterFields = filterFields;
      return this;
    }

    public CreateRetentionPolicyAssignmentRequestBodyBuilder startDateField(String startDateField) {
      this.startDateField = startDateField;
      return this;
    }

    public CreateRetentionPolicyAssignmentRequestBody build() {
      return new CreateRetentionPolicyAssignmentRequestBody(this);
    }

  }

}
