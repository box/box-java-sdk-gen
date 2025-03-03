package com.box.sdkgen.managers.retentionpolicyassignments;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class CreateRetentionPolicyAssignmentRequestBodyAssignToField extends SerializableObject {

  @JsonDeserialize(
      using =
          CreateRetentionPolicyAssignmentRequestBodyAssignToTypeField
              .CreateRetentionPolicyAssignmentRequestBodyAssignToTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          CreateRetentionPolicyAssignmentRequestBodyAssignToTypeField
              .CreateRetentionPolicyAssignmentRequestBodyAssignToTypeFieldSerializer.class)
  protected final EnumWrapper<CreateRetentionPolicyAssignmentRequestBodyAssignToTypeField> type;

  protected String id;

  public CreateRetentionPolicyAssignmentRequestBodyAssignToField(
      @JsonProperty("type")
          EnumWrapper<CreateRetentionPolicyAssignmentRequestBodyAssignToTypeField> type) {
    super();
    this.type = type;
  }

  public CreateRetentionPolicyAssignmentRequestBodyAssignToField(
      CreateRetentionPolicyAssignmentRequestBodyAssignToTypeField type) {
    super();
    this.type = new EnumWrapper<CreateRetentionPolicyAssignmentRequestBodyAssignToTypeField>(type);
  }

  protected CreateRetentionPolicyAssignmentRequestBodyAssignToField(
      CreateRetentionPolicyAssignmentRequestBodyAssignToFieldBuilder builder) {
    super();
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<CreateRetentionPolicyAssignmentRequestBodyAssignToTypeField> getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRetentionPolicyAssignmentRequestBodyAssignToField casted =
        (CreateRetentionPolicyAssignmentRequestBodyAssignToField) o;
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "CreateRetentionPolicyAssignmentRequestBodyAssignToField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + "}";
  }

  public static class CreateRetentionPolicyAssignmentRequestBodyAssignToFieldBuilder {

    protected final EnumWrapper<CreateRetentionPolicyAssignmentRequestBodyAssignToTypeField> type;

    protected String id;

    public CreateRetentionPolicyAssignmentRequestBodyAssignToFieldBuilder(
        EnumWrapper<CreateRetentionPolicyAssignmentRequestBodyAssignToTypeField> type) {
      this.type = type;
    }

    public CreateRetentionPolicyAssignmentRequestBodyAssignToFieldBuilder(
        CreateRetentionPolicyAssignmentRequestBodyAssignToTypeField type) {
      this.type =
          new EnumWrapper<CreateRetentionPolicyAssignmentRequestBodyAssignToTypeField>(type);
    }

    public CreateRetentionPolicyAssignmentRequestBodyAssignToFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public CreateRetentionPolicyAssignmentRequestBodyAssignToField build() {
      return new CreateRetentionPolicyAssignmentRequestBodyAssignToField(this);
    }
  }
}
