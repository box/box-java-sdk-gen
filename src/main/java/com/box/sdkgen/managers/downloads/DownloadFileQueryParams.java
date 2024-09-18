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

public class DownloadFileQueryParams {

  public String version;

  public String accessToken;

  public DownloadFileQueryParams() {
  }

  protected DownloadFileQueryParams(DownloadFileQueryParamsBuilder builder) {
    this.version = builder.version;
    this.accessToken = builder.accessToken;
  }

  public String getVersion() {
    return version;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public static class DownloadFileQueryParamsBuilder {

    protected String version;

    protected String accessToken;

    public DownloadFileQueryParamsBuilder version(String version) {
      this.version = version;
      return this;
    }

    public DownloadFileQueryParamsBuilder accessToken(String accessToken) {
      this.accessToken = accessToken;
      return this;
    }

    public DownloadFileQueryParams build() {
      return new DownloadFileQueryParams(this);
    }

  }

}
