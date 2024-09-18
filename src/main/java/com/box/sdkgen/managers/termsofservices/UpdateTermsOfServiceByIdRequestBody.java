package com.box.sdkgen.managers.termsofservices;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.termsofservices.TermsOfServices;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.termsofservice.TermsOfService;
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

public class UpdateTermsOfServiceByIdRequestBody {

  @JsonDeserialize(using = UpdateTermsOfServiceByIdRequestBodyStatusField.UpdateTermsOfServiceByIdRequestBodyStatusFieldDeserializer.class)
  @JsonSerialize(using = UpdateTermsOfServiceByIdRequestBodyStatusField.UpdateTermsOfServiceByIdRequestBodyStatusFieldSerializer.class)
  protected final EnumWrapper<UpdateTermsOfServiceByIdRequestBodyStatusField> status;

  protected final String text;

  public UpdateTermsOfServiceByIdRequestBody(@JsonProperty("status") EnumWrapper<UpdateTermsOfServiceByIdRequestBodyStatusField> status, @JsonProperty("text") String text) {
    this.status = status;
    this.text = text;
  }

  public UpdateTermsOfServiceByIdRequestBody(UpdateTermsOfServiceByIdRequestBodyStatusField status, String text) {
    this.status = new EnumWrapper<UpdateTermsOfServiceByIdRequestBodyStatusField>(status.getValue(), status);
    this.text = text;
  }

  public EnumWrapper<UpdateTermsOfServiceByIdRequestBodyStatusField> getStatus() {
    return status;
  }

  public String getText() {
    return text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTermsOfServiceByIdRequestBody casted = (UpdateTermsOfServiceByIdRequestBody) o;
    return Objects.equals(status, casted.status) &&
      Objects.equals(text, casted.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      status, text
    );
  }

  @Override
  public String toString() {
    return "UpdateTermsOfServiceByIdRequestBody{" + "status='" + status + '\'' + ", " + "text='" + text + '\'' + "}";
  }

}
