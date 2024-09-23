package com.box.sdkgen.managers.classifications;

import java.util.Objects;

public class UpdateClassificationRequestBodyDataStaticConfigField {

  protected UpdateClassificationRequestBodyDataStaticConfigClassificationField classification;

  public UpdateClassificationRequestBodyDataStaticConfigField() {}

  protected UpdateClassificationRequestBodyDataStaticConfigField(
      UpdateClassificationRequestBodyDataStaticConfigFieldBuilder builder) {
    this.classification = builder.classification;
  }

  public UpdateClassificationRequestBodyDataStaticConfigClassificationField getClassification() {
    return classification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClassificationRequestBodyDataStaticConfigField casted =
        (UpdateClassificationRequestBodyDataStaticConfigField) o;
    return Objects.equals(classification, casted.classification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification);
  }

  @Override
  public String toString() {
    return "UpdateClassificationRequestBodyDataStaticConfigField{"
        + "classification='"
        + classification
        + '\''
        + "}";
  }

  public static class UpdateClassificationRequestBodyDataStaticConfigFieldBuilder {

    protected UpdateClassificationRequestBodyDataStaticConfigClassificationField classification;

    public UpdateClassificationRequestBodyDataStaticConfigFieldBuilder classification(
        UpdateClassificationRequestBodyDataStaticConfigClassificationField classification) {
      this.classification = classification;
      return this;
    }

    public UpdateClassificationRequestBodyDataStaticConfigField build() {
      return new UpdateClassificationRequestBodyDataStaticConfigField(this);
    }
  }
}
