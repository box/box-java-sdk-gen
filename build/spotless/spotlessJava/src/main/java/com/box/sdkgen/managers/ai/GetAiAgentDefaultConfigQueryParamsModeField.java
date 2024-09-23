package com.box.sdkgen.managers.ai;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

public enum GetAiAgentDefaultConfigQueryParamsModeField {
  ASK("ask"),
  TEXT_GEN("text_gen"),
  EXTRACT("extract"),
  EXTRACT_STRUCTURED("extract_structured");

  private final String value;

  GetAiAgentDefaultConfigQueryParamsModeField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static class GetAiAgentDefaultConfigQueryParamsModeFieldDeserializer
      extends JsonDeserializer<EnumWrapper<GetAiAgentDefaultConfigQueryParamsModeField>> {

    public GetAiAgentDefaultConfigQueryParamsModeFieldDeserializer() {
      super();
    }

    @Override
    public EnumWrapper<GetAiAgentDefaultConfigQueryParamsModeField> deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      String value = p.getValueAsString();
      return Arrays.stream(GetAiAgentDefaultConfigQueryParamsModeField.values())
          .filter(v -> v.getValue().equalsIgnoreCase(value))
          .findFirst()
          .map(v -> new EnumWrapper<GetAiAgentDefaultConfigQueryParamsModeField>(value, v))
          .orElse(new EnumWrapper<GetAiAgentDefaultConfigQueryParamsModeField>(value));
    }
  }

  public static class GetAiAgentDefaultConfigQueryParamsModeFieldSerializer
      extends JsonSerializer<EnumWrapper<GetAiAgentDefaultConfigQueryParamsModeField>> {

    public GetAiAgentDefaultConfigQueryParamsModeFieldSerializer() {
      super();
    }

    @Override
    public void serialize(
        EnumWrapper<GetAiAgentDefaultConfigQueryParamsModeField> value,
        JsonGenerator gen,
        SerializerProvider serializers)
        throws IOException {
      gen.writeString(value.getStringValue());
    }
  }
}
