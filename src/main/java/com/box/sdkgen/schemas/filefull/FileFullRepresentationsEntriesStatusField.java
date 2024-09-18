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

public class FileFullRepresentationsEntriesStatusField {

  @JsonDeserialize(using = FileFullRepresentationsEntriesStatusStateField.FileFullRepresentationsEntriesStatusStateFieldDeserializer.class)
  @JsonSerialize(using = FileFullRepresentationsEntriesStatusStateField.FileFullRepresentationsEntriesStatusStateFieldSerializer.class)
  protected EnumWrapper<FileFullRepresentationsEntriesStatusStateField> state;

  public FileFullRepresentationsEntriesStatusField() {
  }

  protected FileFullRepresentationsEntriesStatusField(FileFullRepresentationsEntriesStatusFieldBuilder builder) {
    this.state = builder.state;
  }

  public EnumWrapper<FileFullRepresentationsEntriesStatusStateField> getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileFullRepresentationsEntriesStatusField casted = (FileFullRepresentationsEntriesStatusField) o;
    return Objects.equals(state, casted.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      state
    );
  }

  @Override
  public String toString() {
    return "FileFullRepresentationsEntriesStatusField{" + "state='" + state + '\'' + "}";
  }

  public static class FileFullRepresentationsEntriesStatusFieldBuilder {

    protected EnumWrapper<FileFullRepresentationsEntriesStatusStateField> state;

    public FileFullRepresentationsEntriesStatusFieldBuilder state(FileFullRepresentationsEntriesStatusStateField state) {
      this.state = new EnumWrapper<FileFullRepresentationsEntriesStatusStateField>(state.getValue(), state);
      return this;
    }

    public FileFullRepresentationsEntriesStatusField build() {
      return new FileFullRepresentationsEntriesStatusField(this);
    }

  }

}
