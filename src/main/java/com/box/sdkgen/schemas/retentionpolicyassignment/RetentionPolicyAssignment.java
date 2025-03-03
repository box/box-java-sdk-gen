package com.box.sdkgen.schemas.retentionpolicyassignment;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.schemas.retentionpolicymini.RetentionPolicyMini;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import java.util.Objects;

public class RetentionPolicyAssignment extends SerializableObject {

  protected final String id;

  @JsonDeserialize(
      using =
          RetentionPolicyAssignmentTypeField.RetentionPolicyAssignmentTypeFieldDeserializer.class)
  @JsonSerialize(
      using = RetentionPolicyAssignmentTypeField.RetentionPolicyAssignmentTypeFieldSerializer.class)
  protected EnumWrapper<RetentionPolicyAssignmentTypeField> type;

  @JsonProperty("retention_policy")
  protected RetentionPolicyMini retentionPolicy;

  @JsonProperty("assigned_to")
  protected RetentionPolicyAssignmentAssignedToField assignedTo;

  @JsonProperty("filter_fields")
  protected List<RetentionPolicyAssignmentFilterFieldsField> filterFields;

  @JsonProperty("assigned_by")
  protected UserMini assignedBy;

  @JsonProperty("assigned_at")
  protected String assignedAt;

  @JsonProperty("start_date_field")
  protected String startDateField;

  public RetentionPolicyAssignment(@JsonProperty("id") String id) {
    super();
    this.id = id;
    this.type =
        new EnumWrapper<RetentionPolicyAssignmentTypeField>(
            RetentionPolicyAssignmentTypeField.RETENTION_POLICY_ASSIGNMENT);
  }

  protected RetentionPolicyAssignment(RetentionPolicyAssignmentBuilder builder) {
    super();
    this.id = builder.id;
    this.type = builder.type;
    this.retentionPolicy = builder.retentionPolicy;
    this.assignedTo = builder.assignedTo;
    this.filterFields = builder.filterFields;
    this.assignedBy = builder.assignedBy;
    this.assignedAt = builder.assignedAt;
    this.startDateField = builder.startDateField;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<RetentionPolicyAssignmentTypeField> getType() {
    return type;
  }

  public RetentionPolicyMini getRetentionPolicy() {
    return retentionPolicy;
  }

  public RetentionPolicyAssignmentAssignedToField getAssignedTo() {
    return assignedTo;
  }

  public List<RetentionPolicyAssignmentFilterFieldsField> getFilterFields() {
    return filterFields;
  }

  public UserMini getAssignedBy() {
    return assignedBy;
  }

  public String getAssignedAt() {
    return assignedAt;
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
    RetentionPolicyAssignment casted = (RetentionPolicyAssignment) o;
    return Objects.equals(id, casted.id)
        && Objects.equals(type, casted.type)
        && Objects.equals(retentionPolicy, casted.retentionPolicy)
        && Objects.equals(assignedTo, casted.assignedTo)
        && Objects.equals(filterFields, casted.filterFields)
        && Objects.equals(assignedBy, casted.assignedBy)
        && Objects.equals(assignedAt, casted.assignedAt)
        && Objects.equals(startDateField, casted.startDateField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        type,
        retentionPolicy,
        assignedTo,
        filterFields,
        assignedBy,
        assignedAt,
        startDateField);
  }

  @Override
  public String toString() {
    return "RetentionPolicyAssignment{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + ", "
        + "retentionPolicy='"
        + retentionPolicy
        + '\''
        + ", "
        + "assignedTo='"
        + assignedTo
        + '\''
        + ", "
        + "filterFields='"
        + filterFields
        + '\''
        + ", "
        + "assignedBy='"
        + assignedBy
        + '\''
        + ", "
        + "assignedAt='"
        + assignedAt
        + '\''
        + ", "
        + "startDateField='"
        + startDateField
        + '\''
        + "}";
  }

  public static class RetentionPolicyAssignmentBuilder {

    protected final String id;

    protected EnumWrapper<RetentionPolicyAssignmentTypeField> type;

    protected RetentionPolicyMini retentionPolicy;

    protected RetentionPolicyAssignmentAssignedToField assignedTo;

    protected List<RetentionPolicyAssignmentFilterFieldsField> filterFields;

    protected UserMini assignedBy;

    protected String assignedAt;

    protected String startDateField;

    public RetentionPolicyAssignmentBuilder(String id) {
      this.id = id;
      this.type =
          new EnumWrapper<RetentionPolicyAssignmentTypeField>(
              RetentionPolicyAssignmentTypeField.RETENTION_POLICY_ASSIGNMENT);
    }

    public RetentionPolicyAssignmentBuilder type(RetentionPolicyAssignmentTypeField type) {
      this.type = new EnumWrapper<RetentionPolicyAssignmentTypeField>(type);
      return this;
    }

    public RetentionPolicyAssignmentBuilder type(
        EnumWrapper<RetentionPolicyAssignmentTypeField> type) {
      this.type = type;
      return this;
    }

    public RetentionPolicyAssignmentBuilder retentionPolicy(RetentionPolicyMini retentionPolicy) {
      this.retentionPolicy = retentionPolicy;
      return this;
    }

    public RetentionPolicyAssignmentBuilder assignedTo(
        RetentionPolicyAssignmentAssignedToField assignedTo) {
      this.assignedTo = assignedTo;
      return this;
    }

    public RetentionPolicyAssignmentBuilder filterFields(
        List<RetentionPolicyAssignmentFilterFieldsField> filterFields) {
      this.filterFields = filterFields;
      return this;
    }

    public RetentionPolicyAssignmentBuilder assignedBy(UserMini assignedBy) {
      this.assignedBy = assignedBy;
      return this;
    }

    public RetentionPolicyAssignmentBuilder assignedAt(String assignedAt) {
      this.assignedAt = assignedAt;
      return this;
    }

    public RetentionPolicyAssignmentBuilder startDateField(String startDateField) {
      this.startDateField = startDateField;
      return this;
    }

    public RetentionPolicyAssignment build() {
      return new RetentionPolicyAssignment(this);
    }
  }
}
