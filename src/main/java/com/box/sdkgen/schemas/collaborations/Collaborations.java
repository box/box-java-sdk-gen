package com.box.sdkgen.schemas.collaborations;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.schemas.collaboration.Collaboration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class Collaborations extends SerializableObject {

  protected Long limit;

  @JsonProperty("next_marker")
  protected String nextMarker;

  @JsonProperty("prev_marker")
  protected String prevMarker;

  protected List<Collaboration> entries;

  public Collaborations() {
    super();
  }

  protected Collaborations(CollaborationsBuilder builder) {
    super();
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

  public List<Collaboration> getEntries() {
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
    Collaborations casted = (Collaborations) o;
    return Objects.equals(limit, casted.limit)
        && Objects.equals(nextMarker, casted.nextMarker)
        && Objects.equals(prevMarker, casted.prevMarker)
        && Objects.equals(entries, casted.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, nextMarker, prevMarker, entries);
  }

  @Override
  public String toString() {
    return "Collaborations{"
        + "limit='"
        + limit
        + '\''
        + ", "
        + "nextMarker='"
        + nextMarker
        + '\''
        + ", "
        + "prevMarker='"
        + prevMarker
        + '\''
        + ", "
        + "entries='"
        + entries
        + '\''
        + "}";
  }

  public static class CollaborationsBuilder {

    protected Long limit;

    protected String nextMarker;

    protected String prevMarker;

    protected List<Collaboration> entries;

    public CollaborationsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public CollaborationsBuilder nextMarker(String nextMarker) {
      this.nextMarker = nextMarker;
      return this;
    }

    public CollaborationsBuilder prevMarker(String prevMarker) {
      this.prevMarker = prevMarker;
      return this;
    }

    public CollaborationsBuilder entries(List<Collaboration> entries) {
      this.entries = entries;
      return this;
    }

    public Collaborations build() {
      return new Collaborations(this);
    }
  }
}
