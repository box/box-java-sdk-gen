package com.box.sdkgen.managers.folderlocks;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.folderlocks.FolderLocks;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.folderlock.FolderLock;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;

public class CreateFolderLockRequestBodyLockedOperationsField {

  protected final boolean move;

  protected final boolean delete;

  public CreateFolderLockRequestBodyLockedOperationsField(@JsonProperty("move") boolean move, @JsonProperty("delete") boolean delete) {
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
    CreateFolderLockRequestBodyLockedOperationsField casted = (CreateFolderLockRequestBodyLockedOperationsField) o;
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
    return "CreateFolderLockRequestBodyLockedOperationsField{" + "move='" + move + '\'' + ", " + "delete='" + delete + '\'' + "}";
  }

}
