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

public class RestoreWeblinkFromTrashQueryParams {

  public List<String> fields;

  public RestoreWeblinkFromTrashQueryParams() {
  }

  protected RestoreWeblinkFromTrashQueryParams(RestoreWeblinkFromTrashQueryParamsBuilder builder) {
    this.fields = builder.fields;
  }

  public List<String> getFields() {
    return fields;
  }

  public static class RestoreWeblinkFromTrashQueryParamsBuilder {

    protected List<String> fields;

    public RestoreWeblinkFromTrashQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public RestoreWeblinkFromTrashQueryParams build() {
      return new RestoreWeblinkFromTrashQueryParams(this);
    }

  }

}
