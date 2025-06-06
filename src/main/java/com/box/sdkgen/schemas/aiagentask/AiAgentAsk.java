package com.box.sdkgen.schemas.aiagentask;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.schemas.aiagentbasictexttool.AiAgentBasicTextTool;
import com.box.sdkgen.schemas.aiagentlongtexttool.AiAgentLongTextTool;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class AiAgentAsk extends SerializableObject {

  @JsonDeserialize(using = AiAgentAskTypeField.AiAgentAskTypeFieldDeserializer.class)
  @JsonSerialize(using = AiAgentAskTypeField.AiAgentAskTypeFieldSerializer.class)
  protected EnumWrapper<AiAgentAskTypeField> type;

  @JsonProperty("long_text")
  protected AiAgentLongTextTool longText;

  @JsonProperty("basic_text")
  protected AiAgentBasicTextTool basicText;

  @JsonProperty("long_text_multi")
  protected AiAgentLongTextTool longTextMulti;

  @JsonProperty("basic_text_multi")
  protected AiAgentBasicTextTool basicTextMulti;

  @JsonProperty("basic_image")
  protected AiAgentBasicTextTool basicImage;

  @JsonProperty("basic_image_multi")
  protected AiAgentBasicTextTool basicImageMulti;

  public AiAgentAsk() {
    super();
    this.type = new EnumWrapper<AiAgentAskTypeField>(AiAgentAskTypeField.AI_AGENT_ASK);
  }

  protected AiAgentAsk(AiAgentAskBuilder builder) {
    super();
    this.type = builder.type;
    this.longText = builder.longText;
    this.basicText = builder.basicText;
    this.longTextMulti = builder.longTextMulti;
    this.basicTextMulti = builder.basicTextMulti;
    this.basicImage = builder.basicImage;
    this.basicImageMulti = builder.basicImageMulti;
  }

  public EnumWrapper<AiAgentAskTypeField> getType() {
    return type;
  }

  public AiAgentLongTextTool getLongText() {
    return longText;
  }

  public AiAgentBasicTextTool getBasicText() {
    return basicText;
  }

  public AiAgentLongTextTool getLongTextMulti() {
    return longTextMulti;
  }

  public AiAgentBasicTextTool getBasicTextMulti() {
    return basicTextMulti;
  }

  public AiAgentBasicTextTool getBasicImage() {
    return basicImage;
  }

  public AiAgentBasicTextTool getBasicImageMulti() {
    return basicImageMulti;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAgentAsk casted = (AiAgentAsk) o;
    return Objects.equals(type, casted.type)
        && Objects.equals(longText, casted.longText)
        && Objects.equals(basicText, casted.basicText)
        && Objects.equals(longTextMulti, casted.longTextMulti)
        && Objects.equals(basicTextMulti, casted.basicTextMulti)
        && Objects.equals(basicImage, casted.basicImage)
        && Objects.equals(basicImageMulti, casted.basicImageMulti);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        type, longText, basicText, longTextMulti, basicTextMulti, basicImage, basicImageMulti);
  }

  @Override
  public String toString() {
    return "AiAgentAsk{"
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
        + ", "
        + "longTextMulti='"
        + longTextMulti
        + '\''
        + ", "
        + "basicTextMulti='"
        + basicTextMulti
        + '\''
        + ", "
        + "basicImage='"
        + basicImage
        + '\''
        + ", "
        + "basicImageMulti='"
        + basicImageMulti
        + '\''
        + "}";
  }

  public static class AiAgentAskBuilder {

    protected EnumWrapper<AiAgentAskTypeField> type;

    protected AiAgentLongTextTool longText;

    protected AiAgentBasicTextTool basicText;

    protected AiAgentLongTextTool longTextMulti;

    protected AiAgentBasicTextTool basicTextMulti;

    protected AiAgentBasicTextTool basicImage;

    protected AiAgentBasicTextTool basicImageMulti;

    public AiAgentAskBuilder() {
      this.type = new EnumWrapper<AiAgentAskTypeField>(AiAgentAskTypeField.AI_AGENT_ASK);
    }

    public AiAgentAskBuilder type(AiAgentAskTypeField type) {
      this.type = new EnumWrapper<AiAgentAskTypeField>(type);
      return this;
    }

    public AiAgentAskBuilder type(EnumWrapper<AiAgentAskTypeField> type) {
      this.type = type;
      return this;
    }

    public AiAgentAskBuilder longText(AiAgentLongTextTool longText) {
      this.longText = longText;
      return this;
    }

    public AiAgentAskBuilder basicText(AiAgentBasicTextTool basicText) {
      this.basicText = basicText;
      return this;
    }

    public AiAgentAskBuilder longTextMulti(AiAgentLongTextTool longTextMulti) {
      this.longTextMulti = longTextMulti;
      return this;
    }

    public AiAgentAskBuilder basicTextMulti(AiAgentBasicTextTool basicTextMulti) {
      this.basicTextMulti = basicTextMulti;
      return this;
    }

    public AiAgentAskBuilder basicImage(AiAgentBasicTextTool basicImage) {
      this.basicImage = basicImage;
      return this;
    }

    public AiAgentAskBuilder basicImageMulti(AiAgentBasicTextTool basicImageMulti) {
      this.basicImageMulti = basicImageMulti;
      return this;
    }

    public AiAgentAsk build() {
      return new AiAgentAsk(this);
    }
  }
}
