package com.box.sdkgen.managers.folders;

import com.box.sdkgen.internal.SerializableObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateFolderByIdRequestBodyParentField extends SerializableObject {

  protected String id;

  @JsonProperty("user_id")
  protected String userId;

  public UpdateFolderByIdRequestBodyParentField() {
    super();
  }

  protected UpdateFolderByIdRequestBodyParentField(
      UpdateFolderByIdRequestBodyParentFieldBuilder builder) {
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
    UpdateFolderByIdRequestBodyParentField casted = (UpdateFolderByIdRequestBodyParentField) o;
    return Objects.equals(id, casted.id) && Objects.equals(userId, casted.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId);
  }

  @Override
  public String toString() {
    return "UpdateFolderByIdRequestBodyParentField{"
        + "id='"
        + id
        + '\''
        + ", "
        + "userId='"
        + userId
        + '\''
        + "}";
  }

  public static class UpdateFolderByIdRequestBodyParentFieldBuilder {

    protected String id;

    protected String userId;

    public UpdateFolderByIdRequestBodyParentFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public UpdateFolderByIdRequestBodyParentFieldBuilder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public UpdateFolderByIdRequestBodyParentField build() {
      return new UpdateFolderByIdRequestBodyParentField(this);
    }
  }
}
