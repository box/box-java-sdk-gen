package com.box.sdkgen.schemas.transcriptskillcard;

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

public class TranscriptSkillCard {

  @JsonProperty("created_at")
  protected String createdAt;

  @JsonDeserialize(using = TranscriptSkillCardTypeField.TranscriptSkillCardTypeFieldDeserializer.class)
  @JsonSerialize(using = TranscriptSkillCardTypeField.TranscriptSkillCardTypeFieldSerializer.class)
  protected EnumWrapper<TranscriptSkillCardTypeField> type;

  @JsonDeserialize(using = TranscriptSkillCardSkillCardTypeField.TranscriptSkillCardSkillCardTypeFieldDeserializer.class)
  @JsonSerialize(using = TranscriptSkillCardSkillCardTypeField.TranscriptSkillCardSkillCardTypeFieldSerializer.class)
  @JsonProperty("skill_card_type")
  protected EnumWrapper<TranscriptSkillCardSkillCardTypeField> skillCardType;

  @JsonProperty("skill_card_title")
  protected TranscriptSkillCardSkillCardTitleField skillCardTitle;

  protected final TranscriptSkillCardSkillField skill;

  protected final TranscriptSkillCardInvocationField invocation;

  protected Long duration;

  protected final List<TranscriptSkillCardEntriesField> entries;

  public TranscriptSkillCard(@JsonProperty("skill") TranscriptSkillCardSkillField skill, @JsonProperty("invocation") TranscriptSkillCardInvocationField invocation, @JsonProperty("entries") List<TranscriptSkillCardEntriesField> entries) {
    this.skill = skill;
    this.invocation = invocation;
    this.entries = entries;
    this.type = new EnumWrapper<TranscriptSkillCardTypeField>(TranscriptSkillCardTypeField.SKILL_CARD.getValue(), TranscriptSkillCardTypeField.SKILL_CARD);
    this.skillCardType = new EnumWrapper<TranscriptSkillCardSkillCardTypeField>(TranscriptSkillCardSkillCardTypeField.TRANSCRIPT.getValue(), TranscriptSkillCardSkillCardTypeField.TRANSCRIPT);
  }

  protected TranscriptSkillCard(TranscriptSkillCardBuilder builder) {
    this.createdAt = builder.createdAt;
    this.type = builder.type;
    this.skillCardType = builder.skillCardType;
    this.skillCardTitle = builder.skillCardTitle;
    this.skill = builder.skill;
    this.invocation = builder.invocation;
    this.duration = builder.duration;
    this.entries = builder.entries;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public EnumWrapper<TranscriptSkillCardTypeField> getType() {
    return type;
  }

  public EnumWrapper<TranscriptSkillCardSkillCardTypeField> getSkillCardType() {
    return skillCardType;
  }

  public TranscriptSkillCardSkillCardTitleField getSkillCardTitle() {
    return skillCardTitle;
  }

  public TranscriptSkillCardSkillField getSkill() {
    return skill;
  }

  public TranscriptSkillCardInvocationField getInvocation() {
    return invocation;
  }

  public Long getDuration() {
    return duration;
  }

  public List<TranscriptSkillCardEntriesField> getEntries() {
    return entries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptSkillCard casted = (TranscriptSkillCard) o;
    return Objects.equals(createdAt, casted.createdAt) &&
      Objects.equals(type, casted.type) &&
      Objects.equals(skillCardType, casted.skillCardType) &&
      Objects.equals(skillCardTitle, casted.skillCardTitle) &&
      Objects.equals(skill, casted.skill) &&
      Objects.equals(invocation, casted.invocation) &&
      Objects.equals(duration, casted.duration) &&
      Objects.equals(entries, casted.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      createdAt, type, skillCardType, skillCardTitle, skill, invocation, duration, entries
    );
  }

  @Override
  public String toString() {
    return "TranscriptSkillCard{" + "createdAt='" + createdAt + '\'' + ", " + "type='" + type + '\'' + ", " + "skillCardType='" + skillCardType + '\'' + ", " + "skillCardTitle='" + skillCardTitle + '\'' + ", " + "skill='" + skill + '\'' + ", " + "invocation='" + invocation + '\'' + ", " + "duration='" + duration + '\'' + ", " + "entries='" + entries + '\'' + "}";
  }

  public static class TranscriptSkillCardBuilder {

    protected String createdAt;

    protected EnumWrapper<TranscriptSkillCardTypeField> type;

    protected EnumWrapper<TranscriptSkillCardSkillCardTypeField> skillCardType;

    protected TranscriptSkillCardSkillCardTitleField skillCardTitle;

    protected final TranscriptSkillCardSkillField skill;

    protected final TranscriptSkillCardInvocationField invocation;

    protected Long duration;

    protected final List<TranscriptSkillCardEntriesField> entries;

    public TranscriptSkillCardBuilder(TranscriptSkillCardSkillField skill, TranscriptSkillCardInvocationField invocation, List<TranscriptSkillCardEntriesField> entries) {
      this.skill = skill;
      this.invocation = invocation;
      this.entries = entries;
      this.type = new EnumWrapper<TranscriptSkillCardTypeField>(TranscriptSkillCardTypeField.SKILL_CARD.getValue(), TranscriptSkillCardTypeField.SKILL_CARD);
      this.skillCardType = new EnumWrapper<TranscriptSkillCardSkillCardTypeField>(TranscriptSkillCardSkillCardTypeField.TRANSCRIPT.getValue(), TranscriptSkillCardSkillCardTypeField.TRANSCRIPT);
    }

    public TranscriptSkillCardBuilder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public TranscriptSkillCardBuilder type(TranscriptSkillCardTypeField type) {
      this.type = new EnumWrapper<TranscriptSkillCardTypeField>(type.getValue(), type);
      return this;
    }

    public TranscriptSkillCardBuilder skillCardType(TranscriptSkillCardSkillCardTypeField skillCardType) {
      this.skillCardType = new EnumWrapper<TranscriptSkillCardSkillCardTypeField>(skillCardType.getValue(), skillCardType);
      return this;
    }

    public TranscriptSkillCardBuilder skillCardTitle(TranscriptSkillCardSkillCardTitleField skillCardTitle) {
      this.skillCardTitle = skillCardTitle;
      return this;
    }

    public TranscriptSkillCardBuilder duration(Long duration) {
      this.duration = duration;
      return this;
    }

    public TranscriptSkillCard build() {
      return new TranscriptSkillCard(this);
    }

  }

}
