package com.box.sdkgen.schemas.groupmini;

import com.box.sdkgen.schemas.groupbase.GroupBase;
import com.box.sdkgen.schemas.groupbase.GroupBaseTypeField;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class GroupMini extends GroupBase {

  protected String name;

  @JsonDeserialize(using = GroupMiniGroupTypeField.GroupMiniGroupTypeFieldDeserializer.class)
  @JsonSerialize(using = GroupMiniGroupTypeField.GroupMiniGroupTypeFieldSerializer.class)
  @JsonProperty("group_type")
  protected EnumWrapper<GroupMiniGroupTypeField> groupType;

  public GroupMini(@JsonProperty("id") String id) {
    super(id);
  }

  protected GroupMini(GroupMiniBuilder builder) {
    super(builder);
    this.name = builder.name;
    this.groupType = builder.groupType;
  }

  public String getName() {
    return name;
  }

  public EnumWrapper<GroupMiniGroupTypeField> getGroupType() {
    return groupType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMini casted = (GroupMini) o;
    return Objects.equals(id, casted.id)
        && Objects.equals(type, casted.type)
        && Objects.equals(name, casted.name)
        && Objects.equals(groupType, casted.groupType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, name, groupType);
  }

  @Override
  public String toString() {
    return "GroupMini{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + ", "
        + "name='"
        + name
        + '\''
        + ", "
        + "groupType='"
        + groupType
        + '\''
        + "}";
  }

  public static class GroupMiniBuilder extends GroupBaseBuilder {

    protected String name;

    protected EnumWrapper<GroupMiniGroupTypeField> groupType;

    public GroupMiniBuilder(String id) {
      super(id);
    }

    public GroupMiniBuilder name(String name) {
      this.name = name;
      return this;
    }

    public GroupMiniBuilder groupType(GroupMiniGroupTypeField groupType) {
      this.groupType = new EnumWrapper<GroupMiniGroupTypeField>(groupType);
      return this;
    }

    public GroupMiniBuilder groupType(EnumWrapper<GroupMiniGroupTypeField> groupType) {
      this.groupType = groupType;
      return this;
    }

    @Override
    public GroupMiniBuilder type(GroupBaseTypeField type) {
      this.type = new EnumWrapper<GroupBaseTypeField>(type);
      return this;
    }

    @Override
    public GroupMiniBuilder type(EnumWrapper<GroupBaseTypeField> type) {
      this.type = type;
      return this;
    }

    public GroupMini build() {
      return new GroupMini(this);
    }
  }
}
