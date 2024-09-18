package com.box.sdkgen.schemas.fileversions;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.fileversionfull.FileVersionFull;

public class FileVersionsOrderField {

  protected String by;

  @JsonDeserialize(using = FileVersionsOrderDirectionField.FileVersionsOrderDirectionFieldDeserializer.class)
  @JsonSerialize(using = FileVersionsOrderDirectionField.FileVersionsOrderDirectionFieldSerializer.class)
  protected EnumWrapper<FileVersionsOrderDirectionField> direction;

  public FileVersionsOrderField() {
  }

  protected FileVersionsOrderField(FileVersionsOrderFieldBuilder builder) {
    this.by = builder.by;
    this.direction = builder.direction;
  }

  public String getBy() {
    return by;
  }

  public EnumWrapper<FileVersionsOrderDirectionField> getDirection() {
    return direction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVersionsOrderField casted = (FileVersionsOrderField) o;
    return Objects.equals(by, casted.by) &&
      Objects.equals(direction, casted.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      by, direction
    );
  }

  @Override
  public String toString() {
    return "FileVersionsOrderField{" + "by='" + by + '\'' + ", " + "direction='" + direction + '\'' + "}";
  }

  public static class FileVersionsOrderFieldBuilder {

    protected String by;

    protected EnumWrapper<FileVersionsOrderDirectionField> direction;

    public FileVersionsOrderFieldBuilder by(String by) {
      this.by = by;
      return this;
    }

    public FileVersionsOrderFieldBuilder direction(FileVersionsOrderDirectionField direction) {
      this.direction = new EnumWrapper<FileVersionsOrderDirectionField>(direction.getValue(), direction);
      return this;
    }

    public FileVersionsOrderField build() {
      return new FileVersionsOrderField(this);
    }

  }

}
