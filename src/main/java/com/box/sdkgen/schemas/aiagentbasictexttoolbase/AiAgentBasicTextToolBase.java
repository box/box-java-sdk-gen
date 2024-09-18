package com.box.sdkgen.schemas.aiagentbasictexttoolbase;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.aillmendpointparamsgoogleoraillmendpointparamsopenai.AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi;

public class AiAgentBasicTextToolBase {

  protected String model;

  @JsonProperty("num_tokens_for_completion")
  protected Long numTokensForCompletion;

  @JsonProperty("llm_endpoint_params")
  protected AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi llmEndpointParams;

  public AiAgentBasicTextToolBase() {
  }

  protected AiAgentBasicTextToolBase(AiAgentBasicTextToolBaseBuilder builder) {
    this.model = builder.model;
    this.numTokensForCompletion = builder.numTokensForCompletion;
    this.llmEndpointParams = builder.llmEndpointParams;
  }

  public String getModel() {
    return model;
  }

  public Long getNumTokensForCompletion() {
    return numTokensForCompletion;
  }

  public AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi getLlmEndpointParams() {
    return llmEndpointParams;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAgentBasicTextToolBase casted = (AiAgentBasicTextToolBase) o;
    return Objects.equals(model, casted.model) &&
      Objects.equals(numTokensForCompletion, casted.numTokensForCompletion) &&
      Objects.equals(llmEndpointParams, casted.llmEndpointParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      model, numTokensForCompletion, llmEndpointParams
    );
  }

  @Override
  public String toString() {
    return "AiAgentBasicTextToolBase{" + "model='" + model + '\'' + ", " + "numTokensForCompletion='" + numTokensForCompletion + '\'' + ", " + "llmEndpointParams='" + llmEndpointParams + '\'' + "}";
  }

  public static class AiAgentBasicTextToolBaseBuilder {

    protected String model;

    protected Long numTokensForCompletion;

    protected AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi llmEndpointParams;

    public AiAgentBasicTextToolBaseBuilder model(String model) {
      this.model = model;
      return this;
    }

    public AiAgentBasicTextToolBaseBuilder numTokensForCompletion(Long numTokensForCompletion) {
      this.numTokensForCompletion = numTokensForCompletion;
      return this;
    }

    public AiAgentBasicTextToolBaseBuilder llmEndpointParams(AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi llmEndpointParams) {
      this.llmEndpointParams = llmEndpointParams;
      return this;
    }

    public AiAgentBasicTextToolBase build() {
      return new AiAgentBasicTextToolBase(this);
    }

  }

}
