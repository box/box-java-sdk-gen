package com.box.sdkgen.schemas.uploadparts;

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
import com.box.sdkgen.schemas.uploadpart.UploadPart;

public class UploadPartsOrderField {

  protected String by;

  @JsonDeserialize(using = UploadPartsOrderDirectionField.UploadPartsOrderDirectionFieldDeserializer.class)
  @JsonSerialize(using = UploadPartsOrderDirectionField.UploadPartsOrderDirectionFieldSerializer.class)
  protected EnumWrapper<UploadPartsOrderDirectionField> direction;

  public UploadPartsOrderField() {
  }

  protected UploadPartsOrderField(UploadPartsOrderFieldBuilder builder) {
    this.by = builder.by;
    this.direction = builder.direction;
  }

  public String getBy() {
    return by;
  }

  public EnumWrapper<UploadPartsOrderDirectionField> getDirection() {
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
    UploadPartsOrderField casted = (UploadPartsOrderField) o;
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
    return "UploadPartsOrderField{" + "by='" + by + '\'' + ", " + "direction='" + direction + '\'' + "}";
  }

  public static class UploadPartsOrderFieldBuilder {

    protected String by;

    protected EnumWrapper<UploadPartsOrderDirectionField> direction;

    public UploadPartsOrderFieldBuilder by(String by) {
      this.by = by;
      return this;
    }

    public UploadPartsOrderFieldBuilder direction(UploadPartsOrderDirectionField direction) {
      this.direction = new EnumWrapper<UploadPartsOrderDirectionField>(direction.getValue(), direction);
      return this;
    }

    public UploadPartsOrderField build() {
      return new UploadPartsOrderField(this);
    }

  }

}
