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

public class UpdateSharedLinkOnWebLinkRequestBody {

  @JsonProperty("shared_link")
  protected UpdateSharedLinkOnWebLinkRequestBodySharedLinkField sharedLink;

  public UpdateSharedLinkOnWebLinkRequestBody() {
  }

  protected UpdateSharedLinkOnWebLinkRequestBody(UpdateSharedLinkOnWebLinkRequestBodyBuilder builder) {
    this.sharedLink = builder.sharedLink;
  }

  public UpdateSharedLinkOnWebLinkRequestBodySharedLinkField getSharedLink() {
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
    UpdateSharedLinkOnWebLinkRequestBody casted = (UpdateSharedLinkOnWebLinkRequestBody) o;
    return Objects.equals(sharedLink, casted.sharedLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      sharedLink
    );
  }

  @Override
  public String toString() {
    return "UpdateSharedLinkOnWebLinkRequestBody{" + "sharedLink='" + sharedLink + '\'' + "}";
  }

  public static class UpdateSharedLinkOnWebLinkRequestBodyBuilder {

    protected UpdateSharedLinkOnWebLinkRequestBodySharedLinkField sharedLink;

    public UpdateSharedLinkOnWebLinkRequestBodyBuilder sharedLink(UpdateSharedLinkOnWebLinkRequestBodySharedLinkField sharedLink) {
      this.sharedLink = sharedLink;
      return this;
    }

    public UpdateSharedLinkOnWebLinkRequestBody build() {
      return new UpdateSharedLinkOnWebLinkRequestBody(this);
    }

  }

}
