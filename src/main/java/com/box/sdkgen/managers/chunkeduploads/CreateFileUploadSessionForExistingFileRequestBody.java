package com.box.sdkgen.managers.chunkeduploads;

import com.box.sdkgen.internal.SerializableObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateFileUploadSessionForExistingFileRequestBody extends SerializableObject {

  @JsonProperty("file_size")
  protected final long fileSize;

  @JsonProperty("file_name")
  protected String fileName;

  public CreateFileUploadSessionForExistingFileRequestBody(
      @JsonProperty("file_size") long fileSize) {
    super();
    this.fileSize = fileSize;
  }

  protected CreateFileUploadSessionForExistingFileRequestBody(
      CreateFileUploadSessionForExistingFileRequestBodyBuilder builder) {
    super();
    this.fileSize = builder.fileSize;
    this.fileName = builder.fileName;
  }

  public long getFileSize() {
    return fileSize;
  }

  public String getFileName() {
    return fileName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFileUploadSessionForExistingFileRequestBody casted =
        (CreateFileUploadSessionForExistingFileRequestBody) o;
    return Objects.equals(fileSize, casted.fileSize) && Objects.equals(fileName, casted.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, fileName);
  }

  @Override
  public String toString() {
    return "CreateFileUploadSessionForExistingFileRequestBody{"
        + "fileSize='"
        + fileSize
        + '\''
        + ", "
        + "fileName='"
        + fileName
        + '\''
        + "}";
  }

  public static class CreateFileUploadSessionForExistingFileRequestBodyBuilder {

    protected final long fileSize;

    protected String fileName;

    public CreateFileUploadSessionForExistingFileRequestBodyBuilder(long fileSize) {
      this.fileSize = fileSize;
    }

    public CreateFileUploadSessionForExistingFileRequestBodyBuilder fileName(String fileName) {
      this.fileName = fileName;
      return this;
    }

    public CreateFileUploadSessionForExistingFileRequestBody build() {
      return new CreateFileUploadSessionForExistingFileRequestBody(this);
    }
  }
}
