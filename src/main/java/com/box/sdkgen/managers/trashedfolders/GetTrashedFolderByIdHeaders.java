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

public class GetTrashedFolderByIdHeaders {

  public Map<String, String> extraHeaders;

  public GetTrashedFolderByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetTrashedFolderByIdHeaders(GetTrashedFolderByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetTrashedFolderByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetTrashedFolderByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetTrashedFolderByIdHeaders build() {
      return new GetTrashedFolderByIdHeaders(this);
    }

  }

}
