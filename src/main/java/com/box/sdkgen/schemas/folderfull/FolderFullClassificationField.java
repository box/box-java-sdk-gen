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

public class FolderFullClassificationField {

  protected String name;

  protected String definition;

  protected String color;

  public FolderFullClassificationField() {
  }

  protected FolderFullClassificationField(FolderFullClassificationFieldBuilder builder) {
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
    FolderFullClassificationField casted = (FolderFullClassificationField) o;
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
    return "FolderFullClassificationField{" + "name='" + name + '\'' + ", " + "definition='" + definition + '\'' + ", " + "color='" + color + '\'' + "}";
  }

  public static class FolderFullClassificationFieldBuilder {

    protected String name;

    protected String definition;

    protected String color;

    public FolderFullClassificationFieldBuilder name(String name) {
      this.name = name;
      return this;
    }

    public FolderFullClassificationFieldBuilder definition(String definition) {
      this.definition = definition;
      return this;
    }

    public FolderFullClassificationFieldBuilder color(String color) {
      this.color = color;
      return this;
    }

    public FolderFullClassificationField build() {
      return new FolderFullClassificationField(this);
    }

  }

}
