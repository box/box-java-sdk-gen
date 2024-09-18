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

public class RestoreWeblinkFromTrashRequestBodyParentField {

  protected String id;

  public RestoreWeblinkFromTrashRequestBodyParentField() {
  }

  protected RestoreWeblinkFromTrashRequestBodyParentField(RestoreWeblinkFromTrashRequestBodyParentFieldBuilder builder) {
    this.id = builder.id;
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
    RestoreWeblinkFromTrashRequestBodyParentField casted = (RestoreWeblinkFromTrashRequestBodyParentField) o;
    return Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id
    );
  }

  @Override
  public String toString() {
    return "RestoreWeblinkFromTrashRequestBodyParentField{" + "id='" + id + '\'' + "}";
  }

  public static class RestoreWeblinkFromTrashRequestBodyParentFieldBuilder {

    protected String id;

    public RestoreWeblinkFromTrashRequestBodyParentFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public RestoreWeblinkFromTrashRequestBodyParentField build() {
      return new RestoreWeblinkFromTrashRequestBodyParentField(this);
    }

  }

}
