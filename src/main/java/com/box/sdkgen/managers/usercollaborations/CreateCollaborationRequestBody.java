package com.box.sdkgen.managers.usercollaborations;

import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
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
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.collaboration.Collaboration;
import com.box.sdkgen.schemas.clienterror.ClientError;
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

public class CreateCollaborationRequestBody {

  protected final CreateCollaborationRequestBodyItemField item;

  @JsonProperty("accessible_by")
  protected final CreateCollaborationRequestBodyAccessibleByField accessibleBy;

  @JsonDeserialize(using = CreateCollaborationRequestBodyRoleField.CreateCollaborationRequestBodyRoleFieldDeserializer.class)
  @JsonSerialize(using = CreateCollaborationRequestBodyRoleField.CreateCollaborationRequestBodyRoleFieldSerializer.class)
  protected final EnumWrapper<CreateCollaborationRequestBodyRoleField> role;

  @JsonProperty("is_access_only")
  protected Boolean isAccessOnly;

  @JsonProperty("can_view_path")
  protected Boolean canViewPath;

  @JsonProperty("expires_at")
  protected String expiresAt;

  public CreateCollaborationRequestBody(@JsonProperty("item") CreateCollaborationRequestBodyItemField item, @JsonProperty("accessible_by") CreateCollaborationRequestBodyAccessibleByField accessibleBy, @JsonProperty("role") EnumWrapper<CreateCollaborationRequestBodyRoleField> role) {
    this.item = item;
    this.accessibleBy = accessibleBy;
    this.role = role;
  }

  public CreateCollaborationRequestBody(CreateCollaborationRequestBodyItemField item, CreateCollaborationRequestBodyAccessibleByField accessibleBy, CreateCollaborationRequestBodyRoleField role) {
    this.item = item;
    this.accessibleBy = accessibleBy;
    this.role = new EnumWrapper<CreateCollaborationRequestBodyRoleField>(role.getValue(), role);
  }

  protected CreateCollaborationRequestBody(CreateCollaborationRequestBodyBuilder builder) {
    this.item = builder.item;
    this.accessibleBy = builder.accessibleBy;
    this.role = builder.role;
    this.isAccessOnly = builder.isAccessOnly;
    this.canViewPath = builder.canViewPath;
    this.expiresAt = builder.expiresAt;
  }

  public CreateCollaborationRequestBodyItemField getItem() {
    return item;
  }

  public CreateCollaborationRequestBodyAccessibleByField getAccessibleBy() {
    return accessibleBy;
  }

  public EnumWrapper<CreateCollaborationRequestBodyRoleField> getRole() {
    return role;
  }

  public Boolean getIsAccessOnly() {
    return isAccessOnly;
  }

  public Boolean getCanViewPath() {
    return canViewPath;
  }

  public String getExpiresAt() {
    return expiresAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCollaborationRequestBody casted = (CreateCollaborationRequestBody) o;
    return Objects.equals(item, casted.item) &&
      Objects.equals(accessibleBy, casted.accessibleBy) &&
      Objects.equals(role, casted.role) &&
      Objects.equals(isAccessOnly, casted.isAccessOnly) &&
      Objects.equals(canViewPath, casted.canViewPath) &&
      Objects.equals(expiresAt, casted.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      item, accessibleBy, role, isAccessOnly, canViewPath, expiresAt
    );
  }

  @Override
  public String toString() {
    return "CreateCollaborationRequestBody{" + "item='" + item + '\'' + ", " + "accessibleBy='" + accessibleBy + '\'' + ", " + "role='" + role + '\'' + ", " + "isAccessOnly='" + isAccessOnly + '\'' + ", " + "canViewPath='" + canViewPath + '\'' + ", " + "expiresAt='" + expiresAt + '\'' + "}";
  }

  public static class CreateCollaborationRequestBodyBuilder {

    protected final CreateCollaborationRequestBodyItemField item;

    protected final CreateCollaborationRequestBodyAccessibleByField accessibleBy;

    protected final EnumWrapper<CreateCollaborationRequestBodyRoleField> role;

    protected Boolean isAccessOnly;

    protected Boolean canViewPath;

    protected String expiresAt;

    public CreateCollaborationRequestBodyBuilder(CreateCollaborationRequestBodyItemField item, CreateCollaborationRequestBodyAccessibleByField accessibleBy, CreateCollaborationRequestBodyRoleField role) {
      this.item = item;
      this.accessibleBy = accessibleBy;
      this.role = new EnumWrapper<CreateCollaborationRequestBodyRoleField>(role.getValue(), role);
    }

    public CreateCollaborationRequestBodyBuilder isAccessOnly(Boolean isAccessOnly) {
      this.isAccessOnly = isAccessOnly;
      return this;
    }

    public CreateCollaborationRequestBodyBuilder canViewPath(Boolean canViewPath) {
      this.canViewPath = canViewPath;
      return this;
    }

    public CreateCollaborationRequestBodyBuilder expiresAt(String expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    public CreateCollaborationRequestBody build() {
      return new CreateCollaborationRequestBody(this);
    }

  }

}
