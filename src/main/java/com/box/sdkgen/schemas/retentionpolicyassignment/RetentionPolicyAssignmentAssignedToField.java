package com.box.sdkgen.schemas.retentionpolicyassignment;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class RetentionPolicyAssignmentAssignedToField {

  protected String id;

  @JsonDeserialize(
      using =
          RetentionPolicyAssignmentAssignedToTypeField
              .RetentionPolicyAssignmentAssignedToTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          RetentionPolicyAssignmentAssignedToTypeField
              .RetentionPolicyAssignmentAssignedToTypeFieldSerializer.class)
  protected EnumWrapper<RetentionPolicyAssignmentAssignedToTypeField> type;

  public RetentionPolicyAssignmentAssignedToField() {}

  protected RetentionPolicyAssignmentAssignedToField(
      RetentionPolicyAssignmentAssignedToFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<RetentionPolicyAssignmentAssignedToTypeField> getType() {
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
    RetentionPolicyAssignmentAssignedToField casted = (RetentionPolicyAssignmentAssignedToField) o;
    return Objects.equals(id, casted.id) && Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    return "RetentionPolicyAssignmentAssignedToField{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + "}";
  }

  public static class RetentionPolicyAssignmentAssignedToFieldBuilder {

    protected String id;

    protected EnumWrapper<RetentionPolicyAssignmentAssignedToTypeField> type;

    public RetentionPolicyAssignmentAssignedToFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public RetentionPolicyAssignmentAssignedToFieldBuilder type(
        RetentionPolicyAssignmentAssignedToTypeField type) {
      this.type =
          new EnumWrapper<RetentionPolicyAssignmentAssignedToTypeField>(type.getValue(), type);
      return this;
    }

    public RetentionPolicyAssignmentAssignedToField build() {
      return new RetentionPolicyAssignmentAssignedToField(this);
    }
  }
}
