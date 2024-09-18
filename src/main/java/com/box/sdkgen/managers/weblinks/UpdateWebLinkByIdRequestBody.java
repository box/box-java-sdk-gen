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

public class UpdateWebLinkByIdRequestBody {

  protected String url;

  protected UpdateWebLinkByIdRequestBodyParentField parent;

  protected String name;

  protected String description;

  @JsonProperty("shared_link")
  protected UpdateWebLinkByIdRequestBodySharedLinkField sharedLink;

  public UpdateWebLinkByIdRequestBody() {
  }

  protected UpdateWebLinkByIdRequestBody(UpdateWebLinkByIdRequestBodyBuilder builder) {
    this.url = builder.url;
    this.parent = builder.parent;
    this.name = builder.name;
    this.description = builder.description;
    this.sharedLink = builder.sharedLink;
  }

  public String getUrl() {
    return url;
  }

  public UpdateWebLinkByIdRequestBodyParentField getParent() {
    return parent;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public UpdateWebLinkByIdRequestBodySharedLinkField getSharedLink() {
    return sharedLink;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWebLinkByIdRequestBody casted = (UpdateWebLinkByIdRequestBody) o;
    return Objects.equals(url, casted.url) &&
      Objects.equals(parent, casted.parent) &&
      Objects.equals(name, casted.name) &&
      Objects.equals(description, casted.description) &&
      Objects.equals(sharedLink, casted.sharedLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      url, parent, name, description, sharedLink
    );
  }

  @Override
  public String toString() {
    return "UpdateWebLinkByIdRequestBody{" + "url='" + url + '\'' + ", " + "parent='" + parent + '\'' + ", " + "name='" + name + '\'' + ", " + "description='" + description + '\'' + ", " + "sharedLink='" + sharedLink + '\'' + "}";
  }

  public static class UpdateWebLinkByIdRequestBodyBuilder {

    protected String url;

    protected UpdateWebLinkByIdRequestBodyParentField parent;

    protected String name;

    protected String description;

    protected UpdateWebLinkByIdRequestBodySharedLinkField sharedLink;

    public UpdateWebLinkByIdRequestBodyBuilder url(String url) {
      this.url = url;
      return this;
    }

    public UpdateWebLinkByIdRequestBodyBuilder parent(UpdateWebLinkByIdRequestBodyParentField parent) {
      this.parent = parent;
      return this;
    }

    public UpdateWebLinkByIdRequestBodyBuilder name(String name) {
      this.name = name;
      return this;
    }

    public UpdateWebLinkByIdRequestBodyBuilder description(String description) {
      this.description = description;
      return this;
    }

    public UpdateWebLinkByIdRequestBodyBuilder sharedLink(UpdateWebLinkByIdRequestBodySharedLinkField sharedLink) {
      this.sharedLink = sharedLink;
      return this;
    }

    public UpdateWebLinkByIdRequestBody build() {
      return new UpdateWebLinkByIdRequestBody(this);
    }

  }

}
