package com.box.sdkgen.managers.foldermetadata;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class UpdateFolderMetadataByIdRequestBody {

  @JsonDeserialize(
      using =
          UpdateFolderMetadataByIdRequestBodyOpField
              .UpdateFolderMetadataByIdRequestBodyOpFieldDeserializer.class)
  @JsonSerialize(
      using =
          UpdateFolderMetadataByIdRequestBodyOpField
              .UpdateFolderMetadataByIdRequestBodyOpFieldSerializer.class)
  protected EnumWrapper<UpdateFolderMetadataByIdRequestBodyOpField> op;

  protected String path;

  protected String value;

  protected String from;

  public UpdateFolderMetadataByIdRequestBody() {}

  protected UpdateFolderMetadataByIdRequestBody(
      UpdateFolderMetadataByIdRequestBodyBuilder builder) {
    this.op = builder.op;
    this.path = builder.path;
    this.value = builder.value;
    this.from = builder.from;
  }

  public EnumWrapper<UpdateFolderMetadataByIdRequestBodyOpField> getOp() {
    return op;
  }

  public String getPath() {
    return path;
  }

  public String getValue() {
    return value;
  }

  public String getFrom() {
    return from;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFolderMetadataByIdRequestBody casted = (UpdateFolderMetadataByIdRequestBody) o;
    return Objects.equals(op, casted.op)
        && Objects.equals(path, casted.path)
        && Objects.equals(value, casted.value)
        && Objects.equals(from, casted.from);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value, from);
  }

  @Override
  public String toString() {
    return "UpdateFolderMetadataByIdRequestBody{"
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
        + ", "
        + "from='"
        + from
        + '\''
        + "}";
  }

  public static class UpdateFolderMetadataByIdRequestBodyBuilder {

    protected EnumWrapper<UpdateFolderMetadataByIdRequestBodyOpField> op;

    protected String path;

    protected String value;

    protected String from;

    public UpdateFolderMetadataByIdRequestBodyBuilder op(
        EnumWrapper<UpdateFolderMetadataByIdRequestBodyOpField> op) {
      this.op = op;
      return this;
    }

    public UpdateFolderMetadataByIdRequestBodyBuilder op(
        UpdateFolderMetadataByIdRequestBodyOpField op) {
      this.op = new EnumWrapper<UpdateFolderMetadataByIdRequestBodyOpField>(op.getValue(), op);
      return this;
    }

    public UpdateFolderMetadataByIdRequestBodyBuilder path(String path) {
      this.path = path;
      return this;
    }

    public UpdateFolderMetadataByIdRequestBodyBuilder value(String value) {
      this.value = value;
      return this;
    }

    public UpdateFolderMetadataByIdRequestBodyBuilder from(String from) {
      this.from = from;
      return this;
    }

    public UpdateFolderMetadataByIdRequestBody build() {
      return new UpdateFolderMetadataByIdRequestBody(this);
    }
  }
}
