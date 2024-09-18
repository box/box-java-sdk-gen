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

public class FolderFullWatermarkInfoField {

  @JsonProperty("is_watermarked")
  protected Boolean isWatermarked;

  public FolderFullWatermarkInfoField() {
  }

  protected FolderFullWatermarkInfoField(FolderFullWatermarkInfoFieldBuilder builder) {
    this.isWatermarked = builder.isWatermarked;
  }

  public Boolean getIsWatermarked() {
    return isWatermarked;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderFullWatermarkInfoField casted = (FolderFullWatermarkInfoField) o;
    return Objects.equals(isWatermarked, casted.isWatermarked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      isWatermarked
    );
  }

  @Override
  public String toString() {
    return "FolderFullWatermarkInfoField{" + "isWatermarked='" + isWatermarked + '\'' + "}";
  }

  public static class FolderFullWatermarkInfoFieldBuilder {

    protected Boolean isWatermarked;

    public FolderFullWatermarkInfoFieldBuilder isWatermarked(Boolean isWatermarked) {
      this.isWatermarked = isWatermarked;
      return this;
    }

    public FolderFullWatermarkInfoField build() {
      return new FolderFullWatermarkInfoField(this);
    }

  }

}
