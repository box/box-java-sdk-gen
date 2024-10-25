package com.box.sdkgen.schemas.transcriptskillcard;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class TranscriptSkillCardSkillField {

  @JsonDeserialize(
      using = TranscriptSkillCardSkillTypeField.TranscriptSkillCardSkillTypeFieldDeserializer.class)
  @JsonSerialize(
      using = TranscriptSkillCardSkillTypeField.TranscriptSkillCardSkillTypeFieldSerializer.class)
  protected EnumWrapper<TranscriptSkillCardSkillTypeField> type;

  protected final String id;

  public TranscriptSkillCardSkillField(@JsonProperty("id") String id) {
    this.id = id;
    this.type =
        new EnumWrapper<TranscriptSkillCardSkillTypeField>(
            TranscriptSkillCardSkillTypeField.SERVICE.getValue(),
            TranscriptSkillCardSkillTypeField.SERVICE);
  }

  protected TranscriptSkillCardSkillField(TranscriptSkillCardSkillFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<TranscriptSkillCardSkillTypeField> getType() {
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
    TranscriptSkillCardSkillField casted = (TranscriptSkillCardSkillField) o;
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "TranscriptSkillCardSkillField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + "}";
  }

  public static class TranscriptSkillCardSkillFieldBuilder {

    protected EnumWrapper<TranscriptSkillCardSkillTypeField> type;

    protected final String id;

    public TranscriptSkillCardSkillFieldBuilder(String id) {
      this.id = id;
      this.type =
          new EnumWrapper<TranscriptSkillCardSkillTypeField>(
              TranscriptSkillCardSkillTypeField.SERVICE.getValue(),
              TranscriptSkillCardSkillTypeField.SERVICE);
    }

    public TranscriptSkillCardSkillFieldBuilder type(
        EnumWrapper<TranscriptSkillCardSkillTypeField> type) {
      this.type = type;
      return this;
    }

    public TranscriptSkillCardSkillFieldBuilder type(TranscriptSkillCardSkillTypeField type) {
      this.type = new EnumWrapper<TranscriptSkillCardSkillTypeField>(type.getValue(), type);
      return this;
    }

    public TranscriptSkillCardSkillField build() {
      return new TranscriptSkillCardSkillField(this);
    }
  }
}
