package com.box.sdkgen.schemas.trashfolder;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import com.box.sdkgen.schemas.usermini.UserMini;
import com.box.sdkgen.schemas.foldermini.FolderMini;

public class TrashFolderPathCollectionEntriesField {

  @JsonDeserialize(using = TrashFolderPathCollectionEntriesTypeField.TrashFolderPathCollectionEntriesTypeFieldDeserializer.class)
  @JsonSerialize(using = TrashFolderPathCollectionEntriesTypeField.TrashFolderPathCollectionEntriesTypeFieldSerializer.class)
  protected EnumWrapper<TrashFolderPathCollectionEntriesTypeField> type;

  protected String id;

  @JsonProperty("sequence_id")
  protected String sequenceId;

  protected String etag;

  protected String name;

  public TrashFolderPathCollectionEntriesField() {
  }

  protected TrashFolderPathCollectionEntriesField(TrashFolderPathCollectionEntriesFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
    this.sequenceId = builder.sequenceId;
    this.etag = builder.etag;
    this.name = builder.name;
  }

  public EnumWrapper<TrashFolderPathCollectionEntriesTypeField> getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  public String getSequenceId() {
    return sequenceId;
  }

  public String getEtag() {
    return etag;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrashFolderPathCollectionEntriesField casted = (TrashFolderPathCollectionEntriesField) o;
    return Objects.equals(type, casted.type) &&
      Objects.equals(id, casted.id) &&
      Objects.equals(sequenceId, casted.sequenceId) &&
      Objects.equals(etag, casted.etag) &&
      Objects.equals(name, casted.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, id, sequenceId, etag, name
    );
  }

  @Override
  public String toString() {
    return "TrashFolderPathCollectionEntriesField{" + "type='" + type + '\'' + ", " + "id='" + id + '\'' + ", " + "sequenceId='" + sequenceId + '\'' + ", " + "etag='" + etag + '\'' + ", " + "name='" + name + '\'' + "}";
  }

  public static class TrashFolderPathCollectionEntriesFieldBuilder {

    protected EnumWrapper<TrashFolderPathCollectionEntriesTypeField> type;

    protected String id;

    protected String sequenceId;

    protected String etag;

    protected String name;

    public TrashFolderPathCollectionEntriesFieldBuilder type(TrashFolderPathCollectionEntriesTypeField type) {
      this.type = new EnumWrapper<TrashFolderPathCollectionEntriesTypeField>(type.getValue(), type);
      return this;
    }

    public TrashFolderPathCollectionEntriesFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public TrashFolderPathCollectionEntriesFieldBuilder sequenceId(String sequenceId) {
      this.sequenceId = sequenceId;
      return this;
    }

    public TrashFolderPathCollectionEntriesFieldBuilder etag(String etag) {
      this.etag = etag;
      return this;
    }

    public TrashFolderPathCollectionEntriesFieldBuilder name(String name) {
      this.name = name;
      return this;
    }

    public TrashFolderPathCollectionEntriesField build() {
      return new TrashFolderPathCollectionEntriesField(this);
    }

  }

}
