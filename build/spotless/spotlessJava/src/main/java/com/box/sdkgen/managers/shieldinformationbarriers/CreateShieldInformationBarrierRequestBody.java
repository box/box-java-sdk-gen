package com.box.sdkgen.managers.shieldinformationbarriers;

import com.box.sdkgen.schemas.enterprisebase.EnterpriseBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateShieldInformationBarrierRequestBody {

  protected final EnterpriseBase enterprise;

  public CreateShieldInformationBarrierRequestBody(
      @JsonProperty("enterprise") EnterpriseBase enterprise) {
    this.enterprise = enterprise;
  }

  public EnterpriseBase getEnterprise() {
    return enterprise;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShieldInformationBarrierRequestBody casted =
        (CreateShieldInformationBarrierRequestBody) o;
    return Objects.equals(enterprise, casted.enterprise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enterprise);
  }

  @Override
  public String toString() {
    return "CreateShieldInformationBarrierRequestBody{" + "enterprise='" + enterprise + '\'' + "}";
  }
}
