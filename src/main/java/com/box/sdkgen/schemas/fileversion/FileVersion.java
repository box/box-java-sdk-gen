package com.box.sdkgen.schemas.fileversion;

import com.box.sdkgen.internal.utils.DateTimeUtils;
import com.box.sdkgen.schemas.fileversionbase.FileVersionBaseTypeField;
import com.box.sdkgen.schemas.fileversionmini.FileVersionMini;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import java.util.Objects;

public class FileVersion extends FileVersionMini {

  protected String name;

  protected Long size;

  @JsonProperty("created_at")
  @JsonSerialize(using = DateTimeUtils.DateTimeSerializer.class)
  @JsonDeserialize(using = DateTimeUtils.DateTimeDeserializer.class)
  protected Date createdAt;

  @JsonProperty("modified_at")
  @JsonSerialize(using = DateTimeUtils.DateTimeSerializer.class)
  @JsonDeserialize(using = DateTimeUtils.DateTimeDeserializer.class)
  protected Date modifiedAt;

  @JsonProperty("modified_by")
  protected UserMini modifiedBy;

  @JsonProperty("trashed_at")
  @JsonSerialize(using = DateTimeUtils.DateTimeSerializer.class)
  @JsonDeserialize(using = DateTimeUtils.DateTimeDeserializer.class)
  protected Date trashedAt;

  @JsonProperty("trashed_by")
  protected UserMini trashedBy;

  @JsonProperty("restored_at")
  @JsonSerialize(using = DateTimeUtils.DateTimeSerializer.class)
  @JsonDeserialize(using = DateTimeUtils.DateTimeDeserializer.class)
  protected Date restoredAt;

  @JsonProperty("restored_by")
  protected UserMini restoredBy;

  @JsonProperty("purged_at")
  @JsonSerialize(using = DateTimeUtils.DateTimeSerializer.class)
  @JsonDeserialize(using = DateTimeUtils.DateTimeDeserializer.class)
  protected Date purgedAt;

  @JsonProperty("uploader_display_name")
  protected String uploaderDisplayName;

  public FileVersion(@JsonProperty("id") String id) {
    super(id);
  }

  protected FileVersion(FileVersionBuilder builder) {
    super(builder);
    this.name = builder.name;
    this.size = builder.size;
    this.createdAt = builder.createdAt;
    this.modifiedAt = builder.modifiedAt;
    this.modifiedBy = builder.modifiedBy;
    this.trashedAt = builder.trashedAt;
    this.trashedBy = builder.trashedBy;
    this.restoredAt = builder.restoredAt;
    this.restoredBy = builder.restoredBy;
    this.purgedAt = builder.purgedAt;
    this.uploaderDisplayName = builder.uploaderDisplayName;
  }

  public String getName() {
    return name;
  }

  public Long getSize() {
    return size;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public Date getModifiedAt() {
    return modifiedAt;
  }

  public UserMini getModifiedBy() {
    return modifiedBy;
  }

  public Date getTrashedAt() {
    return trashedAt;
  }

  public UserMini getTrashedBy() {
    return trashedBy;
  }

  public Date getRestoredAt() {
    return restoredAt;
  }

  public UserMini getRestoredBy() {
    return restoredBy;
  }

  public Date getPurgedAt() {
    return purgedAt;
  }

  public String getUploaderDisplayName() {
    return uploaderDisplayName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVersion casted = (FileVersion) o;
    return Objects.equals(id, casted.id)
        && Objects.equals(type, casted.type)
        && Objects.equals(sha1, casted.sha1)
        && Objects.equals(name, casted.name)
        && Objects.equals(size, casted.size)
        && Objects.equals(createdAt, casted.createdAt)
        && Objects.equals(modifiedAt, casted.modifiedAt)
        && Objects.equals(modifiedBy, casted.modifiedBy)
        && Objects.equals(trashedAt, casted.trashedAt)
        && Objects.equals(trashedBy, casted.trashedBy)
        && Objects.equals(restoredAt, casted.restoredAt)
        && Objects.equals(restoredBy, casted.restoredBy)
        && Objects.equals(purgedAt, casted.purgedAt)
        && Objects.equals(uploaderDisplayName, casted.uploaderDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        type,
        sha1,
        name,
        size,
        createdAt,
        modifiedAt,
        modifiedBy,
        trashedAt,
        trashedBy,
        restoredAt,
        restoredBy,
        purgedAt,
        uploaderDisplayName);
  }

  @Override
  public String toString() {
    return "FileVersion{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + ", "
        + "sha1='"
        + sha1
        + '\''
        + ", "
        + "name='"
        + name
        + '\''
        + ", "
        + "size='"
        + size
        + '\''
        + ", "
        + "createdAt='"
        + createdAt
        + '\''
        + ", "
        + "modifiedAt='"
        + modifiedAt
        + '\''
        + ", "
        + "modifiedBy='"
        + modifiedBy
        + '\''
        + ", "
        + "trashedAt='"
        + trashedAt
        + '\''
        + ", "
        + "trashedBy='"
        + trashedBy
        + '\''
        + ", "
        + "restoredAt='"
        + restoredAt
        + '\''
        + ", "
        + "restoredBy='"
        + restoredBy
        + '\''
        + ", "
        + "purgedAt='"
        + purgedAt
        + '\''
        + ", "
        + "uploaderDisplayName='"
        + uploaderDisplayName
        + '\''
        + "}";
  }

  public static class FileVersionBuilder extends FileVersionMiniBuilder {

    protected String name;

    protected Long size;

    protected Date createdAt;

    protected Date modifiedAt;

    protected UserMini modifiedBy;

    protected Date trashedAt;

    protected UserMini trashedBy;

    protected Date restoredAt;

    protected UserMini restoredBy;

    protected Date purgedAt;

    protected String uploaderDisplayName;

    public FileVersionBuilder(String id) {
      super(id);
    }

    public FileVersionBuilder name(String name) {
      this.name = name;
      return this;
    }

    public FileVersionBuilder size(Long size) {
      this.size = size;
      return this;
    }

    public FileVersionBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public FileVersionBuilder modifiedAt(Date modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    public FileVersionBuilder modifiedBy(UserMini modifiedBy) {
      this.modifiedBy = modifiedBy;
      return this;
    }

    public FileVersionBuilder trashedAt(Date trashedAt) {
      this.trashedAt = trashedAt;
      return this;
    }

    public FileVersionBuilder trashedBy(UserMini trashedBy) {
      this.trashedBy = trashedBy;
      return this;
    }

    public FileVersionBuilder restoredAt(Date restoredAt) {
      this.restoredAt = restoredAt;
      return this;
    }

    public FileVersionBuilder restoredBy(UserMini restoredBy) {
      this.restoredBy = restoredBy;
      return this;
    }

    public FileVersionBuilder purgedAt(Date purgedAt) {
      this.purgedAt = purgedAt;
      return this;
    }

    public FileVersionBuilder uploaderDisplayName(String uploaderDisplayName) {
      this.uploaderDisplayName = uploaderDisplayName;
      return this;
    }

    @Override
    public FileVersionBuilder type(FileVersionBaseTypeField type) {
      this.type = new EnumWrapper<FileVersionBaseTypeField>(type);
      return this;
    }

    @Override
    public FileVersionBuilder type(EnumWrapper<FileVersionBaseTypeField> type) {
      this.type = type;
      return this;
    }

    @Override
    public FileVersionBuilder sha1(String sha1) {
      this.sha1 = sha1;
      return this;
    }

    public FileVersion build() {
      return new FileVersion(this);
    }
  }
}
