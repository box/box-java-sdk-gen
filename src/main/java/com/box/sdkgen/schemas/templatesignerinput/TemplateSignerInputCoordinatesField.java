package com.box.sdkgen.schemas.templatesignerinput;

import java.util.Objects;

public class TemplateSignerInputCoordinatesField {

  protected Double x;

  protected Double y;

  public TemplateSignerInputCoordinatesField() {}

  protected TemplateSignerInputCoordinatesField(
      TemplateSignerInputCoordinatesFieldBuilder builder) {
    this.x = builder.x;
    this.y = builder.y;
  }

  public Double getX() {
    return x;
  }

  public Double getY() {
    return y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateSignerInputCoordinatesField casted = (TemplateSignerInputCoordinatesField) o;
    return Objects.equals(x, casted.x) && Objects.equals(y, casted.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public String toString() {
    return "TemplateSignerInputCoordinatesField{"
        + "x='"
        + x
        + '\''
        + ", "
        + "y='"
        + y
        + '\''
        + "}";
  }

  public static class TemplateSignerInputCoordinatesFieldBuilder {

    protected Double x;

    protected Double y;

    public TemplateSignerInputCoordinatesFieldBuilder x(Double x) {
      this.x = x;
      return this;
    }

    public TemplateSignerInputCoordinatesFieldBuilder y(Double y) {
      this.y = y;
      return this;
    }

    public TemplateSignerInputCoordinatesField build() {
      return new TemplateSignerInputCoordinatesField(this);
    }
  }
}
