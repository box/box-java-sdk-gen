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

public class FileFullClassificationField {

  protected String name;

  protected String definition;

  protected String color;

  public FileFullClassificationField() {
  }

  protected FileFullClassificationField(FileFullClassificationFieldBuilder builder) {
    this.name = builder.name;
    this.definition = builder.definition;
    this.color = builder.color;
  }

  public String getName() {
    return name;
  }

  public String getDefinition() {
    return definition;
  }

  public String getColor() {
    return color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileFullClassificationField casted = (FileFullClassificationField) o;
    return Objects.equals(name, casted.name) &&
      Objects.equals(definition, casted.definition) &&
      Objects.equals(color, casted.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      name, definition, color
    );
  }

  @Override
  public String toString() {
    return "FileFullClassificationField{" + "name='" + name + '\'' + ", " + "definition='" + definition + '\'' + ", " + "color='" + color + '\'' + "}";
  }

  public static class FileFullClassificationFieldBuilder {

    protected String name;

    protected String definition;

    protected String color;

    public FileFullClassificationFieldBuilder name(String name) {
      this.name = name;
      return this;
    }

    public FileFullClassificationFieldBuilder definition(String definition) {
      this.definition = definition;
      return this;
    }

    public FileFullClassificationFieldBuilder color(String color) {
      this.color = color;
      return this;
    }

    public FileFullClassificationField build() {
      return new FileFullClassificationField(this);
    }

  }

}
