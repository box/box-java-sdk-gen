package com.box.sdkgen.managers.integrationmappings;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class CreateIntegrationMappingTeamsHeaders {

  public Map<String, String> extraHeaders;

  public CreateIntegrationMappingTeamsHeaders() {
    this.extraHeaders = mapOf();
  }

  protected CreateIntegrationMappingTeamsHeaders(
      CreateIntegrationMappingTeamsHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class CreateIntegrationMappingTeamsHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public CreateIntegrationMappingTeamsHeadersBuilder extraHeaders(
        Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public CreateIntegrationMappingTeamsHeaders build() {
      return new CreateIntegrationMappingTeamsHeaders(this);
    }
  }
}
