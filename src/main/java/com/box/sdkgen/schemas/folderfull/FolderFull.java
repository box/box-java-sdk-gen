package com.box.sdkgen.schemas.folderfull;

import com.box.sdkgen.schemas.folder.Folder;
import com.box.sdkgen.schemas.folder.FolderFolderUploadEmailField;
import com.box.sdkgen.schemas.folder.FolderItemStatusField;
import com.box.sdkgen.schemas.folder.FolderPathCollectionField;
import com.box.sdkgen.schemas.folder.FolderSharedLinkField;
import com.box.sdkgen.schemas.folderbase.FolderBaseTypeField;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.items.Items;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import java.util.Objects;

public class FolderFull extends Folder {

  @JsonDeserialize(using = FolderFullSyncStateField.FolderFullSyncStateFieldDeserializer.class)
  @JsonSerialize(using = FolderFullSyncStateField.FolderFullSyncStateFieldSerializer.class)
  @JsonProperty("sync_state")
  protected EnumWrapper<FolderFullSyncStateField> syncState;

  @JsonProperty("has_collaborations")
  protected Boolean hasCollaborations;

  protected FolderFullPermissionsField permissions;

  protected List<String> tags;

  @JsonProperty("can_non_owners_invite")
  protected Boolean canNonOwnersInvite;

  @JsonProperty("is_externally_owned")
  protected Boolean isExternallyOwned;

  protected FolderFullMetadataField metadata;

  @JsonProperty("is_collaboration_restricted_to_enterprise")
  protected Boolean isCollaborationRestrictedToEnterprise;

  @JsonProperty("allowed_shared_link_access_levels")
  protected List<FolderFullAllowedSharedLinkAccessLevelsField> allowedSharedLinkAccessLevels;

  @JsonProperty("allowed_invitee_roles")
  protected List<FolderFullAllowedInviteeRolesField> allowedInviteeRoles;

  @JsonProperty("watermark_info")
  protected FolderFullWatermarkInfoField watermarkInfo;

  @JsonProperty("is_accessible_via_shared_link")
  protected Boolean isAccessibleViaSharedLink;

  @JsonProperty("can_non_owners_view_collaborators")
  protected Boolean canNonOwnersViewCollaborators;

  protected FolderFullClassificationField classification;

  @JsonProperty("is_associated_with_app_item")
  protected Boolean isAssociatedWithAppItem;

  public FolderFull(@JsonProperty("id") String id) {
    super(id);
  }

  protected FolderFull(FolderFullBuilder builder) {
    super(builder);
    this.syncState = builder.syncState;
    this.hasCollaborations = builder.hasCollaborations;
    this.permissions = builder.permissions;
    this.tags = builder.tags;
    this.canNonOwnersInvite = builder.canNonOwnersInvite;
    this.isExternallyOwned = builder.isExternallyOwned;
    this.metadata = builder.metadata;
    this.isCollaborationRestrictedToEnterprise = builder.isCollaborationRestrictedToEnterprise;
    this.allowedSharedLinkAccessLevels = builder.allowedSharedLinkAccessLevels;
    this.allowedInviteeRoles = builder.allowedInviteeRoles;
    this.watermarkInfo = builder.watermarkInfo;
    this.isAccessibleViaSharedLink = builder.isAccessibleViaSharedLink;
    this.canNonOwnersViewCollaborators = builder.canNonOwnersViewCollaborators;
    this.classification = builder.classification;
    this.isAssociatedWithAppItem = builder.isAssociatedWithAppItem;
  }

  public EnumWrapper<FolderFullSyncStateField> getSyncState() {
    return syncState;
  }

  public Boolean getHasCollaborations() {
    return hasCollaborations;
  }

  public FolderFullPermissionsField getPermissions() {
    return permissions;
  }

  public List<String> getTags() {
    return tags;
  }

  public Boolean getCanNonOwnersInvite() {
    return canNonOwnersInvite;
  }

  public Boolean getIsExternallyOwned() {
    return isExternallyOwned;
  }

  public FolderFullMetadataField getMetadata() {
    return metadata;
  }

  public Boolean getIsCollaborationRestrictedToEnterprise() {
    return isCollaborationRestrictedToEnterprise;
  }

  public List<FolderFullAllowedSharedLinkAccessLevelsField> getAllowedSharedLinkAccessLevels() {
    return allowedSharedLinkAccessLevels;
  }

  public List<FolderFullAllowedInviteeRolesField> getAllowedInviteeRoles() {
    return allowedInviteeRoles;
  }

  public FolderFullWatermarkInfoField getWatermarkInfo() {
    return watermarkInfo;
  }

  public Boolean getIsAccessibleViaSharedLink() {
    return isAccessibleViaSharedLink;
  }

  public Boolean getCanNonOwnersViewCollaborators() {
    return canNonOwnersViewCollaborators;
  }

  public FolderFullClassificationField getClassification() {
    return classification;
  }

  public Boolean getIsAssociatedWithAppItem() {
    return isAssociatedWithAppItem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderFull casted = (FolderFull) o;
    return Objects.equals(id, casted.id)
        && Objects.equals(etag, casted.etag)
        && Objects.equals(type, casted.type)
        && Objects.equals(sequenceId, casted.sequenceId)
        && Objects.equals(name, casted.name)
        && Objects.equals(createdAt, casted.createdAt)
        && Objects.equals(modifiedAt, casted.modifiedAt)
        && Objects.equals(description, casted.description)
        && Objects.equals(size, casted.size)
        && Objects.equals(pathCollection, casted.pathCollection)
        && Objects.equals(createdBy, casted.createdBy)
        && Objects.equals(modifiedBy, casted.modifiedBy)
        && Objects.equals(trashedAt, casted.trashedAt)
        && Objects.equals(purgedAt, casted.purgedAt)
        && Objects.equals(contentCreatedAt, casted.contentCreatedAt)
        && Objects.equals(contentModifiedAt, casted.contentModifiedAt)
        && Objects.equals(ownedBy, casted.ownedBy)
        && Objects.equals(sharedLink, casted.sharedLink)
        && Objects.equals(folderUploadEmail, casted.folderUploadEmail)
        && Objects.equals(parent, casted.parent)
        && Objects.equals(itemStatus, casted.itemStatus)
        && Objects.equals(itemCollection, casted.itemCollection)
        && Objects.equals(syncState, casted.syncState)
        && Objects.equals(hasCollaborations, casted.hasCollaborations)
        && Objects.equals(permissions, casted.permissions)
        && Objects.equals(tags, casted.tags)
        && Objects.equals(canNonOwnersInvite, casted.canNonOwnersInvite)
        && Objects.equals(isExternallyOwned, casted.isExternallyOwned)
        && Objects.equals(metadata, casted.metadata)
        && Objects.equals(
            isCollaborationRestrictedToEnterprise, casted.isCollaborationRestrictedToEnterprise)
        && Objects.equals(allowedSharedLinkAccessLevels, casted.allowedSharedLinkAccessLevels)
        && Objects.equals(allowedInviteeRoles, casted.allowedInviteeRoles)
        && Objects.equals(watermarkInfo, casted.watermarkInfo)
        && Objects.equals(isAccessibleViaSharedLink, casted.isAccessibleViaSharedLink)
        && Objects.equals(canNonOwnersViewCollaborators, casted.canNonOwnersViewCollaborators)
        && Objects.equals(classification, casted.classification)
        && Objects.equals(isAssociatedWithAppItem, casted.isAssociatedWithAppItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        etag,
        type,
        sequenceId,
        name,
        createdAt,
        modifiedAt,
        description,
        size,
        pathCollection,
        createdBy,
        modifiedBy,
        trashedAt,
        purgedAt,
        contentCreatedAt,
        contentModifiedAt,
        ownedBy,
        sharedLink,
        folderUploadEmail,
        parent,
        itemStatus,
        itemCollection,
        syncState,
        hasCollaborations,
        permissions,
        tags,
        canNonOwnersInvite,
        isExternallyOwned,
        metadata,
        isCollaborationRestrictedToEnterprise,
        allowedSharedLinkAccessLevels,
        allowedInviteeRoles,
        watermarkInfo,
        isAccessibleViaSharedLink,
        canNonOwnersViewCollaborators,
        classification,
        isAssociatedWithAppItem);
  }

  @Override
  public String toString() {
    return "FolderFull{"
        + "id='"
        + id
        + '\''
        + ", "
        + "etag='"
        + etag
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + ", "
        + "sequenceId='"
        + sequenceId
        + '\''
        + ", "
        + "name='"
        + name
        + '\''
        + ", "
        + "createdAt='"
        + createdAt
        + '\''
        + ", "
        + "modifiedAt='"
        + modifiedAt
        + '\''
        + ", "
        + "description='"
        + description
        + '\''
        + ", "
        + "size='"
        + size
        + '\''
        + ", "
        + "pathCollection='"
        + pathCollection
        + '\''
        + ", "
        + "createdBy='"
        + createdBy
        + '\''
        + ", "
        + "modifiedBy='"
        + modifiedBy
        + '\''
        + ", "
        + "trashedAt='"
        + trashedAt
        + '\''
        + ", "
        + "purgedAt='"
        + purgedAt
        + '\''
        + ", "
        + "contentCreatedAt='"
        + contentCreatedAt
        + '\''
        + ", "
        + "contentModifiedAt='"
        + contentModifiedAt
        + '\''
        + ", "
        + "ownedBy='"
        + ownedBy
        + '\''
        + ", "
        + "sharedLink='"
        + sharedLink
        + '\''
        + ", "
        + "folderUploadEmail='"
        + folderUploadEmail
        + '\''
        + ", "
        + "parent='"
        + parent
        + '\''
        + ", "
        + "itemStatus='"
        + itemStatus
        + '\''
        + ", "
        + "itemCollection='"
        + itemCollection
        + '\''
        + ", "
        + "syncState='"
        + syncState
        + '\''
        + ", "
        + "hasCollaborations='"
        + hasCollaborations
        + '\''
        + ", "
        + "permissions='"
        + permissions
        + '\''
        + ", "
        + "tags='"
        + tags
        + '\''
        + ", "
        + "canNonOwnersInvite='"
        + canNonOwnersInvite
        + '\''
        + ", "
        + "isExternallyOwned='"
        + isExternallyOwned
        + '\''
        + ", "
        + "metadata='"
        + metadata
        + '\''
        + ", "
        + "isCollaborationRestrictedToEnterprise='"
        + isCollaborationRestrictedToEnterprise
        + '\''
        + ", "
        + "allowedSharedLinkAccessLevels='"
        + allowedSharedLinkAccessLevels
        + '\''
        + ", "
        + "allowedInviteeRoles='"
        + allowedInviteeRoles
        + '\''
        + ", "
        + "watermarkInfo='"
        + watermarkInfo
        + '\''
        + ", "
        + "isAccessibleViaSharedLink='"
        + isAccessibleViaSharedLink
        + '\''
        + ", "
        + "canNonOwnersViewCollaborators='"
        + canNonOwnersViewCollaborators
        + '\''
        + ", "
        + "classification='"
        + classification
        + '\''
        + ", "
        + "isAssociatedWithAppItem='"
        + isAssociatedWithAppItem
        + '\''
        + "}";
  }

  public static class FolderFullBuilder extends FolderBuilder {

    protected EnumWrapper<FolderFullSyncStateField> syncState;

    protected Boolean hasCollaborations;

    protected FolderFullPermissionsField permissions;

    protected List<String> tags;

    protected Boolean canNonOwnersInvite;

    protected Boolean isExternallyOwned;

    protected FolderFullMetadataField metadata;

    protected Boolean isCollaborationRestrictedToEnterprise;

    protected List<FolderFullAllowedSharedLinkAccessLevelsField> allowedSharedLinkAccessLevels;

    protected List<FolderFullAllowedInviteeRolesField> allowedInviteeRoles;

    protected FolderFullWatermarkInfoField watermarkInfo;

    protected Boolean isAccessibleViaSharedLink;

    protected Boolean canNonOwnersViewCollaborators;

    protected FolderFullClassificationField classification;

    protected Boolean isAssociatedWithAppItem;

    public FolderFullBuilder(String id) {
      super(id);
    }

    public FolderFullBuilder syncState(EnumWrapper<FolderFullSyncStateField> syncState) {
      this.syncState = syncState;
      return this;
    }

    public FolderFullBuilder syncState(FolderFullSyncStateField syncState) {
      this.syncState = new EnumWrapper<FolderFullSyncStateField>(syncState.getValue(), syncState);
      return this;
    }

    public FolderFullBuilder hasCollaborations(Boolean hasCollaborations) {
      this.hasCollaborations = hasCollaborations;
      return this;
    }

    public FolderFullBuilder permissions(FolderFullPermissionsField permissions) {
      this.permissions = permissions;
      return this;
    }

    public FolderFullBuilder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    public FolderFullBuilder canNonOwnersInvite(Boolean canNonOwnersInvite) {
      this.canNonOwnersInvite = canNonOwnersInvite;
      return this;
    }

    public FolderFullBuilder isExternallyOwned(Boolean isExternallyOwned) {
      this.isExternallyOwned = isExternallyOwned;
      return this;
    }

    public FolderFullBuilder metadata(FolderFullMetadataField metadata) {
      this.metadata = metadata;
      return this;
    }

    public FolderFullBuilder isCollaborationRestrictedToEnterprise(
        Boolean isCollaborationRestrictedToEnterprise) {
      this.isCollaborationRestrictedToEnterprise = isCollaborationRestrictedToEnterprise;
      return this;
    }

    public FolderFullBuilder allowedSharedLinkAccessLevels(
        List<FolderFullAllowedSharedLinkAccessLevelsField> allowedSharedLinkAccessLevels) {
      this.allowedSharedLinkAccessLevels = allowedSharedLinkAccessLevels;
      return this;
    }

    public FolderFullBuilder allowedInviteeRoles(
        List<FolderFullAllowedInviteeRolesField> allowedInviteeRoles) {
      this.allowedInviteeRoles = allowedInviteeRoles;
      return this;
    }

    public FolderFullBuilder watermarkInfo(FolderFullWatermarkInfoField watermarkInfo) {
      this.watermarkInfo = watermarkInfo;
      return this;
    }

    public FolderFullBuilder isAccessibleViaSharedLink(Boolean isAccessibleViaSharedLink) {
      this.isAccessibleViaSharedLink = isAccessibleViaSharedLink;
      return this;
    }

    public FolderFullBuilder canNonOwnersViewCollaborators(Boolean canNonOwnersViewCollaborators) {
      this.canNonOwnersViewCollaborators = canNonOwnersViewCollaborators;
      return this;
    }

    public FolderFullBuilder classification(FolderFullClassificationField classification) {
      this.classification = classification;
      return this;
    }

    public FolderFullBuilder isAssociatedWithAppItem(Boolean isAssociatedWithAppItem) {
      this.isAssociatedWithAppItem = isAssociatedWithAppItem;
      return this;
    }

    @Override
    public FolderFullBuilder etag(String etag) {
      this.etag = etag;
      return this;
    }

    @Override
    public FolderFullBuilder type(EnumWrapper<FolderBaseTypeField> type) {
      this.type = type;
      return this;
    }

    @Override
    public FolderFullBuilder type(FolderBaseTypeField type) {
      this.type = new EnumWrapper<FolderBaseTypeField>(type.getValue(), type);
      return this;
    }

    @Override
    public FolderFullBuilder sequenceId(String sequenceId) {
      this.sequenceId = sequenceId;
      return this;
    }

    @Override
    public FolderFullBuilder name(String name) {
      this.name = name;
      return this;
    }

    @Override
    public FolderFullBuilder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    @Override
    public FolderFullBuilder modifiedAt(String modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    @Override
    public FolderFullBuilder description(String description) {
      this.description = description;
      return this;
    }

    @Override
    public FolderFullBuilder size(Long size) {
      this.size = size;
      return this;
    }

    @Override
    public FolderFullBuilder pathCollection(FolderPathCollectionField pathCollection) {
      this.pathCollection = pathCollection;
      return this;
    }

    @Override
    public FolderFullBuilder createdBy(UserMini createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    @Override
    public FolderFullBuilder modifiedBy(UserMini modifiedBy) {
      this.modifiedBy = modifiedBy;
      return this;
    }

    @Override
    public FolderFullBuilder trashedAt(String trashedAt) {
      this.trashedAt = trashedAt;
      return this;
    }

    @Override
    public FolderFullBuilder purgedAt(String purgedAt) {
      this.purgedAt = purgedAt;
      return this;
    }

    @Override
    public FolderFullBuilder contentCreatedAt(String contentCreatedAt) {
      this.contentCreatedAt = contentCreatedAt;
      return this;
    }

    @Override
    public FolderFullBuilder contentModifiedAt(String contentModifiedAt) {
      this.contentModifiedAt = contentModifiedAt;
      return this;
    }

    @Override
    public FolderFullBuilder ownedBy(UserMini ownedBy) {
      this.ownedBy = ownedBy;
      return this;
    }

    @Override
    public FolderFullBuilder sharedLink(FolderSharedLinkField sharedLink) {
      this.sharedLink = sharedLink;
      return this;
    }

    @Override
    public FolderFullBuilder folderUploadEmail(FolderFolderUploadEmailField folderUploadEmail) {
      this.folderUploadEmail = folderUploadEmail;
      return this;
    }

    @Override
    public FolderFullBuilder parent(FolderMini parent) {
      this.parent = parent;
      return this;
    }

    @Override
    public FolderFullBuilder itemStatus(EnumWrapper<FolderItemStatusField> itemStatus) {
      this.itemStatus = itemStatus;
      return this;
    }

    @Override
    public FolderFullBuilder itemStatus(FolderItemStatusField itemStatus) {
      this.itemStatus = new EnumWrapper<FolderItemStatusField>(itemStatus.getValue(), itemStatus);
      return this;
    }

    @Override
    public FolderFullBuilder itemCollection(Items itemCollection) {
      this.itemCollection = itemCollection;
      return this;
    }

    public FolderFull build() {
      return new FolderFull(this);
    }
  }
}
