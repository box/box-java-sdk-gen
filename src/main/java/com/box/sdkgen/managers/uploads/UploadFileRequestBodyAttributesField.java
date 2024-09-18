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

public class UploadFileRequestBodyAttributesField {

  protected final String name;

  protected final UploadFileRequestBodyAttributesParentField parent;

  @JsonProperty("content_created_at")
  protected String contentCreatedAt;

  @JsonProperty("content_modified_at")
  protected String contentModifiedAt;

  public UploadFileRequestBodyAttributesField(@JsonProperty("name") String name, @JsonProperty("parent") UploadFileRequestBodyAttributesParentField parent) {
    this.name = name;
    this.parent = parent;
  }

  protected UploadFileRequestBodyAttributesField(UploadFileRequestBodyAttributesFieldBuilder builder) {
    this.name = builder.name;
    this.parent = builder.parent;
    this.contentCreatedAt = builder.contentCreatedAt;
    this.contentModifiedAt = builder.contentModifiedAt;
  }

  public String getName() {
    return name;
  }

  public UploadFileRequestBodyAttributesParentField getParent() {
    return parent;
  }

  public String getContentCreatedAt() {
    return contentCreatedAt;
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
    UploadFileRequestBodyAttributesField casted = (UploadFileRequestBodyAttributesField) o;
    return Objects.equals(name, casted.name) &&
      Objects.equals(parent, casted.parent) &&
      Objects.equals(contentCreatedAt, casted.contentCreatedAt) &&
      Objects.equals(contentModifiedAt, casted.contentModifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      name, parent, contentCreatedAt, contentModifiedAt
    );
  }

  @Override
  public String toString() {
    return "UploadFileRequestBodyAttributesField{" + "name='" + name + '\'' + ", " + "parent='" + parent + '\'' + ", " + "contentCreatedAt='" + contentCreatedAt + '\'' + ", " + "contentModifiedAt='" + contentModifiedAt + '\'' + "}";
  }

  public static class UploadFileRequestBodyAttributesFieldBuilder {

    protected final String name;

    protected final UploadFileRequestBodyAttributesParentField parent;

    protected String contentCreatedAt;

    protected String contentModifiedAt;

    public UploadFileRequestBodyAttributesFieldBuilder(String name, UploadFileRequestBodyAttributesParentField parent) {
      this.name = name;
      this.parent = parent;
    }

    public UploadFileRequestBodyAttributesFieldBuilder contentCreatedAt(String contentCreatedAt) {
      this.contentCreatedAt = contentCreatedAt;
      return this;
    }

    public UploadFileRequestBodyAttributesFieldBuilder contentModifiedAt(String contentModifiedAt) {
      this.contentModifiedAt = contentModifiedAt;
      return this;
    }

    public UploadFileRequestBodyAttributesField build() {
      return new UploadFileRequestBodyAttributesField(this);
    }

  }

}
