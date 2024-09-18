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

public class RestoreFileFromTrashQueryParams {

  public List<String> fields;

  public RestoreFileFromTrashQueryParams() {
  }

  protected RestoreFileFromTrashQueryParams(RestoreFileFromTrashQueryParamsBuilder builder) {
    this.fields = builder.fields;
  }

  public List<String> getFields() {
    return fields;
  }

  public static class RestoreFileFromTrashQueryParamsBuilder {

    protected List<String> fields;

    public RestoreFileFromTrashQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public RestoreFileFromTrashQueryParams build() {
      return new RestoreFileFromTrashQueryParams(this);
    }

  }

}
