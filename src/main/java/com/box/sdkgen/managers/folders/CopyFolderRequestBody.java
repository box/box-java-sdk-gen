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

public class CopyFolderRequestBody {

  protected String name;

  protected final CopyFolderRequestBodyParentField parent;

  public CopyFolderRequestBody(@JsonProperty("parent") CopyFolderRequestBodyParentField parent) {
    this.parent = parent;
  }

  protected CopyFolderRequestBody(CopyFolderRequestBodyBuilder builder) {
    this.name = builder.name;
    this.parent = builder.parent;
  }

  public String getName() {
    return name;
  }

  public CopyFolderRequestBodyParentField getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyFolderRequestBody casted = (CopyFolderRequestBody) o;
    return Objects.equals(name, casted.name) &&
      Objects.equals(parent, casted.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      name, parent
    );
  }

  @Override
  public String toString() {
    return "CopyFolderRequestBody{" + "name='" + name + '\'' + ", " + "parent='" + parent + '\'' + "}";
  }

  public static class CopyFolderRequestBodyBuilder {

    protected String name;

    protected final CopyFolderRequestBodyParentField parent;

    public CopyFolderRequestBodyBuilder(CopyFolderRequestBodyParentField parent) {
      this.parent = parent;
    }

    public CopyFolderRequestBodyBuilder name(String name) {
      this.name = name;
      return this;
    }

    public CopyFolderRequestBody build() {
      return new CopyFolderRequestBody(this);
    }

  }

}
