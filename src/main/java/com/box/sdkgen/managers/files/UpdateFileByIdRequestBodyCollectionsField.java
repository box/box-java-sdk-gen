package com.box.sdkgen.managers.files;

import com.box.sdkgen.internal.SerializableObject;
import java.util.Objects;

public class UpdateFileByIdRequestBodyCollectionsField extends SerializableObject {

  protected String id;

  protected String type;

  public UpdateFileByIdRequestBodyCollectionsField() {
    super();
  }

  protected UpdateFileByIdRequestBodyCollectionsField(
      UpdateFileByIdRequestBodyCollectionsFieldBuilder builder) {
    super();
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
    UpdateFileByIdRequestBodyCollectionsField casted =
        (UpdateFileByIdRequestBodyCollectionsField) o;
    return Objects.equals(id, casted.id) && Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    return "UpdateFileByIdRequestBodyCollectionsField{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + "}";
  }

  public static class UpdateFileByIdRequestBodyCollectionsFieldBuilder {

    protected String id;

    protected String type;

    public UpdateFileByIdRequestBodyCollectionsFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public UpdateFileByIdRequestBodyCollectionsFieldBuilder type(String type) {
      this.type = type;
      return this;
    }

    public UpdateFileByIdRequestBodyCollectionsField build() {
      return new UpdateFileByIdRequestBodyCollectionsField(this);
    }
  }
}
