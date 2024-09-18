package com.box.sdkgen.managers.collaborationallowlistexempttargets;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.collaborationallowlistexempttargets.CollaborationAllowlistExemptTargets;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.collaborationallowlistexempttarget.CollaborationAllowlistExemptTarget;
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

public class GetCollaborationWhitelistExemptTargetByIdHeaders {

  public Map<String, String> extraHeaders;

  public GetCollaborationWhitelistExemptTargetByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetCollaborationWhitelistExemptTargetByIdHeaders(GetCollaborationWhitelistExemptTargetByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetCollaborationWhitelistExemptTargetByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetCollaborationWhitelistExemptTargetByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetCollaborationWhitelistExemptTargetByIdHeaders build() {
      return new GetCollaborationWhitelistExemptTargetByIdHeaders(this);
    }

  }

}
