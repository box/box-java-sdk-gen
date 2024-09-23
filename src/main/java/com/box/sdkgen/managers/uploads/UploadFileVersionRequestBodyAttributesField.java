package com.box.sdkgen.managers.uploads;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UploadFileVersionRequestBodyAttributesField {

  protected final String name;

  @JsonProperty("content_modified_at")
  protected String contentModifiedAt;

  public UploadFileVersionRequestBodyAttributesField(@JsonProperty("name") String name) {
    this.name = name;
  }

  protected UploadFileVersionRequestBodyAttributesField(
      UploadFileVersionRequestBodyAttributesFieldBuilder builder) {
    this.name = builder.name;
    this.contentModifiedAt = builder.contentModifiedAt;
  }

  public String getName() {
    return name;
  }

  public String getContentModifiedAt() {
    return contentModifiedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadFileVersionRequestBodyAttributesField casted =
        (UploadFileVersionRequestBodyAttributesField) o;
    return Objects.equals(name, casted.name)
        && Objects.equals(contentModifiedAt, casted.contentModifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contentModifiedAt);
  }

  @Override
  public String toString() {
    return "UploadFileVersionRequestBodyAttributesField{"
        + "name='"
        + name
        + '\''
        + ", "
        + "contentModifiedAt='"
        + contentModifiedAt
        + '\''
        + "}";
  }

  public static class UploadFileVersionRequestBodyAttributesFieldBuilder {

    protected final String name;

    protected String contentModifiedAt;

    public UploadFileVersionRequestBodyAttributesFieldBuilder(String name) {
      this.name = name;
    }

    public UploadFileVersionRequestBodyAttributesFieldBuilder contentModifiedAt(
        String contentModifiedAt) {
      this.contentModifiedAt = contentModifiedAt;
      return this;
    }

    public UploadFileVersionRequestBodyAttributesField build() {
      return new UploadFileVersionRequestBodyAttributesField(this);
    }
  }
}
