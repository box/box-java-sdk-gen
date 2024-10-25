package com.box.sdkgen.managers.termsofserviceuserstatuses;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class CreateTermsOfServiceStatusForUserRequestBodyUserField {

  @JsonDeserialize(
      using =
          CreateTermsOfServiceStatusForUserRequestBodyUserTypeField
              .CreateTermsOfServiceStatusForUserRequestBodyUserTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          CreateTermsOfServiceStatusForUserRequestBodyUserTypeField
              .CreateTermsOfServiceStatusForUserRequestBodyUserTypeFieldSerializer.class)
  protected EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyUserTypeField> type;

  protected final String id;

  public CreateTermsOfServiceStatusForUserRequestBodyUserField(@JsonProperty("id") String id) {
    this.id = id;
    this.type =
        new EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyUserTypeField>(
            CreateTermsOfServiceStatusForUserRequestBodyUserTypeField.USER.getValue(),
            CreateTermsOfServiceStatusForUserRequestBodyUserTypeField.USER);
  }

  protected CreateTermsOfServiceStatusForUserRequestBodyUserField(
      CreateTermsOfServiceStatusForUserRequestBodyUserFieldBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyUserTypeField> getType() {
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
    CreateTermsOfServiceStatusForUserRequestBodyUserField casted =
        (CreateTermsOfServiceStatusForUserRequestBodyUserField) o;
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "CreateTermsOfServiceStatusForUserRequestBodyUserField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + "}";
  }

  public static class CreateTermsOfServiceStatusForUserRequestBodyUserFieldBuilder {

    protected EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyUserTypeField> type;

    protected final String id;

    public CreateTermsOfServiceStatusForUserRequestBodyUserFieldBuilder(String id) {
      this.id = id;
      this.type =
          new EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyUserTypeField>(
              CreateTermsOfServiceStatusForUserRequestBodyUserTypeField.USER.getValue(),
              CreateTermsOfServiceStatusForUserRequestBodyUserTypeField.USER);
    }

    public CreateTermsOfServiceStatusForUserRequestBodyUserFieldBuilder type(
        EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyUserTypeField> type) {
      this.type = type;
      return this;
    }

    public CreateTermsOfServiceStatusForUserRequestBodyUserFieldBuilder type(
        CreateTermsOfServiceStatusForUserRequestBodyUserTypeField type) {
      this.type =
          new EnumWrapper<CreateTermsOfServiceStatusForUserRequestBodyUserTypeField>(
              type.getValue(), type);
      return this;
    }

    public CreateTermsOfServiceStatusForUserRequestBodyUserField build() {
      return new CreateTermsOfServiceStatusForUserRequestBodyUserField(this);
    }
  }
}
