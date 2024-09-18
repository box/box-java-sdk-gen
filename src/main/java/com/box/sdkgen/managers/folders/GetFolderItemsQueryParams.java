package com.box.sdkgen.managers.folders;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.folderfull.FolderFull;
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

public class GetFolderItemsQueryParams {

  public List<String> fields;

  public Boolean usemarker;

  public String marker;

  public Long offset;

  public Long limit;

  public EnumWrapper<GetFolderItemsQueryParamsSortField> sort;

  public EnumWrapper<GetFolderItemsQueryParamsDirectionField> direction;

  public GetFolderItemsQueryParams() {
  }

  protected GetFolderItemsQueryParams(GetFolderItemsQueryParamsBuilder builder) {
    this.fields = builder.fields;
    this.usemarker = builder.usemarker;
    this.marker = builder.marker;
    this.offset = builder.offset;
    this.limit = builder.limit;
    this.sort = builder.sort;
    this.direction = builder.direction;
  }

  public List<String> getFields() {
    return fields;
  }

  public Boolean getUsemarker() {
    return usemarker;
  }

  public String getMarker() {
    return marker;
  }

  public Long getOffset() {
    return offset;
  }

  public Long getLimit() {
    return limit;
  }

  public EnumWrapper<GetFolderItemsQueryParamsSortField> getSort() {
    return sort;
  }

  public EnumWrapper<GetFolderItemsQueryParamsDirectionField> getDirection() {
    return direction;
  }

  public static class GetFolderItemsQueryParamsBuilder {

    protected List<String> fields;

    protected Boolean usemarker;

    protected String marker;

    protected Long offset;

    protected Long limit;

    protected EnumWrapper<GetFolderItemsQueryParamsSortField> sort;

    protected EnumWrapper<GetFolderItemsQueryParamsDirectionField> direction;

    public GetFolderItemsQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public GetFolderItemsQueryParamsBuilder usemarker(Boolean usemarker) {
      this.usemarker = usemarker;
      return this;
    }

    public GetFolderItemsQueryParamsBuilder marker(String marker) {
      this.marker = marker;
      return this;
    }

    public GetFolderItemsQueryParamsBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public GetFolderItemsQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetFolderItemsQueryParamsBuilder sort(GetFolderItemsQueryParamsSortField sort) {
      this.sort = new EnumWrapper<GetFolderItemsQueryParamsSortField>(sort.getValue(), sort);
      return this;
    }

    public GetFolderItemsQueryParamsBuilder direction(GetFolderItemsQueryParamsDirectionField direction) {
      this.direction = new EnumWrapper<GetFolderItemsQueryParamsDirectionField>(direction.getValue(), direction);
      return this;
    }

    public GetFolderItemsQueryParams build() {
      return new GetFolderItemsQueryParams(this);
    }

  }

}
