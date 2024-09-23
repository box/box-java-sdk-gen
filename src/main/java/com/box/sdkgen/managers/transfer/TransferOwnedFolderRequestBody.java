package com.box.sdkgen.managers.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class TransferOwnedFolderRequestBody {

  @JsonProperty("owned_by")
  protected final TransferOwnedFolderRequestBodyOwnedByField ownedBy;

  public TransferOwnedFolderRequestBody(
      @JsonProperty("owned_by") TransferOwnedFolderRequestBodyOwnedByField ownedBy) {
    this.ownedBy = ownedBy;
  }

  public TransferOwnedFolderRequestBodyOwnedByField getOwnedBy() {
    return ownedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferOwnedFolderRequestBody casted = (TransferOwnedFolderRequestBody) o;
    return Objects.equals(ownedBy, casted.ownedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownedBy);
  }

  @Override
  public String toString() {
    return "TransferOwnedFolderRequestBody{" + "ownedBy='" + ownedBy + '\'' + "}";
  }
}
