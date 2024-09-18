package com.box.sdkgen.managers.sessiontermination;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.sessionterminationmessage.SessionTerminationMessage;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;

public class TerminateGroupsSessionsHeaders {

  public Map<String, String> extraHeaders;

  public TerminateGroupsSessionsHeaders() {
    this.extraHeaders = mapOf();
  }

  protected TerminateGroupsSessionsHeaders(TerminateGroupsSessionsHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class TerminateGroupsSessionsHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public TerminateGroupsSessionsHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public TerminateGroupsSessionsHeaders build() {
      return new TerminateGroupsSessionsHeaders(this);
    }

  }

}
