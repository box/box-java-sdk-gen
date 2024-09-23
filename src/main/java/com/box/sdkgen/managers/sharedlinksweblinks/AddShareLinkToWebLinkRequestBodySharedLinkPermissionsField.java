package com.box.sdkgen.managers.sharedlinksweblinks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class AddShareLinkToWebLinkRequestBodySharedLinkPermissionsField {

  @JsonProperty("can_download")
  protected Boolean canDownload;

  @JsonProperty("can_preview")
  protected Boolean canPreview;

  @JsonProperty("can_edit")
  protected Boolean canEdit;

  public AddShareLinkToWebLinkRequestBodySharedLinkPermissionsField() {}

  protected AddShareLinkToWebLinkRequestBodySharedLinkPermissionsField(
      AddShareLinkToWebLinkRequestBodySharedLinkPermissionsFieldBuilder builder) {
    this.canDownload = builder.canDownload;
    this.canPreview = builder.canPreview;
    this.canEdit = builder.canEdit;
  }

  public Boolean getCanDownload() {
    return canDownload;
  }

  public Boolean getCanPreview() {
    return canPreview;
  }

  public Boolean getCanEdit() {
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
    AddShareLinkToWebLinkRequestBodySharedLinkPermissionsField casted =
        (AddShareLinkToWebLinkRequestBodySharedLinkPermissionsField) o;
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
    return "AddShareLinkToWebLinkRequestBodySharedLinkPermissionsField{"
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

  public static class AddShareLinkToWebLinkRequestBodySharedLinkPermissionsFieldBuilder {

    protected Boolean canDownload;

    protected Boolean canPreview;

    protected Boolean canEdit;

    public AddShareLinkToWebLinkRequestBodySharedLinkPermissionsFieldBuilder canDownload(
        Boolean canDownload) {
      this.canDownload = canDownload;
      return this;
    }

    public AddShareLinkToWebLinkRequestBodySharedLinkPermissionsFieldBuilder canPreview(
        Boolean canPreview) {
      this.canPreview = canPreview;
      return this;
    }

    public AddShareLinkToWebLinkRequestBodySharedLinkPermissionsFieldBuilder canEdit(
        Boolean canEdit) {
      this.canEdit = canEdit;
      return this;
    }

    public AddShareLinkToWebLinkRequestBodySharedLinkPermissionsField build() {
      return new AddShareLinkToWebLinkRequestBodySharedLinkPermissionsField(this);
    }
  }
}
