package com.box.sdkgen.managers.downloads;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;

public class DownloadFileHeaders {

  public String range;

  public String boxapi;

  public Map<String, String> extraHeaders;

  public DownloadFileHeaders() {
    this.extraHeaders = mapOf();
  }

  protected DownloadFileHeaders(DownloadFileHeadersBuilder builder) {
    this.range = builder.range;
    this.boxapi = builder.boxapi;
    this.extraHeaders = builder.extraHeaders;
  }

  public String getRange() {
    return range;
  }

  public String getBoxapi() {
    return boxapi;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class DownloadFileHeadersBuilder {

    protected String range;

    protected String boxapi;

    protected Map<String, String> extraHeaders;

    public DownloadFileHeadersBuilder range(String range) {
      this.range = range;
      return this;
    }

    public DownloadFileHeadersBuilder boxapi(String boxapi) {
      this.boxapi = boxapi;
      return this;
    }

    public DownloadFileHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public DownloadFileHeaders build() {
      return new DownloadFileHeaders(this);
    }

  }

}
