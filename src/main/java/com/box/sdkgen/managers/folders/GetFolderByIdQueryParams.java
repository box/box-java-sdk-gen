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

public class GetFolderByIdQueryParams {

  public List<String> fields;

  public EnumWrapper<GetFolderByIdQueryParamsSortField> sort;

  public EnumWrapper<GetFolderByIdQueryParamsDirectionField> direction;

  public Long offset;

  public Long limit;

  public GetFolderByIdQueryParams() {
  }

  protected GetFolderByIdQueryParams(GetFolderByIdQueryParamsBuilder builder) {
    this.fields = builder.fields;
    this.sort = builder.sort;
    this.direction = builder.direction;
    this.offset = builder.offset;
    this.limit = builder.limit;
  }

  public List<String> getFields() {
    return fields;
  }

  public EnumWrapper<GetFolderByIdQueryParamsSortField> getSort() {
    return sort;
  }

  public EnumWrapper<GetFolderByIdQueryParamsDirectionField> getDirection() {
    return direction;
  }

  public Long getOffset() {
    return offset;
  }

  public Long getLimit() {
    return limit;
  }

  public static class GetFolderByIdQueryParamsBuilder {

    protected List<String> fields;

    protected EnumWrapper<GetFolderByIdQueryParamsSortField> sort;

    protected EnumWrapper<GetFolderByIdQueryParamsDirectionField> direction;

    protected Long offset;

    protected Long limit;

    public GetFolderByIdQueryParamsBuilder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    public GetFolderByIdQueryParamsBuilder sort(GetFolderByIdQueryParamsSortField sort) {
      this.sort = new EnumWrapper<GetFolderByIdQueryParamsSortField>(sort.getValue(), sort);
      return this;
    }

    public GetFolderByIdQueryParamsBuilder direction(GetFolderByIdQueryParamsDirectionField direction) {
      this.direction = new EnumWrapper<GetFolderByIdQueryParamsDirectionField>(direction.getValue(), direction);
      return this;
    }

    public GetFolderByIdQueryParamsBuilder offset(Long offset) {
      this.offset = offset;
      return this;
    }

    public GetFolderByIdQueryParamsBuilder limit(Long limit) {
      this.limit = limit;
      return this;
    }

    public GetFolderByIdQueryParams build() {
      return new GetFolderByIdQueryParams(this);
    }

  }

}
