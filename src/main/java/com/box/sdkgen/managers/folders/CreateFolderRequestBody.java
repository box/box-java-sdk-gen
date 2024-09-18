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

public class CreateFolderRequestBody {

  protected final String name;

  protected final CreateFolderRequestBodyParentField parent;

  @JsonProperty("folder_upload_email")
  protected CreateFolderRequestBodyFolderUploadEmailField folderUploadEmail;

  @JsonDeserialize(using = CreateFolderRequestBodySyncStateField.CreateFolderRequestBodySyncStateFieldDeserializer.class)
  @JsonSerialize(using = CreateFolderRequestBodySyncStateField.CreateFolderRequestBodySyncStateFieldSerializer.class)
  @JsonProperty("sync_state")
  protected EnumWrapper<CreateFolderRequestBodySyncStateField> syncState;

  public CreateFolderRequestBody(@JsonProperty("name") String name, @JsonProperty("parent") CreateFolderRequestBodyParentField parent) {
    this.name = name;
    this.parent = parent;
  }

  protected CreateFolderRequestBody(CreateFolderRequestBodyBuilder builder) {
    this.name = builder.name;
    this.parent = builder.parent;
    this.folderUploadEmail = builder.folderUploadEmail;
    this.syncState = builder.syncState;
  }

  public String getName() {
    return name;
  }

  public CreateFolderRequestBodyParentField getParent() {
    return parent;
  }

  public CreateFolderRequestBodyFolderUploadEmailField getFolderUploadEmail() {
    return folderUploadEmail;
  }

  public EnumWrapper<CreateFolderRequestBodySyncStateField> getSyncState() {
    return syncState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFolderRequestBody casted = (CreateFolderRequestBody) o;
    return Objects.equals(name, casted.name) &&
      Objects.equals(parent, casted.parent) &&
      Objects.equals(folderUploadEmail, casted.folderUploadEmail) &&
      Objects.equals(syncState, casted.syncState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      name, parent, folderUploadEmail, syncState
    );
  }

  @Override
  public String toString() {
    return "CreateFolderRequestBody{" + "name='" + name + '\'' + ", " + "parent='" + parent + '\'' + ", " + "folderUploadEmail='" + folderUploadEmail + '\'' + ", " + "syncState='" + syncState + '\'' + "}";
  }

  public static class CreateFolderRequestBodyBuilder {

    protected final String name;

    protected final CreateFolderRequestBodyParentField parent;

    protected CreateFolderRequestBodyFolderUploadEmailField folderUploadEmail;

    protected EnumWrapper<CreateFolderRequestBodySyncStateField> syncState;

    public CreateFolderRequestBodyBuilder(String name, CreateFolderRequestBodyParentField parent) {
      this.name = name;
      this.parent = parent;
    }

    public CreateFolderRequestBodyBuilder folderUploadEmail(CreateFolderRequestBodyFolderUploadEmailField folderUploadEmail) {
      this.folderUploadEmail = folderUploadEmail;
      return this;
    }

    public CreateFolderRequestBodyBuilder syncState(CreateFolderRequestBodySyncStateField syncState) {
      this.syncState = new EnumWrapper<CreateFolderRequestBodySyncStateField>(syncState.getValue(), syncState);
      return this;
    }

    public CreateFolderRequestBody build() {
      return new CreateFolderRequestBody(this);
    }

  }

}
