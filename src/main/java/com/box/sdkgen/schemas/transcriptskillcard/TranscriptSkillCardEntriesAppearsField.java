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

public class TranscriptSkillCardEntriesAppearsField {

  protected Long start;

  public TranscriptSkillCardEntriesAppearsField() {
  }

  protected TranscriptSkillCardEntriesAppearsField(TranscriptSkillCardEntriesAppearsFieldBuilder builder) {
    this.start = builder.start;
  }

  public Long getStart() {
    return start;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptSkillCardEntriesAppearsField casted = (TranscriptSkillCardEntriesAppearsField) o;
    return Objects.equals(start, casted.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      start
    );
  }

  @Override
  public String toString() {
    return "TranscriptSkillCardEntriesAppearsField{" + "start='" + start + '\'' + "}";
  }

  public static class TranscriptSkillCardEntriesAppearsFieldBuilder {

    protected Long start;

    public TranscriptSkillCardEntriesAppearsFieldBuilder start(Long start) {
      this.start = start;
      return this;
    }

    public TranscriptSkillCardEntriesAppearsField build() {
      return new TranscriptSkillCardEntriesAppearsField(this);
    }

  }

}
