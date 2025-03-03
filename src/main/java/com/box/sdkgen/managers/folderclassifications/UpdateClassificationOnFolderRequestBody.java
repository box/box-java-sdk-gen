package com.box.sdkgen.managers.folderclassifications;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class UpdateClassificationOnFolderRequestBody extends SerializableObject {

  @JsonDeserialize(
      using =
          UpdateClassificationOnFolderRequestBodyOpField
              .UpdateClassificationOnFolderRequestBodyOpFieldDeserializer.class)
  @JsonSerialize(
      using =
          UpdateClassificationOnFolderRequestBodyOpField
              .UpdateClassificationOnFolderRequestBodyOpFieldSerializer.class)
  protected EnumWrapper<UpdateClassificationOnFolderRequestBodyOpField> op;

  @JsonDeserialize(
      using =
          UpdateClassificationOnFolderRequestBodyPathField
              .UpdateClassificationOnFolderRequestBodyPathFieldDeserializer.class)
  @JsonSerialize(
      using =
          UpdateClassificationOnFolderRequestBodyPathField
              .UpdateClassificationOnFolderRequestBodyPathFieldSerializer.class)
  protected EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField> path;

  protected final String value;

  public UpdateClassificationOnFolderRequestBody(@JsonProperty("value") String value) {
    super();
    this.value = value;
    this.op =
        new EnumWrapper<UpdateClassificationOnFolderRequestBodyOpField>(
            UpdateClassificationOnFolderRequestBodyOpField.REPLACE);
    this.path =
        new EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField>(
            UpdateClassificationOnFolderRequestBodyPathField._BOX__SECURITY__CLASSIFICATION__KEY);
  }

  protected UpdateClassificationOnFolderRequestBody(
      UpdateClassificationOnFolderRequestBodyBuilder builder) {
    super();
    this.op = builder.op;
    this.path = builder.path;
    this.value = builder.value;
  }

  public EnumWrapper<UpdateClassificationOnFolderRequestBodyOpField> getOp() {
    return op;
  }

  public EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField> getPath() {
    return path;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClassificationOnFolderRequestBody casted = (UpdateClassificationOnFolderRequestBody) o;
    return Objects.equals(op, casted.op)
        && Objects.equals(path, casted.path)
        && Objects.equals(value, casted.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value);
  }

  @Override
  public String toString() {
    return "UpdateClassificationOnFolderRequestBody{"
        + "op='"
        + op
        + '\''
        + ", "
        + "path='"
        + path
        + '\''
        + ", "
        + "value='"
        + value
        + '\''
        + "}";
  }

  public static class UpdateClassificationOnFolderRequestBodyBuilder {

    protected EnumWrapper<UpdateClassificationOnFolderRequestBodyOpField> op;

    protected EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField> path;

    protected final String value;

    public UpdateClassificationOnFolderRequestBodyBuilder(String value) {
      this.value = value;
      this.op =
          new EnumWrapper<UpdateClassificationOnFolderRequestBodyOpField>(
              UpdateClassificationOnFolderRequestBodyOpField.REPLACE);
      this.path =
          new EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField>(
              UpdateClassificationOnFolderRequestBodyPathField._BOX__SECURITY__CLASSIFICATION__KEY);
    }

    public UpdateClassificationOnFolderRequestBodyBuilder op(
        UpdateClassificationOnFolderRequestBodyOpField op) {
      this.op = new EnumWrapper<UpdateClassificationOnFolderRequestBodyOpField>(op);
      return this;
    }

    public UpdateClassificationOnFolderRequestBodyBuilder op(
        EnumWrapper<UpdateClassificationOnFolderRequestBodyOpField> op) {
      this.op = op;
      return this;
    }

    public UpdateClassificationOnFolderRequestBodyBuilder path(
        UpdateClassificationOnFolderRequestBodyPathField path) {
      this.path = new EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField>(path);
      return this;
    }

    public UpdateClassificationOnFolderRequestBodyBuilder path(
        EnumWrapper<UpdateClassificationOnFolderRequestBodyPathField> path) {
      this.path = path;
      return this;
    }

    public UpdateClassificationOnFolderRequestBody build() {
      return new UpdateClassificationOnFolderRequestBody(this);
    }
  }
}
