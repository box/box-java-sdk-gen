package com.box.sdkgen.schemas.keywordskillcard;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class KeywordSkillCardSkillField {

  @JsonDeserialize(
      using = KeywordSkillCardSkillTypeField.KeywordSkillCardSkillTypeFieldDeserializer.class)
  @JsonSerialize(
      using = KeywordSkillCardSkillTypeField.KeywordSkillCardSkillTypeFieldSerializer.class)
  protected EnumWrapper<KeywordSkillCardSkillTypeField> type;

  protected final String id;

  public KeywordSkillCardSkillField(@JsonProperty("id") String id) {
    this.id = id;
    this.type =
        new EnumWrapper<KeywordSkillCardSkillTypeField>(
            KeywordSkillCardSkillTypeField.SERVICE.getValue(),
            KeywordSkillCardSkillTypeField.SERVICE);
  }

  protected KeywordSkillCardSkillField(KeywordSkillCardSkillFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<KeywordSkillCardSkillTypeField> getType() {
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
    KeywordSkillCardSkillField casted = (KeywordSkillCardSkillField) o;
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "KeywordSkillCardSkillField{" + "type='" + type + '\'' + ", " + "id='" + id + '\'' + "}";
  }

  public static class KeywordSkillCardSkillFieldBuilder {

    protected EnumWrapper<KeywordSkillCardSkillTypeField> type;

    protected final String id;

    public KeywordSkillCardSkillFieldBuilder(String id) {
      this.id = id;
      this.type =
          new EnumWrapper<KeywordSkillCardSkillTypeField>(
              KeywordSkillCardSkillTypeField.SERVICE.getValue(),
              KeywordSkillCardSkillTypeField.SERVICE);
    }

    public KeywordSkillCardSkillFieldBuilder type(
        EnumWrapper<KeywordSkillCardSkillTypeField> type) {
      this.type = type;
      return this;
    }

    public KeywordSkillCardSkillFieldBuilder type(KeywordSkillCardSkillTypeField type) {
      this.type = new EnumWrapper<KeywordSkillCardSkillTypeField>(type.getValue(), type);
      return this;
    }

    public KeywordSkillCardSkillField build() {
      return new KeywordSkillCardSkillField(this);
    }
  }
}
