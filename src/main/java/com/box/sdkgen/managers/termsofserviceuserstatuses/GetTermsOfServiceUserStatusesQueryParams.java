package com.box.sdkgen.managers.termsofserviceuserstatuses;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.termsofserviceuserstatuses.TermsOfServiceUserStatuses;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.termsofserviceuserstatus.TermsOfServiceUserStatus;
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

public class GetTermsOfServiceUserStatusesQueryParams {

  public final String tosId;

  public String userId;

  public GetTermsOfServiceUserStatusesQueryParams(String tosId) {
    this.tosId = tosId;
  }

  protected GetTermsOfServiceUserStatusesQueryParams(GetTermsOfServiceUserStatusesQueryParamsBuilder builder) {
    this.tosId = builder.tosId;
    this.userId = builder.userId;
  }

  public String getTosId() {
    return tosId;
  }

  public String getUserId() {
    return userId;
  }

  public static class GetTermsOfServiceUserStatusesQueryParamsBuilder {

    protected final String tosId;

    protected String userId;

    public GetTermsOfServiceUserStatusesQueryParamsBuilder(String tosId) {
      this.tosId = tosId;
    }

    public GetTermsOfServiceUserStatusesQueryParamsBuilder userId(String userId) {
      this.userId = userId;
      return this;
    }

    public GetTermsOfServiceUserStatusesQueryParams build() {
      return new GetTermsOfServiceUserStatusesQueryParams(this);
    }

  }

}
