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

public class FileFullRepresentationsField {

  protected List<FileFullRepresentationsEntriesField> entries;

  public FileFullRepresentationsField() {
  }

  protected FileFullRepresentationsField(FileFullRepresentationsFieldBuilder builder) {
    this.entries = builder.entries;
  }

  public List<FileFullRepresentationsEntriesField> getEntries() {
    return entries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileFullRepresentationsField casted = (FileFullRepresentationsField) o;
    return Objects.equals(entries, casted.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      entries
    );
  }

  @Override
  public String toString() {
    return "FileFullRepresentationsField{" + "entries='" + entries + '\'' + "}";
  }

  public static class FileFullRepresentationsFieldBuilder {

    protected List<FileFullRepresentationsEntriesField> entries;

    public FileFullRepresentationsFieldBuilder entries(List<FileFullRepresentationsEntriesField> entries) {
      this.entries = entries;
      return this;
    }

    public FileFullRepresentationsField build() {
      return new FileFullRepresentationsField(this);
    }

  }

}
