package com.box.sdkgen.managers.files;

import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.filefull.FileFull;
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

public class UpdateFileByIdRequestBodyLockField {

  @JsonDeserialize(using = UpdateFileByIdRequestBodyLockAccessField.UpdateFileByIdRequestBodyLockAccessFieldDeserializer.class)
  @JsonSerialize(using = UpdateFileByIdRequestBodyLockAccessField.UpdateFileByIdRequestBodyLockAccessFieldSerializer.class)
  protected EnumWrapper<UpdateFileByIdRequestBodyLockAccessField> access;

  @JsonProperty("expires_at")
  protected String expiresAt;

  @JsonProperty("is_download_prevented")
  protected Boolean isDownloadPrevented;

  public UpdateFileByIdRequestBodyLockField() {
  }

  protected UpdateFileByIdRequestBodyLockField(UpdateFileByIdRequestBodyLockFieldBuilder builder) {
    this.access = builder.access;
    this.expiresAt = builder.expiresAt;
    this.isDownloadPrevented = builder.isDownloadPrevented;
  }

  public EnumWrapper<UpdateFileByIdRequestBodyLockAccessField> getAccess() {
    return access;
  }

  public String getExpiresAt() {
    return expiresAt;
  }

  public Boolean getIsDownloadPrevented() {
    return isDownloadPrevented;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFileByIdRequestBodyLockField casted = (UpdateFileByIdRequestBodyLockField) o;
    return Objects.equals(access, casted.access) &&
      Objects.equals(expiresAt, casted.expiresAt) &&
      Objects.equals(isDownloadPrevented, casted.isDownloadPrevented);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      access, expiresAt, isDownloadPrevented
    );
  }

  @Override
  public String toString() {
    return "UpdateFileByIdRequestBodyLockField{" + "access='" + access + '\'' + ", " + "expiresAt='" + expiresAt + '\'' + ", " + "isDownloadPrevented='" + isDownloadPrevented + '\'' + "}";
  }

  public static class UpdateFileByIdRequestBodyLockFieldBuilder {

    protected EnumWrapper<UpdateFileByIdRequestBodyLockAccessField> access;

    protected String expiresAt;

    protected Boolean isDownloadPrevented;

    public UpdateFileByIdRequestBodyLockFieldBuilder access(UpdateFileByIdRequestBodyLockAccessField access) {
      this.access = new EnumWrapper<UpdateFileByIdRequestBodyLockAccessField>(access.getValue(), access);
      return this;
    }

    public UpdateFileByIdRequestBodyLockFieldBuilder expiresAt(String expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    public UpdateFileByIdRequestBodyLockFieldBuilder isDownloadPrevented(Boolean isDownloadPrevented) {
      this.isDownloadPrevented = isDownloadPrevented;
      return this;
    }

    public UpdateFileByIdRequestBodyLockField build() {
      return new UpdateFileByIdRequestBodyLockField(this);
    }

  }

}
