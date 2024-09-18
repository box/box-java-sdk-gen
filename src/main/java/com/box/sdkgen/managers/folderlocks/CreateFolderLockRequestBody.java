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

public class CreateFolderLockRequestBody {

  @JsonProperty("locked_operations")
  protected CreateFolderLockRequestBodyLockedOperationsField lockedOperations;

  protected final CreateFolderLockRequestBodyFolderField folder;

  public CreateFolderLockRequestBody(@JsonProperty("folder") CreateFolderLockRequestBodyFolderField folder) {
    this.folder = folder;
  }

  protected CreateFolderLockRequestBody(CreateFolderLockRequestBodyBuilder builder) {
    this.lockedOperations = builder.lockedOperations;
    this.folder = builder.folder;
  }

  public CreateFolderLockRequestBodyLockedOperationsField getLockedOperations() {
    return lockedOperations;
  }

  public CreateFolderLockRequestBodyFolderField getFolder() {
    return folder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFolderLockRequestBody casted = (CreateFolderLockRequestBody) o;
    return Objects.equals(lockedOperations, casted.lockedOperations) &&
      Objects.equals(folder, casted.folder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      lockedOperations, folder
    );
  }

  @Override
  public String toString() {
    return "CreateFolderLockRequestBody{" + "lockedOperations='" + lockedOperations + '\'' + ", " + "folder='" + folder + '\'' + "}";
  }

  public static class CreateFolderLockRequestBodyBuilder {

    protected CreateFolderLockRequestBodyLockedOperationsField lockedOperations;

    protected final CreateFolderLockRequestBodyFolderField folder;

    public CreateFolderLockRequestBodyBuilder(CreateFolderLockRequestBodyFolderField folder) {
      this.folder = folder;
    }

    public CreateFolderLockRequestBodyBuilder lockedOperations(CreateFolderLockRequestBodyLockedOperationsField lockedOperations) {
      this.lockedOperations = lockedOperations;
      return this;
    }

    public CreateFolderLockRequestBody build() {
      return new CreateFolderLockRequestBody(this);
    }

  }

}
