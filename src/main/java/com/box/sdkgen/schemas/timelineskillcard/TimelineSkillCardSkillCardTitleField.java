package com.box.sdkgen.schemas.timelineskillcard;

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

public class TimelineSkillCardSkillCardTitleField {

  protected String code;

  protected final String message;

  public TimelineSkillCardSkillCardTitleField(@JsonProperty("message") String message) {
    this.message = message;
  }

  protected TimelineSkillCardSkillCardTitleField(TimelineSkillCardSkillCardTitleFieldBuilder builder) {
    this.code = builder.code;
    this.message = builder.message;
  }

  public String getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineSkillCardSkillCardTitleField casted = (TimelineSkillCardSkillCardTitleField) o;
    return Objects.equals(code, casted.code) &&
      Objects.equals(message, casted.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      code, message
    );
  }

  @Override
  public String toString() {
    return "TimelineSkillCardSkillCardTitleField{" + "code='" + code + '\'' + ", " + "message='" + message + '\'' + "}";
  }

  public static class TimelineSkillCardSkillCardTitleFieldBuilder {

    protected String code;

    protected final String message;

    public TimelineSkillCardSkillCardTitleFieldBuilder(String message) {
      this.message = message;
    }

    public TimelineSkillCardSkillCardTitleFieldBuilder code(String code) {
      this.code = code;
      return this;
    }

    public TimelineSkillCardSkillCardTitleField build() {
      return new TimelineSkillCardSkillCardTitleField(this);
    }

  }

}
