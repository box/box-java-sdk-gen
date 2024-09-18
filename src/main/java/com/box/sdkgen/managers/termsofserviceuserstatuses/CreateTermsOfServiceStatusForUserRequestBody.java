package com.box.sdkgen.managers.termsofserviceuserstatuses;

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
import com.box.sdkgen.schemas.termsofserviceuserstatuses.TermsOfServiceUserStatuses;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.termsofserviceuserstatus.TermsOfServiceUserStatus;
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

public class CreateTermsOfServiceStatusForUserRequestBody {

  protected final CreateTermsOfServiceStatusForUserRequestBodyTosField tos;

  protected final CreateTermsOfServiceStatusForUserRequestBodyUserField user;

  @JsonProperty("is_accepted")
  protected final boolean isAccepted;

  public CreateTermsOfServiceStatusForUserRequestBody(@JsonProperty("tos") CreateTermsOfServiceStatusForUserRequestBodyTosField tos, @JsonProperty("user") CreateTermsOfServiceStatusForUserRequestBodyUserField user, @JsonProperty("is_accepted") boolean isAccepted) {
    this.tos = tos;
    this.user = user;
    this.isAccepted = isAccepted;
  }

  public CreateTermsOfServiceStatusForUserRequestBodyTosField getTos() {
    return tos;
  }

  public CreateTermsOfServiceStatusForUserRequestBodyUserField getUser() {
    return user;
  }

  public boolean getIsAccepted() {
    return isAccepted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTermsOfServiceStatusForUserRequestBody casted = (CreateTermsOfServiceStatusForUserRequestBody) o;
    return Objects.equals(tos, casted.tos) &&
      Objects.equals(user, casted.user) &&
      Objects.equals(isAccepted, casted.isAccepted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      tos, user, isAccepted
    );
  }

  @Override
  public String toString() {
    return "CreateTermsOfServiceStatusForUserRequestBody{" + "tos='" + tos + '\'' + ", " + "user='" + user + '\'' + ", " + "isAccepted='" + isAccepted + '\'' + "}";
  }

}
