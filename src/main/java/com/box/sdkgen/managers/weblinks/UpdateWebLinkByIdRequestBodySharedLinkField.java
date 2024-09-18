package com.box.sdkgen.managers.weblinks;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import com.box.sdkgen.schemas.weblink.WebLink;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;

public class UpdateWebLinkByIdRequestBodySharedLinkField {

  @JsonDeserialize(using = UpdateWebLinkByIdRequestBodySharedLinkAccessField.UpdateWebLinkByIdRequestBodySharedLinkAccessFieldDeserializer.class)
  @JsonSerialize(using = UpdateWebLinkByIdRequestBodySharedLinkAccessField.UpdateWebLinkByIdRequestBodySharedLinkAccessFieldSerializer.class)
  protected EnumWrapper<UpdateWebLinkByIdRequestBodySharedLinkAccessField> access;

  protected String password;

  @JsonProperty("vanity_name")
  protected String vanityName;

  @JsonProperty("unshared_at")
  protected String unsharedAt;

  public UpdateWebLinkByIdRequestBodySharedLinkField() {
  }

  protected UpdateWebLinkByIdRequestBodySharedLinkField(UpdateWebLinkByIdRequestBodySharedLinkFieldBuilder builder) {
    this.access = builder.access;
    this.password = builder.password;
    this.vanityName = builder.vanityName;
    this.unsharedAt = builder.unsharedAt;
  }

  public EnumWrapper<UpdateWebLinkByIdRequestBodySharedLinkAccessField> getAccess() {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWebLinkByIdRequestBodySharedLinkField casted = (UpdateWebLinkByIdRequestBodySharedLinkField) o;
    return Objects.equals(access, casted.access) &&
      Objects.equals(password, casted.password) &&
      Objects.equals(vanityName, casted.vanityName) &&
      Objects.equals(unsharedAt, casted.unsharedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      access, password, vanityName, unsharedAt
    );
  }

  @Override
  public String toString() {
    return "UpdateWebLinkByIdRequestBodySharedLinkField{" + "access='" + access + '\'' + ", " + "password='" + password + '\'' + ", " + "vanityName='" + vanityName + '\'' + ", " + "unsharedAt='" + unsharedAt + '\'' + "}";
  }

  public static class UpdateWebLinkByIdRequestBodySharedLinkFieldBuilder {

    protected EnumWrapper<UpdateWebLinkByIdRequestBodySharedLinkAccessField> access;

    protected String password;

    protected String vanityName;

    protected String unsharedAt;

    public UpdateWebLinkByIdRequestBodySharedLinkFieldBuilder access(UpdateWebLinkByIdRequestBodySharedLinkAccessField access) {
      this.access = new EnumWrapper<UpdateWebLinkByIdRequestBodySharedLinkAccessField>(access.getValue(), access);
      return this;
    }

    public UpdateWebLinkByIdRequestBodySharedLinkFieldBuilder password(String password) {
      this.password = password;
      return this;
    }

    public UpdateWebLinkByIdRequestBodySharedLinkFieldBuilder vanityName(String vanityName) {
      this.vanityName = vanityName;
      return this;
    }

    public UpdateWebLinkByIdRequestBodySharedLinkFieldBuilder unsharedAt(String unsharedAt) {
      this.unsharedAt = unsharedAt;
      return this;
    }

    public UpdateWebLinkByIdRequestBodySharedLinkField build() {
      return new UpdateWebLinkByIdRequestBodySharedLinkField(this);
    }

  }

}
