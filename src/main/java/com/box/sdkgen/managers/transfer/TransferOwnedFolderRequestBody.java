package com.box.sdkgen.managers.transfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.folderfull.FolderFull;
import com.box.sdkgen.schemas.clienterror.ClientError;
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

public class TransferOwnedFolderRequestBody {

  @JsonProperty("owned_by")
  protected final TransferOwnedFolderRequestBodyOwnedByField ownedBy;

  public TransferOwnedFolderRequestBody(@JsonProperty("owned_by") TransferOwnedFolderRequestBodyOwnedByField ownedBy) {
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
    return Objects.hash(
      ownedBy
    );
  }

  @Override
  public String toString() {
    return "TransferOwnedFolderRequestBody{" + "ownedBy='" + ownedBy + '\'' + "}";
  }

}
