package com.box.sdkgen.schemas.aiextractstructured;

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
import com.box.sdkgen.schemas.aiitembase.AiItemBase;
import com.box.sdkgen.schemas.aiagentextractstructured.AiAgentExtractStructured;

public class AiExtractStructured {

  protected final List<AiItemBase> items;

  @JsonProperty("metadata_template")
  protected AiExtractStructuredMetadataTemplateField metadataTemplate;

  protected List<AiExtractStructuredFieldsField> fields;

  @JsonProperty("ai_agent")
  protected AiAgentExtractStructured aiAgent;

  public AiExtractStructured(@JsonProperty("items") List<AiItemBase> items) {
    this.items = items;
  }

  protected AiExtractStructured(AiExtractStructuredBuilder builder) {
    this.items = builder.items;
    this.metadataTemplate = builder.metadataTemplate;
    this.fields = builder.fields;
    this.aiAgent = builder.aiAgent;
  }

  public List<AiItemBase> getItems() {
    return items;
  }

  public AiExtractStructuredMetadataTemplateField getMetadataTemplate() {
    return metadataTemplate;
  }

  public List<AiExtractStructuredFieldsField> getFields() {
    return fields;
  }

  public AiAgentExtractStructured getAiAgent() {
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
    AiExtractStructured casted = (AiExtractStructured) o;
    return Objects.equals(items, casted.items) &&
      Objects.equals(metadataTemplate, casted.metadataTemplate) &&
      Objects.equals(fields, casted.fields) &&
      Objects.equals(aiAgent, casted.aiAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      items, metadataTemplate, fields, aiAgent
    );
  }

  @Override
  public String toString() {
    return "AiExtractStructured{" + "items='" + items + '\'' + ", " + "metadataTemplate='" + metadataTemplate + '\'' + ", " + "fields='" + fields + '\'' + ", " + "aiAgent='" + aiAgent + '\'' + "}";
  }

  public static class AiExtractStructuredBuilder {

    protected final List<AiItemBase> items;

    protected AiExtractStructuredMetadataTemplateField metadataTemplate;

    protected List<AiExtractStructuredFieldsField> fields;

    protected AiAgentExtractStructured aiAgent;

    public AiExtractStructuredBuilder(List<AiItemBase> items) {
      this.items = items;
    }

    public AiExtractStructuredBuilder metadataTemplate(AiExtractStructuredMetadataTemplateField metadataTemplate) {
      this.metadataTemplate = metadataTemplate;
      return this;
    }

    public AiExtractStructuredBuilder fields(List<AiExtractStructuredFieldsField> fields) {
      this.fields = fields;
      return this;
    }

    public AiExtractStructuredBuilder aiAgent(AiAgentExtractStructured aiAgent) {
      this.aiAgent = aiAgent;
      return this;
    }

    public AiExtractStructured build() {
      return new AiExtractStructured(this);
    }

  }

}
