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

public class FileFullRepresentationsEntriesPropertiesField {

  protected String dimensions;

  protected Boolean paged;

  protected Boolean thumb;

  public FileFullRepresentationsEntriesPropertiesField() {
  }

  protected FileFullRepresentationsEntriesPropertiesField(FileFullRepresentationsEntriesPropertiesFieldBuilder builder) {
    this.dimensions = builder.dimensions;
    this.paged = builder.paged;
    this.thumb = builder.thumb;
  }

  public String getDimensions() {
    return dimensions;
  }

  public Boolean getPaged() {
    return paged;
  }

  public Boolean getThumb() {
    return thumb;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileFullRepresentationsEntriesPropertiesField casted = (FileFullRepresentationsEntriesPropertiesField) o;
    return Objects.equals(dimensions, casted.dimensions) &&
      Objects.equals(paged, casted.paged) &&
      Objects.equals(thumb, casted.thumb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      dimensions, paged, thumb
    );
  }

  @Override
  public String toString() {
    return "FileFullRepresentationsEntriesPropertiesField{" + "dimensions='" + dimensions + '\'' + ", " + "paged='" + paged + '\'' + ", " + "thumb='" + thumb + '\'' + "}";
  }

  public static class FileFullRepresentationsEntriesPropertiesFieldBuilder {

    protected String dimensions;

    protected Boolean paged;

    protected Boolean thumb;

    public FileFullRepresentationsEntriesPropertiesFieldBuilder dimensions(String dimensions) {
      this.dimensions = dimensions;
      return this;
    }

    public FileFullRepresentationsEntriesPropertiesFieldBuilder paged(Boolean paged) {
      this.paged = paged;
      return this;
    }

    public FileFullRepresentationsEntriesPropertiesFieldBuilder thumb(Boolean thumb) {
      this.thumb = thumb;
      return this;
    }

    public FileFullRepresentationsEntriesPropertiesField build() {
      return new FileFullRepresentationsEntriesPropertiesField(this);
    }

  }

}
