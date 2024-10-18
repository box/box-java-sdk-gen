package com.box.sdkgen.schemas.aiagentextract;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum AiAgentExtractTypeField {
  AI_AGENT_EXTRACT("ai_agent_extract");

  private final String value;

  AiAgentExtractTypeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class AiAgentExtractTypeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<AiAgentExtractTypeField>> {

    public AiAgentExtractTypeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<AiAgentExtractTypeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(AiAgentExtractTypeField.values())
          .filter((v) -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map((v) -> new EnumWrapper<AiAgentExtractTypeField>(value, v))
          .orElse(new EnumWrapper<AiAgentExtractTypeField>(value));
    }
  }

  public static class AiAgentExtractTypeFieldSerializer
      extends JsonSerializer<EnumWrapper<AiAgentExtractTypeField>> {

    public AiAgentExtractTypeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<AiAgentExtractTypeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
