package com.box.sdkgen.managers.search;

import com.box.sdkgen.schemas.metadatafilter.MetadataFilter;
import com.box.sdkgen.serialization.json.EnumWrapper;
import java.util.List;

public class SearchForContentQueryParams {

  public String query;

  public EnumWrapper<SearchForContentQueryParamsScopeField> scope;

  public List<String> fileExtensions;

  public List<String> createdAtRange;

  public List<String> updatedAtRange;

  public List<Long> sizeRange;

  public List<String> ownerUserIds;

  public List<String> recentUpdaterUserIds;

  public List<String> ancestorFolderIds;

  public List<SearchForContentQueryParamsContentTypesField> contentTypes;

  public EnumWrapper<SearchForContentQueryParamsTypeField> type;

  public EnumWrapper<SearchForContentQueryParamsTrashContentField> trashContent;

  public List<MetadataFilter> mdfilters;

  public EnumWrapper<SearchForContentQueryParamsSortField> sort;

  public EnumWrapper<SearchForContentQueryParamsDirectionField> direction;

  public Long limit;

  public Boolean includeRecentSharedLinks;

  public List<String> fields;

  public Long offset;

  public List<String> deletedUserIds;

  public List<String> deletedAtRange;

  public SearchForContentQueryParams() {}

  protected SearchForContentQueryParams(SearchForContentQueryParamsBuilder builder) {
    this.query = builder.query;
    this.scope = builder.scope;
    this.fileExtensions = builder.fileExtensions;
    this.createdAtRange = builder.createdAtRange;
    this.updatedAtRange = builder.updatedAtRange;
    this.sizeRange = builder.sizeRange;
    this.ownerUserIds = builder.ownerUserIds;
    this.recentUpdaterUserIds = builder.recentUpdaterUserIds;
    this.ancestorFolderIds = builder.ancestorFolderIds;
    this.contentTypes = builder.contentTypes;
    this.type = builder.type;
    this.trashContent = builder.trashContent;
    this.mdfilters = builder.mdfilters;
    this.sort = builder.sort;
    this.direction = builder.direction;
    this.limit = builder.limit;
    this.includeRecentSharedLinks = builder.includeRecentSharedLinks;
    this.fields = builder.fields;
    this.offset = builder.offset;
    this.deletedUserIds = builder.deletedUserIds;
    this.deletedAtRange = builder.deletedAtRange;
  }

  public String getQuery() {
    return query;
  }

  public EnumWrapper<SearchForContentQueryParamsScopeField> getScope() {
    return scope;
  }

  public List<String> getFileExtensions() {
    return fileExtensions;
  }

  public List<String> getCreatedAtRange() {
    return createdAtRange;
  }

  public List<String> getUpdatedAtRange() {
    return updatedAtRange;
  }

  public List<Long> getSizeRange() {
    return sizeRange;
  }

  public List<String> getOwnerUserIds() {
    return ownerUserIds;
  }

  public List<String> getRecentUpdaterUserIds() {
    return recentUpdaterUserIds;
  }

  public List<String> getAncestorFolderIds() {
    return ancestorFolderIds;
  }

  public List<SearchForContentQueryParamsContentTypesField> getContentTypes() {
    return contentTypes;
  }

  public EnumWrapper<SearchForContentQueryParamsTypeField> getType() {
    return type;
  }

  public EnumWrapper<SearchForContentQueryParamsTrashContentField> getTrashContent() {
    return trashContent;
  }

  public List<MetadataFilter> getMdfilters() {
    return mdfilters;
  }

  public EnumWrapper<SearchForContentQueryParamsSortField> getSort() {
    return sort;
  }

  public EnumWrapper<SearchForContentQueryParamsDirectionField> getDirection() {
    return direction;
  }

  public Long getLimit() {
    return limit;
  }

  public Boolean getIncludeRecentSharedLinks() {
    return includeRecentSharedLinks;
  }

  public List<String> getFields() {
    return fields;
  }

  public Long getOffset() {
    return offset;
  }

  public List<String> getDeletedUserIds() {
    return deletedUserIds;
  }

  public List<String> getDeletedAtRange() {
    return deletedAtRange;
  }

  public static class SearchForContentQueryParamsBuilder {

    protected String query;

    protected EnumWrapper<SearchForContentQueryParamsScopeField> scope;

    protected List<String> fileExtensions;

    protected List<String> createdAtRange;

    protected List<String> updatedAtRange;

    protected List<Long> sizeRange;

    protected List<String> ownerUserIds;

    protected List<String> recentUpdaterUserIds;

    protected List<String> ancestorFolderIds;

    protected List<SearchForContentQueryParamsContentTypesField> contentTypes;

    protected EnumWrapper<SearchForContentQueryParamsTypeField> type;

    protected EnumWrapper<SearchForContentQueryParamsTrashContentField> trashContent;

    protected List<MetadataFilter> mdfilters;

    protected EnumWrapper<SearchForContentQueryParamsSortField> sort;

    protected EnumWrapper<SearchForContentQueryParamsDirectionField> direction;

    protected Long limit;

    protected Boolean includeRecentSharedLinks;

    protected List<String> fields;

    protected Long offset;

    protected List<String> deletedUserIds;

    protected List<String> deletedAtRange;

    public SearchForContentQueryParamsBuilder query(String query) {
      this.query = query;
      return this;
    }

    public SearchForContentQueryParamsBuilder scope(SearchForContentQueryParamsScopeField scope) {
      this.scope = new EnumWrapper<SearchForContentQueryParamsScopeField>(scope.getValue(), scope);
      return this;
    }

    public SearchForContentQueryParamsBuilder fileExtensions(List<String> fileExtensions) {
      this.fileExtensions = fileExtensions;
      return this;
    }

    public SearchForContentQueryParamsBuilder createdAtRange(List<String> createdAtRange) {
      this.createdAtRange = createdAtRange;
      return this;
    }

    public SearchForContentQueryParamsBuilder updatedAtRange(List<String> updatedAtRange) {
      this.updatedAtRange = updatedAtRange;
      return this;
    }

    public SearchForContentQueryParamsBuilder sizeRange(List<Long> sizeRange) {
      this.sizeRange = sizeRange;
      return this;
    }

    public SearchForContentQueryParamsBuilder ownerUserIds(List<String> ownerUserIds) {
      this.ownerUserIds = ownerUserIds;
      return this;
    }

    public SearchForContentQueryParamsBuilder recentUpdaterUserIds(
        List<String> recentUpdaterUserIds) {
      this.recentUpdaterUserIds = recentUpdaterUserIds;
      return this;
    }

    public SearchForContentQueryParamsBuilder ancestorFolderIds(List<String> ancestorFolderIds) {
      this.ancestorFolderIds = ancestorFolderIds;
      return this;
    }

    public SearchForContentQueryParamsBuilder contentTypes(
        List<SearchForContentQueryParamsContentTypesField> contentTypes) {
      this.contentTypes = contentTypes;
      return this;
    }

    public SearchForContentQueryParamsBuilder type(SearchForContentQueryParamsTypeField type) {
      this.type = new EnumWrapper<SearchForContentQueryParamsTypeField>(type.getValue(), type);
      return this;
    }

    public SearchForContentQueryParamsBuilder trashContent(
        SearchForContentQueryParamsTrashContentField trashContent) {
      this.trashContent =
          new EnumWrapper<SearchForContentQueryParamsTrashContentField>(
              trashContent.getValue(), trashContent);
      return this;
    }

    public SearchForContentQueryParamsBuilder mdfilters(List<MetadataFilter> mdfilters) {
      this.mdfilters = mdfilters;
      return this;
    }

    public SearchForContentQueryParamsBuilder sort(SearchForContentQueryParamsSortField sort) {
      this.sort = new EnumWrapper<SearchForContentQueryParamsSortField>(sort.getValue(), sort);
      return this;
    }

    public SearchForContentQueryParamsBuilder direction(
        SearchForContentQueryParamsDirectionField direction) {
      this.direction =
          new EnumWrapper<SearchForContentQueryParamsDirectionField>(
              direction.getValue(), direction);
      return this;
    }

    public SearchForContentQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public SearchForContentQueryParamsBuilder includeRecentSharedLinks(
        Boolean includeRecentSharedLinks) {
      this.includeRecentSharedLinks = includeRecentSharedLinks;
      return this;
    }

    public SearchForContentQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public SearchForContentQueryParamsBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public SearchForContentQueryParamsBuilder deletedUserIds(List<String> deletedUserIds) {
      this.deletedUserIds = deletedUserIds;
      return this;
    }

    public SearchForContentQueryParamsBuilder deletedAtRange(List<String> deletedAtRange) {
      this.deletedAtRange = deletedAtRange;
      return this;
    }

    public SearchForContentQueryParams build() {
      return new SearchForContentQueryParams(this);
    }
  }
}
