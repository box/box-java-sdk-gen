package com.box.sdkgen.schemas.filefull;

import java.util.Objects;

public class FileFullRepresentationsEntriesInfoField {

  protected String url;

  public FileFullRepresentationsEntriesInfoField() {}

  protected FileFullRepresentationsEntriesInfoField(
      FileFullRepresentationsEntriesInfoFieldBuilder builder) {
    this.url = builder.url;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileFullRepresentationsEntriesInfoField casted = (FileFullRepresentationsEntriesInfoField) o;
    return Objects.equals(url, casted.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    return "FileFullRepresentationsEntriesInfoField{" + "url='" + url + '\'' + "}";
  }

  public static class FileFullRepresentationsEntriesInfoFieldBuilder {

    protected String url;

    public FileFullRepresentationsEntriesInfoFieldBuilder url(String url) {
      this.url = url;
      return this;
    }

    public FileFullRepresentationsEntriesInfoField build() {
      return new FileFullRepresentationsEntriesInfoField(this);
    }
  }
}
