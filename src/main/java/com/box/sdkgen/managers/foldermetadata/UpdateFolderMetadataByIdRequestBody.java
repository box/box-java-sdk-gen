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

public class UpdateFolderMetadataByIdRequestBody {

  @JsonDeserialize(using = UpdateFolderMetadataByIdRequestBodyOpField.UpdateFolderMetadataByIdRequestBodyOpFieldDeserializer.class)
  @JsonSerialize(using = UpdateFolderMetadataByIdRequestBodyOpField.UpdateFolderMetadataByIdRequestBodyOpFieldSerializer.class)
  protected EnumWrapper<UpdateFolderMetadataByIdRequestBodyOpField> op;

  protected String path;

  protected String value;

  protected String from;

  public UpdateFolderMetadataByIdRequestBody() {
  }

  protected UpdateFolderMetadataByIdRequestBody(UpdateFolderMetadataByIdRequestBodyBuilder builder) {
    this.op = builder.op;
    this.path = builder.path;
    this.value = builder.value;
    this.from = builder.from;
  }

  public EnumWrapper<UpdateFolderMetadataByIdRequestBodyOpField> getOp() {
    return op;
  }

  public String getPath() {
    return path;
  }

  public String getValue() {
    return value;
  }

  public String getFrom() {
    return from;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFolderMetadataByIdRequestBody casted = (UpdateFolderMetadataByIdRequestBody) o;
    return Objects.equals(op, casted.op) &&
      Objects.equals(path, casted.path) &&
      Objects.equals(value, casted.value) &&
      Objects.equals(from, casted.from);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      op, path, value, from
    );
  }

  @Override
  public String toString() {
    return "UpdateFolderMetadataByIdRequestBody{" + "op='" + op + '\'' + ", " + "path='" + path + '\'' + ", " + "value='" + value + '\'' + ", " + "from='" + from + '\'' + "}";
  }

  public static class UpdateFolderMetadataByIdRequestBodyBuilder {

    protected EnumWrapper<UpdateFolderMetadataByIdRequestBodyOpField> op;

    protected String path;

    protected String value;

    protected String from;

    public UpdateFolderMetadataByIdRequestBodyBuilder op(UpdateFolderMetadataByIdRequestBodyOpField op) {
      this.op = new EnumWrapper<UpdateFolderMetadataByIdRequestBodyOpField>(op.getValue(), op);
      return this;
    }

    public UpdateFolderMetadataByIdRequestBodyBuilder path(String path) {
      this.path = path;
      return this;
    }

    public UpdateFolderMetadataByIdRequestBodyBuilder value(String value) {
      this.value = value;
      return this;
    }

    public UpdateFolderMetadataByIdRequestBodyBuilder from(String from) {
      this.from = from;
      return this;
    }

    public UpdateFolderMetadataByIdRequestBody build() {
      return new UpdateFolderMetadataByIdRequestBody(this);
    }

  }

}
