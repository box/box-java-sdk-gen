package com.box.sdkgen.schemas.comments;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.schemas.commentfull.CommentFull;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class Comments extends SerializableObject {

  @JsonProperty("total_count")
  protected Long totalCount;

  protected Long limit;

  protected Long offset;

  protected List<CommentsOrderField> order;

  protected List<CommentFull> entries;

  public Comments() {
    super();
  }

  protected Comments(CommentsBuilder builder) {
    super();
    this.totalCount = builder.totalCount;
    this.limit = builder.limit;
    this.offset = builder.offset;
    this.order = builder.order;
    this.entries = builder.entries;
  }

  public Long getTotalCount() {
    return totalCount;
  }

  public Long getLimit() {
    return limit;
  }

  public Long getOffset() {
    return offset;
  }

  public List<CommentsOrderField> getOrder() {
    return order;
  }

  public List<CommentFull> getEntries() {
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
    Comments casted = (Comments) o;
    return Objects.equals(totalCount, casted.totalCount)
        && Objects.equals(limit, casted.limit)
        && Objects.equals(offset, casted.offset)
        && Objects.equals(order, casted.order)
        && Objects.equals(entries, casted.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, limit, offset, order, entries);
  }

  @Override
  public String toString() {
    return "Comments{"
        + "totalCount='"
        + totalCount
        + '\''
        + ", "
        + "limit='"
        + limit
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

  public static class CommentsBuilder {

    protected Long totalCount;

    protected Long limit;

    protected Long offset;

    protected List<CommentsOrderField> order;

    protected List<CommentFull> entries;

    public CommentsBuilder totalCount(Long totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    public CommentsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public CommentsBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public CommentsBuilder order(List<CommentsOrderField> order) {
      this.order = order;
      return this;
    }

    public CommentsBuilder entries(List<CommentFull> entries) {
      this.entries = entries;
      return this;
    }

    public Comments build() {
      return new Comments(this);
    }
  }
}
