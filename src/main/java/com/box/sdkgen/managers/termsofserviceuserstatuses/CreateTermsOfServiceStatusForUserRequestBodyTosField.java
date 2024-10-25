package com.box.sdkgen.managers.termsofserviceuserstatuses;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class CreateTermsOfServiceStatusForUserRequestBodyTosField {

  @JsonDeserialize(
      using =
          CreateTermsOfServiceStatusForUserRequestBodyTosTypeField
              .CreateTermsOfServiceStatusForUserRequestBodyTosTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          CreateTermsOfServiceStatusForUserRequestBodyTosTypeField
              .CreateTermsOfServiceStatusForUserRequestBodyTosTypeFieldSerializer.class)
  protected EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyTosTypeField> type;

  protected final String id;

  public CreateTermsOfServiceStatusForUserRequestBodyTosField(@JsonProperty("id") String id) {
    this.id = id;
    this.type =
        new EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyTosTypeField>(
            CreateTermsOfServiceStatusForUserRequestBodyTosTypeField.TERMS_OF_SERVICE.getValue(),
            CreateTermsOfServiceStatusForUserRequestBodyTosTypeField.TERMS_OF_SERVICE);
  }

  protected CreateTermsOfServiceStatusForUserRequestBodyTosField(
      CreateTermsOfServiceStatusForUserRequestBodyTosFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyTosTypeField> getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTermsOfServiceStatusForUserRequestBodyTosField casted =
        (CreateTermsOfServiceStatusForUserRequestBodyTosField) o;
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "CreateTermsOfServiceStatusForUserRequestBodyTosField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + "}";
  }

  public static class CreateTermsOfServiceStatusForUserRequestBodyTosFieldBuilder {

    protected EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyTosTypeField> type;

    protected final String id;

    public CreateTermsOfServiceStatusForUserRequestBodyTosFieldBuilder(String id) {
      this.id = id;
      this.type =
          new EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyTosTypeField>(
              CreateTermsOfServiceStatusForUserRequestBodyTosTypeField.TERMS_OF_SERVICE.getValue(),
              CreateTermsOfServiceStatusForUserRequestBodyTosTypeField.TERMS_OF_SERVICE);
    }

    public CreateTermsOfServiceStatusForUserRequestBodyTosFieldBuilder type(
        EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyTosTypeField> type) {
      this.type = type;
      return this;
    }

    public CreateTermsOfServiceStatusForUserRequestBodyTosFieldBuilder type(
        CreateTermsOfServiceStatusForUserRequestBodyTosTypeField type) {
      this.type =
          new EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyTosTypeField>(
              type.getValue(), type);
      return this;
    }

    public CreateTermsOfServiceStatusForUserRequestBodyTosField build() {
      return new CreateTermsOfServiceStatusForUserRequestBodyTosField(this);
    }
  }
}
