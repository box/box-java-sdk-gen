package com.box.sdkgen.managers.webhooks;

import com.box.sdkgen.internal.SerializableObject;
import java.util.List;
import java.util.Objects;

public class UpdateWebhookByIdRequestBody extends SerializableObject {

  protected UpdateWebhookByIdRequestBodyTargetField target;

  protected String address;

  protected List<UpdateWebhookByIdRequestBodyTriggersField> triggers;

  public UpdateWebhookByIdRequestBody() {
    super();
  }

  protected UpdateWebhookByIdRequestBody(UpdateWebhookByIdRequestBodyBuilder builder) {
    super();
    this.target = builder.target;
    this.address = builder.address;
    this.triggers = builder.triggers;
  }

  public UpdateWebhookByIdRequestBodyTargetField getTarget() {
    return target;
  }

  public String getAddress() {
    return address;
  }

  public List<UpdateWebhookByIdRequestBodyTriggersField> getTriggers() {
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
    UpdateWebhookByIdRequestBody casted = (UpdateWebhookByIdRequestBody) o;
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
    return "UpdateWebhookByIdRequestBody{"
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

  public static class UpdateWebhookByIdRequestBodyBuilder {

    protected UpdateWebhookByIdRequestBodyTargetField target;

    protected String address;

    protected List<UpdateWebhookByIdRequestBodyTriggersField> triggers;

    public UpdateWebhookByIdRequestBodyBuilder target(
        UpdateWebhookByIdRequestBodyTargetField target) {
      this.target = target;
      return this;
    }

    public UpdateWebhookByIdRequestBodyBuilder address(String address) {
      this.address = address;
      return this;
    }

    public UpdateWebhookByIdRequestBodyBuilder triggers(
        List<UpdateWebhookByIdRequestBodyTriggersField> triggers) {
      this.triggers = triggers;
      return this;
    }

    public UpdateWebhookByIdRequestBody build() {
      return new UpdateWebhookByIdRequestBody(this);
    }
  }
}
