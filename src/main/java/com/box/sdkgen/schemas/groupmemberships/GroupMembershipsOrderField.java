package com.box.sdkgen.schemas.groupmemberships;

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
import com.box.sdkgen.schemas.groupmembership.GroupMembership;

public class GroupMembershipsOrderField {

  protected String by;

  @JsonDeserialize(using = GroupMembershipsOrderDirectionField.GroupMembershipsOrderDirectionFieldDeserializer.class)
  @JsonSerialize(using = GroupMembershipsOrderDirectionField.GroupMembershipsOrderDirectionFieldSerializer.class)
  protected EnumWrapper<GroupMembershipsOrderDirectionField> direction;

  public GroupMembershipsOrderField() {
  }

  protected GroupMembershipsOrderField(GroupMembershipsOrderFieldBuilder builder) {
    this.by = builder.by;
    this.direction = builder.direction;
  }

  public String getBy() {
    return by;
  }

  public EnumWrapper<GroupMembershipsOrderDirectionField> getDirection() {
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
    GroupMembershipsOrderField casted = (GroupMembershipsOrderField) o;
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
    return "GroupMembershipsOrderField{" + "by='" + by + '\'' + ", " + "direction='" + direction + '\'' + "}";
  }

  public static class GroupMembershipsOrderFieldBuilder {

    protected String by;

    protected EnumWrapper<GroupMembershipsOrderDirectionField> direction;

    public GroupMembershipsOrderFieldBuilder by(String by) {
      this.by = by;
      return this;
    }

    public GroupMembershipsOrderFieldBuilder direction(GroupMembershipsOrderDirectionField direction) {
      this.direction = new EnumWrapper<GroupMembershipsOrderDirectionField>(direction.getValue(), direction);
      return this;
    }

    public GroupMembershipsOrderField build() {
      return new GroupMembershipsOrderField(this);
    }

  }

}
