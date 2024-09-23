package com.box.sdkgen.managers.skills;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class UpdateAllSkillCardsOnFileRequestBodyFileVersionField {

  @JsonDeserialize(
      using =
          UpdateAllSkillCardsOnFileRequestBodyFileVersionTypeField
              .UpdateAllSkillCardsOnFileRequestBodyFileVersionTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          UpdateAllSkillCardsOnFileRequestBodyFileVersionTypeField
              .UpdateAllSkillCardsOnFileRequestBodyFileVersionTypeFieldSerializer.class)
  protected EnumWrapper<UpdateAllSkillCardsOnFileRequestBodyFileVersionTypeField> type;

  protected String id;

  public UpdateAllSkillCardsOnFileRequestBodyFileVersionField() {}

  protected UpdateAllSkillCardsOnFileRequestBodyFileVersionField(
      UpdateAllSkillCardsOnFileRequestBodyFileVersionFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<UpdateAllSkillCardsOnFileRequestBodyFileVersionTypeField> getType() {
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
    UpdateAllSkillCardsOnFileRequestBodyFileVersionField casted =
        (UpdateAllSkillCardsOnFileRequestBodyFileVersionField) o;
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "UpdateAllSkillCardsOnFileRequestBodyFileVersionField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + "}";
  }

  public static class UpdateAllSkillCardsOnFileRequestBodyFileVersionFieldBuilder {

    protected EnumWrapper<UpdateAllSkillCardsOnFileRequestBodyFileVersionTypeField> type;

    protected String id;

    public UpdateAllSkillCardsOnFileRequestBodyFileVersionFieldBuilder type(
        UpdateAllSkillCardsOnFileRequestBodyFileVersionTypeField type) {
      this.type =
          new EnumWrapper<UpdateAllSkillCardsOnFileRequestBodyFileVersionTypeField>(
              type.getValue(), type);
      return this;
    }

    public UpdateAllSkillCardsOnFileRequestBodyFileVersionFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public UpdateAllSkillCardsOnFileRequestBodyFileVersionField build() {
      return new UpdateAllSkillCardsOnFileRequestBodyFileVersionField(this);
    }
  }
}
