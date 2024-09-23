package com.box.sdkgen.schemas.statusskillcard;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class StatusSkillCardInvocationField {

  @JsonDeserialize(
      using =
          StatusSkillCardInvocationTypeField.StatusSkillCardInvocationTypeFieldDeserializer.class)
  @JsonSerialize(
      using = StatusSkillCardInvocationTypeField.StatusSkillCardInvocationTypeFieldSerializer.class)
  protected EnumWrapper<StatusSkillCardInvocationTypeField> type;

  protected final String id;

  public StatusSkillCardInvocationField(@JsonProperty("id") String id) {
    this.id = id;
    this.type =
        new EnumWrapper<StatusSkillCardInvocationTypeField>(
            StatusSkillCardInvocationTypeField.SKILL_INVOCATION.getValue(),
            StatusSkillCardInvocationTypeField.SKILL_INVOCATION);
  }

  protected StatusSkillCardInvocationField(StatusSkillCardInvocationFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<StatusSkillCardInvocationTypeField> getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusSkillCardInvocationField casted = (StatusSkillCardInvocationField) o;
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "StatusSkillCardInvocationField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + "}";
  }

  public static class StatusSkillCardInvocationFieldBuilder {

    protected EnumWrapper<StatusSkillCardInvocationTypeField> type;

    protected final String id;

    public StatusSkillCardInvocationFieldBuilder(String id) {
      this.id = id;
      this.type =
          new EnumWrapper<StatusSkillCardInvocationTypeField>(
              StatusSkillCardInvocationTypeField.SKILL_INVOCATION.getValue(),
              StatusSkillCardInvocationTypeField.SKILL_INVOCATION);
    }

    public StatusSkillCardInvocationFieldBuilder type(StatusSkillCardInvocationTypeField type) {
      this.type = new EnumWrapper<StatusSkillCardInvocationTypeField>(type.getValue(), type);
      return this;
    }

    public StatusSkillCardInvocationField build() {
      return new StatusSkillCardInvocationField(this);
    }
  }
}
