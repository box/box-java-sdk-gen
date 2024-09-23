package com.box.sdkgen.schemas.collaborations;

import com.box.sdkgen.schemas.collaboration.Collaboration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class Collaborations {

  protected Long limit;

  @JsonProperty("next_marker")
  protected String nextMarker;

  @JsonProperty("prev_marker")
  protected String prevMarker;

  @JsonProperty("total_count")
  protected Long totalCount;

  protected Long offset;

  protected List<CollaborationsOrderField> order;

  protected List<Collaboration> entries;

  public Collaborations() {}

  protected Collaborations(CollaborationsBuilder builder) {
    this.limit = builder.limit;
    this.nextMarker = builder.nextMarker;
    this.prevMarker = builder.prevMarker;
    this.totalCount = builder.totalCount;
    this.offset = builder.offset;
    this.order = builder.order;
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

  public Long getTotalCount() {
    return totalCount;
  }

  public Long getOffset() {
    return offset;
  }

  public List<CollaborationsOrderField> getOrder() {
    return order;
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
        && Objects.equals(totalCount, casted.totalCount)
        && Objects.equals(offset, casted.offset)
        && Objects.equals(order, casted.order)
        && Objects.equals(entries, casted.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, nextMarker, prevMarker, totalCount, offset, order, entries);
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
        + "totalCount='"
        + totalCount
        + '\''
        + ", "
        + "offset='"
        + offset
        + '\''
        + ", "
        + "order='"
        + order
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

    protected Long totalCount;

    protected Long offset;

    protected List<CollaborationsOrderField> order;

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

    public CollaborationsBuilder totalCount(Long totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    public CollaborationsBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public CollaborationsBuilder order(List<CollaborationsOrderField> order) {
      this.order = order;
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
