package com.box.sdkgen.managers.storagepolicyassignments;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.storagepolicyassignments.StoragePolicyAssignments;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.storagepolicyassignment.StoragePolicyAssignment;
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

public class GetStoragePolicyAssignmentsQueryParams {

  public String marker;

  public final EnumWrapper<GetStoragePolicyAssignmentsQueryParamsResolvedForTypeField> resolvedForType;

  public final String resolvedForId;

  public GetStoragePolicyAssignmentsQueryParams(EnumWrapper<GetStoragePolicyAssignmentsQueryParamsResolvedForTypeField> resolvedForType, String resolvedForId) {
    this.resolvedForType = resolvedForType;
    this.resolvedForId = resolvedForId;
  }

  public GetStoragePolicyAssignmentsQueryParams(GetStoragePolicyAssignmentsQueryParamsResolvedForTypeField resolvedForType, String resolvedForId) {
    this.resolvedForType = new EnumWrapper<GetStoragePolicyAssignmentsQueryParamsResolvedForTypeField>(resolvedForType.getValue(), resolvedForType);
    this.resolvedForId = resolvedForId;
  }

  protected GetStoragePolicyAssignmentsQueryParams(GetStoragePolicyAssignmentsQueryParamsBuilder builder) {
    this.marker = builder.marker;
    this.resolvedForType = builder.resolvedForType;
    this.resolvedForId = builder.resolvedForId;
  }

  public String getMarker() {
    return marker;
  }

  public EnumWrapper<GetStoragePolicyAssignmentsQueryParamsResolvedForTypeField> getResolvedForType() {
    return resolvedForType;
  }

  public String getResolvedForId() {
    return resolvedForId;
  }

  public static class GetStoragePolicyAssignmentsQueryParamsBuilder {

    protected String marker;

    protected final EnumWrapper<GetStoragePolicyAssignmentsQueryParamsResolvedForTypeField> resolvedForType;

    protected final String resolvedForId;

    public GetStoragePolicyAssignmentsQueryParamsBuilder(GetStoragePolicyAssignmentsQueryParamsResolvedForTypeField resolvedForType, String resolvedForId) {
      this.resolvedForType = new EnumWrapper<GetStoragePolicyAssignmentsQueryParamsResolvedForTypeField>(resolvedForType.getValue(), resolvedForType);
      this.resolvedForId = resolvedForId;
    }

    public GetStoragePolicyAssignmentsQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetStoragePolicyAssignmentsQueryParams build() {
      return new GetStoragePolicyAssignmentsQueryParams(this);
    }

  }

}
