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

public class CreateFileUploadSessionCommitHeaders {

  public final String digest;

  public String ifMatch;

  public String ifNoneMatch;

  public Map<String, String> extraHeaders;

  public CreateFileUploadSessionCommitHeaders(String digest) {
    this.digest = digest;
    this.extraHeaders = mapOf();
  }

  protected CreateFileUploadSessionCommitHeaders(CreateFileUploadSessionCommitHeadersBuilder builder) {
    this.digest = builder.digest;
    this.ifMatch = builder.ifMatch;
    this.ifNoneMatch = builder.ifNoneMatch;
    this.extraHeaders = builder.extraHeaders;
  }

  public String getDigest() {
    return digest;
  }

  public String getIfMatch() {
    return ifMatch;
  }

  public String getIfNoneMatch() {
    return ifNoneMatch;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class CreateFileUploadSessionCommitHeadersBuilder {

    protected final String digest;

    protected String ifMatch;

    protected String ifNoneMatch;

    protected Map<String, String> extraHeaders;

    public CreateFileUploadSessionCommitHeadersBuilder(String digest) {
      this.digest = digest;
      this.extraHeaders = mapOf();
    }

    public CreateFileUploadSessionCommitHeadersBuilder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    public CreateFileUploadSessionCommitHeadersBuilder ifNoneMatch(String ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      return this;
    }

    public CreateFileUploadSessionCommitHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public CreateFileUploadSessionCommitHeaders build() {
      return new CreateFileUploadSessionCommitHeaders(this);
    }

  }

}
