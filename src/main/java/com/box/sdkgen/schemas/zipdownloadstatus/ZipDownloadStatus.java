package com.box.sdkgen.schemas.zipdownloadstatus;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class ZipDownloadStatus {

  @JsonProperty("total_file_count")
  protected Long totalFileCount;

  @JsonProperty("downloaded_file_count")
  protected Long downloadedFileCount;

  @JsonProperty("skipped_file_count")
  protected Long skippedFileCount;

  @JsonProperty("skipped_folder_count")
  protected Long skippedFolderCount;

  @JsonDeserialize(using = ZipDownloadStatusStateField.ZipDownloadStatusStateFieldDeserializer.class)
  @JsonSerialize(using = ZipDownloadStatusStateField.ZipDownloadStatusStateFieldSerializer.class)
  protected EnumWrapper<ZipDownloadStatusStateField> state;

  public ZipDownloadStatus() {
  }

  protected ZipDownloadStatus(ZipDownloadStatusBuilder builder) {
    this.totalFileCount = builder.totalFileCount;
    this.downloadedFileCount = builder.downloadedFileCount;
    this.skippedFileCount = builder.skippedFileCount;
    this.skippedFolderCount = builder.skippedFolderCount;
    this.state = builder.state;
  }

  public Long getTotalFileCount() {
    return totalFileCount;
  }

  public Long getDownloadedFileCount() {
    return downloadedFileCount;
  }

  public Long getSkippedFileCount() {
    return skippedFileCount;
  }

  public Long getSkippedFolderCount() {
    return skippedFolderCount;
  }

  public EnumWrapper<ZipDownloadStatusStateField> getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipDownloadStatus casted = (ZipDownloadStatus) o;
    return Objects.equals(totalFileCount, casted.totalFileCount) &&
      Objects.equals(downloadedFileCount, casted.downloadedFileCount) &&
      Objects.equals(skippedFileCount, casted.skippedFileCount) &&
      Objects.equals(skippedFolderCount, casted.skippedFolderCount) &&
      Objects.equals(state, casted.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      totalFileCount, downloadedFileCount, skippedFileCount, skippedFolderCount, state
    );
  }

  @Override
  public String toString() {
    return "ZipDownloadStatus{" + "totalFileCount='" + totalFileCount + '\'' + ", " + "downloadedFileCount='" + downloadedFileCount + '\'' + ", " + "skippedFileCount='" + skippedFileCount + '\'' + ", " + "skippedFolderCount='" + skippedFolderCount + '\'' + ", " + "state='" + state + '\'' + "}";
  }

  public static class ZipDownloadStatusBuilder {

    protected Long totalFileCount;

    protected Long downloadedFileCount;

    protected Long skippedFileCount;

    protected Long skippedFolderCount;

    protected EnumWrapper<ZipDownloadStatusStateField> state;

    public ZipDownloadStatusBuilder totalFileCount(Long totalFileCount) {
      this.totalFileCount = totalFileCount;
      return this;
    }

    public ZipDownloadStatusBuilder downloadedFileCount(Long downloadedFileCount) {
      this.downloadedFileCount = downloadedFileCount;
      return this;
    }

    public ZipDownloadStatusBuilder skippedFileCount(Long skippedFileCount) {
      this.skippedFileCount = skippedFileCount;
      return this;
    }

    public ZipDownloadStatusBuilder skippedFolderCount(Long skippedFolderCount) {
      this.skippedFolderCount = skippedFolderCount;
      return this;
    }

    public ZipDownloadStatusBuilder state(ZipDownloadStatusStateField state) {
      this.state = new EnumWrapper<ZipDownloadStatusStateField>(state.getValue(), state);
      return this;
    }

    public ZipDownloadStatus build() {
      return new ZipDownloadStatus(this);
    }

  }

}
