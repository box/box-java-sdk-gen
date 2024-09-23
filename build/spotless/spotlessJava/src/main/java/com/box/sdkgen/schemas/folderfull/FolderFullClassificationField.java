package com.box.sdkgen.schemas.folderfull;

import java.util.Objects;

public class FolderFullClassificationField {

  protected String name;

  protected String definition;

  protected String color;

  public FolderFullClassificationField() {}

  protected FolderFullClassificationField(FolderFullClassificationFieldBuilder builder) {
    this.name = builder.name;
    this.definition = builder.definition;
    this.color = builder.color;
  }

  public String getName() {
    return name;
  }

  public String getDefinition() {
    return definition;
  }

  public String getColor() {
    return color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderFullClassificationField casted = (FolderFullClassificationField) o;
    return Objects.equals(name, casted.name)
        && Objects.equals(definition, casted.definition)
        && Objects.equals(color, casted.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, definition, color);
  }

  @Override
  public String toString() {
    return "FolderFullClassificationField{"
        + "name='"
        + name
        + '\''
        + ", "
        + "definition='"
        + definition
        + '\''
        + ", "
        + "color='"
        + color
        + '\''
        + "}";
  }

  public static class FolderFullClassificationFieldBuilder {

    protected String name;

    protected String definition;

    protected String color;

    public FolderFullClassificationFieldBuilder name(String name) {
      this.name = name;
      return this;
    }

    public FolderFullClassificationFieldBuilder definition(String definition) {
      this.definition = definition;
      return this;
    }

    public FolderFullClassificationFieldBuilder color(String color) {
      this.color = color;
      return this;
    }

    public FolderFullClassificationField build() {
      return new FolderFullClassificationField(this);
    }
  }
}
