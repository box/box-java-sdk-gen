package com.box.sdkgen.managers.integrationmappings;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class DeleteIntegrationMappingTeamsByIdHeaders {

  public Map<String, String> extraHeaders;

  public DeleteIntegrationMappingTeamsByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected DeleteIntegrationMappingTeamsByIdHeaders(
      DeleteIntegrationMappingTeamsByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class DeleteIntegrationMappingTeamsByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public DeleteIntegrationMappingTeamsByIdHeadersBuilder extraHeaders(
        Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public DeleteIntegrationMappingTeamsByIdHeaders build() {
      return new DeleteIntegrationMappingTeamsByIdHeaders(this);
    }
  }
}
