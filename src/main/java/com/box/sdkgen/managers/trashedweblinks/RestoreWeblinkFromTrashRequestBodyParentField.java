package com.box.sdkgen.managers.trashedweblinks;

import com.box.sdkgen.internal.SerializableObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class RestoreWeblinkFromTrashRequestBodyParentField extends SerializableObject {

  protected String id;

  @JsonProperty("user_id")
  protected String userId;

  public RestoreWeblinkFromTrashRequestBodyParentField() {
    super();
  }

  protected RestoreWeblinkFromTrashRequestBodyParentField(
      RestoreWeblinkFromTrashRequestBodyParentFieldBuilder builder) {
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
    RestoreWeblinkFromTrashRequestBodyParentField casted =
        (RestoreWeblinkFromTrashRequestBodyParentField) o;
    return Objects.equals(id, casted.id) && Objects.equals(userId, casted.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId);
  }

  @Override
  public String toString() {
    return "RestoreWeblinkFromTrashRequestBodyParentField{"
        + "id='"
        + id
        + '\''
        + ", "
        + "userId='"
        + userId
        + '\''
        + "}";
  }

  public static class RestoreWeblinkFromTrashRequestBodyParentFieldBuilder {

    protected String id;

    protected String userId;

    public RestoreWeblinkFromTrashRequestBodyParentFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public RestoreWeblinkFromTrashRequestBodyParentFieldBuilder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public RestoreWeblinkFromTrashRequestBodyParentField build() {
      return new RestoreWeblinkFromTrashRequestBodyParentField(this);
    }
  }
}
