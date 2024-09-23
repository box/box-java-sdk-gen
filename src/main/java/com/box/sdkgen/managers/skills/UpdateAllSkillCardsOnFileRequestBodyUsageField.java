package com.box.sdkgen.managers.skills;

import java.util.Objects;

public class UpdateAllSkillCardsOnFileRequestBodyUsageField {

  protected String unit;

  protected Double value;

  public UpdateAllSkillCardsOnFileRequestBodyUsageField() {}

  protected UpdateAllSkillCardsOnFileRequestBodyUsageField(
      UpdateAllSkillCardsOnFileRequestBodyUsageFieldBuilder builder) {
    this.unit = builder.unit;
    this.value = builder.value;
  }

  public String getUnit() {
    return unit;
  }

  public Double getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAllSkillCardsOnFileRequestBodyUsageField casted =
        (UpdateAllSkillCardsOnFileRequestBodyUsageField) o;
    return Objects.equals(unit, casted.unit) && Objects.equals(value, casted.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }

  @Override
  public String toString() {
    return "UpdateAllSkillCardsOnFileRequestBodyUsageField{"
        + "unit='"
        + unit
        + '\''
        + ", "
        + "value='"
        + value
        + '\''
        + "}";
  }

  public static class UpdateAllSkillCardsOnFileRequestBodyUsageFieldBuilder {

    protected String unit;

    protected Double value;

    public UpdateAllSkillCardsOnFileRequestBodyUsageFieldBuilder unit(String unit) {
      this.unit = unit;
      return this;
    }

    public UpdateAllSkillCardsOnFileRequestBodyUsageFieldBuilder value(Double value) {
      this.value = value;
      return this;
    }

    public UpdateAllSkillCardsOnFileRequestBodyUsageField build() {
      return new UpdateAllSkillCardsOnFileRequestBodyUsageField(this);
    }
  }
}
