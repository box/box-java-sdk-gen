package com.box.sdkgen.schemas.filesunderretention;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.filemini.FileMini;

public class FilesUnderRetention {

  protected Long limit;

  @JsonProperty("next_marker")
  protected String nextMarker;

  @JsonProperty("prev_marker")
  protected String prevMarker;

  protected List<FileMini> entries;

  public FilesUnderRetention() {
  }

  protected FilesUnderRetention(FilesUnderRetentionBuilder builder) {
    this.limit = builder.limit;
    this.nextMarker = builder.nextMarker;
    this.prevMarker = builder.prevMarker;
    this.entries = builder.entries;
  }

  public Long getLimit() {
    return limit;
  }

  public String getNextMarker() {
    return nextMarker;
  }

  public String getPrevMarker() {
    return prevMarker;
  }

  public List<FileMini> getEntries() {
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
    FilesUnderRetention casted = (FilesUnderRetention) o;
    return Objects.equals(limit, casted.limit) &&
      Objects.equals(nextMarker, casted.nextMarker) &&
      Objects.equals(prevMarker, casted.prevMarker) &&
      Objects.equals(entries, casted.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      limit, nextMarker, prevMarker, entries
    );
  }

  @Override
  public String toString() {
    return "FilesUnderRetention{" + "limit='" + limit + '\'' + ", " + "nextMarker='" + nextMarker + '\'' + ", " + "prevMarker='" + prevMarker + '\'' + ", " + "entries='" + entries + '\'' + "}";
  }

  public static class FilesUnderRetentionBuilder {

    protected Long limit;

    protected String nextMarker;

    protected String prevMarker;

    protected List<FileMini> entries;

    public FilesUnderRetentionBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public FilesUnderRetentionBuilder nextMarker(String nextMarker) {
      this.nextMarker = nextMarker;
      return this;
    }

    public FilesUnderRetentionBuilder prevMarker(String prevMarker) {
      this.prevMarker = prevMarker;
      return this;
    }

    public FilesUnderRetentionBuilder entries(List<FileMini> entries) {
      this.entries = entries;
      return this;
    }

    public FilesUnderRetention build() {
      return new FilesUnderRetention(this);
    }

  }

}
