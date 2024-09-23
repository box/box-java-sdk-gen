package com.box.sdkgen.managers.storagepolicyassignments;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class CreateStoragePolicyAssignmentRequestBodyAssignedToField {

  @JsonDeserialize(
      using =
          CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField
              .CreateStoragePolicyAssignmentRequestBodyAssignedToTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField
              .CreateStoragePolicyAssignmentRequestBodyAssignedToTypeFieldSerializer.class)
  protected final EnumWrapper<CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField> type;

  protected final String id;

  public CreateStoragePolicyAssignmentRequestBodyAssignedToField(
      @JsonProperty("type")
          EnumWrapper<CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField> type,
      @JsonProperty("id") String id) {
    this.type = type;
    this.id = id;
  }

  public CreateStoragePolicyAssignmentRequestBodyAssignedToField(
      CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField type, String id) {
    this.type =
        new EnumWrapper<CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField>(
            type.getValue(), type);
    this.id = id;
  }

  public EnumWrapper<CreateStoragePolicyAssignmentRequestBodyAssignedToTypeField> getType() {
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
    CreateStoragePolicyAssignmentRequestBodyAssignedToField casted =
        (CreateStoragePolicyAssignmentRequestBodyAssignedToField) o;
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "CreateStoragePolicyAssignmentRequestBodyAssignedToField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + "}";
  }
}
