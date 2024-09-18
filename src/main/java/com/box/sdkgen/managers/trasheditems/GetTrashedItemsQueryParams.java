package com.box.sdkgen.managers.trasheditems;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.items.Items;
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

public class GetTrashedItemsQueryParams {

  public List<String> fields;

  public Long limit;

  public Long offset;

  public Boolean usemarker;

  public String marker;

  public EnumWrapper<GetTrashedItemsQueryParamsDirectionField> direction;

  public EnumWrapper<GetTrashedItemsQueryParamsSortField> sort;

  public GetTrashedItemsQueryParams() {
  }

  protected GetTrashedItemsQueryParams(GetTrashedItemsQueryParamsBuilder builder) {
    this.fields = builder.fields;
    this.limit = builder.limit;
    this.offset = builder.offset;
    this.usemarker = builder.usemarker;
    this.marker = builder.marker;
    this.direction = builder.direction;
    this.sort = builder.sort;
  }

  public List<String> getFields() {
    return fields;
  }

  public Long getLimit() {
    return limit;
  }

  public Long getOffset() {
    return offset;
  }

  public Boolean getUsemarker() {
    return usemarker;
  }

  public String getMarker() {
    return marker;
  }

  public EnumWrapper<GetTrashedItemsQueryParamsDirectionField> getDirection() {
    return direction;
  }

  public EnumWrapper<GetTrashedItemsQueryParamsSortField> getSort() {
    return sort;
  }

  public static class GetTrashedItemsQueryParamsBuilder {

    protected List<String> fields;

    protected Long limit;

    protected Long offset;

    protected Boolean usemarker;

    protected String marker;

    protected EnumWrapper<GetTrashedItemsQueryParamsDirectionField> direction;

    protected EnumWrapper<GetTrashedItemsQueryParamsSortField> sort;

    public GetTrashedItemsQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public GetTrashedItemsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetTrashedItemsQueryParamsBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public GetTrashedItemsQueryParamsBuilder usemarker(Boolean usemarker) {
      this.usemarker = usemarker;
      return this;
    }

    public GetTrashedItemsQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetTrashedItemsQueryParamsBuilder direction(GetTrashedItemsQueryParamsDirectionField direction) {
      this.direction = new EnumWrapper<GetTrashedItemsQueryParamsDirectionField>(direction.getValue(), direction);
      return this;
    }

    public GetTrashedItemsQueryParamsBuilder sort(GetTrashedItemsQueryParamsSortField sort) {
      this.sort = new EnumWrapper<GetTrashedItemsQueryParamsSortField>(sort.getValue(), sort);
      return this;
    }

    public GetTrashedItemsQueryParams build() {
      return new GetTrashedItemsQueryParams(this);
    }

  }

}
