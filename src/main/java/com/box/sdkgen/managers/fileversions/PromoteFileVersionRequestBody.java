package com.box.sdkgen.managers.fileversions;

import java.util.List;
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
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.fileversions.FileVersions;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.fileversionfull.FileVersionFull;
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

public class PromoteFileVersionRequestBody {

  protected String id;

  @JsonDeserialize(using = PromoteFileVersionRequestBodyTypeField.PromoteFileVersionRequestBodyTypeFieldDeserializer.class)
  @JsonSerialize(using = PromoteFileVersionRequestBodyTypeField.PromoteFileVersionRequestBodyTypeFieldSerializer.class)
  protected EnumWrapper<PromoteFileVersionRequestBodyTypeField> type;

  public PromoteFileVersionRequestBody() {
  }

  protected PromoteFileVersionRequestBody(PromoteFileVersionRequestBodyBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<PromoteFileVersionRequestBodyTypeField> getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromoteFileVersionRequestBody casted = (PromoteFileVersionRequestBody) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type
    );
  }

  @Override
  public String toString() {
    return "PromoteFileVersionRequestBody{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class PromoteFileVersionRequestBodyBuilder {

    protected String id;

    protected EnumWrapper<PromoteFileVersionRequestBodyTypeField> type;

    public PromoteFileVersionRequestBodyBuilder id(String id) {
      this.id = id;
      return this;
    }

    public PromoteFileVersionRequestBodyBuilder type(PromoteFileVersionRequestBodyTypeField type) {
      this.type = new EnumWrapper<PromoteFileVersionRequestBodyTypeField>(type.getValue(), type);
      return this;
    }

    public PromoteFileVersionRequestBody build() {
      return new PromoteFileVersionRequestBody(this);
    }

  }

}
