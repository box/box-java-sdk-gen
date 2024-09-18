package com.box.sdkgen.managers.listcollaborations;

import java.util.List;
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
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.collaborations.Collaborations;
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

public class GetCollaborationsQueryParams {

  public final EnumWrapper<GetCollaborationsQueryParamsStatusField> status;

  public List<String> fields;

  public Long offset;

  public Long limit;

  public GetCollaborationsQueryParams(EnumWrapper<GetCollaborationsQueryParamsStatusField> status) {
    this.status = status;
  }

  public GetCollaborationsQueryParams(GetCollaborationsQueryParamsStatusField status) {
    this.status = new EnumWrapper<GetCollaborationsQueryParamsStatusField>(status.getValue(), status);
  }

  protected GetCollaborationsQueryParams(GetCollaborationsQueryParamsBuilder builder) {
    this.status = builder.status;
    this.fields = builder.fields;
    this.offset = builder.offset;
    this.limit = builder.limit;
  }

  public EnumWrapper<GetCollaborationsQueryParamsStatusField> getStatus() {
    return status;
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

  public static class GetCollaborationsQueryParamsBuilder {

    protected final EnumWrapper<GetCollaborationsQueryParamsStatusField> status;

    protected List<String> fields;

    protected Long offset;

    protected Long limit;

    public GetCollaborationsQueryParamsBuilder(GetCollaborationsQueryParamsStatusField status) {
      this.status = new EnumWrapper<GetCollaborationsQueryParamsStatusField>(status.getValue(), status);
    }

    public GetCollaborationsQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public GetCollaborationsQueryParamsBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public GetCollaborationsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetCollaborationsQueryParams build() {
      return new GetCollaborationsQueryParams(this);
    }

  }

}
