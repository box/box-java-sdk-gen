package com.box.sdkgen.managers.shieldinformationbarriersegments;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class UpdateShieldInformationBarrierSegmentByIdHeaders {

  public Map<String, String> extraHeaders;

  public UpdateShieldInformationBarrierSegmentByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected UpdateShieldInformationBarrierSegmentByIdHeaders(
      UpdateShieldInformationBarrierSegmentByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class UpdateShieldInformationBarrierSegmentByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public UpdateShieldInformationBarrierSegmentByIdHeadersBuilder() {
      this.extraHeaders = mapOf();
    }

    public UpdateShieldInformationBarrierSegmentByIdHeadersBuilder extraHeaders(
        Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public UpdateShieldInformationBarrierSegmentByIdHeaders build() {
      return new UpdateShieldInformationBarrierSegmentByIdHeaders(this);
    }
  }
}
