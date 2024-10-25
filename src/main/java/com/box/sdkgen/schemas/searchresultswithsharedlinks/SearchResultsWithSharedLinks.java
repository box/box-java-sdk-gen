package com.box.sdkgen.schemas.searchresultswithsharedlinks;

import com.box.sdkgen.schemas.searchresultwithsharedlink.SearchResultWithSharedLink;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import java.util.Objects;

public class SearchResultsWithSharedLinks {

  @JsonProperty("total_count")
  protected Long totalCount;

  protected Long limit;

  protected Long offset;

  @JsonDeserialize(
      using =
          SearchResultsWithSharedLinksTypeField.SearchResultsWithSharedLinksTypeFieldDeserializer
              .class)
  @JsonSerialize(
      using =
          SearchResultsWithSharedLinksTypeField.SearchResultsWithSharedLinksTypeFieldSerializer
              .class)
  protected EnumWrapper<SearchResultsWithSharedLinksTypeField> type;

  protected List<SearchResultWithSharedLink> entries;

  public SearchResultsWithSharedLinks() {
    this.type =
        new EnumWrapper<SearchResultsWithSharedLinksTypeField>(
            SearchResultsWithSharedLinksTypeField.SEARCH_RESULTS_WITH_SHARED_LINKS.getValue(),
            SearchResultsWithSharedLinksTypeField.SEARCH_RESULTS_WITH_SHARED_LINKS);
  }

  protected SearchResultsWithSharedLinks(SearchResultsWithSharedLinksBuilder builder) {
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

  public EnumWrapper<SearchResultsWithSharedLinksTypeField> getType() {
    return type;
  }

  public List<SearchResultWithSharedLink> getEntries() {
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
    SearchResultsWithSharedLinks casted = (SearchResultsWithSharedLinks) o;
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
    return "SearchResultsWithSharedLinks{"
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

  public static class SearchResultsWithSharedLinksBuilder {

    protected Long totalCount;

    protected Long limit;

    protected Long offset;

    protected EnumWrapper<SearchResultsWithSharedLinksTypeField> type;

    protected List<SearchResultWithSharedLink> entries;

    public SearchResultsWithSharedLinksBuilder totalCount(Long totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    public SearchResultsWithSharedLinksBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public SearchResultsWithSharedLinksBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public SearchResultsWithSharedLinksBuilder type(
        EnumWrapper<SearchResultsWithSharedLinksTypeField> type) {
      this.type = type;
      return this;
    }

    public SearchResultsWithSharedLinksBuilder type(SearchResultsWithSharedLinksTypeField type) {
      this.type = new EnumWrapper<SearchResultsWithSharedLinksTypeField>(type.getValue(), type);
      return this;
    }

    public SearchResultsWithSharedLinksBuilder entries(List<SearchResultWithSharedLink> entries) {
      this.entries = entries;
      return this;
    }

    public SearchResultsWithSharedLinks build() {
      return new SearchResultsWithSharedLinks(this);
    }
  }
}
