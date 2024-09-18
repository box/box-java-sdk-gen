package com.box.sdkgen.schemas.webhookmini;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class WebhookMini {

  protected String id;

  @JsonDeserialize(using = WebhookMiniTypeField.WebhookMiniTypeFieldDeserializer.class)
  @JsonSerialize(using = WebhookMiniTypeField.WebhookMiniTypeFieldSerializer.class)
  protected EnumWrapper<WebhookMiniTypeField> type;

  protected WebhookMiniTargetField target;

  public WebhookMini() {
  }

  protected WebhookMini(WebhookMiniBuilder builder) {
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
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type) &&
      Objects.equals(target, casted.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type, target
    );
  }

  @Override
  public String toString() {
    return "WebhookMini{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + ", " + "target='" + target + '\'' + "}";
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
      this.type = new EnumWrapper<WebhookMiniTypeField>(type.getValue(), type);
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
