package com.box.sdkgen.schemas.sessionterminationmessage;

import java.util.Objects;

public class SessionTerminationMessage {

  protected String message;

  public SessionTerminationMessage() {
  }

  protected SessionTerminationMessage(SessionTerminationMessageBuilder builder) {
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
    SessionTerminationMessage casted = (SessionTerminationMessage) o;
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
    return "SessionTerminationMessage{" + "message='" + message + '\'' + "}";
  }

  public static class SessionTerminationMessageBuilder {

    protected String message;

    public SessionTerminationMessageBuilder message(String message) {
      this.message = message;
      return this;
    }

    public SessionTerminationMessage build() {
      return new SessionTerminationMessage(this);
    }

  }

}
