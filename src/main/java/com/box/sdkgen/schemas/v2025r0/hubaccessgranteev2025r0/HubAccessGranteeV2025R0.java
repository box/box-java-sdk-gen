package com.box.sdkgen.schemas.v2025r0.hubaccessgranteev2025r0;

import com.box.sdkgen.internal.OneOfTwo;
import com.box.sdkgen.schemas.v2025r0.groupminiv2025r0.GroupMiniV2025R0;
import com.box.sdkgen.schemas.v2025r0.hubcollaborationuserv2025r0.HubCollaborationUserV2025R0;
import com.box.sdkgen.serialization.json.JsonManager;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;

@JsonDeserialize(using = HubAccessGranteeV2025R0.HubAccessGranteeV2025R0Deserializer.class)
@JsonSerialize(using = OneOfTwo.OneOfTwoSerializer.class)
public class HubAccessGranteeV2025R0
    extends OneOfTwo<HubCollaborationUserV2025R0, GroupMiniV2025R0> {

  public HubAccessGranteeV2025R0(HubCollaborationUserV2025R0 hubCollaborationUserV2025R0) {
    super(hubCollaborationUserV2025R0, null);
  }

  public HubAccessGranteeV2025R0(GroupMiniV2025R0 groupMiniV2025R0) {
    super(null, groupMiniV2025R0);
  }

  public HubCollaborationUserV2025R0 getHubCollaborationUserV2025R0() {
    return value0;
  }

  public GroupMiniV2025R0 getGroupMiniV2025R0() {
    return value1;
  }

  static class HubAccessGranteeV2025R0Deserializer
      extends JsonDeserializer<HubAccessGranteeV2025R0> {

    public HubAccessGranteeV2025R0Deserializer() {
      super();
    }

    @Override
    public HubAccessGranteeV2025R0 deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException {
      JsonNode node = JsonManager.jsonToSerializedData(jp);
      JsonNode discriminant0 = node.get("type");
      if (!(discriminant0 == null)) {
        switch (discriminant0.asText()) {
          case "user":
            return new HubAccessGranteeV2025R0(
                JsonManager.deserialize(node, HubCollaborationUserV2025R0.class));
          case "group":
            return new HubAccessGranteeV2025R0(
                JsonManager.deserialize(node, GroupMiniV2025R0.class));
        }
      }
      throw new JsonMappingException(jp, "Unable to deserialize HubAccessGranteeV2025R0");
    }
  }
}
