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

public class UpdateFileByIdRequestBody {

  protected String name;

  protected String description;

  protected UpdateFileByIdRequestBodyParentField parent;

  @JsonProperty("shared_link")
  protected UpdateFileByIdRequestBodySharedLinkField sharedLink;

  protected UpdateFileByIdRequestBodyLockField lock;

  @JsonProperty("disposition_at")
  protected String dispositionAt;

  protected UpdateFileByIdRequestBodyPermissionsField permissions;

  protected List<UpdateFileByIdRequestBodyCollectionsField> collections;

  protected List<String> tags;

  public UpdateFileByIdRequestBody() {
  }

  protected UpdateFileByIdRequestBody(UpdateFileByIdRequestBodyBuilder builder) {
    this.name = builder.name;
    this.description = builder.description;
    this.parent = builder.parent;
    this.sharedLink = builder.sharedLink;
    this.lock = builder.lock;
    this.dispositionAt = builder.dispositionAt;
    this.permissions = builder.permissions;
    this.collections = builder.collections;
    this.tags = builder.tags;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public UpdateFileByIdRequestBodyParentField getParent() {
    return parent;
  }

  public UpdateFileByIdRequestBodySharedLinkField getSharedLink() {
    return sharedLink;
  }

  public UpdateFileByIdRequestBodyLockField getLock() {
    return lock;
  }

  public String getDispositionAt() {
    return dispositionAt;
  }

  public UpdateFileByIdRequestBodyPermissionsField getPermissions() {
    return permissions;
  }

  public List<UpdateFileByIdRequestBodyCollectionsField> getCollections() {
    return collections;
  }

  public List<String> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFileByIdRequestBody casted = (UpdateFileByIdRequestBody) o;
    return Objects.equals(name, casted.name) &&
      Objects.equals(description, casted.description) &&
      Objects.equals(parent, casted.parent) &&
      Objects.equals(sharedLink, casted.sharedLink) &&
      Objects.equals(lock, casted.lock) &&
      Objects.equals(dispositionAt, casted.dispositionAt) &&
      Objects.equals(permissions, casted.permissions) &&
      Objects.equals(collections, casted.collections) &&
      Objects.equals(tags, casted.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      name, description, parent, sharedLink, lock, dispositionAt, permissions, collections, tags
    );
  }

  @Override
  public String toString() {
    return "UpdateFileByIdRequestBody{" + "name='" + name + '\'' + ", " + "description='" + description + '\'' + ", " + "parent='" + parent + '\'' + ", " + "sharedLink='" + sharedLink + '\'' + ", " + "lock='" + lock + '\'' + ", " + "dispositionAt='" + dispositionAt + '\'' + ", " + "permissions='" + permissions + '\'' + ", " + "collections='" + collections + '\'' + ", " + "tags='" + tags + '\'' + "}";
  }

  public static class UpdateFileByIdRequestBodyBuilder {

    protected String name;

    protected String description;

    protected UpdateFileByIdRequestBodyParentField parent;

    protected UpdateFileByIdRequestBodySharedLinkField sharedLink;

    protected UpdateFileByIdRequestBodyLockField lock;

    protected String dispositionAt;

    protected UpdateFileByIdRequestBodyPermissionsField permissions;

    protected List<UpdateFileByIdRequestBodyCollectionsField> collections;

    protected List<String> tags;

    public UpdateFileByIdRequestBodyBuilder name(String name) {
      this.name = name;
      return this;
    }

    public UpdateFileByIdRequestBodyBuilder description(String description) {
      this.description = description;
      return this;
    }

    public UpdateFileByIdRequestBodyBuilder parent(UpdateFileByIdRequestBodyParentField parent) {
      this.parent = parent;
      return this;
    }

    public UpdateFileByIdRequestBodyBuilder sharedLink(UpdateFileByIdRequestBodySharedLinkField sharedLink) {
      this.sharedLink = sharedLink;
      return this;
    }

    public UpdateFileByIdRequestBodyBuilder lock(UpdateFileByIdRequestBodyLockField lock) {
      this.lock = lock;
      return this;
    }

    public UpdateFileByIdRequestBodyBuilder dispositionAt(String dispositionAt) {
      this.dispositionAt = dispositionAt;
      return this;
    }

    public UpdateFileByIdRequestBodyBuilder permissions(UpdateFileByIdRequestBodyPermissionsField permissions) {
      this.permissions = permissions;
      return this;
    }

    public UpdateFileByIdRequestBodyBuilder collections(List<UpdateFileByIdRequestBodyCollectionsField> collections) {
      this.collections = collections;
      return this;
    }

    public UpdateFileByIdRequestBodyBuilder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    public UpdateFileByIdRequestBody build() {
      return new UpdateFileByIdRequestBody(this);
    }

  }

}
