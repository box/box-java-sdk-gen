package com.box.sdkgen.managers.signrequests;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.signrequest.SignRequest;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.signrequests.SignRequests;
import com.box.sdkgen.schemas.signrequestcreaterequest.SignRequestCreateRequest;
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

public class GetSignRequestByIdHeaders {

  public Map<String, String> extraHeaders;

  public GetSignRequestByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetSignRequestByIdHeaders(GetSignRequestByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetSignRequestByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetSignRequestByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetSignRequestByIdHeaders build() {
      return new GetSignRequestByIdHeaders(this);
    }

  }

}
