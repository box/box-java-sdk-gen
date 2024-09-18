package com.box.sdkgen.managers.uploads;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import java.util.Arrays;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.files.Files;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.uploadurl.UploadUrl;
import com.box.sdkgen.schemas.conflicterror.ConflictError;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.box.sdkgen.networking.fetch.MultipartItem;
import com.fasterxml.jackson.databind.JsonNode;

public class PreflightFileUploadCheckRequestBody {

  protected String name;

  protected Integer size;

  protected PreflightFileUploadCheckRequestBodyParentField parent;

  public PreflightFileUploadCheckRequestBody() {
  }

  protected PreflightFileUploadCheckRequestBody(PreflightFileUploadCheckRequestBodyBuilder builder) {
    this.name = builder.name;
    this.size = builder.size;
    this.parent = builder.parent;
  }

  public String getName() {
    return name;
  }

  public Integer getSize() {
    return size;
  }

  public PreflightFileUploadCheckRequestBodyParentField getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreflightFileUploadCheckRequestBody casted = (PreflightFileUploadCheckRequestBody) o;
    return Objects.equals(name, casted.name) &&
      Objects.equals(size, casted.size) &&
      Objects.equals(parent, casted.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      name, size, parent
    );
  }

  @Override
  public String toString() {
    return "PreflightFileUploadCheckRequestBody{" + "name='" + name + '\'' + ", " + "size='" + size + '\'' + ", " + "parent='" + parent + '\'' + "}";
  }

  public static class PreflightFileUploadCheckRequestBodyBuilder {

    protected String name;

    protected Integer size;

    protected PreflightFileUploadCheckRequestBodyParentField parent;

    public PreflightFileUploadCheckRequestBodyBuilder name(String name) {
      this.name = name;
      return this;
    }

    public PreflightFileUploadCheckRequestBodyBuilder size(Integer size) {
      this.size = size;
      return this;
    }

    public PreflightFileUploadCheckRequestBodyBuilder parent(PreflightFileUploadCheckRequestBodyParentField parent) {
      this.parent = parent;
      return this;
    }

    public PreflightFileUploadCheckRequestBody build() {
      return new PreflightFileUploadCheckRequestBody(this);
    }

  }

}
