package com.box.sdkgen.managers.files;

import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.filefull.FileFull;
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

public class GetFileThumbnailByIdQueryParams {

  public Long minHeight;

  public Long minWidth;

  public Long maxHeight;

  public Long maxWidth;

  public GetFileThumbnailByIdQueryParams() {
  }

  protected GetFileThumbnailByIdQueryParams(GetFileThumbnailByIdQueryParamsBuilder builder) {
    this.minHeight = builder.minHeight;
    this.minWidth = builder.minWidth;
    this.maxHeight = builder.maxHeight;
    this.maxWidth = builder.maxWidth;
  }

  public Long getMinHeight() {
    return minHeight;
  }

  public Long getMinWidth() {
    return minWidth;
  }

  public Long getMaxHeight() {
    return maxHeight;
  }

  public Long getMaxWidth() {
    return maxWidth;
  }

  public static class GetFileThumbnailByIdQueryParamsBuilder {

    protected Long minHeight;

    protected Long minWidth;

    protected Long maxHeight;

    protected Long maxWidth;

    public GetFileThumbnailByIdQueryParamsBuilder minHeight(Long minHeight) {
      this.minHeight = minHeight;
      return this;
    }

    public GetFileThumbnailByIdQueryParamsBuilder minWidth(Long minWidth) {
      this.minWidth = minWidth;
      return this;
    }

    public GetFileThumbnailByIdQueryParamsBuilder maxHeight(Long maxHeight) {
      this.maxHeight = maxHeight;
      return this;
    }

    public GetFileThumbnailByIdQueryParamsBuilder maxWidth(Long maxWidth) {
      this.maxWidth = maxWidth;
      return this;
    }

    public GetFileThumbnailByIdQueryParams build() {
      return new GetFileThumbnailByIdQueryParams(this);
    }

  }

}
