package com.box.sdkgen.schemas.statusskillcard;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class StatusSkillCard extends SerializableObject {

  @JsonProperty("created_at")
  protected String createdAt;

  @JsonDeserialize(using = StatusSkillCardTypeField.StatusSkillCardTypeFieldDeserializer.class)
  @JsonSerialize(using = StatusSkillCardTypeField.StatusSkillCardTypeFieldSerializer.class)
  protected EnumWrapper<StatusSkillCardTypeField> type;

  @JsonDeserialize(
      using = StatusSkillCardSkillCardTypeField.StatusSkillCardSkillCardTypeFieldDeserializer.class)
  @JsonSerialize(
      using = StatusSkillCardSkillCardTypeField.StatusSkillCardSkillCardTypeFieldSerializer.class)
  @JsonProperty("skill_card_type")
  protected EnumWrapper<StatusSkillCardSkillCardTypeField> skillCardType;

  @JsonProperty("skill_card_title")
  protected StatusSkillCardSkillCardTitleField skillCardTitle;

  protected final StatusSkillCardStatusField status;

  protected final StatusSkillCardSkillField skill;

  protected final StatusSkillCardInvocationField invocation;

  public StatusSkillCard(
      @JsonProperty("status") StatusSkillCardStatusField status,
      @JsonProperty("skill") StatusSkillCardSkillField skill,
      @JsonProperty("invocation") StatusSkillCardInvocationField invocation) {
    super();
    this.status = status;
    this.skill = skill;
    this.invocation = invocation;
    this.type = new EnumWrapper<StatusSkillCardTypeField>(StatusSkillCardTypeField.SKILL_CARD);
    this.skillCardType =
        new EnumWrapper<StatusSkillCardSkillCardTypeField>(
            StatusSkillCardSkillCardTypeField.STATUS);
  }

  protected StatusSkillCard(StatusSkillCardBuilder builder) {
    super();
    this.createdAt = builder.createdAt;
    this.type = builder.type;
    this.skillCardType = builder.skillCardType;
    this.skillCardTitle = builder.skillCardTitle;
    this.status = builder.status;
    this.skill = builder.skill;
    this.invocation = builder.invocation;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public EnumWrapper<StatusSkillCardTypeField> getType() {
    return type;
  }

  public EnumWrapper<StatusSkillCardSkillCardTypeField> getSkillCardType() {
    return skillCardType;
  }

  public StatusSkillCardSkillCardTitleField getSkillCardTitle() {
    return skillCardTitle;
  }

  public StatusSkillCardStatusField getStatus() {
    return status;
  }

  public StatusSkillCardSkillField getSkill() {
    return skill;
  }

  public StatusSkillCardInvocationField getInvocation() {
    return invocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusSkillCard casted = (StatusSkillCard) o;
    return Objects.equals(createdAt, casted.createdAt)
        && Objects.equals(type, casted.type)
        && Objects.equals(skillCardType, casted.skillCardType)
        && Objects.equals(skillCardTitle, casted.skillCardTitle)
        && Objects.equals(status, casted.status)
        && Objects.equals(skill, casted.skill)
        && Objects.equals(invocation, casted.invocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, type, skillCardType, skillCardTitle, status, skill, invocation);
  }

  @Override
  public String toString() {
    return "StatusSkillCard{"
        + "createdAt='"
        + createdAt
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + ", "
        + "skillCardType='"
        + skillCardType
        + '\''
        + ", "
        + "skillCardTitle='"
        + skillCardTitle
        + '\''
        + ", "
        + "status='"
        + status
        + '\''
        + ", "
        + "skill='"
        + skill
        + '\''
        + ", "
        + "invocation='"
        + invocation
        + '\''
        + "}";
  }

  public static class StatusSkillCardBuilder {

    protected String createdAt;

    protected EnumWrapper<StatusSkillCardTypeField> type;

    protected EnumWrapper<StatusSkillCardSkillCardTypeField> skillCardType;

    protected StatusSkillCardSkillCardTitleField skillCardTitle;

    protected final StatusSkillCardStatusField status;

    protected final StatusSkillCardSkillField skill;

    protected final StatusSkillCardInvocationField invocation;

    public StatusSkillCardBuilder(
        StatusSkillCardStatusField status,
        StatusSkillCardSkillField skill,
        StatusSkillCardInvocationField invocation) {
      this.status = status;
      this.skill = skill;
      this.invocation = invocation;
      this.type = new EnumWrapper<StatusSkillCardTypeField>(StatusSkillCardTypeField.SKILL_CARD);
      this.skillCardType =
          new EnumWrapper<StatusSkillCardSkillCardTypeField>(
              StatusSkillCardSkillCardTypeField.STATUS);
    }

    public StatusSkillCardBuilder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public StatusSkillCardBuilder type(StatusSkillCardTypeField type) {
      this.type = new EnumWrapper<StatusSkillCardTypeField>(type);
      return this;
    }

    public StatusSkillCardBuilder type(EnumWrapper<StatusSkillCardTypeField> type) {
      this.type = type;
      return this;
    }

    public StatusSkillCardBuilder skillCardType(StatusSkillCardSkillCardTypeField skillCardType) {
      this.skillCardType = new EnumWrapper<StatusSkillCardSkillCardTypeField>(skillCardType);
      return this;
    }

    public StatusSkillCardBuilder skillCardType(
        EnumWrapper<StatusSkillCardSkillCardTypeField> skillCardType) {
      this.skillCardType = skillCardType;
      return this;
    }

    public StatusSkillCardBuilder skillCardTitle(
        StatusSkillCardSkillCardTitleField skillCardTitle) {
      this.skillCardTitle = skillCardTitle;
      return this;
    }

    public StatusSkillCard build() {
      return new StatusSkillCard(this);
    }
  }
}
