package com.box.sdkgen.managers.uploads;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import java.util.Arrays;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.files.Files;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.uploadurl.UploadUrl;
import com.box.sdkgen.schemas.conflicterror.ConflictError;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.box.sdkgen.networking.fetch.MultipartItem;
import com.fasterxml.jackson.databind.JsonNode;

public class PreflightFileUploadCheckHeaders {

  public Map<String, String> extraHeaders;

  public PreflightFileUploadCheckHeaders() {
    this.extraHeaders = mapOf();
  }

  protected PreflightFileUploadCheckHeaders(PreflightFileUploadCheckHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class PreflightFileUploadCheckHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public PreflightFileUploadCheckHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public PreflightFileUploadCheckHeaders build() {
      return new PreflightFileUploadCheckHeaders(this);
    }

  }

}
