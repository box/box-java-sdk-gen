package com.box.sdkgen.schemas.timelineskillcard;

import java.util.Objects;

public class TimelineSkillCardEntriesAppearsField {

  protected Long start;

  protected Long end;

  public TimelineSkillCardEntriesAppearsField() {}

  protected TimelineSkillCardEntriesAppearsField(
      TimelineSkillCardEntriesAppearsFieldBuilder builder) {
    this.start = builder.start;
    this.end = builder.end;
  }

  public Long getStart() {
    return start;
  }

  public Long getEnd() {
    return end;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineSkillCardEntriesAppearsField casted = (TimelineSkillCardEntriesAppearsField) o;
    return Objects.equals(start, casted.start) && Objects.equals(end, casted.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    return "TimelineSkillCardEntriesAppearsField{"
        + "start='"
        + start
        + '\''
        + ", "
        + "end='"
        + end
        + '\''
        + "}";
  }

  public static class TimelineSkillCardEntriesAppearsFieldBuilder {

    protected Long start;

    protected Long end;

    public TimelineSkillCardEntriesAppearsFieldBuilder start(Long start) {
      this.start = start;
      return this;
    }

    public TimelineSkillCardEntriesAppearsFieldBuilder end(Long end) {
      this.end = end;
      return this;
    }

    public TimelineSkillCardEntriesAppearsField build() {
      return new TimelineSkillCardEntriesAppearsField(this);
    }
  }
}
