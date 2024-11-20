package com.box.sdkgen.schemas.filefull;

import com.box.sdkgen.internal.SerializableObject;
import java.util.Objects;

public class FileFullRepresentationsEntriesPropertiesField extends SerializableObject {

  protected String dimensions;

  protected Boolean paged;

  protected Boolean thumb;

  public FileFullRepresentationsEntriesPropertiesField() {
    super();
  }

  protected FileFullRepresentationsEntriesPropertiesField(
      FileFullRepresentationsEntriesPropertiesFieldBuilder builder) {
    super();
    this.dimensions = builder.dimensions;
    this.paged = builder.paged;
    this.thumb = builder.thumb;
  }

  public String getDimensions() {
    return dimensions;
  }

  public Boolean getPaged() {
    return paged;
  }

  public Boolean getThumb() {
    return thumb;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileFullRepresentationsEntriesPropertiesField casted =
        (FileFullRepresentationsEntriesPropertiesField) o;
    return Objects.equals(dimensions, casted.dimensions)
        && Objects.equals(paged, casted.paged)
        && Objects.equals(thumb, casted.thumb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, paged, thumb);
  }

  @Override
  public String toString() {
    return "FileFullRepresentationsEntriesPropertiesField{"
        + "dimensions='"
        + dimensions
        + '\''
        + ", "
        + "paged='"
        + paged
        + '\''
        + ", "
        + "thumb='"
        + thumb
        + '\''
        + "}";
  }

  public static class FileFullRepresentationsEntriesPropertiesFieldBuilder {

    protected String dimensions;

    protected Boolean paged;

    protected Boolean thumb;

    public FileFullRepresentationsEntriesPropertiesFieldBuilder dimensions(String dimensions) {
      this.dimensions = dimensions;
      return this;
    }

    public FileFullRepresentationsEntriesPropertiesFieldBuilder paged(Boolean paged) {
      this.paged = paged;
      return this;
    }

    public FileFullRepresentationsEntriesPropertiesFieldBuilder thumb(Boolean thumb) {
      this.thumb = thumb;
      return this;
    }

    public FileFullRepresentationsEntriesPropertiesField build() {
      return new FileFullRepresentationsEntriesPropertiesField(this);
    }
  }
}
