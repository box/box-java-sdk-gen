package com.box.sdkgen.managers.foldermetadata;

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
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import java.util.List;
import com.box.sdkgen.schemas.metadatas.Metadatas;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.metadatafull.MetadataFull;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.fasterxml.jackson.databind.JsonNode;

public class DeleteFolderMetadataByIdHeaders {

  public Map<String, String> extraHeaders;

  public DeleteFolderMetadataByIdHeaders() {
    this.extraHeaders = mapOf();
  }

  protected DeleteFolderMetadataByIdHeaders(DeleteFolderMetadataByIdHeadersBuilder builder) {
    this.extraHeaders = builder.extraHeaders;
  }

  public Map<String, String> getExtraHeaders() {
    return extraHeaders;
  }

  public static class DeleteFolderMetadataByIdHeadersBuilder {

    protected Map<String, String> extraHeaders;

    public DeleteFolderMetadataByIdHeadersBuilder extraHeaders(Map<String, String> extraHeaders) {
      this.extraHeaders = extraHeaders;
      return this;
    }

    public DeleteFolderMetadataByIdHeaders build() {
      return new DeleteFolderMetadataByIdHeaders(this);
    }

  }

}
