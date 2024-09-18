package com.box.sdkgen.managers.filerequests;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.filerequest.FileRequest;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.filerequestupdaterequest.FileRequestUpdateRequest;
import com.box.sdkgen.schemas.filerequestcopyrequest.FileRequestCopyRequest;
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

public class UpdateFileRequestByIdHeaders {

  public String ifMatch;

  public Map<String, String> extraHeaders;

  public UpdateFileRequestByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected UpdateFileRequestByIdHeaders(UpdateFileRequestByIdHeadersBuilder builder) {
    this.ifMatch = builder.ifMatch;
    this.extraHeaders = builder.extraHeaders;
  }

  public String getIfMatch() {
    return ifMatch;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class UpdateFileRequestByIdHeadersBuilder {

    protected String ifMatch;

    protected Map<String, String> extraHeaders;

    public UpdateFileRequestByIdHeadersBuilder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    public UpdateFileRequestByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public UpdateFileRequestByIdHeaders build() {
      return new UpdateFileRequestByIdHeaders(this);
    }

  }

}
