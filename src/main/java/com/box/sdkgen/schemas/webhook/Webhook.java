package com.box.sdkgen.schemas.webhook;

import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.webhookmini.WebhookMini;
import com.box.sdkgen.schemas.webhookmini.WebhookMiniTargetField;
import com.box.sdkgen.schemas.webhookmini.WebhookMiniTypeField;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class Webhook extends WebhookMini {

  @JsonProperty("created_by")
  protected UserMini createdBy;

  @JsonProperty("created_at")
  protected String createdAt;

  protected String address;

  protected List<WebhookTriggersField> triggers;

  public Webhook() {
    super();
  }

  protected Webhook(WebhookBuilder builder) {
    super(builder);
    this.createdBy = builder.createdBy;
    this.createdAt = builder.createdAt;
    this.address = builder.address;
    this.triggers = builder.triggers;
  }

  public UserMini getCreatedBy() {
    return createdBy;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public String getAddress() {
    return address;
  }

  public List<WebhookTriggersField> getTriggers() {
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
    Webhook casted = (Webhook) o;
    return Objects.equals(id, casted.id)
        && Objects.equals(type, casted.type)
        && Objects.equals(target, casted.target)
        && Objects.equals(createdBy, casted.createdBy)
        && Objects.equals(createdAt, casted.createdAt)
        && Objects.equals(address, casted.address)
        && Objects.equals(triggers, casted.triggers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, target, createdBy, createdAt, address, triggers);
  }

  @Override
  public String toString() {
    return "Webhook{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + ", "
        + "target='"
        + target
        + '\''
        + ", "
        + "createdBy='"
        + createdBy
        + '\''
        + ", "
        + "createdAt='"
        + createdAt
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

  public static class WebhookBuilder extends WebhookMiniBuilder {

    protected UserMini createdBy;

    protected String createdAt;

    protected String address;

    protected List<WebhookTriggersField> triggers;

    public WebhookBuilder createdBy(UserMini createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    public WebhookBuilder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public WebhookBuilder address(String address) {
      this.address = address;
      return this;
    }

    public WebhookBuilder triggers(List<WebhookTriggersField> triggers) {
      this.triggers = triggers;
      return this;
    }

    @Override
    public WebhookBuilder id(String id) {
      this.id = id;
      return this;
    }

    @Override
    public WebhookBuilder type(EnumWrapper<WebhookMiniTypeField> type) {
      this.type = type;
      return this;
    }

    @Override
    public WebhookBuilder type(WebhookMiniTypeField type) {
      this.type = new EnumWrapper<WebhookMiniTypeField>(type.getValue(), type);
      return this;
    }

    @Override
    public WebhookBuilder target(WebhookMiniTargetField target) {
      this.target = target;
      return this;
    }

    public Webhook build() {
      return new Webhook(this);
    }
  }
}
