package com.box.sdkgen.schemas.transcriptskillcard;

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

public class TranscriptSkillCardEntriesField {

  protected String text;

  protected List<TranscriptSkillCardEntriesAppearsField> appears;

  public TranscriptSkillCardEntriesField() {
  }

  protected TranscriptSkillCardEntriesField(TranscriptSkillCardEntriesFieldBuilder builder) {
    this.text = builder.text;
    this.appears = builder.appears;
  }

  public String getText() {
    return text;
  }

  public List<TranscriptSkillCardEntriesAppearsField> getAppears() {
    return appears;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptSkillCardEntriesField casted = (TranscriptSkillCardEntriesField) o;
    return Objects.equals(text, casted.text) &&
      Objects.equals(appears, casted.appears);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      text, appears
    );
  }

  @Override
  public String toString() {
    return "TranscriptSkillCardEntriesField{" + "text='" + text + '\'' + ", " + "appears='" + appears + '\'' + "}";
  }

  public static class TranscriptSkillCardEntriesFieldBuilder {

    protected String text;

    protected List<TranscriptSkillCardEntriesAppearsField> appears;

    public TranscriptSkillCardEntriesFieldBuilder text(String text) {
      this.text = text;
      return this;
    }

    public TranscriptSkillCardEntriesFieldBuilder appears(List<TranscriptSkillCardEntriesAppearsField> appears) {
      this.appears = appears;
      return this;
    }

    public TranscriptSkillCardEntriesField build() {
      return new TranscriptSkillCardEntriesField(this);
    }

  }

}
