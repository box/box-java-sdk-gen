package com.box.sdkgen.schemas.skillinvocation;

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
import com.box.sdkgen.schemas.fileorfolder.FileOrFolder;
import com.box.sdkgen.schemas.event.Event;

public class SkillInvocationTokenField {

  protected SkillInvocationTokenReadField read;

  protected SkillInvocationTokenWriteField write;

  public SkillInvocationTokenField() {
  }

  protected SkillInvocationTokenField(SkillInvocationTokenFieldBuilder builder) {
    this.read = builder.read;
    this.write = builder.write;
  }

  public SkillInvocationTokenReadField getRead() {
    return read;
  }

  public SkillInvocationTokenWriteField getWrite() {
    return write;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillInvocationTokenField casted = (SkillInvocationTokenField) o;
    return Objects.equals(read, casted.read) &&
      Objects.equals(write, casted.write);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      read, write
    );
  }

  @Override
  public String toString() {
    return "SkillInvocationTokenField{" + "read='" + read + '\'' + ", " + "write='" + write + '\'' + "}";
  }

  public static class SkillInvocationTokenFieldBuilder {

    protected SkillInvocationTokenReadField read;

    protected SkillInvocationTokenWriteField write;

    public SkillInvocationTokenFieldBuilder read(SkillInvocationTokenReadField read) {
      this.read = read;
      return this;
    }

    public SkillInvocationTokenFieldBuilder write(SkillInvocationTokenWriteField write) {
      this.write = write;
      return this;
    }

    public SkillInvocationTokenField build() {
      return new SkillInvocationTokenField(this);
    }

  }

}
