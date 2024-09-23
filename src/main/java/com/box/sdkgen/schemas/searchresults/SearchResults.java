package com.box.sdkgen.schemas.searchresults;

import com.box.sdkgen.schemas.filefullorfolderfullorweblink.FileFullOrFolderFullOrWebLink;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import java.util.Objects;

public class SearchResults {

  @JsonProperty("total_count")
  protected Long totalCount;

  protected Long limit;

  protected Long offset;

  @JsonDeserialize(using = SearchResultsTypeField.SearchResultsTypeFieldDeserializer.class)
  @JsonSerialize(using = SearchResultsTypeField.SearchResultsTypeFieldSerializer.class)
  protected EnumWrapper<SearchResultsTypeField> type;

  protected List<FileFullOrFolderFullOrWebLink> entries;

  public SearchResults() {
    this.type =
        new EnumWrapper<SearchResultsTypeField>(
            SearchResultsTypeField.SEARCH_RESULTS_ITEMS.getValue(),
            SearchResultsTypeField.SEARCH_RESULTS_ITEMS);
  }

  protected SearchResults(SearchResultsBuilder builder) {
    this.totalCount = builder.totalCount;
    this.limit = builder.limit;
    this.offset = builder.offset;
    this.type = builder.type;
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

  public EnumWrapper<SearchResultsTypeField> getType() {
    return type;
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
    SearchResults casted = (SearchResults) o;
    return Objects.equals(totalCount, casted.totalCount)
        && Objects.equals(limit, casted.limit)
        && Objects.equals(offset, casted.offset)
        && Objects.equals(type, casted.type)
        && Objects.equals(entries, casted.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, limit, offset, type, entries);
  }

  @Override
  public String toString() {
    return "SearchResults{"
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
        + "type='"
        + type
        + '\''
        + ", "
        + "entries='"
        + entries
        + '\''
        + "}";
  }

  public static class SearchResultsBuilder {

    protected Long totalCount;

    protected Long limit;

    protected Long offset;

    protected EnumWrapper<SearchResultsTypeField> type;

    protected List<FileFullOrFolderFullOrWebLink> entries;

    public SearchResultsBuilder totalCount(Long totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    public SearchResultsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public SearchResultsBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public SearchResultsBuilder type(SearchResultsTypeField type) {
      this.type = new EnumWrapper<SearchResultsTypeField>(type.getValue(), type);
      return this;
    }

    public SearchResultsBuilder entries(List<FileFullOrFolderFullOrWebLink> entries) {
      this.entries = entries;
      return this;
    }

    public SearchResults build() {
      return new SearchResults(this);
    }
  }
}
