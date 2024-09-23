package com.box.sdkgen.schemas.aiagentextractstructured;

import com.box.sdkgen.schemas.aiagentbasictexttool.AiAgentBasicTextTool;
import com.box.sdkgen.schemas.aiagentlongtexttool.AiAgentLongTextTool;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class AiAgentExtractStructured {

  @JsonDeserialize(
      using = AiAgentExtractStructuredTypeField.AiAgentExtractStructuredTypeFieldDeserializer.class)
  @JsonSerialize(
      using = AiAgentExtractStructuredTypeField.AiAgentExtractStructuredTypeFieldSerializer.class)
  protected EnumWrapper<AiAgentExtractStructuredTypeField> type;

  @JsonProperty("long_text")
  protected AiAgentLongTextTool longText;

  @JsonProperty("basic_text")
  protected AiAgentBasicTextTool basicText;

  public AiAgentExtractStructured() {
    this.type =
        new EnumWrapper<AiAgentExtractStructuredTypeField>(
            AiAgentExtractStructuredTypeField.AI_AGENT_EXTRACT_STRUCTURED.getValue(),
            AiAgentExtractStructuredTypeField.AI_AGENT_EXTRACT_STRUCTURED);
  }

  protected AiAgentExtractStructured(AiAgentExtractStructuredBuilder builder) {
    this.type = builder.type;
    this.longText = builder.longText;
    this.basicText = builder.basicText;
  }

  public EnumWrapper<AiAgentExtractStructuredTypeField> getType() {
    return type;
  }

  public AiAgentLongTextTool getLongText() {
    return longText;
  }

  public AiAgentBasicTextTool getBasicText() {
    return basicText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAgentExtractStructured casted = (AiAgentExtractStructured) o;
    return Objects.equals(type, casted.type)
        && Objects.equals(longText, casted.longText)
        && Objects.equals(basicText, casted.basicText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, longText, basicText);
  }

  @Override
  public String toString() {
    return "AiAgentExtractStructured{"
        + "type='"
        + type
        + '\''
        + ", "
        + "longText='"
        + longText
        + '\''
        + ", "
        + "basicText='"
        + basicText
        + '\''
        + "}";
  }

  public static class AiAgentExtractStructuredBuilder {

    protected EnumWrapper<AiAgentExtractStructuredTypeField> type;

    protected AiAgentLongTextTool longText;

    protected AiAgentBasicTextTool basicText;

    public AiAgentExtractStructuredBuilder type(AiAgentExtractStructuredTypeField type) {
      this.type = new EnumWrapper<AiAgentExtractStructuredTypeField>(type.getValue(), type);
      return this;
    }

    public AiAgentExtractStructuredBuilder longText(AiAgentLongTextTool longText) {
      this.longText = longText;
      return this;
    }

    public AiAgentExtractStructuredBuilder basicText(AiAgentBasicTextTool basicText) {
      this.basicText = basicText;
      return this;
    }

    public AiAgentExtractStructured build() {
      return new AiAgentExtractStructured(this);
    }
  }
}
