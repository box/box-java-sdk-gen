package com.box.sdkgen.schemas.keywordskillcard;

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

public class KeywordSkillCardEntriesField {

  protected String text;

  public KeywordSkillCardEntriesField() {
  }

  protected KeywordSkillCardEntriesField(KeywordSkillCardEntriesFieldBuilder builder) {
    this.text = builder.text;
  }

  public String getText() {
    return text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordSkillCardEntriesField casted = (KeywordSkillCardEntriesField) o;
    return Objects.equals(text, casted.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      text
    );
  }

  @Override
  public String toString() {
    return "KeywordSkillCardEntriesField{" + "text='" + text + '\'' + "}";
  }

  public static class KeywordSkillCardEntriesFieldBuilder {

    protected String text;

    public KeywordSkillCardEntriesFieldBuilder text(String text) {
      this.text = text;
      return this;
    }

    public KeywordSkillCardEntriesField build() {
      return new KeywordSkillCardEntriesField(this);
    }

  }

}
