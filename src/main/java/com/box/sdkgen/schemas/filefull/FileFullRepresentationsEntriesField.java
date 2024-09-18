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

public class FileFullRepresentationsEntriesField {

  protected FileFullRepresentationsEntriesContentField content;

  protected FileFullRepresentationsEntriesInfoField info;

  protected FileFullRepresentationsEntriesPropertiesField properties;

  protected String representation;

  protected FileFullRepresentationsEntriesStatusField status;

  public FileFullRepresentationsEntriesField() {
  }

  protected FileFullRepresentationsEntriesField(FileFullRepresentationsEntriesFieldBuilder builder) {
    this.content = builder.content;
    this.info = builder.info;
    this.properties = builder.properties;
    this.representation = builder.representation;
    this.status = builder.status;
  }

  public FileFullRepresentationsEntriesContentField getContent() {
    return content;
  }

  public FileFullRepresentationsEntriesInfoField getInfo() {
    return info;
  }

  public FileFullRepresentationsEntriesPropertiesField getProperties() {
    return properties;
  }

  public String getRepresentation() {
    return representation;
  }

  public FileFullRepresentationsEntriesStatusField getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileFullRepresentationsEntriesField casted = (FileFullRepresentationsEntriesField) o;
    return Objects.equals(content, casted.content) &&
      Objects.equals(info, casted.info) &&
      Objects.equals(properties, casted.properties) &&
      Objects.equals(representation, casted.representation) &&
      Objects.equals(status, casted.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      content, info, properties, representation, status
    );
  }

  @Override
  public String toString() {
    return "FileFullRepresentationsEntriesField{" + "content='" + content + '\'' + ", " + "info='" + info + '\'' + ", " + "properties='" + properties + '\'' + ", " + "representation='" + representation + '\'' + ", " + "status='" + status + '\'' + "}";
  }

  public static class FileFullRepresentationsEntriesFieldBuilder {

    protected FileFullRepresentationsEntriesContentField content;

    protected FileFullRepresentationsEntriesInfoField info;

    protected FileFullRepresentationsEntriesPropertiesField properties;

    protected String representation;

    protected FileFullRepresentationsEntriesStatusField status;

    public FileFullRepresentationsEntriesFieldBuilder content(FileFullRepresentationsEntriesContentField content) {
      this.content = content;
      return this;
    }

    public FileFullRepresentationsEntriesFieldBuilder info(FileFullRepresentationsEntriesInfoField info) {
      this.info = info;
      return this;
    }

    public FileFullRepresentationsEntriesFieldBuilder properties(FileFullRepresentationsEntriesPropertiesField properties) {
      this.properties = properties;
      return this;
    }

    public FileFullRepresentationsEntriesFieldBuilder representation(String representation) {
      this.representation = representation;
      return this;
    }

    public FileFullRepresentationsEntriesFieldBuilder status(FileFullRepresentationsEntriesStatusField status) {
      this.status = status;
      return this;
    }

    public FileFullRepresentationsEntriesField build() {
      return new FileFullRepresentationsEntriesField(this);
    }

  }

}
