package com.box.sdkgen.managers.folderclassifications;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import java.util.List;
import com.box.sdkgen.schemas.classification.Classification;
import com.box.sdkgen.schemas.clienterror.ClientError;
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

public class UpdateClassificationOnFolderRequestBody {

  @JsonDeserialize(using = UpdateClassificationOnFolderRequestBodyOpField.UpdateClassificationOnFolderRequestBodyOpFieldDeserializer.class)
  @JsonSerialize(using = UpdateClassificationOnFolderRequestBodyOpField.UpdateClassificationOnFolderRequestBodyOpFieldSerializer.class)
  protected EnumWrapper<UpdateClassificationOnFolderRequestBodyOpField> op;

  @JsonDeserialize(using = UpdateClassificationOnFolderRequestBodyPathField.UpdateClassificationOnFolderRequestBodyPathFieldDeserializer.class)
  @JsonSerialize(using = UpdateClassificationOnFolderRequestBodyPathField.UpdateClassificationOnFolderRequestBodyPathFieldSerializer.class)
  protected EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField> path;

  protected final String value;

  public UpdateClassificationOnFolderRequestBody(@JsonProperty("value") String value) {
    this.value = value;
    this.op = new EnumWrapper<UpdateClassificationOnFolderRequestBodyOpField>(UpdateClassificationOnFolderRequestBodyOpField.REPLACE.getValue(), UpdateClassificationOnFolderRequestBodyOpField.REPLACE);
    this.path = new EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField>(UpdateClassificationOnFolderRequestBodyPathField._BOX__SECURITY__CLASSIFICATION__KEY.getValue(), UpdateClassificationOnFolderRequestBodyPathField._BOX__SECURITY__CLASSIFICATION__KEY);
  }

  protected UpdateClassificationOnFolderRequestBody(UpdateClassificationOnFolderRequestBodyBuilder builder) {
    this.op = builder.op;
    this.path = builder.path;
    this.value = builder.value;
  }

  public EnumWrapper<UpdateClassificationOnFolderRequestBodyOpField> getOp() {
    return op;
  }

  public EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField> getPath() {
    return path;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClassificationOnFolderRequestBody casted = (UpdateClassificationOnFolderRequestBody) o;
    return Objects.equals(op, casted.op) &&
      Objects.equals(path, casted.path) &&
      Objects.equals(value, casted.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      op, path, value
    );
  }

  @Override
  public String toString() {
    return "UpdateClassificationOnFolderRequestBody{" + "op='" + op + '\'' + ", " + "path='" + path + '\'' + ", " + "value='" + value + '\'' + "}";
  }

  public static class UpdateClassificationOnFolderRequestBodyBuilder {

    protected EnumWrapper<UpdateClassificationOnFolderRequestBodyOpField> op;

    protected EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField> path;

    protected final String value;

    public UpdateClassificationOnFolderRequestBodyBuilder(String value) {
      this.value = value;
      this.op = new EnumWrapper<UpdateClassificationOnFolderRequestBodyOpField>(UpdateClassificationOnFolderRequestBodyOpField.REPLACE.getValue(), UpdateClassificationOnFolderRequestBodyOpField.REPLACE);
      this.path = new EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField>(UpdateClassificationOnFolderRequestBodyPathField._BOX__SECURITY__CLASSIFICATION__KEY.getValue(), UpdateClassificationOnFolderRequestBodyPathField._BOX__SECURITY__CLASSIFICATION__KEY);
    }

    public UpdateClassificationOnFolderRequestBodyBuilder op(UpdateClassificationOnFolderRequestBodyOpField op) {
      this.op = new EnumWrapper<UpdateClassificationOnFolderRequestBodyOpField>(op.getValue(), op);
      return this;
    }

    public UpdateClassificationOnFolderRequestBodyBuilder path(UpdateClassificationOnFolderRequestBodyPathField path) {
      this.path = new EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField>(path.getValue(), path);
      return this;
    }

    public UpdateClassificationOnFolderRequestBody build() {
      return new UpdateClassificationOnFolderRequestBody(this);
    }

  }

}
