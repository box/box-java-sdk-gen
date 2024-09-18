package com.box.sdkgen.managers.chunkeduploads;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.List;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.uploadsession.UploadSession;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.uploadedpart.UploadedPart;
import com.box.sdkgen.schemas.uploadparts.UploadParts;
import com.box.sdkgen.schemas.files.Files;
import com.box.sdkgen.schemas.uploadpart.UploadPart;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;

public class CreateFileUploadSessionForExistingFileRequestBody {

  @JsonProperty("file_size")
  protected final long fileSize;

  @JsonProperty("file_name")
  protected String fileName;

  public CreateFileUploadSessionForExistingFileRequestBody(@JsonProperty("file_size") long fileSize) {
    this.fileSize = fileSize;
  }

  protected CreateFileUploadSessionForExistingFileRequestBody(CreateFileUploadSessionForExistingFileRequestBodyBuilder builder) {
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
    CreateFileUploadSessionForExistingFileRequestBody casted = (CreateFileUploadSessionForExistingFileRequestBody) o;
    return Objects.equals(fileSize, casted.fileSize) &&
      Objects.equals(fileName, casted.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      fileSize, fileName
    );
  }

  @Override
  public String toString() {
    return "CreateFileUploadSessionForExistingFileRequestBody{" + "fileSize='" + fileSize + '\'' + ", " + "fileName='" + fileName + '\'' + "}";
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
