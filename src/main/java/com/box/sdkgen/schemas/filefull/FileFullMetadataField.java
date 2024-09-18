package com.box.sdkgen.schemas.filefull;

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
import java.util.List;
import java.util.Map;
import com.box.sdkgen.schemas.filebase.FileBaseTypeField;
import com.box.sdkgen.schemas.filebase.FileBase;
import com.box.sdkgen.schemas.fileversionmini.FileVersionMini;
import com.box.sdkgen.schemas.filemini.FileMini;
import com.box.sdkgen.schemas.file.FilePathCollectionField;
import com.box.sdkgen.schemas.file.FileSharedLinkField;
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.file.FileItemStatusField;
import com.box.sdkgen.schemas.file.File;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.fileorfolderscope.FileOrFolderScope;
import com.box.sdkgen.schemas.metadatafull.MetadataFull;

public class FileFullMetadataField {

  protected Map<String, Map<String, MetadataFull>> extraData;

  public FileFullMetadataField() {
  }

  protected FileFullMetadataField(FileFullMetadataFieldBuilder builder) {
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
    FileFullMetadataField casted = (FileFullMetadataField) o;
    return Objects.equals(extraData, casted.extraData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      extraData
    );
  }

  @Override
  public String toString() {
    return "FileFullMetadataField{" + "extraData='" + extraData + '\'' + "}";
  }

  public static class FileFullMetadataFieldBuilder {

    protected Map<String, Map<String, MetadataFull>> extraData;

    public FileFullMetadataFieldBuilder extraData(Map<String, Map<String, MetadataFull>> extraData) {
      this.extraData = extraData;
      return this;
    }

    public FileFullMetadataField build() {
      return new FileFullMetadataField(this);
    }

  }

}
