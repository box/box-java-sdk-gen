package com.box.sdkgen.schemas.aillmendpointparamsgoogle;

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

public class AiLlmEndpointParamsGoogle {

  @JsonDeserialize(using = AiLlmEndpointParamsGoogleTypeField.AiLlmEndpointParamsGoogleTypeFieldDeserializer.class)
  @JsonSerialize(using = AiLlmEndpointParamsGoogleTypeField.AiLlmEndpointParamsGoogleTypeFieldSerializer.class)
  protected EnumWrapper<AiLlmEndpointParamsGoogleTypeField> type;

  protected Double temperature;

  @JsonProperty("top_p")
  protected Double topP;

  @JsonProperty("top_k")
  protected Double topK;

  public AiLlmEndpointParamsGoogle() {
    this.type = new EnumWrapper<AiLlmEndpointParamsGoogleTypeField>(AiLlmEndpointParamsGoogleTypeField.GOOGLE_PARAMS.getValue(), AiLlmEndpointParamsGoogleTypeField.GOOGLE_PARAMS);
  }

  protected AiLlmEndpointParamsGoogle(AiLlmEndpointParamsGoogleBuilder builder) {
    this.type = builder.type;
    this.temperature = builder.temperature;
    this.topP = builder.topP;
    this.topK = builder.topK;
  }

  public EnumWrapper<AiLlmEndpointParamsGoogleTypeField> getType() {
    return type;
  }

  public Double getTemperature() {
    return temperature;
  }

  public Double getTopP() {
    return topP;
  }

  public Double getTopK() {
    return topK;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiLlmEndpointParamsGoogle casted = (AiLlmEndpointParamsGoogle) o;
    return Objects.equals(type, casted.type) &&
      Objects.equals(temperature, casted.temperature) &&
      Objects.equals(topP, casted.topP) &&
      Objects.equals(topK, casted.topK);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, temperature, topP, topK
    );
  }

  @Override
  public String toString() {
    return "AiLlmEndpointParamsGoogle{" + "type='" + type + '\'' + ", " + "temperature='" + temperature + '\'' + ", " + "topP='" + topP + '\'' + ", " + "topK='" + topK + '\'' + "}";
  }

  public static class AiLlmEndpointParamsGoogleBuilder {

    protected EnumWrapper<AiLlmEndpointParamsGoogleTypeField> type;

    protected Double temperature;

    protected Double topP;

    protected Double topK;

    public AiLlmEndpointParamsGoogleBuilder type(AiLlmEndpointParamsGoogleTypeField type) {
      this.type = new EnumWrapper<AiLlmEndpointParamsGoogleTypeField>(type.getValue(), type);
      return this;
    }

    public AiLlmEndpointParamsGoogleBuilder temperature(Double temperature) {
      this.temperature = temperature;
      return this;
    }

    public AiLlmEndpointParamsGoogleBuilder topP(Double topP) {
      this.topP = topP;
      return this;
    }

    public AiLlmEndpointParamsGoogleBuilder topK(Double topK) {
      this.topK = topK;
      return this;
    }

    public AiLlmEndpointParamsGoogle build() {
      return new AiLlmEndpointParamsGoogle(this);
    }

  }

}
