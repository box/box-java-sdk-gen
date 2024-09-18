package com.box.sdkgen.schemas.folderbase;

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

public class FolderBase {

  protected final String id;

  protected String etag;

  @JsonDeserialize(using = FolderBaseTypeField.FolderBaseTypeFieldDeserializer.class)
  @JsonSerialize(using = FolderBaseTypeField.FolderBaseTypeFieldSerializer.class)
  protected EnumWrapper<FolderBaseTypeField> type;

  public FolderBase(@JsonProperty("id") String id) {
    this.id = id;
    this.type = new EnumWrapper<FolderBaseTypeField>(FolderBaseTypeField.FOLDER.getValue(), FolderBaseTypeField.FOLDER);
  }

  protected FolderBase(FolderBaseBuilder builder) {
    this.id = builder.id;
    this.etag = builder.etag;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public String getEtag() {
    return etag;
  }

  public EnumWrapper<FolderBaseTypeField> getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderBase casted = (FolderBase) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(etag, casted.etag) &&
      Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, etag, type
    );
  }

  @Override
  public String toString() {
    return "FolderBase{" + "id='" + id + '\'' + ", " + "etag='" + etag + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class FolderBaseBuilder {

    protected final String id;

    protected String etag;

    protected EnumWrapper<FolderBaseTypeField> type;

    public FolderBaseBuilder(String id) {
      this.id = id;
      this.type = new EnumWrapper<FolderBaseTypeField>(FolderBaseTypeField.FOLDER.getValue(), FolderBaseTypeField.FOLDER);
    }

    public FolderBaseBuilder etag(String etag) {
      this.etag = etag;
      return this;
    }

    public FolderBaseBuilder type(FolderBaseTypeField type) {
      this.type = new EnumWrapper<FolderBaseTypeField>(type.getValue(), type);
      return this;
    }

    public FolderBase build() {
      return new FolderBase(this);
    }

  }

}
