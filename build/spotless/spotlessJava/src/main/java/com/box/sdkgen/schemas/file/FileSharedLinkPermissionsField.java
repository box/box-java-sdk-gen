package com.box.sdkgen.schemas.file;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class FileSharedLinkPermissionsField {

  @JsonProperty("can_download")
  protected final boolean canDownload;

  @JsonProperty("can_preview")
  protected final boolean canPreview;

  @JsonProperty("can_edit")
  protected final boolean canEdit;

  public FileSharedLinkPermissionsField(
      @JsonProperty("can_download") boolean canDownload,
      @JsonProperty("can_preview") boolean canPreview,
      @JsonProperty("can_edit") boolean canEdit) {
    this.canDownload = canDownload;
    this.canPreview = canPreview;
    this.canEdit = canEdit;
  }

  public boolean getCanDownload() {
    return canDownload;
  }

  public boolean getCanPreview() {
    return canPreview;
  }

  public boolean getCanEdit() {
    return canEdit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSharedLinkPermissionsField casted = (FileSharedLinkPermissionsField) o;
    return Objects.equals(canDownload, casted.canDownload)
        && Objects.equals(canPreview, casted.canPreview)
        && Objects.equals(canEdit, casted.canEdit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDownload, canPreview, canEdit);
  }

  @Override
  public String toString() {
    return "FileSharedLinkPermissionsField{"
        + "canDownload='"
        + canDownload
        + '\''
        + ", "
        + "canPreview='"
        + canPreview
        + '\''
        + ", "
        + "canEdit='"
        + canEdit
        + '\''
        + "}";
  }
}
