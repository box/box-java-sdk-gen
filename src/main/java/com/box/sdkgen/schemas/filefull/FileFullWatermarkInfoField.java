package com.box.sdkgen.schemas.filefull;

import com.box.sdkgen.internal.SerializableObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class FileFullWatermarkInfoField extends SerializableObject {

  @JsonProperty("is_watermarked")
  protected Boolean isWatermarked;

  public FileFullWatermarkInfoField() {
    super();
  }

  protected FileFullWatermarkInfoField(FileFullWatermarkInfoFieldBuilder builder) {
    super();
    this.isWatermarked = builder.isWatermarked;
  }

  public Boolean getIsWatermarked() {
    return isWatermarked;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileFullWatermarkInfoField casted = (FileFullWatermarkInfoField) o;
    return Objects.equals(isWatermarked, casted.isWatermarked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isWatermarked);
  }

  @Override
  public String toString() {
    return "FileFullWatermarkInfoField{" + "isWatermarked='" + isWatermarked + '\'' + "}";
  }

  public static class FileFullWatermarkInfoFieldBuilder {

    protected Boolean isWatermarked;

    public FileFullWatermarkInfoFieldBuilder isWatermarked(Boolean isWatermarked) {
      this.isWatermarked = isWatermarked;
      return this;
    }

    public FileFullWatermarkInfoField build() {
      return new FileFullWatermarkInfoField(this);
    }
  }
}
