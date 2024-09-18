package com.box.sdkgen.schemas.aiask;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.aiitembase.AiItemBase;
import com.box.sdkgen.schemas.aidialoguehistory.AiDialogueHistory;
import com.box.sdkgen.schemas.aiagentask.AiAgentAsk;

public enum AiAskModeField {
  MULTIPLE_ITEM_QA("multiple_item_qa"),
  SINGLE_ITEM_QA("single_item_qa");

  private final String value;

  AiAskModeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class AiAskModeFieldDeserializer extends JsonDeserializer<EnumWrapper<AiAskModeField>> {

    public AiAskModeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<AiAskModeField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(AiAskModeField.values()).filter(v -> v.getValue().equalsIgnoreCase(value)).findFirst().map(v -> new EnumWrapper<AiAskModeField>(value, v)).orElse(new EnumWrapper<AiAskModeField>(value));
    }

  }

  public static class AiAskModeFieldSerializer extends JsonSerializer<EnumWrapper<AiAskModeField>> {

    public AiAskModeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(EnumWrapper<AiAskModeField> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeString(value.getStringValue());
    }

  }

}
