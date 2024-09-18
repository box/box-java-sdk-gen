package com.box.sdkgen.schemas.comments;

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
import com.box.sdkgen.schemas.commentfull.CommentFull;

public class CommentsOrderField {

  protected String by;

  @JsonDeserialize(using = CommentsOrderDirectionField.CommentsOrderDirectionFieldDeserializer.class)
  @JsonSerialize(using = CommentsOrderDirectionField.CommentsOrderDirectionFieldSerializer.class)
  protected EnumWrapper<CommentsOrderDirectionField> direction;

  public CommentsOrderField() {
  }

  protected CommentsOrderField(CommentsOrderFieldBuilder builder) {
    this.by = builder.by;
    this.direction = builder.direction;
  }

  public String getBy() {
    return by;
  }

  public EnumWrapper<CommentsOrderDirectionField> getDirection() {
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
    CommentsOrderField casted = (CommentsOrderField) o;
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
    return "CommentsOrderField{" + "by='" + by + '\'' + ", " + "direction='" + direction + '\'' + "}";
  }

  public static class CommentsOrderFieldBuilder {

    protected String by;

    protected EnumWrapper<CommentsOrderDirectionField> direction;

    public CommentsOrderFieldBuilder by(String by) {
      this.by = by;
      return this;
    }

    public CommentsOrderFieldBuilder direction(CommentsOrderDirectionField direction) {
      this.direction = new EnumWrapper<CommentsOrderDirectionField>(direction.getValue(), direction);
      return this;
    }

    public CommentsOrderField build() {
      return new CommentsOrderField(this);
    }

  }

}
