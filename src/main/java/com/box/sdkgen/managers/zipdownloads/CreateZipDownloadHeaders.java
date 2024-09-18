package com.box.sdkgen.managers.zipdownloads;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.zipdownload.ZipDownload;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.zipdownloadrequest.ZipDownloadRequest;
import com.box.sdkgen.schemas.zipdownloadstatus.ZipDownloadStatus;
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

public class CreateZipDownloadHeaders {

  public Map<String, String> extraHeaders;

  public CreateZipDownloadHeaders() {
    this.extraHeaders = mapOf();
  }

  protected CreateZipDownloadHeaders(CreateZipDownloadHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class CreateZipDownloadHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public CreateZipDownloadHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public CreateZipDownloadHeaders build() {
      return new CreateZipDownloadHeaders(this);
    }

  }

}
