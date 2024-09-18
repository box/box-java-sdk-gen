package com.box.sdkgen.schemas.zipdownload;

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

public class ZipDownload {

  @JsonProperty("download_url")
  protected String downloadUrl;

  @JsonProperty("status_url")
  protected String statusUrl;

  @JsonProperty("expires_at")
  protected String expiresAt;

  @JsonProperty("name_conflicts")
  protected List<List<ZipDownloadNameConflictsField>> nameConflicts;

  public ZipDownload() {
  }

  protected ZipDownload(ZipDownloadBuilder builder) {
    this.downloadUrl = builder.downloadUrl;
    this.statusUrl = builder.statusUrl;
    this.expiresAt = builder.expiresAt;
    this.nameConflicts = builder.nameConflicts;
  }

  public String getDownloadUrl() {
    return downloadUrl;
  }

  public String getStatusUrl() {
    return statusUrl;
  }

  public String getExpiresAt() {
    return expiresAt;
  }

  public List<List<ZipDownloadNameConflictsField>> getNameConflicts() {
    return nameConflicts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipDownload casted = (ZipDownload) o;
    return Objects.equals(downloadUrl, casted.downloadUrl) &&
      Objects.equals(statusUrl, casted.statusUrl) &&
      Objects.equals(expiresAt, casted.expiresAt) &&
      Objects.equals(nameConflicts, casted.nameConflicts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      downloadUrl, statusUrl, expiresAt, nameConflicts
    );
  }

  @Override
  public String toString() {
    return "ZipDownload{" + "downloadUrl='" + downloadUrl + '\'' + ", " + "statusUrl='" + statusUrl + '\'' + ", " + "expiresAt='" + expiresAt + '\'' + ", " + "nameConflicts='" + nameConflicts + '\'' + "}";
  }

  public static class ZipDownloadBuilder {

    protected String downloadUrl;

    protected String statusUrl;

    protected String expiresAt;

    protected List<List<ZipDownloadNameConflictsField>> nameConflicts;

    public ZipDownloadBuilder downloadUrl(String downloadUrl) {
      this.downloadUrl = downloadUrl;
      return this;
    }

    public ZipDownloadBuilder statusUrl(String statusUrl) {
      this.statusUrl = statusUrl;
      return this;
    }

    public ZipDownloadBuilder expiresAt(String expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    public ZipDownloadBuilder nameConflicts(List<List<ZipDownloadNameConflictsField>> nameConflicts) {
      this.nameConflicts = nameConflicts;
      return this;
    }

    public ZipDownload build() {
      return new ZipDownload(this);
    }

  }

}
