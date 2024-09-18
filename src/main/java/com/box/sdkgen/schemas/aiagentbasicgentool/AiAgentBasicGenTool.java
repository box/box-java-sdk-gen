package com.box.sdkgen.schemas.aiagentbasicgentool;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.aillmendpointparamsgoogleoraillmendpointparamsopenai.AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi;
import com.box.sdkgen.schemas.aiagentbasictexttoolbase.AiAgentBasicTextToolBase;
import com.box.sdkgen.schemas.aiagentbasictexttooltextgen.AiAgentBasicTextToolTextGen;
import com.box.sdkgen.schemas.aiagentlongtexttooltextgen.AiAgentLongTextToolTextGenEmbeddingsField;
import com.box.sdkgen.schemas.aiagentlongtexttooltextgen.AiAgentLongTextToolTextGen;

public class AiAgentBasicGenTool extends AiAgentLongTextToolTextGen {

  @JsonProperty("content_template")
  protected String contentTemplate;

  public AiAgentBasicGenTool() {
    super();
  }

  protected AiAgentBasicGenTool(AiAgentBasicGenToolBuilder builder) {
    super(builder);
    this.contentTemplate = builder.contentTemplate;
  }

  public String getContentTemplate() {
    return contentTemplate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAgentBasicGenTool casted = (AiAgentBasicGenTool) o;
    return Objects.equals(model, casted.model) &&
      Objects.equals(numTokensForCompletion, casted.numTokensForCompletion) &&
      Objects.equals(llmEndpointParams, casted.llmEndpointParams) &&
      Objects.equals(systemMessage, casted.systemMessage) &&
      Objects.equals(promptTemplate, casted.promptTemplate) &&
      Objects.equals(embeddings, casted.embeddings) &&
      Objects.equals(contentTemplate, casted.contentTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      model, numTokensForCompletion, llmEndpointParams, systemMessage, promptTemplate, embeddings, contentTemplate
    );
  }

  @Override
  public String toString() {
    return "AiAgentBasicGenTool{" + "model='" + model + '\'' + ", " + "numTokensForCompletion='" + numTokensForCompletion + '\'' + ", " + "llmEndpointParams='" + llmEndpointParams + '\'' + ", " + "systemMessage='" + systemMessage + '\'' + ", " + "promptTemplate='" + promptTemplate + '\'' + ", " + "embeddings='" + embeddings + '\'' + ", " + "contentTemplate='" + contentTemplate + '\'' + "}";
  }

  public static class AiAgentBasicGenToolBuilder extends AiAgentLongTextToolTextGenBuilder {

    protected String contentTemplate;

    public AiAgentBasicGenToolBuilder contentTemplate(String contentTemplate) {
      this.contentTemplate = contentTemplate;
      return this;
    }

    @Override
    public AiAgentBasicGenToolBuilder model(String model) {
      this.model = model;
      return this;
    }

    @Override
    public AiAgentBasicGenToolBuilder numTokensForCompletion(Long numTokensForCompletion) {
      this.numTokensForCompletion = numTokensForCompletion;
      return this;
    }

    @Override
    public AiAgentBasicGenToolBuilder llmEndpointParams(AiLlmEndpointParamsGoogleOrAiLlmEndpointParamsOpenAi llmEndpointParams) {
      this.llmEndpointParams = llmEndpointParams;
      return this;
    }

    @Override
    public AiAgentBasicGenToolBuilder systemMessage(String systemMessage) {
      this.systemMessage = systemMessage;
      return this;
    }

    @Override
    public AiAgentBasicGenToolBuilder promptTemplate(String promptTemplate) {
      this.promptTemplate = promptTemplate;
      return this;
    }

    @Override
    public AiAgentBasicGenToolBuilder embeddings(AiAgentLongTextToolTextGenEmbeddingsField embeddings) {
      this.embeddings = embeddings;
      return this;
    }

    public AiAgentBasicGenTool build() {
      return new AiAgentBasicGenTool(this);
    }

  }

}
