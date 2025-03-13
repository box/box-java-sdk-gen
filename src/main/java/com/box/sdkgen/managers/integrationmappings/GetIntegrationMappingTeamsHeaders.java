package com.box.sdkgen.managers.integrationmappings;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetIntegrationMappingTeamsHeaders {

  public Map<String, String> extraHeaders;

  public GetIntegrationMappingTeamsHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetIntegrationMappingTeamsHeaders(GetIntegrationMappingTeamsHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetIntegrationMappingTeamsHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetIntegrationMappingTeamsHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetIntegrationMappingTeamsHeaders build() {
      return new GetIntegrationMappingTeamsHeaders(this);
    }
  }
}
