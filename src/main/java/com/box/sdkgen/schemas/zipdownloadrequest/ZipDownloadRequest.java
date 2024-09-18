package com.box.sdkgen.schemas.zipdownloadrequest;

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
import java.util.List;

public class ZipDownloadRequest {

  protected final List<ZipDownloadRequestItemsField> items;

  @JsonProperty("download_file_name")
  protected String downloadFileName;

  public ZipDownloadRequest(@JsonProperty("items") List<ZipDownloadRequestItemsField> items) {
    this.items = items;
  }

  protected ZipDownloadRequest(ZipDownloadRequestBuilder builder) {
    this.items = builder.items;
    this.downloadFileName = builder.downloadFileName;
  }

  public List<ZipDownloadRequestItemsField> getItems() {
    return items;
  }

  public String getDownloadFileName() {
    return downloadFileName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipDownloadRequest casted = (ZipDownloadRequest) o;
    return Objects.equals(items, casted.items) &&
      Objects.equals(downloadFileName, casted.downloadFileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      items, downloadFileName
    );
  }

  @Override
  public String toString() {
    return "ZipDownloadRequest{" + "items='" + items + '\'' + ", " + "downloadFileName='" + downloadFileName + '\'' + "}";
  }

  public static class ZipDownloadRequestBuilder {

    protected final List<ZipDownloadRequestItemsField> items;

    protected String downloadFileName;

    public ZipDownloadRequestBuilder(List<ZipDownloadRequestItemsField> items) {
      this.items = items;
    }

    public ZipDownloadRequestBuilder downloadFileName(String downloadFileName) {
      this.downloadFileName = downloadFileName;
      return this;
    }

    public ZipDownloadRequest build() {
      return new ZipDownloadRequest(this);
    }

  }

}
