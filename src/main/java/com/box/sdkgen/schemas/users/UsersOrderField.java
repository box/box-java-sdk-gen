package com.box.sdkgen.schemas.users;

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
import com.box.sdkgen.schemas.userfull.UserFull;

public class UsersOrderField {

  protected String by;

  @JsonDeserialize(using = UsersOrderDirectionField.UsersOrderDirectionFieldDeserializer.class)
  @JsonSerialize(using = UsersOrderDirectionField.UsersOrderDirectionFieldSerializer.class)
  protected EnumWrapper<UsersOrderDirectionField> direction;

  public UsersOrderField() {
  }

  protected UsersOrderField(UsersOrderFieldBuilder builder) {
    this.by = builder.by;
    this.direction = builder.direction;
  }

  public String getBy() {
    return by;
  }

  public EnumWrapper<UsersOrderDirectionField> getDirection() {
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
    UsersOrderField casted = (UsersOrderField) o;
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
    return "UsersOrderField{" + "by='" + by + '\'' + ", " + "direction='" + direction + '\'' + "}";
  }

  public static class UsersOrderFieldBuilder {

    protected String by;

    protected EnumWrapper<UsersOrderDirectionField> direction;

    public UsersOrderFieldBuilder by(String by) {
      this.by = by;
      return this;
    }

    public UsersOrderFieldBuilder direction(UsersOrderDirectionField direction) {
      this.direction = new EnumWrapper<UsersOrderDirectionField>(direction.getValue(), direction);
      return this;
    }

    public UsersOrderField build() {
      return new UsersOrderField(this);
    }

  }

}
