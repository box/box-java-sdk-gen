package com.box.sdkgen.schemas.eventsource;

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
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.usermini.UserMini;

public class EventSourceClassificationField {

  protected String name;

  public EventSourceClassificationField() {
  }

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
    return Objects.hash(
      name
    );
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
