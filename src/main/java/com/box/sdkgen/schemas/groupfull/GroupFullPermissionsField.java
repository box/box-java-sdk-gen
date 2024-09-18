package com.box.sdkgen.schemas.groupfull;

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
import com.box.sdkgen.schemas.groupbase.GroupBaseTypeField;
import com.box.sdkgen.schemas.groupbase.GroupBase;
import com.box.sdkgen.schemas.groupmini.GroupMiniGroupTypeField;
import com.box.sdkgen.schemas.groupmini.GroupMini;
import com.box.sdkgen.schemas.group.Group;

public class GroupFullPermissionsField {

  @JsonProperty("can_invite_as_collaborator")
  protected Boolean canInviteAsCollaborator;

  public GroupFullPermissionsField() {
  }

  protected GroupFullPermissionsField(GroupFullPermissionsFieldBuilder builder) {
    this.canInviteAsCollaborator = builder.canInviteAsCollaborator;
  }

  public Boolean getCanInviteAsCollaborator() {
    return canInviteAsCollaborator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupFullPermissionsField casted = (GroupFullPermissionsField) o;
    return Objects.equals(canInviteAsCollaborator, casted.canInviteAsCollaborator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      canInviteAsCollaborator
    );
  }

  @Override
  public String toString() {
    return "GroupFullPermissionsField{" + "canInviteAsCollaborator='" + canInviteAsCollaborator + '\'' + "}";
  }

  public static class GroupFullPermissionsFieldBuilder {

    protected Boolean canInviteAsCollaborator;

    public GroupFullPermissionsFieldBuilder canInviteAsCollaborator(Boolean canInviteAsCollaborator) {
      this.canInviteAsCollaborator = canInviteAsCollaborator;
      return this;
    }

    public GroupFullPermissionsField build() {
      return new GroupFullPermissionsField(this);
    }

  }

}
