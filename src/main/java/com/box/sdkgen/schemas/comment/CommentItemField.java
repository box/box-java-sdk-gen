package com.box.sdkgen.schemas.comment;

import java.util.Objects;

public class CommentItemField {

  protected String id;

  protected String type;

  public CommentItemField() {}

  protected CommentItemField(CommentItemFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentItemField casted = (CommentItemField) o;
    return Objects.equals(id, casted.id) && Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    return "CommentItemField{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class CommentItemFieldBuilder {

    protected String id;

    protected String type;

    public CommentItemFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public CommentItemFieldBuilder type(String type) {
      this.type = type;
      return this;
    }

    public CommentItemField build() {
      return new CommentItemField(this);
    }
  }
}
