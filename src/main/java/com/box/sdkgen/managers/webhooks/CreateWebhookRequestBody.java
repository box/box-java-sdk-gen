package com.box.sdkgen.managers.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class CreateWebhookRequestBody {

  protected final CreateWebhookRequestBodyTargetField target;

  protected final String address;

  protected final List<CreateWebhookRequestBodyTriggersField> triggers;

  public CreateWebhookRequestBody(
      @JsonProperty("target") CreateWebhookRequestBodyTargetField target,
      @JsonProperty("address") String address,
      @JsonProperty("triggers") List<CreateWebhookRequestBodyTriggersField> triggers) {
    this.target = target;
    this.address = address;
    this.triggers = triggers;
  }

  public CreateWebhookRequestBodyTargetField getTarget() {
    return target;
  }

  public String getAddress() {
    return address;
  }

  public List<CreateWebhookRequestBodyTriggersField> getTriggers() {
    return triggers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebhookRequestBody casted = (CreateWebhookRequestBody) o;
    return Objects.equals(target, casted.target)
        && Objects.equals(address, casted.address)
        && Objects.equals(triggers, casted.triggers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, address, triggers);
  }

  @Override
  public String toString() {
    return "CreateWebhookRequestBody{"
        + "target='"
        + target
        + '\''
        + ", "
        + "address='"
        + address
        + '\''
        + ", "
        + "triggers='"
        + triggers
        + '\''
        + "}";
  }
}
