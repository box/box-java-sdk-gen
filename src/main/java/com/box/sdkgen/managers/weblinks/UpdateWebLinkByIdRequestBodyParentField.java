package com.box.sdkgen.managers.weblinks;

import java.util.Objects;

public class UpdateWebLinkByIdRequestBodyParentField {

  protected String id;

  public UpdateWebLinkByIdRequestBodyParentField() {}

  protected UpdateWebLinkByIdRequestBodyParentField(
      UpdateWebLinkByIdRequestBodyParentFieldBuilder builder) {
    this.id = builder.id;
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
    UpdateWebLinkByIdRequestBodyParentField casted = (UpdateWebLinkByIdRequestBodyParentField) o;
    return Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "UpdateWebLinkByIdRequestBodyParentField{" + "id='" + id + '\'' + "}";
  }

  public static class UpdateWebLinkByIdRequestBodyParentFieldBuilder {

    protected String id;

    public UpdateWebLinkByIdRequestBodyParentFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public UpdateWebLinkByIdRequestBodyParentField build() {
      return new UpdateWebLinkByIdRequestBodyParentField(this);
    }
  }
}
