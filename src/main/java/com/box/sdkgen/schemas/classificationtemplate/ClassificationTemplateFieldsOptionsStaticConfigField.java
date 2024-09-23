package com.box.sdkgen.schemas.classificationtemplate;

import java.util.Objects;

public class ClassificationTemplateFieldsOptionsStaticConfigField {

  protected ClassificationTemplateFieldsOptionsStaticConfigClassificationField classification;

  public ClassificationTemplateFieldsOptionsStaticConfigField() {}

  protected ClassificationTemplateFieldsOptionsStaticConfigField(
      ClassificationTemplateFieldsOptionsStaticConfigFieldBuilder builder) {
    this.classification = builder.classification;
  }

  public ClassificationTemplateFieldsOptionsStaticConfigClassificationField getClassification() {
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
    ClassificationTemplateFieldsOptionsStaticConfigField casted =
        (ClassificationTemplateFieldsOptionsStaticConfigField) o;
    return Objects.equals(classification, casted.classification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification);
  }

  @Override
  public String toString() {
    return "ClassificationTemplateFieldsOptionsStaticConfigField{"
        + "classification='"
        + classification
        + '\''
        + "}";
  }

  public static class ClassificationTemplateFieldsOptionsStaticConfigFieldBuilder {

    protected ClassificationTemplateFieldsOptionsStaticConfigClassificationField classification;

    public ClassificationTemplateFieldsOptionsStaticConfigFieldBuilder classification(
        ClassificationTemplateFieldsOptionsStaticConfigClassificationField classification) {
      this.classification = classification;
      return this;
    }

    public ClassificationTemplateFieldsOptionsStaticConfigField build() {
      return new ClassificationTemplateFieldsOptionsStaticConfigField(this);
    }
  }
}
