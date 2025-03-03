package com.box.sdkgen.schemas.folderfull;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.schemas.metadatafull.MetadataFull;
import java.util.Map;
import java.util.Objects;

public class FolderFullMetadataField extends SerializableObject {

  protected Map<String, Map<String, MetadataFull>> extraData;

  public FolderFullMetadataField() {
    super();
  }

  protected FolderFullMetadataField(FolderFullMetadataFieldBuilder builder) {
    super();
    this.extraData = builder.extraData;
  }

  public Map<String, Map<String, MetadataFull>> getExtraData() {
    return extraData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderFullMetadataField casted = (FolderFullMetadataField) o;
    return Objects.equals(extraData, casted.extraData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraData);
  }

  @Override
  public String toString() {
    return "FolderFullMetadataField{" + "extraData='" + extraData + '\'' + "}";
  }

  public static class FolderFullMetadataFieldBuilder {

    protected Map<String, Map<String, MetadataFull>> extraData;

    public FolderFullMetadataFieldBuilder extraData(
        Map<String, Map<String, MetadataFull>> extraData) {
      this.extraData = extraData;
      return this;
    }

    public FolderFullMetadataField build() {
      return new FolderFullMetadataField(this);
    }
  }
}
