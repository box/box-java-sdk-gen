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

public class AiExtractStructuredFieldsOptionsField {

  protected final String key;

  public AiExtractStructuredFieldsOptionsField(@JsonProperty("key") String key) {
    this.key = key;
  }

  public String getKey() {
    return key;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiExtractStructuredFieldsOptionsField casted = (AiExtractStructuredFieldsOptionsField) o;
    return Objects.equals(key, casted.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      key
    );
  }

  @Override
  public String toString() {
    return "AiExtractStructuredFieldsOptionsField{" + "key='" + key + '\'' + "}";
  }

}
