package com.box.sdkgen.schemas.shieldinformationbarrierreportdetails;

import java.util.Objects;

public class ShieldInformationBarrierReportDetails {

  protected ShieldInformationBarrierReportDetailsDetailsField details;

  public ShieldInformationBarrierReportDetails() {}

  protected ShieldInformationBarrierReportDetails(
      ShieldInformationBarrierReportDetailsBuilder builder) {
    this.details = builder.details;
  }

  public ShieldInformationBarrierReportDetailsDetailsField getDetails() {
    return details;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShieldInformationBarrierReportDetails casted = (ShieldInformationBarrierReportDetails) o;
    return Objects.equals(details, casted.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details);
  }

  @Override
  public String toString() {
    return "ShieldInformationBarrierReportDetails{" + "details='" + details + '\'' + "}";
  }

  public static class ShieldInformationBarrierReportDetailsBuilder {

    protected ShieldInformationBarrierReportDetailsDetailsField details;

    public ShieldInformationBarrierReportDetailsBuilder details(
        ShieldInformationBarrierReportDetailsDetailsField details) {
      this.details = details;
      return this;
    }

    public ShieldInformationBarrierReportDetails build() {
      return new ShieldInformationBarrierReportDetails(this);
    }
  }
}
