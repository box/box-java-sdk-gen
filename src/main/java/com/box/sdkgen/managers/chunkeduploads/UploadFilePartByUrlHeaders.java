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

public class UploadFilePartByUrlHeaders {

  public final String digest;

  public final String contentRange;

  public Map<String, String> extraHeaders;

  public UploadFilePartByUrlHeaders(String digest, String contentRange) {
    this.digest = digest;
    this.contentRange = contentRange;
    this.extraHeaders = mapOf();
  }

  protected UploadFilePartByUrlHeaders(UploadFilePartByUrlHeadersBuilder builder) {
    this.digest = builder.digest;
    this.contentRange = builder.contentRange;
    this.extraHeaders = builder.extraHeaders;
  }

  public String getDigest() {
    return digest;
  }

  public String getContentRange() {
    return contentRange;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class UploadFilePartByUrlHeadersBuilder {

    protected final String digest;

    protected final String contentRange;

    protected Map<String, String> extraHeaders;

    public UploadFilePartByUrlHeadersBuilder(String digest, String contentRange) {
      this.digest = digest;
      this.contentRange = contentRange;
      this.extraHeaders = mapOf();
    }

    public UploadFilePartByUrlHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public UploadFilePartByUrlHeaders build() {
      return new UploadFilePartByUrlHeaders(this);
    }

  }

}
