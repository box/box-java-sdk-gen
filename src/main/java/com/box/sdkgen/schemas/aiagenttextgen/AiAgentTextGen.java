package com.box.sdkgen.schemas.aiagenttextgen;

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
import com.box.sdkgen.schemas.aiagentbasicgentool.AiAgentBasicGenTool;

public class AiAgentTextGen {

  @JsonDeserialize(using = AiAgentTextGenTypeField.AiAgentTextGenTypeFieldDeserializer.class)
  @JsonSerialize(using = AiAgentTextGenTypeField.AiAgentTextGenTypeFieldSerializer.class)
  protected EnumWrapper<AiAgentTextGenTypeField> type;

  @JsonProperty("basic_gen")
  protected AiAgentBasicGenTool basicGen;

  public AiAgentTextGen() {
    this.type = new EnumWrapper<AiAgentTextGenTypeField>(AiAgentTextGenTypeField.AI_AGENT_TEXT_GEN.getValue(), AiAgentTextGenTypeField.AI_AGENT_TEXT_GEN);
  }

  protected AiAgentTextGen(AiAgentTextGenBuilder builder) {
    this.type = builder.type;
    this.basicGen = builder.basicGen;
  }

  public EnumWrapper<AiAgentTextGenTypeField> getType() {
    return type;
  }

  public AiAgentBasicGenTool getBasicGen() {
    return basicGen;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAgentTextGen casted = (AiAgentTextGen) o;
    return Objects.equals(type, casted.type) &&
      Objects.equals(basicGen, casted.basicGen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, basicGen
    );
  }

  @Override
  public String toString() {
    return "AiAgentTextGen{" + "type='" + type + '\'' + ", " + "basicGen='" + basicGen + '\'' + "}";
  }

  public static class AiAgentTextGenBuilder {

    protected EnumWrapper<AiAgentTextGenTypeField> type;

    protected AiAgentBasicGenTool basicGen;

    public AiAgentTextGenBuilder type(AiAgentTextGenTypeField type) {
      this.type = new EnumWrapper<AiAgentTextGenTypeField>(type.getValue(), type);
      return this;
    }

    public AiAgentTextGenBuilder basicGen(AiAgentBasicGenTool basicGen) {
      this.basicGen = basicGen;
      return this;
    }

    public AiAgentTextGen build() {
      return new AiAgentTextGen(this);
    }

  }

}
