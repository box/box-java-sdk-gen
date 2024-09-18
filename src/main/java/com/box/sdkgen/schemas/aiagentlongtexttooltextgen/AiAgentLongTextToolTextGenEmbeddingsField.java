package com.box.sdkgen.schemas.aiagentlongtexttooltextgen;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.aillmendpointparamsgoogleoraillmendpointparamsopenai.AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi;
import com.box.sdkgen.schemas.aiagentbasictexttoolbase.AiAgentBasicTextToolBase;
import com.box.sdkgen.schemas.aiagentbasictexttooltextgen.AiAgentBasicTextToolTextGen;

public class AiAgentLongTextToolTextGenEmbeddingsField {

  protected String model;

  protected AiAgentLongTextToolTextGenEmbeddingsStrategyField strategy;

  public AiAgentLongTextToolTextGenEmbeddingsField() {
  }

  protected AiAgentLongTextToolTextGenEmbeddingsField(AiAgentLongTextToolTextGenEmbeddingsFieldBuilder builder) {
    this.model = builder.model;
    this.strategy = builder.strategy;
  }

  public String getModel() {
    return model;
  }

  public AiAgentLongTextToolTextGenEmbeddingsStrategyField getStrategy() {
    return strategy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAgentLongTextToolTextGenEmbeddingsField casted = (AiAgentLongTextToolTextGenEmbeddingsField) o;
    return Objects.equals(model, casted.model) &&
      Objects.equals(strategy, casted.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      model, strategy
    );
  }

  @Override
  public String toString() {
    return "AiAgentLongTextToolTextGenEmbeddingsField{" + "model='" + model + '\'' + ", " + "strategy='" + strategy + '\'' + "}";
  }

  public static class AiAgentLongTextToolTextGenEmbeddingsFieldBuilder {

    protected String model;

    protected AiAgentLongTextToolTextGenEmbeddingsStrategyField strategy;

    public AiAgentLongTextToolTextGenEmbeddingsFieldBuilder model(String model) {
      this.model = model;
      return this;
    }

    public AiAgentLongTextToolTextGenEmbeddingsFieldBuilder strategy(AiAgentLongTextToolTextGenEmbeddingsStrategyField strategy) {
      this.strategy = strategy;
      return this;
    }

    public AiAgentLongTextToolTextGenEmbeddingsField build() {
      return new AiAgentLongTextToolTextGenEmbeddingsField(this);
    }

  }

}
