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

public class GetFileUploadSessionPartsQueryParams {

  public Long offset;

  public Long limit;

  public GetFileUploadSessionPartsQueryParams() {
  }

  protected GetFileUploadSessionPartsQueryParams(GetFileUploadSessionPartsQueryParamsBuilder builder) {
    this.offset = builder.offset;
    this.limit = builder.limit;
  }

  public Long getOffset() {
    return offset;
  }

  public Long getLimit() {
    return limit;
  }

  public static class GetFileUploadSessionPartsQueryParamsBuilder {

    protected Long offset;

    protected Long limit;

    public GetFileUploadSessionPartsQueryParamsBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public GetFileUploadSessionPartsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetFileUploadSessionPartsQueryParams build() {
      return new GetFileUploadSessionPartsQueryParams(this);
    }

  }

}
