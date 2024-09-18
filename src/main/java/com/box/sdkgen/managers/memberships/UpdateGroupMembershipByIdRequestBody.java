package com.box.sdkgen.managers.memberships;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.groupmemberships.GroupMemberships;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.groupmembership.GroupMembership;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;

public class UpdateGroupMembershipByIdRequestBody {

  @JsonDeserialize(using = UpdateGroupMembershipByIdRequestBodyRoleField.UpdateGroupMembershipByIdRequestBodyRoleFieldDeserializer.class)
  @JsonSerialize(using = UpdateGroupMembershipByIdRequestBodyRoleField.UpdateGroupMembershipByIdRequestBodyRoleFieldSerializer.class)
  protected EnumWrapper<UpdateGroupMembershipByIdRequestBodyRoleField> role;

  @JsonProperty("configurable_permissions")
  protected Map<String, Boolean> configurablePermissions;

  public UpdateGroupMembershipByIdRequestBody() {
  }

  protected UpdateGroupMembershipByIdRequestBody(UpdateGroupMembershipByIdRequestBodyBuilder builder) {
    this.role = builder.role;
    this.configurablePermissions = builder.configurablePermissions;
  }

  public EnumWrapper<UpdateGroupMembershipByIdRequestBodyRoleField> getRole() {
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
    UpdateGroupMembershipByIdRequestBody casted = (UpdateGroupMembershipByIdRequestBody) o;
    return Objects.equals(role, casted.role) &&
      Objects.equals(configurablePermissions, casted.configurablePermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      role, configurablePermissions
    );
  }

  @Override
  public String toString() {
    return "UpdateGroupMembershipByIdRequestBody{" + "role='" + role + '\'' + ", " + "configurablePermissions='" + configurablePermissions + '\'' + "}";
  }

  public static class UpdateGroupMembershipByIdRequestBodyBuilder {

    protected EnumWrapper<UpdateGroupMembershipByIdRequestBodyRoleField> role;

    protected Map<String, Boolean> configurablePermissions;

    public UpdateGroupMembershipByIdRequestBodyBuilder role(UpdateGroupMembershipByIdRequestBodyRoleField role) {
      this.role = new EnumWrapper<UpdateGroupMembershipByIdRequestBodyRoleField>(role.getValue(), role);
      return this;
    }

    public UpdateGroupMembershipByIdRequestBodyBuilder configurablePermissions(Map<String, Boolean> configurablePermissions) {
      this.configurablePermissions = configurablePermissions;
      return this;
    }

    public UpdateGroupMembershipByIdRequestBody build() {
      return new UpdateGroupMembershipByIdRequestBody(this);
    }

  }

}
