package com.box.sdkgen.schemas.aiagentextractstructuredoraiagentreference;

import com.box.sdkgen.internal.OneOfTwo;
import com.box.sdkgen.schemas.aiagentextractstructured.AiAgentExtractStructured;
import com.box.sdkgen.schemas.aiagentreference.AiAgentReference;
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
        AiAgentExtractStructuredOrAiAgentReference
            .AiAgentExtractStructuredOrAiAgentReferenceDeserializer.class)
@JsonSerialize(using = OneOfTwo.OneOfTwoSerializer.class)
public class AiAgentExtractStructuredOrAiAgentReference
    extends OneOfTwo<AiAgentExtractStructured, AiAgentReference> {

  public AiAgentExtractStructuredOrAiAgentReference(
      AiAgentExtractStructured aiAgentExtractStructured) {
    super(aiAgentExtractStructured, null);
  }

  public AiAgentExtractStructuredOrAiAgentReference(AiAgentReference aiAgentReference) {
    super(null, aiAgentReference);
  }

  public AiAgentExtractStructured getAiAgentExtractStructured() {
    return value0;
  }

  public AiAgentReference getAiAgentReference() {
    return value1;
  }

  static class AiAgentExtractStructuredOrAiAgentReferenceDeserializer
      extends JsonDeserializer<AiAgentExtractStructuredOrAiAgentReference> {

    public AiAgentExtractStructuredOrAiAgentReferenceDeserializer() {
      super();
    }

    @Override
    public AiAgentExtractStructuredOrAiAgentReference deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException {
      JsonNode node = JsonManager.jsonToSerializedData(jp);
      JsonNode discriminant0 = node.get("type");
      if (!(discriminant0 == null)) {
        switch (discriminant0.asText()) {
          case "ai_agent_extract_structured":
            return new AiAgentExtractStructuredOrAiAgentReference(
                JsonManager.deserialize(node, AiAgentExtractStructured.class));
          case "ai_agent_id":
            return new AiAgentExtractStructuredOrAiAgentReference(
                JsonManager.deserialize(node, AiAgentReference.class));
        }
      }
      throw new JsonMappingException(
          jp, "Unable to deserialize AiAgentExtractStructuredOrAiAgentReference");
    }
  }
}
