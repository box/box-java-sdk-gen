package com.box.sdkgen.managers.uploads;

import com.box.sdkgen.internal.SerializableObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class PreflightFileUploadCheckRequestBodyParentField extends SerializableObject {

  protected String id;

  @JsonProperty("user_id")
  protected String userId;

  public PreflightFileUploadCheckRequestBodyParentField() {
    super();
  }

  protected PreflightFileUploadCheckRequestBodyParentField(
      PreflightFileUploadCheckRequestBodyParentFieldBuilder builder) {
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
    PreflightFileUploadCheckRequestBodyParentField casted =
        (PreflightFileUploadCheckRequestBodyParentField) o;
    return Objects.equals(id, casted.id) && Objects.equals(userId, casted.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId);
  }

  @Override
  public String toString() {
    return "PreflightFileUploadCheckRequestBodyParentField{"
        + "id='"
        + id
        + '\''
        + ", "
        + "userId='"
        + userId
        + '\''
        + "}";
  }

  public static class PreflightFileUploadCheckRequestBodyParentFieldBuilder {

    protected String id;

    protected String userId;

    public PreflightFileUploadCheckRequestBodyParentFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public PreflightFileUploadCheckRequestBodyParentFieldBuilder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public PreflightFileUploadCheckRequestBodyParentField build() {
      return new PreflightFileUploadCheckRequestBodyParentField(this);
    }
  }
}
