package com.box.sdkgen.managers.uploads;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import java.util.Arrays;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.files.Files;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.uploadurl.UploadUrl;
import com.box.sdkgen.schemas.conflicterror.ConflictError;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.box.sdkgen.networking.fetch.MultipartItem;
import com.fasterxml.jackson.databind.JsonNode;

public class UploadFileVersionRequestBodyAttributesField {

  protected final String name;

  @JsonProperty("content_modified_at")
  protected String contentModifiedAt;

  public UploadFileVersionRequestBodyAttributesField(@JsonProperty("name") String name) {
    this.name = name;
  }

  protected UploadFileVersionRequestBodyAttributesField(UploadFileVersionRequestBodyAttributesFieldBuilder builder) {
    this.name = builder.name;
    this.contentModifiedAt = builder.contentModifiedAt;
  }

  public String getName() {
    return name;
  }

  public String getContentModifiedAt() {
    return contentModifiedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadFileVersionRequestBodyAttributesField casted = (UploadFileVersionRequestBodyAttributesField) o;
    return Objects.equals(name, casted.name) &&
      Objects.equals(contentModifiedAt, casted.contentModifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      name, contentModifiedAt
    );
  }

  @Override
  public String toString() {
    return "UploadFileVersionRequestBodyAttributesField{" + "name='" + name + '\'' + ", " + "contentModifiedAt='" + contentModifiedAt + '\'' + "}";
  }

  public static class UploadFileVersionRequestBodyAttributesFieldBuilder {

    protected final String name;

    protected String contentModifiedAt;

    public UploadFileVersionRequestBodyAttributesFieldBuilder(String name) {
      this.name = name;
    }

    public UploadFileVersionRequestBodyAttributesFieldBuilder contentModifiedAt(String contentModifiedAt) {
      this.contentModifiedAt = contentModifiedAt;
      return this;
    }

    public UploadFileVersionRequestBodyAttributesField build() {
      return new UploadFileVersionRequestBodyAttributesField(this);
    }

  }

}
