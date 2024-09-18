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

public class CreateTermsOfServiceRequestBody {

  @JsonDeserialize(using = CreateTermsOfServiceRequestBodyStatusField.CreateTermsOfServiceRequestBodyStatusFieldDeserializer.class)
  @JsonSerialize(using = CreateTermsOfServiceRequestBodyStatusField.CreateTermsOfServiceRequestBodyStatusFieldSerializer.class)
  protected final EnumWrapper<CreateTermsOfServiceRequestBodyStatusField> status;

  @JsonDeserialize(using = CreateTermsOfServiceRequestBodyTosTypeField.CreateTermsOfServiceRequestBodyTosTypeFieldDeserializer.class)
  @JsonSerialize(using = CreateTermsOfServiceRequestBodyTosTypeField.CreateTermsOfServiceRequestBodyTosTypeFieldSerializer.class)
  @JsonProperty("tos_type")
  protected EnumWrapper<CreateTermsOfServiceRequestBodyTosTypeField> tosType;

  protected final String text;

  public CreateTermsOfServiceRequestBody(@JsonProperty("status") EnumWrapper<CreateTermsOfServiceRequestBodyStatusField> status, @JsonProperty("text") String text) {
    this.status = status;
    this.text = text;
  }

  public CreateTermsOfServiceRequestBody(CreateTermsOfServiceRequestBodyStatusField status, String text) {
    this.status = new EnumWrapper<CreateTermsOfServiceRequestBodyStatusField>(status.getValue(), status);
    this.text = text;
  }

  protected CreateTermsOfServiceRequestBody(CreateTermsOfServiceRequestBodyBuilder builder) {
    this.status = builder.status;
    this.tosType = builder.tosType;
    this.text = builder.text;
  }

  public EnumWrapper<CreateTermsOfServiceRequestBodyStatusField> getStatus() {
    return status;
  }

  public EnumWrapper<CreateTermsOfServiceRequestBodyTosTypeField> getTosType() {
    return tosType;
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
    CreateTermsOfServiceRequestBody casted = (CreateTermsOfServiceRequestBody) o;
    return Objects.equals(status, casted.status) &&
      Objects.equals(tosType, casted.tosType) &&
      Objects.equals(text, casted.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      status, tosType, text
    );
  }

  @Override
  public String toString() {
    return "CreateTermsOfServiceRequestBody{" + "status='" + status + '\'' + ", " + "tosType='" + tosType + '\'' + ", " + "text='" + text + '\'' + "}";
  }

  public static class CreateTermsOfServiceRequestBodyBuilder {

    protected final EnumWrapper<CreateTermsOfServiceRequestBodyStatusField> status;

    protected EnumWrapper<CreateTermsOfServiceRequestBodyTosTypeField> tosType;

    protected final String text;

    public CreateTermsOfServiceRequestBodyBuilder(CreateTermsOfServiceRequestBodyStatusField status, String text) {
      this.status = new EnumWrapper<CreateTermsOfServiceRequestBodyStatusField>(status.getValue(), status);
      this.text = text;
    }

    public CreateTermsOfServiceRequestBodyBuilder tosType(CreateTermsOfServiceRequestBodyTosTypeField tosType) {
      this.tosType = new EnumWrapper<CreateTermsOfServiceRequestBodyTosTypeField>(tosType.getValue(), tosType);
      return this;
    }

    public CreateTermsOfServiceRequestBody build() {
      return new CreateTermsOfServiceRequestBody(this);
    }

  }

}
