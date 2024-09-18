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

public class FileFullRepresentationsEntriesInfoField {

  protected String url;

  public FileFullRepresentationsEntriesInfoField() {
  }

  protected FileFullRepresentationsEntriesInfoField(FileFullRepresentationsEntriesInfoFieldBuilder builder) {
    this.url = builder.url;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileFullRepresentationsEntriesInfoField casted = (FileFullRepresentationsEntriesInfoField) o;
    return Objects.equals(url, casted.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      url
    );
  }

  @Override
  public String toString() {
    return "FileFullRepresentationsEntriesInfoField{" + "url='" + url + '\'' + "}";
  }

  public static class FileFullRepresentationsEntriesInfoFieldBuilder {

    protected String url;

    public FileFullRepresentationsEntriesInfoFieldBuilder url(String url) {
      this.url = url;
      return this;
    }

    public FileFullRepresentationsEntriesInfoField build() {
      return new FileFullRepresentationsEntriesInfoField(this);
    }

  }

}
