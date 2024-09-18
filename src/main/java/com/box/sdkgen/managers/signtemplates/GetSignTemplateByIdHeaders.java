package com.box.sdkgen.managers.signtemplates;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.signtemplates.SignTemplates;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.signtemplate.SignTemplate;
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

public class GetSignTemplateByIdHeaders {

  public Map<String, String> extraHeaders;

  public GetSignTemplateByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetSignTemplateByIdHeaders(GetSignTemplateByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetSignTemplateByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetSignTemplateByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetSignTemplateByIdHeaders build() {
      return new GetSignTemplateByIdHeaders(this);
    }

  }

}
