package com.box.sdkgen.schemas.folderfull;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.folderbase.FolderBaseTypeField;
import com.box.sdkgen.schemas.folderbase.FolderBase;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.folder.FolderPathCollectionField;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.folder.FolderSharedLinkField;
import com.box.sdkgen.schemas.folder.FolderFolderUploadEmailField;
import com.box.sdkgen.schemas.folder.FolderItemStatusField;
import com.box.sdkgen.schemas.items.Items;
import com.box.sdkgen.schemas.folder.Folder;
import com.box.sdkgen.schemas.metadatafull.MetadataFull;

public class FolderFullPermissionsField {

  @JsonProperty("can_delete")
  protected final boolean canDelete;

  @JsonProperty("can_download")
  protected final boolean canDownload;

  @JsonProperty("can_invite_collaborator")
  protected final boolean canInviteCollaborator;

  @JsonProperty("can_rename")
  protected final boolean canRename;

  @JsonProperty("can_set_share_access")
  protected final boolean canSetShareAccess;

  @JsonProperty("can_share")
  protected final boolean canShare;

  @JsonProperty("can_upload")
  protected final boolean canUpload;

  public FolderFullPermissionsField(@JsonProperty("can_delete") boolean canDelete, @JsonProperty("can_download") boolean canDownload, @JsonProperty("can_invite_collaborator") boolean canInviteCollaborator, @JsonProperty("can_rename") boolean canRename, @JsonProperty("can_set_share_access") boolean canSetShareAccess, @JsonProperty("can_share") boolean canShare, @JsonProperty("can_upload") boolean canUpload) {
    this.canDelete = canDelete;
    this.canDownload = canDownload;
    this.canInviteCollaborator = canInviteCollaborator;
    this.canRename = canRename;
    this.canSetShareAccess = canSetShareAccess;
    this.canShare = canShare;
    this.canUpload = canUpload;
  }

  public boolean getCanDelete() {
    return canDelete;
  }

  public boolean getCanDownload() {
    return canDownload;
  }

  public boolean getCanInviteCollaborator() {
    return canInviteCollaborator;
  }

  public boolean getCanRename() {
    return canRename;
  }

  public boolean getCanSetShareAccess() {
    return canSetShareAccess;
  }

  public boolean getCanShare() {
    return canShare;
  }

  public boolean getCanUpload() {
    return canUpload;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderFullPermissionsField casted = (FolderFullPermissionsField) o;
    return Objects.equals(canDelete, casted.canDelete) &&
      Objects.equals(canDownload, casted.canDownload) &&
      Objects.equals(canInviteCollaborator, casted.canInviteCollaborator) &&
      Objects.equals(canRename, casted.canRename) &&
      Objects.equals(canSetShareAccess, casted.canSetShareAccess) &&
      Objects.equals(canShare, casted.canShare) &&
      Objects.equals(canUpload, casted.canUpload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      canDelete, canDownload, canInviteCollaborator, canRename, canSetShareAccess, canShare, canUpload
    );
  }

  @Override
  public String toString() {
    return "FolderFullPermissionsField{" + "canDelete='" + canDelete + '\'' + ", " + "canDownload='" + canDownload + '\'' + ", " + "canInviteCollaborator='" + canInviteCollaborator + '\'' + ", " + "canRename='" + canRename + '\'' + ", " + "canSetShareAccess='" + canSetShareAccess + '\'' + ", " + "canShare='" + canShare + '\'' + ", " + "canUpload='" + canUpload + '\'' + "}";
  }

}
