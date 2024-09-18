package com.box.sdkgen.managers.emailaliases;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.emailaliases.EmailAliases;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.emailalias.EmailAlias;
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

public class DeleteUserEmailAliasByIdHeaders {

  public Map<String, String> extraHeaders;

  public DeleteUserEmailAliasByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected DeleteUserEmailAliasByIdHeaders(DeleteUserEmailAliasByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class DeleteUserEmailAliasByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public DeleteUserEmailAliasByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public DeleteUserEmailAliasByIdHeaders build() {
      return new DeleteUserEmailAliasByIdHeaders(this);
    }

  }

}
