package com.box.sdkgen.managers.taskassignments;

import java.util.Objects;

public class CreateTaskAssignmentRequestBodyAssignToField {

  protected String id;

  protected String login;

  public CreateTaskAssignmentRequestBodyAssignToField() {}

  protected CreateTaskAssignmentRequestBodyAssignToField(
      CreateTaskAssignmentRequestBodyAssignToFieldBuilder builder) {
    this.id = builder.id;
    this.login = builder.login;
  }

  public String getId() {
    return id;
  }

  public String getLogin() {
    return login;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTaskAssignmentRequestBodyAssignToField casted =
        (CreateTaskAssignmentRequestBodyAssignToField) o;
    return Objects.equals(id, casted.id) && Objects.equals(login, casted.login);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, login);
  }

  @Override
  public String toString() {
    return "CreateTaskAssignmentRequestBodyAssignToField{"
        + "id='"
        + id
        + '\''
        + ", "
        + "login='"
        + login
        + '\''
        + "}";
  }

  public static class CreateTaskAssignmentRequestBodyAssignToFieldBuilder {

    protected String id;

    protected String login;

    public CreateTaskAssignmentRequestBodyAssignToFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public CreateTaskAssignmentRequestBodyAssignToFieldBuilder login(String login) {
      this.login = login;
      return this;
    }

    public CreateTaskAssignmentRequestBodyAssignToField build() {
      return new CreateTaskAssignmentRequestBodyAssignToField(this);
    }
  }
}
