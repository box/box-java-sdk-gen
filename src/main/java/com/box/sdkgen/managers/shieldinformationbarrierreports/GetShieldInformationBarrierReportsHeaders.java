package com.box.sdkgen.managers.shieldinformationbarrierreports;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class GetShieldInformationBarrierReportsHeaders {

  public Map<String, String> extraHeaders;

  public GetShieldInformationBarrierReportsHeaders() {
    this.extraHeaders = mapOf();
  }

  protected GetShieldInformationBarrierReportsHeaders(
      GetShieldInformationBarrierReportsHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class GetShieldInformationBarrierReportsHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public GetShieldInformationBarrierReportsHeadersBuilder extraHeaders(
        Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public GetShieldInformationBarrierReportsHeaders build() {
      return new GetShieldInformationBarrierReportsHeaders(this);
    }
  }
}
