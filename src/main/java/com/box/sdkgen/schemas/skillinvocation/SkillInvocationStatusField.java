package com.box.sdkgen.schemas.skillinvocation;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class SkillInvocationStatusField extends SerializableObject {

  @JsonDeserialize(
      using = SkillInvocationStatusStateField.SkillInvocationStatusStateFieldDeserializer.class)
  @JsonSerialize(
      using = SkillInvocationStatusStateField.SkillInvocationStatusStateFieldSerializer.class)
  protected EnumWrapper<SkillInvocationStatusStateField> state;

  protected String message;

  @JsonProperty("error_code")
  protected String errorCode;

  @JsonProperty("additional_info")
  protected String additionalInfo;

  public SkillInvocationStatusField() {
    super();
  }

  protected SkillInvocationStatusField(SkillInvocationStatusFieldBuilder builder) {
    super();
    this.state = builder.state;
    this.message = builder.message;
    this.errorCode = builder.errorCode;
    this.additionalInfo = builder.additionalInfo;
  }

  public EnumWrapper<SkillInvocationStatusStateField> getState() {
    return state;
  }

  public String getMessage() {
    return message;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public String getAdditionalInfo() {
    return additionalInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillInvocationStatusField casted = (SkillInvocationStatusField) o;
    return Objects.equals(state, casted.state)
        && Objects.equals(message, casted.message)
        && Objects.equals(errorCode, casted.errorCode)
        && Objects.equals(additionalInfo, casted.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, message, errorCode, additionalInfo);
  }

  @Override
  public String toString() {
    return "SkillInvocationStatusField{"
        + "state='"
        + state
        + '\''
        + ", "
        + "message='"
        + message
        + '\''
        + ", "
        + "errorCode='"
        + errorCode
        + '\''
        + ", "
        + "additionalInfo='"
        + additionalInfo
        + '\''
        + "}";
  }

  public static class SkillInvocationStatusFieldBuilder {

    protected EnumWrapper<SkillInvocationStatusStateField> state;

    protected String message;

    protected String errorCode;

    protected String additionalInfo;

    public SkillInvocationStatusFieldBuilder state(SkillInvocationStatusStateField state) {
      this.state = new EnumWrapper<SkillInvocationStatusStateField>(state);
      return this;
    }

    public SkillInvocationStatusFieldBuilder state(
        EnumWrapper<SkillInvocationStatusStateField> state) {
      this.state = state;
      return this;
    }

    public SkillInvocationStatusFieldBuilder message(String message) {
      this.message = message;
      return this;
    }

    public SkillInvocationStatusFieldBuilder errorCode(String errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    public SkillInvocationStatusFieldBuilder additionalInfo(String additionalInfo) {
      this.additionalInfo = additionalInfo;
      return this;
    }

    public SkillInvocationStatusField build() {
      return new SkillInvocationStatusField(this);
    }
  }
}
