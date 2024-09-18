package com.box.sdkgen.managers.sharedlinksweblinks;

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
import com.box.sdkgen.schemas.weblink.WebLink;
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

public class UpdateSharedLinkOnWebLinkRequestBodySharedLinkField {

  @JsonDeserialize(using = UpdateSharedLinkOnWebLinkRequestBodySharedLinkAccessField.UpdateSharedLinkOnWebLinkRequestBodySharedLinkAccessFieldDeserializer.class)
  @JsonSerialize(using = UpdateSharedLinkOnWebLinkRequestBodySharedLinkAccessField.UpdateSharedLinkOnWebLinkRequestBodySharedLinkAccessFieldSerializer.class)
  protected EnumWrapper<UpdateSharedLinkOnWebLinkRequestBodySharedLinkAccessField> access;

  protected String password;

  @JsonProperty("vanity_name")
  protected String vanityName;

  @JsonProperty("unshared_at")
  protected String unsharedAt;

  protected UpdateSharedLinkOnWebLinkRequestBodySharedLinkPermissionsField permissions;

  public UpdateSharedLinkOnWebLinkRequestBodySharedLinkField() {
  }

  protected UpdateSharedLinkOnWebLinkRequestBodySharedLinkField(UpdateSharedLinkOnWebLinkRequestBodySharedLinkFieldBuilder builder) {
    this.access = builder.access;
    this.password = builder.password;
    this.vanityName = builder.vanityName;
    this.unsharedAt = builder.unsharedAt;
    this.permissions = builder.permissions;
  }

  public EnumWrapper<UpdateSharedLinkOnWebLinkRequestBodySharedLinkAccessField> getAccess() {
    return access;
  }

  public String getPassword() {
    return password;
  }

  public String getVanityName() {
    return vanityName;
  }

  public String getUnsharedAt() {
    return unsharedAt;
  }

  public UpdateSharedLinkOnWebLinkRequestBodySharedLinkPermissionsField getPermissions() {
    return permissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSharedLinkOnWebLinkRequestBodySharedLinkField casted = (UpdateSharedLinkOnWebLinkRequestBodySharedLinkField) o;
    return Objects.equals(access, casted.access) &&
      Objects.equals(password, casted.password) &&
      Objects.equals(vanityName, casted.vanityName) &&
      Objects.equals(unsharedAt, casted.unsharedAt) &&
      Objects.equals(permissions, casted.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      access, password, vanityName, unsharedAt, permissions
    );
  }

  @Override
  public String toString() {
    return "UpdateSharedLinkOnWebLinkRequestBodySharedLinkField{" + "access='" + access + '\'' + ", " + "password='" + password + '\'' + ", " + "vanityName='" + vanityName + '\'' + ", " + "unsharedAt='" + unsharedAt + '\'' + ", " + "permissions='" + permissions + '\'' + "}";
  }

  public static class UpdateSharedLinkOnWebLinkRequestBodySharedLinkFieldBuilder {

    protected EnumWrapper<UpdateSharedLinkOnWebLinkRequestBodySharedLinkAccessField> access;

    protected String password;

    protected String vanityName;

    protected String unsharedAt;

    protected UpdateSharedLinkOnWebLinkRequestBodySharedLinkPermissionsField permissions;

    public UpdateSharedLinkOnWebLinkRequestBodySharedLinkFieldBuilder access(UpdateSharedLinkOnWebLinkRequestBodySharedLinkAccessField access) {
      this.access = new EnumWrapper<UpdateSharedLinkOnWebLinkRequestBodySharedLinkAccessField>(access.getValue(), access);
      return this;
    }

    public UpdateSharedLinkOnWebLinkRequestBodySharedLinkFieldBuilder password(String password) {
      this.password = password;
      return this;
    }

    public UpdateSharedLinkOnWebLinkRequestBodySharedLinkFieldBuilder vanityName(String vanityName) {
      this.vanityName = vanityName;
      return this;
    }

    public UpdateSharedLinkOnWebLinkRequestBodySharedLinkFieldBuilder unsharedAt(String unsharedAt) {
      this.unsharedAt = unsharedAt;
      return this;
    }

    public UpdateSharedLinkOnWebLinkRequestBodySharedLinkFieldBuilder permissions(UpdateSharedLinkOnWebLinkRequestBodySharedLinkPermissionsField permissions) {
      this.permissions = permissions;
      return this;
    }

    public UpdateSharedLinkOnWebLinkRequestBodySharedLinkField build() {
      return new UpdateSharedLinkOnWebLinkRequestBodySharedLinkField(this);
    }

  }

}
