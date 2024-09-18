package com.box.sdkgen.schemas.trashweblink;

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
import com.box.sdkgen.schemas.foldermini.FolderMini;
import com.box.sdkgen.schemas.usermini.UserMini;

public class TrashWebLinkPathCollectionEntriesField {

  @JsonDeserialize(using = TrashWebLinkPathCollectionEntriesTypeField.TrashWebLinkPathCollectionEntriesTypeFieldDeserializer.class)
  @JsonSerialize(using = TrashWebLinkPathCollectionEntriesTypeField.TrashWebLinkPathCollectionEntriesTypeFieldSerializer.class)
  protected EnumWrapper<TrashWebLinkPathCollectionEntriesTypeField> type;

  protected String id;

  @JsonProperty("sequence_id")
  protected String sequenceId;

  protected String etag;

  protected String name;

  public TrashWebLinkPathCollectionEntriesField() {
  }

  protected TrashWebLinkPathCollectionEntriesField(TrashWebLinkPathCollectionEntriesFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
    this.sequenceId = builder.sequenceId;
    this.etag = builder.etag;
    this.name = builder.name;
  }

  public EnumWrapper<TrashWebLinkPathCollectionEntriesTypeField> getType() {
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
    TrashWebLinkPathCollectionEntriesField casted = (TrashWebLinkPathCollectionEntriesField) o;
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
    return "TrashWebLinkPathCollectionEntriesField{" + "type='" + type + '\'' + ", " + "id='" + id + '\'' + ", " + "sequenceId='" + sequenceId + '\'' + ", " + "etag='" + etag + '\'' + ", " + "name='" + name + '\'' + "}";
  }

  public static class TrashWebLinkPathCollectionEntriesFieldBuilder {

    protected EnumWrapper<TrashWebLinkPathCollectionEntriesTypeField> type;

    protected String id;

    protected String sequenceId;

    protected String etag;

    protected String name;

    public TrashWebLinkPathCollectionEntriesFieldBuilder type(TrashWebLinkPathCollectionEntriesTypeField type) {
      this.type = new EnumWrapper<TrashWebLinkPathCollectionEntriesTypeField>(type.getValue(), type);
      return this;
    }

    public TrashWebLinkPathCollectionEntriesFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public TrashWebLinkPathCollectionEntriesFieldBuilder sequenceId(String sequenceId) {
      this.sequenceId = sequenceId;
      return this;
    }

    public TrashWebLinkPathCollectionEntriesFieldBuilder etag(String etag) {
      this.etag = etag;
      return this;
    }

    public TrashWebLinkPathCollectionEntriesFieldBuilder name(String name) {
      this.name = name;
      return this;
    }

    public TrashWebLinkPathCollectionEntriesField build() {
      return new TrashWebLinkPathCollectionEntriesField(this);
    }

  }

}
