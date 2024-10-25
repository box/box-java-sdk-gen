package com.box.sdkgen.schemas.aillmendpointparamsawsoraillmendpointparamsgoogleoraillmendpointparamsopenai;

import com.box.sdkgen.internal.OneOfThree;
import com.box.sdkgen.schemas.aillmendpointparamsaws.AiLlmEndpointParamsAws;
import com.box.sdkgen.schemas.aillmendpointparamsgoogle.AiLlmEndpointParamsGoogle;
import com.box.sdkgen.schemas.aillmendpointparamsopenai.AiLlmEndpointParamsOpenAi;
import com.box.sdkgen.serialization.json.JsonManager;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;

@JsonDeserialize(
    using =
        AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi
            .AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAiDeserializer
            .class)
@JsonSerialize(using = OneOfThree.OneOfThreeSerializer.class)
public class AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi
    extends OneOfThree<
        AiLlmEndpointParamsAws, AiLlmEndpointParamsGoogle, AiLlmEndpointParamsOpenAi> {

  public AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi(
      AiLlmEndpointParamsAws aiLlmEndpointParamsAws) {
    super(aiLlmEndpointParamsAws, null, null);
  }

  public AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi(
      AiLlmEndpointParamsGoogle aiLlmEndpointParamsGoogle) {
    super(null, aiLlmEndpointParamsGoogle, null);
  }

  public AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi(
      AiLlmEndpointParamsOpenAi aiLlmEndpointParamsOpenAi) {
    super(null, null, aiLlmEndpointParamsOpenAi);
  }

  public AiLlmEndpointParamsAws getAiLlmEndpointParamsAws() {
    return value0;
  }

  public AiLlmEndpointParamsGoogle getAiLlmEndpointParamsGoogle() {
    return value1;
  }

  public AiLlmEndpointParamsOpenAi getAiLlmEndpointParamsOpenAi() {
    return value2;
  }

  static
  class AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAiDeserializer
      extends JsonDeserializer<
          AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi> {

    public
    AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAiDeserializer() {
      super();
    }

    @Override
    public AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException {
      JsonNode node = JsonManager.jsonToSerializedData(jp);
      JsonNode discriminant0 = node.get("type");
      if (!(discriminant0 == null)) {
        switch (discriminant0.asText()) {
          case "aws_params":
            return new AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi(
                JsonManager.deserialize(node, AiLlmEndpointParamsAws.class));
          case "google_params":
            return new AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi(
                JsonManager.deserialize(node, AiLlmEndpointParamsGoogle.class));
          case "openai_params":
            return new AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi(
                JsonManager.deserialize(node, AiLlmEndpointParamsOpenAi.class));
        }
      }
      throw new JsonMappingException(
          jp,
          "Unable to deserialize AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi");
    }
  }
}
