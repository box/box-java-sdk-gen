package com.box.sdkgen.managers.trashedfolders;

import java.util.Objects;
import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.trashfolderrestored.TrashFolderRestored;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.trashfolder.TrashFolder;
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

public class RestoreFolderFromTrashRequestBody {

  protected String name;

  protected RestoreFolderFromTrashRequestBodyParentField parent;

  public RestoreFolderFromTrashRequestBody() {
  }

  protected RestoreFolderFromTrashRequestBody(RestoreFolderFromTrashRequestBodyBuilder builder) {
    this.name = builder.name;
    this.parent = builder.parent;
  }

  public String getName() {
    return name;
  }

  public RestoreFolderFromTrashRequestBodyParentField getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreFolderFromTrashRequestBody casted = (RestoreFolderFromTrashRequestBody) o;
    return Objects.equals(name, casted.name) &&
      Objects.equals(parent, casted.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      name, parent
    );
  }

  @Override
  public String toString() {
    return "RestoreFolderFromTrashRequestBody{" + "name='" + name + '\'' + ", " + "parent='" + parent + '\'' + "}";
  }

  public static class RestoreFolderFromTrashRequestBodyBuilder {

    protected String name;

    protected RestoreFolderFromTrashRequestBodyParentField parent;

    public RestoreFolderFromTrashRequestBodyBuilder name(String name) {
      this.name = name;
      return this;
    }

    public RestoreFolderFromTrashRequestBodyBuilder parent(RestoreFolderFromTrashRequestBodyParentField parent) {
      this.parent = parent;
      return this;
    }

    public RestoreFolderFromTrashRequestBody build() {
      return new RestoreFolderFromTrashRequestBody(this);
    }

  }

}
