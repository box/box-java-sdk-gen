package com.box.sdkgen.managers.fileversionlegalholds;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.fileversionlegalhold.FileVersionLegalHold;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.fileversionlegalholds.FileVersionLegalHolds;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.fasterxml.jackson.databind.JsonNode;

public class GetFileVersionLegalHoldByIdHeaders {

  public Map<String, String> extraHeaders;

  public GetFileVersionLegalHoldByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetFileVersionLegalHoldByIdHeaders(GetFileVersionLegalHoldByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetFileVersionLegalHoldByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetFileVersionLegalHoldByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetFileVersionLegalHoldByIdHeaders build() {
      return new GetFileVersionLegalHoldByIdHeaders(this);
    }

  }

}
