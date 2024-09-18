package com.box.sdkgen.managers.sharedlinksfiles;

import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
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

public class AddShareLinkToFileRequestBodySharedLinkPermissionsField {

  @JsonProperty("can_download")
  protected Boolean canDownload;

  @JsonProperty("can_preview")
  protected Boolean canPreview;

  @JsonProperty("can_edit")
  protected Boolean canEdit;

  public AddShareLinkToFileRequestBodySharedLinkPermissionsField() {
  }

  protected AddShareLinkToFileRequestBodySharedLinkPermissionsField(AddShareLinkToFileRequestBodySharedLinkPermissionsFieldBuilder builder) {
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
    AddShareLinkToFileRequestBodySharedLinkPermissionsField casted = (AddShareLinkToFileRequestBodySharedLinkPermissionsField) o;
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
    return "AddShareLinkToFileRequestBodySharedLinkPermissionsField{" + "canDownload='" + canDownload + '\'' + ", " + "canPreview='" + canPreview + '\'' + ", " + "canEdit='" + canEdit + '\'' + "}";
  }

  public static class AddShareLinkToFileRequestBodySharedLinkPermissionsFieldBuilder {

    protected Boolean canDownload;

    protected Boolean canPreview;

    protected Boolean canEdit;

    public AddShareLinkToFileRequestBodySharedLinkPermissionsFieldBuilder canDownload(Boolean canDownload) {
      this.canDownload = canDownload;
      return this;
    }

    public AddShareLinkToFileRequestBodySharedLinkPermissionsFieldBuilder canPreview(Boolean canPreview) {
      this.canPreview = canPreview;
      return this;
    }

    public AddShareLinkToFileRequestBodySharedLinkPermissionsFieldBuilder canEdit(Boolean canEdit) {
      this.canEdit = canEdit;
      return this;
    }

    public AddShareLinkToFileRequestBodySharedLinkPermissionsField build() {
      return new AddShareLinkToFileRequestBodySharedLinkPermissionsField(this);
    }

  }

}
