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

public class CreateWebLinkRequestBody {

  protected final String url;

  protected final CreateWebLinkRequestBodyParentField parent;

  protected String name;

  protected String description;

  public CreateWebLinkRequestBody(@JsonProperty("url") String url, @JsonProperty("parent") CreateWebLinkRequestBodyParentField parent) {
    this.url = url;
    this.parent = parent;
  }

  protected CreateWebLinkRequestBody(CreateWebLinkRequestBodyBuilder builder) {
    this.url = builder.url;
    this.parent = builder.parent;
    this.name = builder.name;
    this.description = builder.description;
  }

  public String getUrl() {
    return url;
  }

  public CreateWebLinkRequestBodyParentField getParent() {
    return parent;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebLinkRequestBody casted = (CreateWebLinkRequestBody) o;
    return Objects.equals(url, casted.url) &&
      Objects.equals(parent, casted.parent) &&
      Objects.equals(name, casted.name) &&
      Objects.equals(description, casted.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      url, parent, name, description
    );
  }

  @Override
  public String toString() {
    return "CreateWebLinkRequestBody{" + "url='" + url + '\'' + ", " + "parent='" + parent + '\'' + ", " + "name='" + name + '\'' + ", " + "description='" + description + '\'' + "}";
  }

  public static class CreateWebLinkRequestBodyBuilder {

    protected final String url;

    protected final CreateWebLinkRequestBodyParentField parent;

    protected String name;

    protected String description;

    public CreateWebLinkRequestBodyBuilder(String url, CreateWebLinkRequestBodyParentField parent) {
      this.url = url;
      this.parent = parent;
    }

    public CreateWebLinkRequestBodyBuilder name(String name) {
      this.name = name;
      return this;
    }

    public CreateWebLinkRequestBodyBuilder description(String description) {
      this.description = description;
      return this;
    }

    public CreateWebLinkRequestBody build() {
      return new CreateWebLinkRequestBody(this);
    }

  }

}
