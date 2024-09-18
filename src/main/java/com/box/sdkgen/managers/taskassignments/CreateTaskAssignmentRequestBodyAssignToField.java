package com.box.sdkgen.managers.taskassignments;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
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
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.taskassignments.TaskAssignments;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.taskassignment.TaskAssignment;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.fasterxml.jackson.databind.JsonNode;

public class CreateTaskAssignmentRequestBodyAssignToField {

  protected String id;

  protected String login;

  public CreateTaskAssignmentRequestBodyAssignToField() {
  }

  protected CreateTaskAssignmentRequestBodyAssignToField(CreateTaskAssignmentRequestBodyAssignToFieldBuilder builder) {
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
    CreateTaskAssignmentRequestBodyAssignToField casted = (CreateTaskAssignmentRequestBodyAssignToField) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(login, casted.login);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, login
    );
  }

  @Override
  public String toString() {
    return "CreateTaskAssignmentRequestBodyAssignToField{" + "id='" + id + '\'' + ", " + "login='" + login + '\'' + "}";
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
