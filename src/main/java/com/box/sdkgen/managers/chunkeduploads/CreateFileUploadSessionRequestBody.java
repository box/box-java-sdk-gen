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

public class CreateFileUploadSessionRequestBody {

  @JsonProperty("folder_id")
  protected final String folderId;

  @JsonProperty("file_size")
  protected final long fileSize;

  @JsonProperty("file_name")
  protected final String fileName;

  public CreateFileUploadSessionRequestBody(@JsonProperty("folder_id") String folderId, @JsonProperty("file_size") long fileSize, @JsonProperty("file_name") String fileName) {
    this.folderId = folderId;
    this.fileSize = fileSize;
    this.fileName = fileName;
  }

  public String getFolderId() {
    return folderId;
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
    CreateFileUploadSessionRequestBody casted = (CreateFileUploadSessionRequestBody) o;
    return Objects.equals(folderId, casted.folderId) &&
      Objects.equals(fileSize, casted.fileSize) &&
      Objects.equals(fileName, casted.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      folderId, fileSize, fileName
    );
  }

  @Override
  public String toString() {
    return "CreateFileUploadSessionRequestBody{" + "folderId='" + folderId + '\'' + ", " + "fileSize='" + fileSize + '\'' + ", " + "fileName='" + fileName + '\'' + "}";
  }

}
