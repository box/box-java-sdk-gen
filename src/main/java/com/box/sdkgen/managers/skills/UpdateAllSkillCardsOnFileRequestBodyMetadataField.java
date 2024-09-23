package com.box.sdkgen.managers.skills;

import com.box.sdkgen.schemas.keywordskillcardorstatusskillcardortimelineskillcardortranscriptskillcard.KeywordSkillCardOrStatusSkillCardOrTimelineSkillCardOrTranscriptSkillCard;
import java.util.List;
import java.util.Objects;

public class UpdateAllSkillCardsOnFileRequestBodyMetadataField {

  protected List<KeywordSkillCardOrStatusSkillCardOrTimelineSkillCardOrTranscriptSkillCard> cards;

  public UpdateAllSkillCardsOnFileRequestBodyMetadataField() {}

  protected UpdateAllSkillCardsOnFileRequestBodyMetadataField(
      UpdateAllSkillCardsOnFileRequestBodyMetadataFieldBuilder builder) {
    this.cards = builder.cards;
  }

  public List<KeywordSkillCardOrStatusSkillCardOrTimelineSkillCardOrTranscriptSkillCard>
      getCards() {
    return cards;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAllSkillCardsOnFileRequestBodyMetadataField casted =
        (UpdateAllSkillCardsOnFileRequestBodyMetadataField) o;
    return Objects.equals(cards, casted.cards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cards);
  }

  @Override
  public String toString() {
    return "UpdateAllSkillCardsOnFileRequestBodyMetadataField{" + "cards='" + cards + '\'' + "}";
  }

  public static class UpdateAllSkillCardsOnFileRequestBodyMetadataFieldBuilder {

    protected List<KeywordSkillCardOrStatusSkillCardOrTimelineSkillCardOrTranscriptSkillCard> cards;

    public UpdateAllSkillCardsOnFileRequestBodyMetadataFieldBuilder cards(
        List<KeywordSkillCardOrStatusSkillCardOrTimelineSkillCardOrTranscriptSkillCard> cards) {
      this.cards = cards;
      return this;
    }

    public UpdateAllSkillCardsOnFileRequestBodyMetadataField build() {
      return new UpdateAllSkillCardsOnFileRequestBodyMetadataField(this);
    }
  }
}
