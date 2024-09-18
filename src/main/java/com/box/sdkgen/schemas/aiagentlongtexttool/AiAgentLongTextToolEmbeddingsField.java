package com.box.sdkgen.schemas.aiagentlongtexttool;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.aillmendpointparamsgoogleoraillmendpointparamsopenai.AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi;
import com.box.sdkgen.schemas.aiagentbasictexttoolbase.AiAgentBasicTextToolBase;
import com.box.sdkgen.schemas.aiagentbasictexttool.AiAgentBasicTextTool;

public class AiAgentLongTextToolEmbeddingsField {

  protected String model;

  protected AiAgentLongTextToolEmbeddingsStrategyField strategy;

  public AiAgentLongTextToolEmbeddingsField() {
  }

  protected AiAgentLongTextToolEmbeddingsField(AiAgentLongTextToolEmbeddingsFieldBuilder builder) {
    this.model = builder.model;
    this.strategy = builder.strategy;
  }

  public String getModel() {
    return model;
  }

  public AiAgentLongTextToolEmbeddingsStrategyField getStrategy() {
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
    AiAgentLongTextToolEmbeddingsField casted = (AiAgentLongTextToolEmbeddingsField) o;
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
    return "AiAgentLongTextToolEmbeddingsField{" + "model='" + model + '\'' + ", " + "strategy='" + strategy + '\'' + "}";
  }

  public static class AiAgentLongTextToolEmbeddingsFieldBuilder {

    protected String model;

    protected AiAgentLongTextToolEmbeddingsStrategyField strategy;

    public AiAgentLongTextToolEmbeddingsFieldBuilder model(String model) {
      this.model = model;
      return this;
    }

    public AiAgentLongTextToolEmbeddingsFieldBuilder strategy(AiAgentLongTextToolEmbeddingsStrategyField strategy) {
      this.strategy = strategy;
      return this;
    }

    public AiAgentLongTextToolEmbeddingsField build() {
      return new AiAgentLongTextToolEmbeddingsField(this);
    }

  }

}
