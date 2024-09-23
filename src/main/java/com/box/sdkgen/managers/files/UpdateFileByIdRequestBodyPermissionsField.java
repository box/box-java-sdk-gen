package com.box.sdkgen.managers.files;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class UpdateFileByIdRequestBodyPermissionsField {

  @JsonDeserialize(
      using =
          UpdateFileByIdRequestBodyPermissionsCanDownloadField
              .UpdateFileByIdRequestBodyPermissionsCanDownloadFieldDeserializer.class)
  @JsonSerialize(
      using =
          UpdateFileByIdRequestBodyPermissionsCanDownloadField
              .UpdateFileByIdRequestBodyPermissionsCanDownloadFieldSerializer.class)
  @JsonProperty("can_download")
  protected EnumWrapper<UpdateFileByIdRequestBodyPermissionsCanDownloadField> canDownload;

  public UpdateFileByIdRequestBodyPermissionsField() {}

  protected UpdateFileByIdRequestBodyPermissionsField(
      UpdateFileByIdRequestBodyPermissionsFieldBuilder builder) {
    this.canDownload = builder.canDownload;
  }

  public EnumWrapper<UpdateFileByIdRequestBodyPermissionsCanDownloadField> getCanDownload() {
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
    UpdateFileByIdRequestBodyPermissionsField casted =
        (UpdateFileByIdRequestBodyPermissionsField) o;
    return Objects.equals(canDownload, casted.canDownload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDownload);
  }

  @Override
  public String toString() {
    return "UpdateFileByIdRequestBodyPermissionsField{"
        + "canDownload='"
        + canDownload
        + '\''
        + "}";
  }

  public static class UpdateFileByIdRequestBodyPermissionsFieldBuilder {

    protected EnumWrapper<UpdateFileByIdRequestBodyPermissionsCanDownloadField> canDownload;

    public UpdateFileByIdRequestBodyPermissionsFieldBuilder canDownload(
        UpdateFileByIdRequestBodyPermissionsCanDownloadField canDownload) {
      this.canDownload =
          new EnumWrapper<UpdateFileByIdRequestBodyPermissionsCanDownloadField>(
              canDownload.getValue(), canDownload);
      return this;
    }

    public UpdateFileByIdRequestBodyPermissionsField build() {
      return new UpdateFileByIdRequestBodyPermissionsField(this);
    }
  }
}
