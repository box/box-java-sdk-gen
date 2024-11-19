package com.box.sdkgen.managers.files;

import com.box.sdkgen.internal.SerializableObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CopyFileRequestBodyParentField extends SerializableObject {

  protected final String id;

  public CopyFileRequestBodyParentField(@JsonProperty("id") String id) {
    super();
    this.id = id;
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
    CopyFileRequestBodyParentField casted = (CopyFileRequestBodyParentField) o;
    return Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "CopyFileRequestBodyParentField{" + "id='" + id + '\'' + "}";
  }
}
