package com.box.sdkgen.schemas.groupbase;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class GroupBase {

  protected final String id;

  @JsonDeserialize(using = GroupBaseTypeField.GroupBaseTypeFieldDeserializer.class)
  @JsonSerialize(using = GroupBaseTypeField.GroupBaseTypeFieldSerializer.class)
  protected EnumWrapper<GroupBaseTypeField> type;

  public GroupBase(@JsonProperty("id") String id) {
    this.id = id;
    this.type = new EnumWrapper<GroupBaseTypeField>(GroupBaseTypeField.GROUP.getValue(), GroupBaseTypeField.GROUP);
  }

  protected GroupBase(GroupBaseBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<GroupBaseTypeField> getType() {
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
    GroupBase casted = (GroupBase) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type
    );
  }

  @Override
  public String toString() {
    return "GroupBase{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class GroupBaseBuilder {

    protected final String id;

    protected EnumWrapper<GroupBaseTypeField> type;

    public GroupBaseBuilder(String id) {
      this.id = id;
      this.type = new EnumWrapper<GroupBaseTypeField>(GroupBaseTypeField.GROUP.getValue(), GroupBaseTypeField.GROUP);
    }

    public GroupBaseBuilder type(GroupBaseTypeField type) {
      this.type = new EnumWrapper<GroupBaseTypeField>(type.getValue(), type);
      return this;
    }

    public GroupBase build() {
      return new GroupBase(this);
    }

  }

}
