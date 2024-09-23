package com.box.sdkgen.schemas.retentionpolicyassignmentbase;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class RetentionPolicyAssignmentBase {

  protected final String id;

  @JsonDeserialize(
      using =
          RetentionPolicyAssignmentBaseTypeField.RetentionPolicyAssignmentBaseTypeFieldDeserializer
              .class)
  @JsonSerialize(
      using =
          RetentionPolicyAssignmentBaseTypeField.RetentionPolicyAssignmentBaseTypeFieldSerializer
              .class)
  protected EnumWrapper<RetentionPolicyAssignmentBaseTypeField> type;

  public RetentionPolicyAssignmentBase(@JsonProperty("id") String id) {
    this.id = id;
    this.type =
        new EnumWrapper<RetentionPolicyAssignmentBaseTypeField>(
            RetentionPolicyAssignmentBaseTypeField.RETENTION_POLICY_ASSIGNMENT.getValue(),
            RetentionPolicyAssignmentBaseTypeField.RETENTION_POLICY_ASSIGNMENT);
  }

  protected RetentionPolicyAssignmentBase(RetentionPolicyAssignmentBaseBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<RetentionPolicyAssignmentBaseTypeField> getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionPolicyAssignmentBase casted = (RetentionPolicyAssignmentBase) o;
    return Objects.equals(id, casted.id) && Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    return "RetentionPolicyAssignmentBase{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + "}";
  }

  public static class RetentionPolicyAssignmentBaseBuilder {

    protected final String id;

    protected EnumWrapper<RetentionPolicyAssignmentBaseTypeField> type;

    public RetentionPolicyAssignmentBaseBuilder(String id) {
      this.id = id;
      this.type =
          new EnumWrapper<RetentionPolicyAssignmentBaseTypeField>(
              RetentionPolicyAssignmentBaseTypeField.RETENTION_POLICY_ASSIGNMENT.getValue(),
              RetentionPolicyAssignmentBaseTypeField.RETENTION_POLICY_ASSIGNMENT);
    }

    public RetentionPolicyAssignmentBaseBuilder type(RetentionPolicyAssignmentBaseTypeField type) {
      this.type = new EnumWrapper<RetentionPolicyAssignmentBaseTypeField>(type.getValue(), type);
      return this;
    }

    public RetentionPolicyAssignmentBase build() {
      return new RetentionPolicyAssignmentBase(this);
    }
  }
}
