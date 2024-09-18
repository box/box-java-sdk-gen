package com.box.sdkgen.schemas.webhookinvocation;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.webhook.Webhook;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.fileorfolder.FileOrFolder;

public enum WebhookInvocationTypeField {
  WEBHOOK_EVENT("webhook_event");

  private final String value;

  WebhookInvocationTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class WebhookInvocationTypeFieldDeserializer extends JsonDeserializer<EnumWrapper<WebhookInvocationTypeField>> {

    public WebhookInvocationTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<WebhookInvocationTypeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(WebhookInvocationTypeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<WebhookInvocationTypeField>(value, v)).orElse(new EnumWrapper<WebhookInvocationTypeField>(value));
    }

  }

  public static class WebhookInvocationTypeFieldSerializer extends JsonSerializer<EnumWrapper<WebhookInvocationTypeField>> {

    public WebhookInvocationTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<WebhookInvocationTypeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
