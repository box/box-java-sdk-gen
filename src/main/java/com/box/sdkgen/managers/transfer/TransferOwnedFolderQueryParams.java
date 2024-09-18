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

public class TransferOwnedFolderQueryParams {

  public List<String> fields;

  public Boolean notify;

  public TransferOwnedFolderQueryParams() {
  }

  protected TransferOwnedFolderQueryParams(TransferOwnedFolderQueryParamsBuilder builder) {
    this.fields = builder.fields;
    this.notify = builder.notify;
  }

  public List<String> getFields() {
    return fields;
  }

  public Boolean getNotify() {
    return notify;
  }

  public static class TransferOwnedFolderQueryParamsBuilder {

    protected List<String> fields;

    protected Boolean notify;

    public TransferOwnedFolderQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public TransferOwnedFolderQueryParamsBuilder notify(Boolean notify) {
      this.notify = notify;
      return this;
    }

    public TransferOwnedFolderQueryParams build() {
      return new TransferOwnedFolderQueryParams(this);
    }

  }

}
