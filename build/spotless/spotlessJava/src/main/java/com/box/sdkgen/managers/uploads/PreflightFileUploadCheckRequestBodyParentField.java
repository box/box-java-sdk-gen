package com.box.sdkgen.managers.uploads;

import java.util.Objects;

public class PreflightFileUploadCheckRequestBodyParentField {

  protected String id;

  public PreflightFileUploadCheckRequestBodyParentField() {}

  protected PreflightFileUploadCheckRequestBodyParentField(
      PreflightFileUploadCheckRequestBodyParentFieldBuilder builder) {
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
    PreflightFileUploadCheckRequestBodyParentField casted =
        (PreflightFileUploadCheckRequestBodyParentField) o;
    return Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "PreflightFileUploadCheckRequestBodyParentField{" + "id='" + id + '\'' + "}";
  }

  public static class PreflightFileUploadCheckRequestBodyParentFieldBuilder {

    protected String id;

    public PreflightFileUploadCheckRequestBodyParentFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public PreflightFileUploadCheckRequestBodyParentField build() {
      return new PreflightFileUploadCheckRequestBodyParentField(this);
    }
  }
}
