package com.box.sdkgen.schemas.aiagentbasictexttooltextgen;

import com.box.sdkgen.schemas.aiagentbasictexttoolbase.AiAgentBasicTextToolBase;
import com.box.sdkgen.schemas.aillmendpointparamsawsoraillmendpointparamsgoogleoraillmendpointparamsopenai.AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class AiAgentBasicTextToolTextGen extends AiAgentBasicTextToolBase {

  @JsonProperty("system_message")
  protected String systemMessage;

  @JsonProperty("prompt_template")
  protected String promptTemplate;

  public AiAgentBasicTextToolTextGen() {
    super();
  }

  protected AiAgentBasicTextToolTextGen(AiAgentBasicTextToolTextGenBuilder builder) {
    super(builder);
    this.systemMessage = builder.systemMessage;
    this.promptTemplate = builder.promptTemplate;
  }

  public String getSystemMessage() {
    return systemMessage;
  }

  public String getPromptTemplate() {
    return promptTemplate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAgentBasicTextToolTextGen casted = (AiAgentBasicTextToolTextGen) o;
    return Objects.equals(model, casted.model)
        && Objects.equals(numTokensForCompletion, casted.numTokensForCompletion)
        && Objects.equals(llmEndpointParams, casted.llmEndpointParams)
        && Objects.equals(systemMessage, casted.systemMessage)
        && Objects.equals(promptTemplate, casted.promptTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        model, numTokensForCompletion, llmEndpointParams, systemMessage, promptTemplate);
  }

  @Override
  public String toString() {
    return "AiAgentBasicTextToolTextGen{"
        + "model='"
        + model
        + '\''
        + ", "
        + "numTokensForCompletion='"
        + numTokensForCompletion
        + '\''
        + ", "
        + "llmEndpointParams='"
        + llmEndpointParams
        + '\''
        + ", "
        + "systemMessage='"
        + systemMessage
        + '\''
        + ", "
        + "promptTemplate='"
        + promptTemplate
        + '\''
        + "}";
  }

  public static class AiAgentBasicTextToolTextGenBuilder extends AiAgentBasicTextToolBaseBuilder {

    protected String systemMessage;

    protected String promptTemplate;

    public AiAgentBasicTextToolTextGenBuilder systemMessage(String systemMessage) {
      this.systemMessage = systemMessage;
      return this;
    }

    public AiAgentBasicTextToolTextGenBuilder promptTemplate(String promptTemplate) {
      this.promptTemplate = promptTemplate;
      return this;
    }

    @Override
    public AiAgentBasicTextToolTextGenBuilder model(String model) {
      this.model = model;
      return this;
    }

    @Override
    public AiAgentBasicTextToolTextGenBuilder numTokensForCompletion(Long numTokensForCompletion) {
      this.numTokensForCompletion = numTokensForCompletion;
      return this;
    }

    @Override
    public AiAgentBasicTextToolTextGenBuilder llmEndpointParams(
        AiLlmEndpointParamsAwsOrAiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi
            llmEndpointParams) {
      this.llmEndpointParams = llmEndpointParams;
      return this;
    }

    public AiAgentBasicTextToolTextGen build() {
      return new AiAgentBasicTextToolTextGen(this);
    }
  }
}
