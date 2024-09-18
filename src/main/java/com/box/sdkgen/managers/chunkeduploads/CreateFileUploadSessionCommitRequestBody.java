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

public class CreateFileUploadSessionCommitRequestBody {

  protected final List<UploadPart> parts;

  public CreateFileUploadSessionCommitRequestBody(@JsonProperty("parts") List<UploadPart> parts) {
    this.parts = parts;
  }

  public List<UploadPart> getParts() {
    return parts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFileUploadSessionCommitRequestBody casted = (CreateFileUploadSessionCommitRequestBody) o;
    return Objects.equals(parts, casted.parts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      parts
    );
  }

  @Override
  public String toString() {
    return "CreateFileUploadSessionCommitRequestBody{" + "parts='" + parts + '\'' + "}";
  }

}
