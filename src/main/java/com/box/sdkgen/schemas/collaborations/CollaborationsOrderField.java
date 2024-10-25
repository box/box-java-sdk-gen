package com.box.sdkgen.schemas.collaborations;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class CollaborationsOrderField {

  protected String by;

  @JsonDeserialize(
      using = CollaborationsOrderDirectionField.CollaborationsOrderDirectionFieldDeserializer.class)
  @JsonSerialize(
      using = CollaborationsOrderDirectionField.CollaborationsOrderDirectionFieldSerializer.class)
  protected EnumWrapper<CollaborationsOrderDirectionField> direction;

  public CollaborationsOrderField() {}

  protected CollaborationsOrderField(CollaborationsOrderFieldBuilder builder) {
    this.by = builder.by;
    this.direction = builder.direction;
  }

  public String getBy() {
    return by;
  }

  public EnumWrapper<CollaborationsOrderDirectionField> getDirection() {
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
    CollaborationsOrderField casted = (CollaborationsOrderField) o;
    return Objects.equals(by, casted.by) && Objects.equals(direction, casted.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(by, direction);
  }

  @Override
  public String toString() {
    return "CollaborationsOrderField{"
        + "by='"
        + by
        + '\''
        + ", "
        + "direction='"
        + direction
        + '\''
        + "}";
  }

  public static class CollaborationsOrderFieldBuilder {

    protected String by;

    protected EnumWrapper<CollaborationsOrderDirectionField> direction;

    public CollaborationsOrderFieldBuilder by(String by) {
      this.by = by;
      return this;
    }

    public CollaborationsOrderFieldBuilder direction(
        EnumWrapper<CollaborationsOrderDirectionField> direction) {
      this.direction = direction;
      return this;
    }

    public CollaborationsOrderFieldBuilder direction(CollaborationsOrderDirectionField direction) {
      this.direction =
          new EnumWrapper<CollaborationsOrderDirectionField>(direction.getValue(), direction);
      return this;
    }

    public CollaborationsOrderField build() {
      return new CollaborationsOrderField(this);
    }
  }
}
