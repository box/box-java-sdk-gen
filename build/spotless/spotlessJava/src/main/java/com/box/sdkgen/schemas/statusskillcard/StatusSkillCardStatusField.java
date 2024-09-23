package com.box.sdkgen.schemas.statusskillcard;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class StatusSkillCardStatusField {

  @JsonDeserialize(
      using = StatusSkillCardStatusCodeField.StatusSkillCardStatusCodeFieldDeserializer.class)
  @JsonSerialize(
      using = StatusSkillCardStatusCodeField.StatusSkillCardStatusCodeFieldSerializer.class)
  protected final EnumWrapper<StatusSkillCardStatusCodeField> code;

  protected String message;

  public StatusSkillCardStatusField(
      @JsonProperty("code") EnumWrapper<StatusSkillCardStatusCodeField> code) {
    this.code = code;
  }

  public StatusSkillCardStatusField(StatusSkillCardStatusCodeField code) {
    this.code = new EnumWrapper<StatusSkillCardStatusCodeField>(code.getValue(), code);
  }

  protected StatusSkillCardStatusField(StatusSkillCardStatusFieldBuilder builder) {
    this.code = builder.code;
    this.message = builder.message;
  }

  public EnumWrapper<StatusSkillCardStatusCodeField> getCode() {
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
    StatusSkillCardStatusField casted = (StatusSkillCardStatusField) o;
    return Objects.equals(code, casted.code) && Objects.equals(message, casted.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    return "StatusSkillCardStatusField{"
        + "code='"
        + code
        + '\''
        + ", "
        + "message='"
        + message
        + '\''
        + "}";
  }

  public static class StatusSkillCardStatusFieldBuilder {

    protected final EnumWrapper<StatusSkillCardStatusCodeField> code;

    protected String message;

    public StatusSkillCardStatusFieldBuilder(StatusSkillCardStatusCodeField code) {
      this.code = new EnumWrapper<StatusSkillCardStatusCodeField>(code.getValue(), code);
    }

    public StatusSkillCardStatusFieldBuilder message(String message) {
      this.message = message;
      return this;
    }

    public StatusSkillCardStatusField build() {
      return new StatusSkillCardStatusField(this);
    }
  }
}
