package com.box.sdkgen.managers.files;

public class GetFileThumbnailByIdQueryParams {

  public Long minHeight;

  public Long minWidth;

  public Long maxHeight;

  public Long maxWidth;

  public GetFileThumbnailByIdQueryParams() {}

  protected GetFileThumbnailByIdQueryParams(GetFileThumbnailByIdQueryParamsBuilder builder) {
    this.minHeight = builder.minHeight;
    this.minWidth = builder.minWidth;
    this.maxHeight = builder.maxHeight;
    this.maxWidth = builder.maxWidth;
  }

  public Long getMinHeight() {
    return minHeight;
  }

  public Long getMinWidth() {
    return minWidth;
  }

  public Long getMaxHeight() {
    return maxHeight;
  }

  public Long getMaxWidth() {
    return maxWidth;
  }

  public static class GetFileThumbnailByIdQueryParamsBuilder {

    protected Long minHeight;

    protected Long minWidth;

    protected Long maxHeight;

    protected Long maxWidth;

    public GetFileThumbnailByIdQueryParamsBuilder minHeight(Long minHeight) {
      this.minHeight = minHeight;
      return this;
    }

    public GetFileThumbnailByIdQueryParamsBuilder minWidth(Long minWidth) {
      this.minWidth = minWidth;
      return this;
    }

    public GetFileThumbnailByIdQueryParamsBuilder maxHeight(Long maxHeight) {
      this.maxHeight = maxHeight;
      return this;
    }

    public GetFileThumbnailByIdQueryParamsBuilder maxWidth(Long maxWidth) {
      this.maxWidth = maxWidth;
      return this;
    }

    public GetFileThumbnailByIdQueryParams build() {
      return new GetFileThumbnailByIdQueryParams(this);
    }
  }
}
