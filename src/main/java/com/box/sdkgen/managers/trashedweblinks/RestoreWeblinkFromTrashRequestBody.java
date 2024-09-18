package com.box.sdkgen.managers.trashedweblinks;

import java.util.Objects;
import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.trashweblinkrestored.TrashWebLinkRestored;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.trashweblink.TrashWebLink;
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

public class RestoreWeblinkFromTrashRequestBody {

  protected String name;

  protected RestoreWeblinkFromTrashRequestBodyParentField parent;

  public RestoreWeblinkFromTrashRequestBody() {
  }

  protected RestoreWeblinkFromTrashRequestBody(RestoreWeblinkFromTrashRequestBodyBuilder builder) {
    this.name = builder.name;
    this.parent = builder.parent;
  }

  public String getName() {
    return name;
  }

  public RestoreWeblinkFromTrashRequestBodyParentField getParent() {
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
    RestoreWeblinkFromTrashRequestBody casted = (RestoreWeblinkFromTrashRequestBody) o;
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
    return "RestoreWeblinkFromTrashRequestBody{" + "name='" + name + '\'' + ", " + "parent='" + parent + '\'' + "}";
  }

  public static class RestoreWeblinkFromTrashRequestBodyBuilder {

    protected String name;

    protected RestoreWeblinkFromTrashRequestBodyParentField parent;

    public RestoreWeblinkFromTrashRequestBodyBuilder name(String name) {
      this.name = name;
      return this;
    }

    public RestoreWeblinkFromTrashRequestBodyBuilder parent(RestoreWeblinkFromTrashRequestBodyParentField parent) {
      this.parent = parent;
      return this;
    }

    public RestoreWeblinkFromTrashRequestBody build() {
      return new RestoreWeblinkFromTrashRequestBody(this);
    }

  }

}
