package com.box.sdkgen.schemas.transcriptskillcard;

import java.util.Objects;

public class TranscriptSkillCardEntriesAppearsField {

  protected Long start;

  public TranscriptSkillCardEntriesAppearsField() {}

  protected TranscriptSkillCardEntriesAppearsField(
      TranscriptSkillCardEntriesAppearsFieldBuilder builder) {
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
    return Objects.hash(start);
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
