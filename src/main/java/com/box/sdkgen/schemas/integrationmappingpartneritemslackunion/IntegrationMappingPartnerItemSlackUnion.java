package com.box.sdkgen.schemas.integrationmappingpartneritemslackunion;

import com.box.sdkgen.internal.OneOfOne;
import com.box.sdkgen.schemas.integrationmappingpartneritemslack.IntegrationMappingPartnerItemSlack;
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
        IntegrationMappingPartnerItemSlackUnion.IntegrationMappingPartnerItemSlackUnionDeserializer
            .class)
@JsonSerialize(using = OneOfOne.OneOfOneSerializer.class)
public class IntegrationMappingPartnerItemSlackUnion
    extends OneOfOne<IntegrationMappingPartnerItemSlack> {

  public IntegrationMappingPartnerItemSlackUnion(
      IntegrationMappingPartnerItemSlack integrationMappingPartnerItemSlack) {
    super(integrationMappingPartnerItemSlack);
  }

  public IntegrationMappingPartnerItemSlack getIntegrationMappingPartnerItemSlack() {
    return value0;
  }

  static class IntegrationMappingPartnerItemSlackUnionDeserializer
      extends JsonDeserializer<IntegrationMappingPartnerItemSlackUnion> {

    public IntegrationMappingPartnerItemSlackUnionDeserializer() {
      super();
    }

    @Override
    public IntegrationMappingPartnerItemSlackUnion deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException {
      JsonNode node = JsonManager.jsonToSerializedData(jp);
      JsonNode discriminant0 = node.get("type");
      if (!(discriminant0 == null)) {
        switch (discriminant0.asText()) {
          case "channel":
            return new IntegrationMappingPartnerItemSlackUnion(
                JsonManager.deserialize(node, IntegrationMappingPartnerItemSlack.class));
        }
      }
      throw new JsonMappingException(
          jp, "Unable to deserialize IntegrationMappingPartnerItemSlackUnion");
    }
  }
}
