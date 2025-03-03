package com.box.sdkgen.schemas.fileversionbase;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class FileVersionBase extends SerializableObject {

  protected final String id;

  @JsonDeserialize(using = FileVersionBaseTypeField.FileVersionBaseTypeFieldDeserializer.class)
  @JsonSerialize(using = FileVersionBaseTypeField.FileVersionBaseTypeFieldSerializer.class)
  protected EnumWrapper<FileVersionBaseTypeField> type;

  public FileVersionBase(@JsonProperty("id") String id) {
    super();
    this.id = id;
    this.type = new EnumWrapper<FileVersionBaseTypeField>(FileVersionBaseTypeField.FILE_VERSION);
  }

  protected FileVersionBase(FileVersionBaseBuilder builder) {
    super();
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<FileVersionBaseTypeField> getType() {
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
    FileVersionBase casted = (FileVersionBase) o;
    return Objects.equals(id, casted.id) && Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    return "FileVersionBase{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class FileVersionBaseBuilder {

    protected final String id;

    protected EnumWrapper<FileVersionBaseTypeField> type;

    public FileVersionBaseBuilder(String id) {
      this.id = id;
      this.type = new EnumWrapper<FileVersionBaseTypeField>(FileVersionBaseTypeField.FILE_VERSION);
    }

    public FileVersionBaseBuilder type(FileVersionBaseTypeField type) {
      this.type = new EnumWrapper<FileVersionBaseTypeField>(type);
      return this;
    }

    public FileVersionBaseBuilder type(EnumWrapper<FileVersionBaseTypeField> type) {
      this.type = type;
      return this;
    }

    public FileVersionBase build() {
      return new FileVersionBase(this);
    }
  }
}
