package com.box.sdkgen.managers.memberships;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import java.util.Objects;

public class CreateGroupMembershipRequestBody {

  protected final CreateGroupMembershipRequestBodyUserField user;

  protected final CreateGroupMembershipRequestBodyGroupField group;

  @JsonDeserialize(
      using =
          CreateGroupMembershipRequestBodyRoleField
              .CreateGroupMembershipRequestBodyRoleFieldDeserializer.class)
  @JsonSerialize(
      using =
          CreateGroupMembershipRequestBodyRoleField
              .CreateGroupMembershipRequestBodyRoleFieldSerializer.class)
  protected EnumWrapper<CreateGroupMembershipRequestBodyRoleField> role;

  @JsonProperty("configurable_permissions")
  protected Map<String, Boolean> configurablePermissions;

  public CreateGroupMembershipRequestBody(
      @JsonProperty("user") CreateGroupMembershipRequestBodyUserField user,
      @JsonProperty("group") CreateGroupMembershipRequestBodyGroupField group) {
    this.user = user;
    this.group = group;
  }

  protected CreateGroupMembershipRequestBody(CreateGroupMembershipRequestBodyBuilder builder) {
    this.user = builder.user;
    this.group = builder.group;
    this.role = builder.role;
    this.configurablePermissions = builder.configurablePermissions;
  }

  public CreateGroupMembershipRequestBodyUserField getUser() {
    return user;
  }

  public CreateGroupMembershipRequestBodyGroupField getGroup() {
    return group;
  }

  public EnumWrapper<CreateGroupMembershipRequestBodyRoleField> getRole() {
    return role;
  }

  public Map<String, Boolean> getConfigurablePermissions() {
    return configurablePermissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupMembershipRequestBody casted = (CreateGroupMembershipRequestBody) o;
    return Objects.equals(user, casted.user)
        && Objects.equals(group, casted.group)
        && Objects.equals(role, casted.role)
        && Objects.equals(configurablePermissions, casted.configurablePermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, group, role, configurablePermissions);
  }

  @Override
  public String toString() {
    return "CreateGroupMembershipRequestBody{"
        + "user='"
        + user
        + '\''
        + ", "
        + "group='"
        + group
        + '\''
        + ", "
        + "role='"
        + role
        + '\''
        + ", "
        + "configurablePermissions='"
        + configurablePermissions
        + '\''
        + "}";
  }

  public static class CreateGroupMembershipRequestBodyBuilder {

    protected final CreateGroupMembershipRequestBodyUserField user;

    protected final CreateGroupMembershipRequestBodyGroupField group;

    protected EnumWrapper<CreateGroupMembershipRequestBodyRoleField> role;

    protected Map<String, Boolean> configurablePermissions;

    public CreateGroupMembershipRequestBodyBuilder(
        CreateGroupMembershipRequestBodyUserField user,
        CreateGroupMembershipRequestBodyGroupField group) {
      this.user = user;
      this.group = group;
    }

    public CreateGroupMembershipRequestBodyBuilder role(
        EnumWrapper<CreateGroupMembershipRequestBodyRoleField> role) {
      this.role = role;
      return this;
    }

    public CreateGroupMembershipRequestBodyBuilder role(
        CreateGroupMembershipRequestBodyRoleField role) {
      this.role = new EnumWrapper<CreateGroupMembershipRequestBodyRoleField>(role.getValue(), role);
      return this;
    }

    public CreateGroupMembershipRequestBodyBuilder configurablePermissions(
        Map<String, Boolean> configurablePermissions) {
      this.configurablePermissions = configurablePermissions;
      return this;
    }

    public CreateGroupMembershipRequestBody build() {
      return new CreateGroupMembershipRequestBody(this);
    }
  }
}
