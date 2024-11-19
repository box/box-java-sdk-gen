package com.box.sdkgen.managers.files;

import com.box.sdkgen.internal.SerializableObject;
import java.util.Objects;

public class UpdateFileByIdRequestBodyParentField extends SerializableObject {

  protected String id;

  public UpdateFileByIdRequestBodyParentField() {
    super();
  }

  protected UpdateFileByIdRequestBodyParentField(
      UpdateFileByIdRequestBodyParentFieldBuilder builder) {
    super();
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
    UpdateFileByIdRequestBodyParentField casted = (UpdateFileByIdRequestBodyParentField) o;
    return Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "UpdateFileByIdRequestBodyParentField{" + "id='" + id + '\'' + "}";
  }

  public static class UpdateFileByIdRequestBodyParentFieldBuilder {

    protected String id;

    public UpdateFileByIdRequestBodyParentFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public UpdateFileByIdRequestBodyParentField build() {
      return new UpdateFileByIdRequestBodyParentField(this);
    }
  }
}
