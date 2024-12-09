package com.box.sdkgen.managers.trashedfiles;

import com.box.sdkgen.internal.SerializableObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class RestoreFileFromTrashRequestBodyParentField extends SerializableObject {

  protected String id;

  @JsonProperty("user_id")
  protected String userId;

  public RestoreFileFromTrashRequestBodyParentField() {
    super();
  }

  protected RestoreFileFromTrashRequestBodyParentField(
      RestoreFileFromTrashRequestBodyParentFieldBuilder builder) {
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
    RestoreFileFromTrashRequestBodyParentField casted =
        (RestoreFileFromTrashRequestBodyParentField) o;
    return Objects.equals(id, casted.id) && Objects.equals(userId, casted.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId);
  }

  @Override
  public String toString() {
    return "RestoreFileFromTrashRequestBodyParentField{"
        + "id='"
        + id
        + '\''
        + ", "
        + "userId='"
        + userId
        + '\''
        + "}";
  }

  public static class RestoreFileFromTrashRequestBodyParentFieldBuilder {

    protected String id;

    protected String userId;

    public RestoreFileFromTrashRequestBodyParentFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public RestoreFileFromTrashRequestBodyParentFieldBuilder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public RestoreFileFromTrashRequestBodyParentField build() {
      return new RestoreFileFromTrashRequestBodyParentField(this);
    }
  }
}
