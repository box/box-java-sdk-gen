package com.box.sdkgen.schemas.aillmendpointparamsopenai;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class AiLlmEndpointParamsOpenAi extends SerializableObject {

  @JsonDeserialize(
      using =
          AiLlmEndpointParamsOpenAiTypeField.AiLlmEndpointParamsOpenAiTypeFieldDeserializer.class)
  @JsonSerialize(
      using = AiLlmEndpointParamsOpenAiTypeField.AiLlmEndpointParamsOpenAiTypeFieldSerializer.class)
  protected EnumWrapper<AiLlmEndpointParamsOpenAiTypeField> type;

  protected Double temperature;

  @JsonProperty("top_p")
  protected Double topP;

  @JsonProperty("frequency_penalty")
  protected Double frequencyPenalty;

  @JsonProperty("presence_penalty")
  protected Double presencePenalty;

  protected String stop;

  public AiLlmEndpointParamsOpenAi() {
    super();
    this.type =
        new EnumWrapper<AiLlmEndpointParamsOpenAiTypeField>(
            AiLlmEndpointParamsOpenAiTypeField.OPENAI_PARAMS);
  }

  protected AiLlmEndpointParamsOpenAi(Builder builder) {
    super();
    this.type = builder.type;
    this.temperature = builder.temperature;
    this.topP = builder.topP;
    this.frequencyPenalty = builder.frequencyPenalty;
    this.presencePenalty = builder.presencePenalty;
    this.stop = builder.stop;
  }

  public EnumWrapper<AiLlmEndpointParamsOpenAiTypeField> getType() {
    return type;
  }

  public Double getTemperature() {
    return temperature;
  }

  public Double getTopP() {
    return topP;
  }

  public Double getFrequencyPenalty() {
    return frequencyPenalty;
  }

  public Double getPresencePenalty() {
    return presencePenalty;
  }

  public String getStop() {
    return stop;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiLlmEndpointParamsOpenAi casted = (AiLlmEndpointParamsOpenAi) o;
    return Objects.equals(type, casted.type)
        && Objects.equals(temperature, casted.temperature)
        && Objects.equals(topP, casted.topP)
        && Objects.equals(frequencyPenalty, casted.frequencyPenalty)
        && Objects.equals(presencePenalty, casted.presencePenalty)
        && Objects.equals(stop, casted.stop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, temperature, topP, frequencyPenalty, presencePenalty, stop);
  }

  @Override
  public String toString() {
    return "AiLlmEndpointParamsOpenAi{"
        + "type='"
        + type
        + '\''
        + ", "
        + "temperature='"
        + temperature
        + '\''
        + ", "
        + "topP='"
        + topP
        + '\''
        + ", "
        + "frequencyPenalty='"
        + frequencyPenalty
        + '\''
        + ", "
        + "presencePenalty='"
        + presencePenalty
        + '\''
        + ", "
        + "stop='"
        + stop
        + '\''
        + "}";
  }

  public static class Builder {

    protected EnumWrapper<AiLlmEndpointParamsOpenAiTypeField> type;

    protected Double temperature;

    protected Double topP;

    protected Double frequencyPenalty;

    protected Double presencePenalty;

    protected String stop;

    public Builder() {
      this.type =
          new EnumWrapper<AiLlmEndpointParamsOpenAiTypeField>(
              AiLlmEndpointParamsOpenAiTypeField.OPENAI_PARAMS);
    }

    public Builder type(AiLlmEndpointParamsOpenAiTypeField type) {
      this.type = new EnumWrapper<AiLlmEndpointParamsOpenAiTypeField>(type);
      return this;
    }

    public Builder type(EnumWrapper<AiLlmEndpointParamsOpenAiTypeField> type) {
      this.type = type;
      return this;
    }

    public Builder temperature(Double temperature) {
      this.temperature = temperature;
      return this;
    }

    public Builder topP(Double topP) {
      this.topP = topP;
      return this;
    }

    public Builder frequencyPenalty(Double frequencyPenalty) {
      this.frequencyPenalty = frequencyPenalty;
      return this;
    }

    public Builder presencePenalty(Double presencePenalty) {
      this.presencePenalty = presencePenalty;
      return this;
    }

    public Builder stop(String stop) {
      this.stop = stop;
      return this;
    }

    public AiLlmEndpointParamsOpenAi build() {
      return new AiLlmEndpointParamsOpenAi(this);
    }
  }
}
