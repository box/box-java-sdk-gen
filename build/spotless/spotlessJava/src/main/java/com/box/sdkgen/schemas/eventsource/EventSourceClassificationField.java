package com.box.sdkgen.schemas.eventsource;

import java.util.Objects;

public class EventSourceClassificationField {

  protected String name;

  public EventSourceClassificationField() {}

  protected EventSourceClassificationField(EventSourceClassificationFieldBuilder builder) {
    this.name = builder.name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSourceClassificationField casted = (EventSourceClassificationField) o;
    return Objects.equals(name, casted.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return "EventSourceClassificationField{" + "name='" + name + '\'' + "}";
  }

  public static class EventSourceClassificationFieldBuilder {

    protected String name;

    public EventSourceClassificationFieldBuilder name(String name) {
      this.name = name;
      return this;
    }

    public EventSourceClassificationField build() {
      return new EventSourceClassificationField(this);
    }
  }
}
