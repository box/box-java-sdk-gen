package com.box.sdkgen.schemas.filebase;

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

public class FileBase {

  protected final String id;

  protected String etag;

  @JsonDeserialize(using = FileBaseTypeField.FileBaseTypeFieldDeserializer.class)
  @JsonSerialize(using = FileBaseTypeField.FileBaseTypeFieldSerializer.class)
  protected EnumWrapper<FileBaseTypeField> type;

  public FileBase(@JsonProperty("id") String id) {
    this.id = id;
    this.type = new EnumWrapper<FileBaseTypeField>(FileBaseTypeField.FILE.getValue(), FileBaseTypeField.FILE);
  }

  protected FileBase(FileBaseBuilder builder) {
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

  public EnumWrapper<FileBaseTypeField> getType() {
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
    FileBase casted = (FileBase) o;
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
    return "FileBase{" + "id='" + id + '\'' + ", " + "etag='" + etag + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class FileBaseBuilder {

    protected final String id;

    protected String etag;

    protected EnumWrapper<FileBaseTypeField> type;

    public FileBaseBuilder(String id) {
      this.id = id;
      this.type = new EnumWrapper<FileBaseTypeField>(FileBaseTypeField.FILE.getValue(), FileBaseTypeField.FILE);
    }

    public FileBaseBuilder etag(String etag) {
      this.etag = etag;
      return this;
    }

    public FileBaseBuilder type(FileBaseTypeField type) {
      this.type = new EnumWrapper<FileBaseTypeField>(type.getValue(), type);
      return this;
    }

    public FileBase build() {
      return new FileBase(this);
    }

  }

}
