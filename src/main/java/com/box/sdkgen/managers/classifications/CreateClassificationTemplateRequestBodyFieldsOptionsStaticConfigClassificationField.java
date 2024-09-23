package com.box.sdkgen.managers.classifications;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateClassificationTemplateRequestBodyFieldsOptionsStaticConfigClassificationField {

  protected String classificationDefinition;

  @JsonProperty("colorID")
  protected Long colorId;

  public CreateClassificationTemplateRequestBodyFieldsOptionsStaticConfigClassificationField() {}

  protected CreateClassificationTemplateRequestBodyFieldsOptionsStaticConfigClassificationField(
      CreateClassificationTemplateRequestBodyFieldsOptionsStaticConfigClassificationFieldBuilder
          builder) {
    this.classificationDefinition = builder.classificationDefinition;
    this.colorId = builder.colorId;
  }

  public String getClassificationDefinition() {
    return classificationDefinition;
  }

  public Long getColorId() {
    return colorId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClassificationTemplateRequestBodyFieldsOptionsStaticConfigClassificationField casted =
        (CreateClassificationTemplateRequestBodyFieldsOptionsStaticConfigClassificationField) o;
    return Objects.equals(classificationDefinition, casted.classificationDefinition)
        && Objects.equals(colorId, casted.colorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classificationDefinition, colorId);
  }

  @Override
  public String toString() {
    return "CreateClassificationTemplateRequestBodyFieldsOptionsStaticConfigClassificationField{"
        + "classificationDefinition='"
        + classificationDefinition
        + '\''
        + ", "
        + "colorId='"
        + colorId
        + '\''
        + "}";
  }

  public static
  class CreateClassificationTemplateRequestBodyFieldsOptionsStaticConfigClassificationFieldBuilder {

    protected String classificationDefinition;

    protected Long colorId;

    public
    CreateClassificationTemplateRequestBodyFieldsOptionsStaticConfigClassificationFieldBuilder
        classificationDefinition(String classificationDefinition) {
      this.classificationDefinition = classificationDefinition;
      return this;
    }

    public
    CreateClassificationTemplateRequestBodyFieldsOptionsStaticConfigClassificationFieldBuilder
        colorId(Long colorId) {
      this.colorId = colorId;
      return this;
    }

    public CreateClassificationTemplateRequestBodyFieldsOptionsStaticConfigClassificationField
        build() {
      return new CreateClassificationTemplateRequestBodyFieldsOptionsStaticConfigClassificationField(
          this);
    }
  }
}
