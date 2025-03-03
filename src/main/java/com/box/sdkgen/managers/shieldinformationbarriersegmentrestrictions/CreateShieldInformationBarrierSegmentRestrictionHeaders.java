package com.box.sdkgen.managers.shieldinformationbarriersegmentrestrictions;

import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;

import java.util.Map;

public class CreateShieldInformationBarrierSegmentRestrictionHeaders {

  public Map<String, String> extraHeaders;

  public CreateShieldInformationBarrierSegmentRestrictionHeaders() {
    this.extraHeaders = mapOf();
  }

  protected CreateShieldInformationBarrierSegmentRestrictionHeaders(
      CreateShieldInformationBarrierSegmentRestrictionHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class CreateShieldInformationBarrierSegmentRestrictionHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public CreateShieldInformationBarrierSegmentRestrictionHeadersBuilder extraHeaders(
        Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public CreateShieldInformationBarrierSegmentRestrictionHeaders build() {
      return new CreateShieldInformationBarrierSegmentRestrictionHeaders(this);
    }
  }
}
