package com.box.sdkgen.managers.trashedfiles;

import java.util.Objects;
import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.trashfilerestored.TrashFileRestored;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.trashfile.TrashFile;
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

public class RestoreFileFromTrashRequestBody {

  protected String name;

  protected RestoreFileFromTrashRequestBodyParentField parent;

  public RestoreFileFromTrashRequestBody() {
  }

  protected RestoreFileFromTrashRequestBody(RestoreFileFromTrashRequestBodyBuilder builder) {
    this.name = builder.name;
    this.parent = builder.parent;
  }

  public String getName() {
    return name;
  }

  public RestoreFileFromTrashRequestBodyParentField getParent() {
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
    RestoreFileFromTrashRequestBody casted = (RestoreFileFromTrashRequestBody) o;
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
    return "RestoreFileFromTrashRequestBody{" + "name='" + name + '\'' + ", " + "parent='" + parent + '\'' + "}";
  }

  public static class RestoreFileFromTrashRequestBodyBuilder {

    protected String name;

    protected RestoreFileFromTrashRequestBodyParentField parent;

    public RestoreFileFromTrashRequestBodyBuilder name(String name) {
      this.name = name;
      return this;
    }

    public RestoreFileFromTrashRequestBodyBuilder parent(RestoreFileFromTrashRequestBodyParentField parent) {
      this.parent = parent;
      return this;
    }

    public RestoreFileFromTrashRequestBody build() {
      return new RestoreFileFromTrashRequestBody(this);
    }

  }

}
