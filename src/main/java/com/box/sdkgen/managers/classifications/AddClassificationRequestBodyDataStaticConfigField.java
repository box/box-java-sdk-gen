package com.box.sdkgen.managers.classifications;

import java.util.Objects;

public class AddClassificationRequestBodyDataStaticConfigField {

  protected AddClassificationRequestBodyDataStaticConfigClassificationField classification;

  public AddClassificationRequestBodyDataStaticConfigField() {}

  protected AddClassificationRequestBodyDataStaticConfigField(
      AddClassificationRequestBodyDataStaticConfigFieldBuilder builder) {
    this.classification = builder.classification;
  }

  public AddClassificationRequestBodyDataStaticConfigClassificationField getClassification() {
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
    AddClassificationRequestBodyDataStaticConfigField casted =
        (AddClassificationRequestBodyDataStaticConfigField) o;
    return Objects.equals(classification, casted.classification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification);
  }

  @Override
  public String toString() {
    return "AddClassificationRequestBodyDataStaticConfigField{"
        + "classification='"
        + classification
        + '\''
        + "}";
  }

  public static class AddClassificationRequestBodyDataStaticConfigFieldBuilder {

    protected AddClassificationRequestBodyDataStaticConfigClassificationField classification;

    public AddClassificationRequestBodyDataStaticConfigFieldBuilder classification(
        AddClassificationRequestBodyDataStaticConfigClassificationField classification) {
      this.classification = classification;
      return this;
    }

    public AddClassificationRequestBodyDataStaticConfigField build() {
      return new AddClassificationRequestBodyDataStaticConfigField(this);
    }
  }
}
