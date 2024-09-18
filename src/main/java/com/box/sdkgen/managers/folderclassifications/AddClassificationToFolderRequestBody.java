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

public class AddClassificationToFolderRequestBody {

  @JsonProperty("Box__Security__Classification__Key")
  protected String boxSecurityClassificationKey;

  public AddClassificationToFolderRequestBody() {
  }

  protected AddClassificationToFolderRequestBody(AddClassificationToFolderRequestBodyBuilder builder) {
    this.boxSecurityClassificationKey = builder.boxSecurityClassificationKey;
  }

  public String getBoxSecurityClassificationKey() {
    return boxSecurityClassificationKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddClassificationToFolderRequestBody casted = (AddClassificationToFolderRequestBody) o;
    return Objects.equals(boxSecurityClassificationKey, casted.boxSecurityClassificationKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      boxSecurityClassificationKey
    );
  }

  @Override
  public String toString() {
    return "AddClassificationToFolderRequestBody{" + "boxSecurityClassificationKey='" + boxSecurityClassificationKey + '\'' + "}";
  }

  public static class AddClassificationToFolderRequestBodyBuilder {

    protected String boxSecurityClassificationKey;

    public AddClassificationToFolderRequestBodyBuilder boxSecurityClassificationKey(String boxSecurityClassificationKey) {
      this.boxSecurityClassificationKey = boxSecurityClassificationKey;
      return this;
    }

    public AddClassificationToFolderRequestBody build() {
      return new AddClassificationToFolderRequestBody(this);
    }

  }

}
