package com.box.sdkgen.managers.trashedfolders;

import com.box.sdkgen.internal.SerializableObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class RestoreFolderFromTrashRequestBodyParentField extends SerializableObject {

  protected String id;

  @JsonProperty("user_id")
  protected String userId;

  public RestoreFolderFromTrashRequestBodyParentField() {
    super();
  }

  protected RestoreFolderFromTrashRequestBodyParentField(
      RestoreFolderFromTrashRequestBodyParentFieldBuilder builder) {
    super();
    this.id = builder.id;
    this.userId = builder.userId;
  }

  public String getId() {
    return id;
  }

  public String getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreFolderFromTrashRequestBodyParentField casted =
        (RestoreFolderFromTrashRequestBodyParentField) o;
    return Objects.equals(id, casted.id) && Objects.equals(userId, casted.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId);
  }

  @Override
  public String toString() {
    return "RestoreFolderFromTrashRequestBodyParentField{"
        + "id='"
        + id
        + '\''
        + ", "
        + "userId='"
        + userId
        + '\''
        + "}";
  }

  public static class RestoreFolderFromTrashRequestBodyParentFieldBuilder {

    protected String id;

    protected String userId;

    public RestoreFolderFromTrashRequestBodyParentFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public RestoreFolderFromTrashRequestBodyParentFieldBuilder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public RestoreFolderFromTrashRequestBodyParentField build() {
      return new RestoreFolderFromTrashRequestBodyParentField(this);
    }
  }
}
