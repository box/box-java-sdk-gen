package com.box.sdkgen.schemas.aillmendpointparamsgoogleoraillmendpointparamsopenai;

import com.box.sdkgen.internal.OneOfTwo;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.serialization.json.JsonManager;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import com.box.sdkgen.schemas.aillmendpointparamsgoogle.AiLlmEndpointParamsGoogle;
import com.box.sdkgen.schemas.aillmendpointparamsopenai.AiLlmEndpointParamsOpenAi;

@JsonDeserialize(using = AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi.AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAiDeserializer.class)
@JsonSerialize(using = OneOfTwo.OneOfTwoSerializer.class)
public class AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi extends OneOfTwo<AiLlmEndpointParamsGoogle, AiLlmEndpointParamsOpenAi> {

  public AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi(AiLlmEndpointParamsGoogle aiLlmEndpointParamsGoogle) {
    super(aiLlmEndpointParamsGoogle, null);
  }

  public AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi(AiLlmEndpointParamsOpenAi aiLlmEndpointParamsOpenAi) {
    super(null, aiLlmEndpointParamsOpenAi);
  }

  public AiLlmEndpointParamsGoogle getAiLlmEndpointParamsGoogle() {
    return value0;
  }

  public AiLlmEndpointParamsOpenAi getAiLlmEndpointParamsOpenAi() {
    return value1;
  }

  static class AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAiDeserializer extends JsonDeserializer<AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi> {

    public AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAiDeserializer() {
      super();
    }

    @Override
    public AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
      JsonNode node = JsonManager.jsonToSerializedData(jp);
      JsonNode discriminant0 = node.get("type");
      if(!(discriminant0 == null)){
        switch (discriminant0.asText()) {
          case "google_params":
            return new AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi(JsonManager.deserialize(node, AiLlmEndpointParamsGoogle.class));
          case "openai_params":
            return new AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi(JsonManager.deserialize(node, AiLlmEndpointParamsOpenAi.class));
        }
      }
      throw new JsonMappingException(jp, "Unable to deserialize AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi");
    }

  }

}
