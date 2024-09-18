package com.box.sdkgen.managers.collections;

import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.collections.Collections;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.items.Items;
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

public class GetCollectionsQueryParams {

  public List<String> fields;

  public Long offset;

  public Long limit;

  public GetCollectionsQueryParams() {
  }

  protected GetCollectionsQueryParams(GetCollectionsQueryParamsBuilder builder) {
    this.fields = builder.fields;
    this.offset = builder.offset;
    this.limit = builder.limit;
  }

  public List<String> getFields() {
    return fields;
  }

  public Long getOffset() {
    return offset;
  }

  public Long getLimit() {
    return limit;
  }

  public static class GetCollectionsQueryParamsBuilder {

    protected List<String> fields;

    protected Long offset;

    protected Long limit;

    public GetCollectionsQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public GetCollectionsQueryParamsBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public GetCollectionsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetCollectionsQueryParams build() {
      return new GetCollectionsQueryParams(this);
    }

  }

}
