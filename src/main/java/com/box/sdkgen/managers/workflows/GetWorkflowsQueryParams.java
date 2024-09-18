package com.box.sdkgen.managers.workflows;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.workflows.Workflows;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.outcome.Outcome;
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

public class GetWorkflowsQueryParams {

  public final String folderId;

  public String triggerType;

  public Long limit;

  public String marker;

  public GetWorkflowsQueryParams(String folderId) {
    this.folderId = folderId;
  }

  protected GetWorkflowsQueryParams(GetWorkflowsQueryParamsBuilder builder) {
    this.folderId = builder.folderId;
    this.triggerType = builder.triggerType;
    this.limit = builder.limit;
    this.marker = builder.marker;
  }

  public String getFolderId() {
    return folderId;
  }

  public String getTriggerType() {
    return triggerType;
  }

  public Long getLimit() {
    return limit;
  }

  public String getMarker() {
    return marker;
  }

  public static class GetWorkflowsQueryParamsBuilder {

    protected final String folderId;

    protected String triggerType;

    protected Long limit;

    protected String marker;

    public GetWorkflowsQueryParamsBuilder(String folderId) {
      this.folderId = folderId;
    }

    public GetWorkflowsQueryParamsBuilder triggerType(String triggerType) {
      this.triggerType = triggerType;
      return this;
    }

    public GetWorkflowsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetWorkflowsQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetWorkflowsQueryParams build() {
      return new GetWorkflowsQueryParams(this);
    }

  }

}
