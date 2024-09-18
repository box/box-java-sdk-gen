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

public class CreateFolderRequestBodyFolderUploadEmailField {

  @JsonDeserialize(using = CreateFolderRequestBodyFolderUploadEmailAccessField.CreateFolderRequestBodyFolderUploadEmailAccessFieldDeserializer.class)
  @JsonSerialize(using = CreateFolderRequestBodyFolderUploadEmailAccessField.CreateFolderRequestBodyFolderUploadEmailAccessFieldSerializer.class)
  protected EnumWrapper<CreateFolderRequestBodyFolderUploadEmailAccessField> access;

  public CreateFolderRequestBodyFolderUploadEmailField() {
  }

  protected CreateFolderRequestBodyFolderUploadEmailField(CreateFolderRequestBodyFolderUploadEmailFieldBuilder builder) {
    this.access = builder.access;
  }

  public EnumWrapper<CreateFolderRequestBodyFolderUploadEmailAccessField> getAccess() {
    return access;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFolderRequestBodyFolderUploadEmailField casted = (CreateFolderRequestBodyFolderUploadEmailField) o;
    return Objects.equals(access, casted.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      access
    );
  }

  @Override
  public String toString() {
    return "CreateFolderRequestBodyFolderUploadEmailField{" + "access='" + access + '\'' + "}";
  }

  public static class CreateFolderRequestBodyFolderUploadEmailFieldBuilder {

    protected EnumWrapper<CreateFolderRequestBodyFolderUploadEmailAccessField> access;

    public CreateFolderRequestBodyFolderUploadEmailFieldBuilder access(CreateFolderRequestBodyFolderUploadEmailAccessField access) {
      this.access = new EnumWrapper<CreateFolderRequestBodyFolderUploadEmailAccessField>(access.getValue(), access);
      return this;
    }

    public CreateFolderRequestBodyFolderUploadEmailField build() {
      return new CreateFolderRequestBodyFolderUploadEmailField(this);
    }

  }

}
