package com.box.sdkgen.managers.termsofservices;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class UpdateTermsOfServiceByIdRequestBody {

  @JsonDeserialize(
      using =
          UpdateTermsOfServiceByIdRequestBodyStatusField
              .UpdateTermsOfServiceByIdRequestBodyStatusFieldDeserializer.class)
  @JsonSerialize(
      using =
          UpdateTermsOfServiceByIdRequestBodyStatusField
              .UpdateTermsOfServiceByIdRequestBodyStatusFieldSerializer.class)
  protected final EnumWrapper<UpdateTermsOfServiceByIdRequestBodyStatusField> status;

  protected final String text;

  public UpdateTermsOfServiceByIdRequestBody(
      @JsonProperty("status") EnumWrapper<UpdateTermsOfServiceByIdRequestBodyStatusField> status,
      @JsonProperty("text") String text) {
    this.status = status;
    this.text = text;
  }

  public UpdateTermsOfServiceByIdRequestBody(
      UpdateTermsOfServiceByIdRequestBodyStatusField status, String text) {
    this.status =
        new EnumWrapper<UpdateTermsOfServiceByIdRequestBodyStatusField>(status.getValue(), status);
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
    return Objects.equals(status, casted.status) && Objects.equals(text, casted.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, text);
  }

  @Override
  public String toString() {
    return "UpdateTermsOfServiceByIdRequestBody{"
        + "status='"
        + status
        + '\''
        + ", "
        + "text='"
        + text
        + '\''
        + "}";
  }
}
