package com.box.sdkgen.managers.integrationmappings;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class UpdateIntegrationMappingTeamsByIdHeaders {

  public Map<String, String> extraHeaders;

  public UpdateIntegrationMappingTeamsByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected UpdateIntegrationMappingTeamsByIdHeaders(
      UpdateIntegrationMappingTeamsByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class UpdateIntegrationMappingTeamsByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public UpdateIntegrationMappingTeamsByIdHeadersBuilder extraHeaders(
        Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public UpdateIntegrationMappingTeamsByIdHeaders build() {
      return new UpdateIntegrationMappingTeamsByIdHeaders(this);
    }
  }
}
