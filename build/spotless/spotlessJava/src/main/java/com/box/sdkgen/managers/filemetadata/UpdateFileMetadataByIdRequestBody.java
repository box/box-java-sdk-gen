package com.box.sdkgen.managers.filemetadata;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class UpdateFileMetadataByIdRequestBody {

  @JsonDeserialize(
      using =
          UpdateFileMetadataByIdRequestBodyOpField
              .UpdateFileMetadataByIdRequestBodyOpFieldDeserializer.class)
  @JsonSerialize(
      using =
          UpdateFileMetadataByIdRequestBodyOpField
              .UpdateFileMetadataByIdRequestBodyOpFieldSerializer.class)
  protected EnumWrapper<UpdateFileMetadataByIdRequestBodyOpField> op;

  protected String path;

  protected String value;

  protected String from;

  public UpdateFileMetadataByIdRequestBody() {}

  protected UpdateFileMetadataByIdRequestBody(UpdateFileMetadataByIdRequestBodyBuilder builder) {
    this.op = builder.op;
    this.path = builder.path;
    this.value = builder.value;
    this.from = builder.from;
  }

  public EnumWrapper<UpdateFileMetadataByIdRequestBodyOpField> getOp() {
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
    UpdateFileMetadataByIdRequestBody casted = (UpdateFileMetadataByIdRequestBody) o;
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
    return "UpdateFileMetadataByIdRequestBody{"
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

  public static class UpdateFileMetadataByIdRequestBodyBuilder {

    protected EnumWrapper<UpdateFileMetadataByIdRequestBodyOpField> op;

    protected String path;

    protected String value;

    protected String from;

    public UpdateFileMetadataByIdRequestBodyBuilder op(
        UpdateFileMetadataByIdRequestBodyOpField op) {
      this.op = new EnumWrapper<UpdateFileMetadataByIdRequestBodyOpField>(op.getValue(), op);
      return this;
    }

    public UpdateFileMetadataByIdRequestBodyBuilder path(String path) {
      this.path = path;
      return this;
    }

    public UpdateFileMetadataByIdRequestBodyBuilder value(String value) {
      this.value = value;
      return this;
    }

    public UpdateFileMetadataByIdRequestBodyBuilder from(String from) {
      this.from = from;
      return this;
    }

    public UpdateFileMetadataByIdRequestBody build() {
      return new UpdateFileMetadataByIdRequestBody(this);
    }
  }
}
