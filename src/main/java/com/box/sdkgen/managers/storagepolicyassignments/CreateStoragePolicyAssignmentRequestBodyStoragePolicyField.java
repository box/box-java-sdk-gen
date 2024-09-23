package com.box.sdkgen.managers.storagepolicyassignments;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class CreateStoragePolicyAssignmentRequestBodyStoragePolicyField {

  @JsonDeserialize(
      using =
          CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField
              .CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField
              .CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeFieldSerializer.class)
  protected EnumWrapper<CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField> type;

  protected final String id;

  public CreateStoragePolicyAssignmentRequestBodyStoragePolicyField(@JsonProperty("id") String id) {
    this.id = id;
    this.type =
        new EnumWrapper<CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField>(
            CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField.STORAGE_POLICY
                .getValue(),
            CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField.STORAGE_POLICY);
  }

  protected CreateStoragePolicyAssignmentRequestBodyStoragePolicyField(
      CreateStoragePolicyAssignmentRequestBodyStoragePolicyFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField> getType() {
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
    CreateStoragePolicyAssignmentRequestBodyStoragePolicyField casted =
        (CreateStoragePolicyAssignmentRequestBodyStoragePolicyField) o;
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "CreateStoragePolicyAssignmentRequestBodyStoragePolicyField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + "}";
  }

  public static class CreateStoragePolicyAssignmentRequestBodyStoragePolicyFieldBuilder {

    protected EnumWrapper<CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField> type;

    protected final String id;

    public CreateStoragePolicyAssignmentRequestBodyStoragePolicyFieldBuilder(String id) {
      this.id = id;
      this.type =
          new EnumWrapper<CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField>(
              CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField.STORAGE_POLICY
                  .getValue(),
              CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField.STORAGE_POLICY);
    }

    public CreateStoragePolicyAssignmentRequestBodyStoragePolicyFieldBuilder type(
        CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField type) {
      this.type =
          new EnumWrapper<CreateStoragePolicyAssignmentRequestBodyStoragePolicyTypeField>(
              type.getValue(), type);
      return this;
    }

    public CreateStoragePolicyAssignmentRequestBodyStoragePolicyField build() {
      return new CreateStoragePolicyAssignmentRequestBodyStoragePolicyField(this);
    }
  }
}
