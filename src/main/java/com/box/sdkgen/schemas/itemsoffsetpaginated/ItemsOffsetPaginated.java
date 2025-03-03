package com.box.sdkgen.schemas.itemsoffsetpaginated;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.schemas.filefullorfolderfullorweblink.FileFullOrFolderFullOrWebLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class ItemsOffsetPaginated extends SerializableObject {

  @JsonProperty("total_count")
  protected Long totalCount;

  protected Long limit;

  protected Long offset;

  protected List<ItemsOffsetPaginatedOrderField> order;

  protected List<FileFullOrFolderFullOrWebLink> entries;

  public ItemsOffsetPaginated() {
    super();
  }

  protected ItemsOffsetPaginated(ItemsOffsetPaginatedBuilder builder) {
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

  public List<ItemsOffsetPaginatedOrderField> getOrder() {
    return order;
  }

  public List<FileFullOrFolderFullOrWebLink> getEntries() {
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
    ItemsOffsetPaginated casted = (ItemsOffsetPaginated) o;
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
    return "ItemsOffsetPaginated{"
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

  public static class ItemsOffsetPaginatedBuilder {

    protected Long totalCount;

    protected Long limit;

    protected Long offset;

    protected List<ItemsOffsetPaginatedOrderField> order;

    protected List<FileFullOrFolderFullOrWebLink> entries;

    public ItemsOffsetPaginatedBuilder totalCount(Long totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    public ItemsOffsetPaginatedBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public ItemsOffsetPaginatedBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public ItemsOffsetPaginatedBuilder order(List<ItemsOffsetPaginatedOrderField> order) {
      this.order = order;
      return this;
    }

    public ItemsOffsetPaginatedBuilder entries(List<FileFullOrFolderFullOrWebLink> entries) {
      this.entries = entries;
      return this;
    }

    public ItemsOffsetPaginated build() {
      return new ItemsOffsetPaginated(this);
    }
  }
}
