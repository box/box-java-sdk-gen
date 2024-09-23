package com.box.sdkgen.managers.emailaliases;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateUserEmailAliasRequestBody {

  protected final String email;

  public CreateUserEmailAliasRequestBody(@JsonProperty("email") String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserEmailAliasRequestBody casted = (CreateUserEmailAliasRequestBody) o;
    return Objects.equals(email, casted.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email);
  }

  @Override
  public String toString() {
    return "CreateUserEmailAliasRequestBody{" + "email='" + email + '\'' + "}";
  }
}
