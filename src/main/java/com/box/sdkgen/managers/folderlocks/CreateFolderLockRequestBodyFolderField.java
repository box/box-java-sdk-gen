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

public class CreateFolderLockRequestBodyFolderField {

  protected final String type;

  protected final String id;

  public CreateFolderLockRequestBodyFolderField(@JsonProperty("type") String type, @JsonProperty("id") String id) {
    this.type = type;
    this.id = id;
  }

  public String getType() {
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
    CreateFolderLockRequestBodyFolderField casted = (CreateFolderLockRequestBodyFolderField) o;
    return Objects.equals(type, casted.type) &&
      Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, id
    );
  }

  @Override
  public String toString() {
    return "CreateFolderLockRequestBodyFolderField{" + "type='" + type + '\'' + ", " + "id='" + id + '\'' + "}";
  }

}
