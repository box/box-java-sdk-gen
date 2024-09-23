package com.box.sdkgen.schemas.storagepolicyassignment;

import java.util.Objects;

public class StoragePolicyAssignmentAssignedToField {

  protected String id;

  protected String type;

  public StoragePolicyAssignmentAssignedToField() {}

  protected StoragePolicyAssignmentAssignedToField(
      StoragePolicyAssignmentAssignedToFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public String getType() {
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
    StoragePolicyAssignmentAssignedToField casted = (StoragePolicyAssignmentAssignedToField) o;
    return Objects.equals(id, casted.id) && Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    return "StoragePolicyAssignmentAssignedToField{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + "}";
  }

  public static class StoragePolicyAssignmentAssignedToFieldBuilder {

    protected String id;

    protected String type;

    public StoragePolicyAssignmentAssignedToFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public StoragePolicyAssignmentAssignedToFieldBuilder type(String type) {
      this.type = type;
      return this;
    }

    public StoragePolicyAssignmentAssignedToField build() {
      return new StoragePolicyAssignmentAssignedToField(this);
    }
  }
}
