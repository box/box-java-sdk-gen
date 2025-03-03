package com.box.sdkgen.managers.fileversions;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class PromoteFileVersionRequestBody extends SerializableObject {

  protected String id;

  @JsonDeserialize(
      using =
          PromoteFileVersionRequestBodyTypeField.PromoteFileVersionRequestBodyTypeFieldDeserializer
              .class)
  @JsonSerialize(
      using =
          PromoteFileVersionRequestBodyTypeField.PromoteFileVersionRequestBodyTypeFieldSerializer
              .class)
  protected EnumWrapper<PromoteFileVersionRequestBodyTypeField> type;

  public PromoteFileVersionRequestBody() {
    super();
  }

  protected PromoteFileVersionRequestBody(PromoteFileVersionRequestBodyBuilder builder) {
    super();
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<PromoteFileVersionRequestBodyTypeField> getType() {
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
    PromoteFileVersionRequestBody casted = (PromoteFileVersionRequestBody) o;
    return Objects.equals(id, casted.id) && Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    return "PromoteFileVersionRequestBody{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + "}";
  }

  public static class PromoteFileVersionRequestBodyBuilder {

    protected String id;

    protected EnumWrapper<PromoteFileVersionRequestBodyTypeField> type;

    public PromoteFileVersionRequestBodyBuilder id(String id) {
      this.id = id;
      return this;
    }

    public PromoteFileVersionRequestBodyBuilder type(PromoteFileVersionRequestBodyTypeField type) {
      this.type = new EnumWrapper<PromoteFileVersionRequestBodyTypeField>(type);
      return this;
    }

    public PromoteFileVersionRequestBodyBuilder type(
        EnumWrapper<PromoteFileVersionRequestBodyTypeField> type) {
      this.type = type;
      return this;
    }

    public PromoteFileVersionRequestBody build() {
      return new PromoteFileVersionRequestBody(this);
    }
  }
}
