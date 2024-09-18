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

public class WebhookMiniTargetField {

  protected String id;

  @JsonDeserialize(using = WebhookMiniTargetTypeField.WebhookMiniTargetTypeFieldDeserializer.class)
  @JsonSerialize(using = WebhookMiniTargetTypeField.WebhookMiniTargetTypeFieldSerializer.class)
  protected EnumWrapper<WebhookMiniTargetTypeField> type;

  public WebhookMiniTargetField() {
  }

  protected WebhookMiniTargetField(WebhookMiniTargetFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<WebhookMiniTargetTypeField> getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookMiniTargetField casted = (WebhookMiniTargetField) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type
    );
  }

  @Override
  public String toString() {
    return "WebhookMiniTargetField{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class WebhookMiniTargetFieldBuilder {

    protected String id;

    protected EnumWrapper<WebhookMiniTargetTypeField> type;

    public WebhookMiniTargetFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public WebhookMiniTargetFieldBuilder type(WebhookMiniTargetTypeField type) {
      this.type = new EnumWrapper<WebhookMiniTargetTypeField>(type.getValue(), type);
      return this;
    }

    public WebhookMiniTargetField build() {
      return new WebhookMiniTargetField(this);
    }

  }

}
