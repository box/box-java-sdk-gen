package com.box.sdkgen.schemas.user;

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
import com.box.sdkgen.schemas.userbase.UserBaseTypeField;
import com.box.sdkgen.schemas.userbase.UserBase;
import com.box.sdkgen.schemas.usermini.UserMini;

public class UserNotificationEmailField {

  protected String email;

  @JsonProperty("is_confirmed")
  protected Boolean isConfirmed;

  public UserNotificationEmailField() {
  }

  protected UserNotificationEmailField(UserNotificationEmailFieldBuilder builder) {
    this.email = builder.email;
    this.isConfirmed = builder.isConfirmed;
  }

  public String getEmail() {
    return email;
  }

  public Boolean getIsConfirmed() {
    return isConfirmed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserNotificationEmailField casted = (UserNotificationEmailField) o;
    return Objects.equals(email, casted.email) &&
      Objects.equals(isConfirmed, casted.isConfirmed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      email, isConfirmed
    );
  }

  @Override
  public String toString() {
    return "UserNotificationEmailField{" + "email='" + email + '\'' + ", " + "isConfirmed='" + isConfirmed + '\'' + "}";
  }

  public static class UserNotificationEmailFieldBuilder {

    protected String email;

    protected Boolean isConfirmed;

    public UserNotificationEmailFieldBuilder email(String email) {
      this.email = email;
      return this;
    }

    public UserNotificationEmailFieldBuilder isConfirmed(Boolean isConfirmed) {
      this.isConfirmed = isConfirmed;
      return this;
    }

    public UserNotificationEmailField build() {
      return new UserNotificationEmailField(this);
    }

  }

}
