package com.box.sdkgen.managers.storagepolicyassignments;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateStoragePolicyAssignmentByIdRequestBody {

  @JsonProperty("storage_policy")
  protected final UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyField storagePolicy;

  public UpdateStoragePolicyAssignmentByIdRequestBody(
      @JsonProperty("storage_policy")
          UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyField storagePolicy) {
    this.storagePolicy = storagePolicy;
  }

  public UpdateStoragePolicyAssignmentByIdRequestBodyStoragePolicyField getStoragePolicy() {
    return storagePolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateStoragePolicyAssignmentByIdRequestBody casted =
        (UpdateStoragePolicyAssignmentByIdRequestBody) o;
    return Objects.equals(storagePolicy, casted.storagePolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storagePolicy);
  }

  @Override
  public String toString() {
    return "UpdateStoragePolicyAssignmentByIdRequestBody{"
        + "storagePolicy='"
        + storagePolicy
        + '\''
        + "}";
  }
}
