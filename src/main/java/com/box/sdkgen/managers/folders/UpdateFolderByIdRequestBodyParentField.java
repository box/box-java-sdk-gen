package com.box.sdkgen.managers.folders;

import com.box.sdkgen.internal.SerializableObject;
import java.util.Objects;

public class UpdateFolderByIdRequestBodyParentField extends SerializableObject {

  protected String id;

  public UpdateFolderByIdRequestBodyParentField() {
    super();
  }

  protected UpdateFolderByIdRequestBodyParentField(
      UpdateFolderByIdRequestBodyParentFieldBuilder builder) {
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
    UpdateFolderByIdRequestBodyParentField casted = (UpdateFolderByIdRequestBodyParentField) o;
    return Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "UpdateFolderByIdRequestBodyParentField{" + "id='" + id + '\'' + "}";
  }

  public static class UpdateFolderByIdRequestBodyParentFieldBuilder {

    protected String id;

    public UpdateFolderByIdRequestBodyParentFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public UpdateFolderByIdRequestBodyParentField build() {
      return new UpdateFolderByIdRequestBodyParentField(this);
    }
  }
}
