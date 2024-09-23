package com.box.sdkgen.managers.classifications;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateClassificationRequestBodyDataStaticConfigClassificationField {

  protected String classificationDefinition;

  @JsonProperty("colorID")
  protected Long colorId;

  public UpdateClassificationRequestBodyDataStaticConfigClassificationField() {}

  protected UpdateClassificationRequestBodyDataStaticConfigClassificationField(
      UpdateClassificationRequestBodyDataStaticConfigClassificationFieldBuilder builder) {
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
    UpdateClassificationRequestBodyDataStaticConfigClassificationField casted =
        (UpdateClassificationRequestBodyDataStaticConfigClassificationField) o;
    return Objects.equals(classificationDefinition, casted.classificationDefinition)
        && Objects.equals(colorId, casted.colorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classificationDefinition, colorId);
  }

  @Override
  public String toString() {
    return "UpdateClassificationRequestBodyDataStaticConfigClassificationField{"
        + "classificationDefinition='"
        + classificationDefinition
        + '\''
        + ", "
        + "colorId='"
        + colorId
        + '\''
        + "}";
  }

  public static class UpdateClassificationRequestBodyDataStaticConfigClassificationFieldBuilder {

    protected String classificationDefinition;

    protected Long colorId;

    public UpdateClassificationRequestBodyDataStaticConfigClassificationFieldBuilder
        classificationDefinition(String classificationDefinition) {
      this.classificationDefinition = classificationDefinition;
      return this;
    }

    public UpdateClassificationRequestBodyDataStaticConfigClassificationFieldBuilder colorId(
        Long colorId) {
      this.colorId = colorId;
      return this;
    }

    public UpdateClassificationRequestBodyDataStaticConfigClassificationField build() {
      return new UpdateClassificationRequestBodyDataStaticConfigClassificationField(this);
    }
  }
}
