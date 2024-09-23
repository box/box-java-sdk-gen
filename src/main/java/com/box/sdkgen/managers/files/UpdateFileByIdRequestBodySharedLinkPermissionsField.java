package com.box.sdkgen.managers.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateFileByIdRequestBodySharedLinkPermissionsField {

  @JsonProperty("can_download")
  protected Boolean canDownload;

  public UpdateFileByIdRequestBodySharedLinkPermissionsField() {}

  protected UpdateFileByIdRequestBodySharedLinkPermissionsField(
      UpdateFileByIdRequestBodySharedLinkPermissionsFieldBuilder builder) {
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
    UpdateFileByIdRequestBodySharedLinkPermissionsField casted =
        (UpdateFileByIdRequestBodySharedLinkPermissionsField) o;
    return Objects.equals(canDownload, casted.canDownload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDownload);
  }

  @Override
  public String toString() {
    return "UpdateFileByIdRequestBodySharedLinkPermissionsField{"
        + "canDownload='"
        + canDownload
        + '\''
        + "}";
  }

  public static class UpdateFileByIdRequestBodySharedLinkPermissionsFieldBuilder {

    protected Boolean canDownload;

    public UpdateFileByIdRequestBodySharedLinkPermissionsFieldBuilder canDownload(
        Boolean canDownload) {
      this.canDownload = canDownload;
      return this;
    }

    public UpdateFileByIdRequestBodySharedLinkPermissionsField build() {
      return new UpdateFileByIdRequestBodySharedLinkPermissionsField(this);
    }
  }
}
