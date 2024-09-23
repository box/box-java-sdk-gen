package com.box.sdkgen.schemas.shieldinformationbarrierreference;

import com.box.sdkgen.schemas.shieldinformationbarrierbase.ShieldInformationBarrierBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class ShieldInformationBarrierReference {

  @JsonProperty("shield_information_barrier")
  protected ShieldInformationBarrierBase shieldInformationBarrier;

  public ShieldInformationBarrierReference() {}

  protected ShieldInformationBarrierReference(ShieldInformationBarrierReferenceBuilder builder) {
    this.shieldInformationBarrier = builder.shieldInformationBarrier;
  }

  public ShieldInformationBarrierBase getShieldInformationBarrier() {
    return shieldInformationBarrier;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShieldInformationBarrierReference casted = (ShieldInformationBarrierReference) o;
    return Objects.equals(shieldInformationBarrier, casted.shieldInformationBarrier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shieldInformationBarrier);
  }

  @Override
  public String toString() {
    return "ShieldInformationBarrierReference{"
        + "shieldInformationBarrier='"
        + shieldInformationBarrier
        + '\''
        + "}";
  }

  public static class ShieldInformationBarrierReferenceBuilder {

    protected ShieldInformationBarrierBase shieldInformationBarrier;

    public ShieldInformationBarrierReferenceBuilder shieldInformationBarrier(
        ShieldInformationBarrierBase shieldInformationBarrier) {
      this.shieldInformationBarrier = shieldInformationBarrier;
      return this;
    }

    public ShieldInformationBarrierReference build() {
      return new ShieldInformationBarrierReference(this);
    }
  }
}
