package com.box.sdkgen.schemas.clienterror;

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

public class ClientErrorContextInfoField {

  protected String message;

  public ClientErrorContextInfoField() {
  }

  protected ClientErrorContextInfoField(ClientErrorContextInfoFieldBuilder builder) {
    this.message = builder.message;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientErrorContextInfoField casted = (ClientErrorContextInfoField) o;
    return Objects.equals(message, casted.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      message
    );
  }

  @Override
  public String toString() {
    return "ClientErrorContextInfoField{" + "message='" + message + '\'' + "}";
  }

  public static class ClientErrorContextInfoFieldBuilder {

    protected String message;

    public ClientErrorContextInfoFieldBuilder message(String message) {
      this.message = message;
      return this;
    }

    public ClientErrorContextInfoField build() {
      return new ClientErrorContextInfoField(this);
    }

  }

}
