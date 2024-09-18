package com.box.sdkgen.managers.memberships;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.groupmemberships.GroupMemberships;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.groupmembership.GroupMembership;
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

public class GetUserMembershipsQueryParams {

  public Long limit;

  public Long offset;

  public GetUserMembershipsQueryParams() {
  }

  protected GetUserMembershipsQueryParams(GetUserMembershipsQueryParamsBuilder builder) {
    this.limit = builder.limit;
    this.offset = builder.offset;
  }

  public Long getLimit() {
    return limit;
  }

  public Long getOffset() {
    return offset;
  }

  public static class GetUserMembershipsQueryParamsBuilder {

    protected Long limit;

    protected Long offset;

    public GetUserMembershipsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetUserMembershipsQueryParamsBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public GetUserMembershipsQueryParams build() {
      return new GetUserMembershipsQueryParams(this);
    }

  }

}
