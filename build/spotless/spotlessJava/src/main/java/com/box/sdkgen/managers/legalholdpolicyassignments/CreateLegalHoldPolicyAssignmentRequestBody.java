package com.box.sdkgen.managers.legalholdpolicyassignments;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateLegalHoldPolicyAssignmentRequestBody {

  @JsonProperty("policy_id")
  protected final String policyId;

  @JsonProperty("assign_to")
  protected final CreateLegalHoldPolicyAssignmentRequestBodyAssignToField assignTo;

  public CreateLegalHoldPolicyAssignmentRequestBody(
      @JsonProperty("policy_id") String policyId,
      @JsonProperty("assign_to") CreateLegalHoldPolicyAssignmentRequestBodyAssignToField assignTo) {
    this.policyId = policyId;
    this.assignTo = assignTo;
  }

  public String getPolicyId() {
    return policyId;
  }

  public CreateLegalHoldPolicyAssignmentRequestBodyAssignToField getAssignTo() {
    return assignTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLegalHoldPolicyAssignmentRequestBody casted =
        (CreateLegalHoldPolicyAssignmentRequestBody) o;
    return Objects.equals(policyId, casted.policyId) && Objects.equals(assignTo, casted.assignTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, assignTo);
  }

  @Override
  public String toString() {
    return "CreateLegalHoldPolicyAssignmentRequestBody{"
        + "policyId='"
        + policyId
        + '\''
        + ", "
        + "assignTo='"
        + assignTo
        + '\''
        + "}";
  }
}
