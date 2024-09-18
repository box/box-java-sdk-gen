package com.box.sdkgen.schemas.aitextgen;

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
import java.util.List;
import com.box.sdkgen.schemas.aidialoguehistory.AiDialogueHistory;
import com.box.sdkgen.schemas.aiagenttextgen.AiAgentTextGen;

public class AiTextGen {

  protected final String prompt;

  protected final List<AiTextGenItemsField> items;

  @JsonProperty("dialogue_history")
  protected List<AiDialogueHistory> dialogueHistory;

  @JsonProperty("ai_agent")
  protected AiAgentTextGen aiAgent;

  public AiTextGen(@JsonProperty("prompt") String prompt, @JsonProperty("items") List<AiTextGenItemsField> items) {
    this.prompt = prompt;
    this.items = items;
  }

  protected AiTextGen(AiTextGenBuilder builder) {
    this.prompt = builder.prompt;
    this.items = builder.items;
    this.dialogueHistory = builder.dialogueHistory;
    this.aiAgent = builder.aiAgent;
  }

  public String getPrompt() {
    return prompt;
  }

  public List<AiTextGenItemsField> getItems() {
    return items;
  }

  public List<AiDialogueHistory> getDialogueHistory() {
    return dialogueHistory;
  }

  public AiAgentTextGen getAiAgent() {
    return aiAgent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiTextGen casted = (AiTextGen) o;
    return Objects.equals(prompt, casted.prompt) &&
      Objects.equals(items, casted.items) &&
      Objects.equals(dialogueHistory, casted.dialogueHistory) &&
      Objects.equals(aiAgent, casted.aiAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      prompt, items, dialogueHistory, aiAgent
    );
  }

  @Override
  public String toString() {
    return "AiTextGen{" + "prompt='" + prompt + '\'' + ", " + "items='" + items + '\'' + ", " + "dialogueHistory='" + dialogueHistory + '\'' + ", " + "aiAgent='" + aiAgent + '\'' + "}";
  }

  public static class AiTextGenBuilder {

    protected final String prompt;

    protected final List<AiTextGenItemsField> items;

    protected List<AiDialogueHistory> dialogueHistory;

    protected AiAgentTextGen aiAgent;

    public AiTextGenBuilder(String prompt, List<AiTextGenItemsField> items) {
      this.prompt = prompt;
      this.items = items;
    }

    public AiTextGenBuilder dialogueHistory(List<AiDialogueHistory> dialogueHistory) {
      this.dialogueHistory = dialogueHistory;
      return this;
    }

    public AiTextGenBuilder aiAgent(AiAgentTextGen aiAgent) {
      this.aiAgent = aiAgent;
      return this;
    }

    public AiTextGen build() {
      return new AiTextGen(this);
    }

  }

}
