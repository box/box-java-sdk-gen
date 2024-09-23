package com.box.sdkgen.schemas.filefull;

import java.util.List;
import java.util.Objects;

public class FileFullRepresentationsField {

  protected List<FileFullRepresentationsEntriesField> entries;

  public FileFullRepresentationsField() {}

  protected FileFullRepresentationsField(FileFullRepresentationsFieldBuilder builder) {
    this.entries = builder.entries;
  }

  public List<FileFullRepresentationsEntriesField> getEntries() {
    return entries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileFullRepresentationsField casted = (FileFullRepresentationsField) o;
    return Objects.equals(entries, casted.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries);
  }

  @Override
  public String toString() {
    return "FileFullRepresentationsField{" + "entries='" + entries + '\'' + "}";
  }

  public static class FileFullRepresentationsFieldBuilder {

    protected List<FileFullRepresentationsEntriesField> entries;

    public FileFullRepresentationsFieldBuilder entries(
        List<FileFullRepresentationsEntriesField> entries) {
      this.entries = entries;
      return this;
    }

    public FileFullRepresentationsField build() {
      return new FileFullRepresentationsField(this);
    }
  }
}
