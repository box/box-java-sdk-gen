package com.box.sdkgen.schemas.webhookmini;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class WebhookMini extends SerializableObject {

  protected String id;

  @JsonDeserialize(using = WebhookMiniTypeField.WebhookMiniTypeFieldDeserializer.class)
  @JsonSerialize(using = WebhookMiniTypeField.WebhookMiniTypeFieldSerializer.class)
  protected EnumWrapper<WebhookMiniTypeField> type;

  protected WebhookMiniTargetField target;

  public WebhookMini() {
    super();
  }

  protected WebhookMini(WebhookMiniBuilder builder) {
    super();
    this.id = builder.id;
    this.type = builder.type;
    this.target = builder.target;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<WebhookMiniTypeField> getType() {
    return type;
  }

  public WebhookMiniTargetField getTarget() {
    return target;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookMini casted = (WebhookMini) o;
    return Objects.equals(id, casted.id)
        && Objects.equals(type, casted.type)
        && Objects.equals(target, casted.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, target);
  }

  @Override
  public String toString() {
    return "WebhookMini{"
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
        + "}";
  }

  public static class WebhookMiniBuilder {

    protected String id;

    protected EnumWrapper<WebhookMiniTypeField> type;

    protected WebhookMiniTargetField target;

    public WebhookMiniBuilder id(String id) {
      this.id = id;
      return this;
    }

    public WebhookMiniBuilder type(WebhookMiniTypeField type) {
      this.type = new EnumWrapper<WebhookMiniTypeField>(type);
      return this;
    }

    public WebhookMiniBuilder type(EnumWrapper<WebhookMiniTypeField> type) {
      this.type = type;
      return this;
    }

    public WebhookMiniBuilder target(WebhookMiniTargetField target) {
      this.target = target;
      return this;
    }

    public WebhookMini build() {
      return new WebhookMini(this);
    }
  }
}
