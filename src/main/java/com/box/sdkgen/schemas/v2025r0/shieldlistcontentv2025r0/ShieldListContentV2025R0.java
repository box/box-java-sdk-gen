package com.box.sdkgen.schemas.v2025r0.shieldlistcontentv2025r0;

import com.box.sdkgen.internal.OneOfFive;
import com.box.sdkgen.schemas.v2025r0.shieldlistcontentcountryv2025r0.ShieldListContentCountryV2025R0;
import com.box.sdkgen.schemas.v2025r0.shieldlistcontentdomainv2025r0.ShieldListContentDomainV2025R0;
import com.box.sdkgen.schemas.v2025r0.shieldlistcontentemailv2025r0.ShieldListContentEmailV2025R0;
import com.box.sdkgen.schemas.v2025r0.shieldlistcontentintegrationv2025r0.ShieldListContentIntegrationV2025R0;
import com.box.sdkgen.schemas.v2025r0.shieldlistcontentipv2025r0.ShieldListContentIpV2025R0;
import com.box.sdkgen.serialization.json.JsonManager;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;

@JsonDeserialize(using = ShieldListContentV2025R0.ShieldListContentV2025R0Deserializer.class)
@JsonSerialize(using = OneOfFive.OneOfFiveSerializer.class)
public class ShieldListContentV2025R0
    extends OneOfFive<
        ShieldListContentCountryV2025R0,
        ShieldListContentDomainV2025R0,
        ShieldListContentEmailV2025R0,
        ShieldListContentIpV2025R0,
        ShieldListContentIntegrationV2025R0> {

  public ShieldListContentV2025R0(ShieldListContentCountryV2025R0 shieldListContentCountryV2025R0) {
    super(shieldListContentCountryV2025R0, null, null, null, null);
  }

  public ShieldListContentV2025R0(ShieldListContentDomainV2025R0 shieldListContentDomainV2025R0) {
    super(null, shieldListContentDomainV2025R0, null, null, null);
  }

  public ShieldListContentV2025R0(ShieldListContentEmailV2025R0 shieldListContentEmailV2025R0) {
    super(null, null, shieldListContentEmailV2025R0, null, null);
  }

  public ShieldListContentV2025R0(ShieldListContentIpV2025R0 shieldListContentIpV2025R0) {
    super(null, null, null, shieldListContentIpV2025R0, null);
  }

  public ShieldListContentV2025R0(
      ShieldListContentIntegrationV2025R0 shieldListContentIntegrationV2025R0) {
    super(null, null, null, null, shieldListContentIntegrationV2025R0);
  }

  public ShieldListContentCountryV2025R0 getShieldListContentCountryV2025R0() {
    return value0;
  }

  public ShieldListContentDomainV2025R0 getShieldListContentDomainV2025R0() {
    return value1;
  }

  public ShieldListContentEmailV2025R0 getShieldListContentEmailV2025R0() {
    return value2;
  }

  public ShieldListContentIpV2025R0 getShieldListContentIpV2025R0() {
    return value3;
  }

  public ShieldListContentIntegrationV2025R0 getShieldListContentIntegrationV2025R0() {
    return value4;
  }

  static class ShieldListContentV2025R0Deserializer
      extends JsonDeserializer<ShieldListContentV2025R0> {

    public ShieldListContentV2025R0Deserializer() {
      super();
    }

    @Override
    public ShieldListContentV2025R0 deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException {
      JsonNode node = JsonManager.jsonToSerializedData(jp);
      JsonNode discriminant0 = node.get("type");
      if (!(discriminant0 == null)) {
        switch (discriminant0.asText()) {
          case "country":
            return new ShieldListContentV2025R0(
                JsonManager.deserialize(node, ShieldListContentCountryV2025R0.class));
          case "domain":
            return new ShieldListContentV2025R0(
                JsonManager.deserialize(node, ShieldListContentDomainV2025R0.class));
          case "email":
            return new ShieldListContentV2025R0(
                JsonManager.deserialize(node, ShieldListContentEmailV2025R0.class));
          case "ip":
            return new ShieldListContentV2025R0(
                JsonManager.deserialize(node, ShieldListContentIpV2025R0.class));
          case "integration":
            return new ShieldListContentV2025R0(
                JsonManager.deserialize(node, ShieldListContentIntegrationV2025R0.class));
        }
      }
      throw new JsonMappingException(jp, "Unable to deserialize ShieldListContentV2025R0");
    }
  }
}
