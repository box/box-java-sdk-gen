package com.box.sdkgen.schemas.folderlock;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.userbase.UserBase;

public class FolderLockLockedOperationsField {

  protected final boolean move;

  protected final boolean delete;

  public FolderLockLockedOperationsField(@JsonProperty("move") boolean move, @JsonProperty("delete") boolean delete) {
    this.move = move;
    this.delete = delete;
  }

  public boolean getMove() {
    return move;
  }

  public boolean getDelete() {
    return delete;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderLockLockedOperationsField casted = (FolderLockLockedOperationsField) o;
    return Objects.equals(move, casted.move) &&
      Objects.equals(delete, casted.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      move, delete
    );
  }

  @Override
  public String toString() {
    return "FolderLockLockedOperationsField{" + "move='" + move + '\'' + ", " + "delete='" + delete + '\'' + "}";
  }

}
