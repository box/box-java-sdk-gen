package com.box.sdkgen.schemas.statusskillcard;

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

public class StatusSkillCardSkillCardTitleField {

  protected String code;

  protected final String message;

  public StatusSkillCardSkillCardTitleField(@JsonProperty("message") String message) {
    this.message = message;
  }

  protected StatusSkillCardSkillCardTitleField(StatusSkillCardSkillCardTitleFieldBuilder builder) {
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
    StatusSkillCardSkillCardTitleField casted = (StatusSkillCardSkillCardTitleField) o;
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
    return "StatusSkillCardSkillCardTitleField{" + "code='" + code + '\'' + ", " + "message='" + message + '\'' + "}";
  }

  public static class StatusSkillCardSkillCardTitleFieldBuilder {

    protected String code;

    protected final String message;

    public StatusSkillCardSkillCardTitleFieldBuilder(String message) {
      this.message = message;
    }

    public StatusSkillCardSkillCardTitleFieldBuilder code(String code) {
      this.code = code;
      return this;
    }

    public StatusSkillCardSkillCardTitleField build() {
      return new StatusSkillCardSkillCardTitleField(this);
    }

  }

}
