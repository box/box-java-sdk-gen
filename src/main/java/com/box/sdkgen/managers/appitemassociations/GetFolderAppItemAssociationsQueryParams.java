package com.box.sdkgen.managers.appitemassociations;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.appitemassociations.AppItemAssociations;
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
import com.fasterxml.jackson.databind.JsonNode;

public class GetFolderAppItemAssociationsQueryParams {

  public Long limit;

  public String marker;

  public String applicationType;

  public GetFolderAppItemAssociationsQueryParams() {
  }

  protected GetFolderAppItemAssociationsQueryParams(GetFolderAppItemAssociationsQueryParamsBuilder builder) {
    this.limit = builder.limit;
    this.marker = builder.marker;
    this.applicationType = builder.applicationType;
  }

  public Long getLimit() {
    return limit;
  }

  public String getMarker() {
    return marker;
  }

  public String getApplicationType() {
    return applicationType;
  }

  public static class GetFolderAppItemAssociationsQueryParamsBuilder {

    protected Long limit;

    protected String marker;

    protected String applicationType;

    public GetFolderAppItemAssociationsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetFolderAppItemAssociationsQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetFolderAppItemAssociationsQueryParamsBuilder applicationType(String applicationType) {
      this.applicationType = applicationType;
      return this;
    }

    public GetFolderAppItemAssociationsQueryParams build() {
      return new GetFolderAppItemAssociationsQueryParams(this);
    }

  }

}
