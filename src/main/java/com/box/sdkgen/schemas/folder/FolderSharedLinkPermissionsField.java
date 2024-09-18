package com.box.sdkgen.schemas.folder;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.folderbase.FolderBaseTypeField;
import com.box.sdkgen.schemas.folderbase.FolderBase;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.items.Items;

public class FolderSharedLinkPermissionsField {

  @JsonProperty("can_download")
  protected final boolean canDownload;

  @JsonProperty("can_preview")
  protected final boolean canPreview;

  @JsonProperty("can_edit")
  protected final boolean canEdit;

  public FolderSharedLinkPermissionsField(@JsonProperty("can_download") boolean canDownload, @JsonProperty("can_preview") boolean canPreview, @JsonProperty("can_edit") boolean canEdit) {
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
    FolderSharedLinkPermissionsField casted = (FolderSharedLinkPermissionsField) o;
    return Objects.equals(canDownload, casted.canDownload) &&
      Objects.equals(canPreview, casted.canPreview) &&
      Objects.equals(canEdit, casted.canEdit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      canDownload, canPreview, canEdit
    );
  }

  @Override
  public String toString() {
    return "FolderSharedLinkPermissionsField{" + "canDownload='" + canDownload + '\'' + ", " + "canPreview='" + canPreview + '\'' + ", " + "canEdit='" + canEdit + '\'' + "}";
  }

}
