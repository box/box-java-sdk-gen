package com.box.sdkgen.schemas.oauth2error;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OAuth2Error {

  protected String error;

  @JsonProperty("error_description")
  protected String errorDescription;

  public OAuth2Error() {
  }

  protected OAuth2Error(OAuth2ErrorBuilder builder) {
    this.error = builder.error;
    this.errorDescription = builder.errorDescription;
  }

  public String getError() {
    return error;
  }

  public String getErrorDescription() {
    return errorDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2Error casted = (OAuth2Error) o;
    return Objects.equals(error, casted.error) &&
      Objects.equals(errorDescription, casted.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      error, errorDescription
    );
  }

  @Override
  public String toString() {
    return "OAuth2Error{" + "error='" + error + '\'' + ", " + "errorDescription='" + errorDescription + '\'' + "}";
  }

  public static class OAuth2ErrorBuilder {

    protected String error;

    protected String errorDescription;

    public OAuth2ErrorBuilder error(String error) {
      this.error = error;
      return this;
    }

    public OAuth2ErrorBuilder errorDescription(String errorDescription) {
      this.errorDescription = errorDescription;
      return this;
    }

    public OAuth2Error build() {
      return new OAuth2Error(this);
    }

  }

}
