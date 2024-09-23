package com.box.sdkgen.managers.folders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateFolderByIdRequestBodySharedLinkPermissionsField {

  @JsonProperty("can_download")
  protected Boolean canDownload;

  public UpdateFolderByIdRequestBodySharedLinkPermissionsField() {}

  protected UpdateFolderByIdRequestBodySharedLinkPermissionsField(
      UpdateFolderByIdRequestBodySharedLinkPermissionsFieldBuilder builder) {
    this.canDownload = builder.canDownload;
  }

  public Boolean getCanDownload() {
    return canDownload;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFolderByIdRequestBodySharedLinkPermissionsField casted =
        (UpdateFolderByIdRequestBodySharedLinkPermissionsField) o;
    return Objects.equals(canDownload, casted.canDownload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDownload);
  }

  @Override
  public String toString() {
    return "UpdateFolderByIdRequestBodySharedLinkPermissionsField{"
        + "canDownload='"
        + canDownload
        + '\''
        + "}";
  }

  public static class UpdateFolderByIdRequestBodySharedLinkPermissionsFieldBuilder {

    protected Boolean canDownload;

    public UpdateFolderByIdRequestBodySharedLinkPermissionsFieldBuilder canDownload(
        Boolean canDownload) {
      this.canDownload = canDownload;
      return this;
    }

    public UpdateFolderByIdRequestBodySharedLinkPermissionsField build() {
      return new UpdateFolderByIdRequestBodySharedLinkPermissionsField(this);
    }
  }
}
