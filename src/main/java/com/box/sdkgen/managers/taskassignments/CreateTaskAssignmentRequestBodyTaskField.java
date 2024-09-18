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

public class CreateTaskAssignmentRequestBodyTaskField {

  protected final String id;

  @JsonDeserialize(using = CreateTaskAssignmentRequestBodyTaskTypeField.CreateTaskAssignmentRequestBodyTaskTypeFieldDeserializer.class)
  @JsonSerialize(using = CreateTaskAssignmentRequestBodyTaskTypeField.CreateTaskAssignmentRequestBodyTaskTypeFieldSerializer.class)
  protected EnumWrapper<CreateTaskAssignmentRequestBodyTaskTypeField> type;

  public CreateTaskAssignmentRequestBodyTaskField(@JsonProperty("id") String id) {
    this.id = id;
    this.type = new EnumWrapper<CreateTaskAssignmentRequestBodyTaskTypeField>(CreateTaskAssignmentRequestBodyTaskTypeField.TASK.getValue(), CreateTaskAssignmentRequestBodyTaskTypeField.TASK);
  }

  protected CreateTaskAssignmentRequestBodyTaskField(CreateTaskAssignmentRequestBodyTaskFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<CreateTaskAssignmentRequestBodyTaskTypeField> getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTaskAssignmentRequestBodyTaskField casted = (CreateTaskAssignmentRequestBodyTaskField) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type
    );
  }

  @Override
  public String toString() {
    return "CreateTaskAssignmentRequestBodyTaskField{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class CreateTaskAssignmentRequestBodyTaskFieldBuilder {

    protected final String id;

    protected EnumWrapper<CreateTaskAssignmentRequestBodyTaskTypeField> type;

    public CreateTaskAssignmentRequestBodyTaskFieldBuilder(String id) {
      this.id = id;
      this.type = new EnumWrapper<CreateTaskAssignmentRequestBodyTaskTypeField>(CreateTaskAssignmentRequestBodyTaskTypeField.TASK.getValue(), CreateTaskAssignmentRequestBodyTaskTypeField.TASK);
    }

    public CreateTaskAssignmentRequestBodyTaskFieldBuilder type(CreateTaskAssignmentRequestBodyTaskTypeField type) {
      this.type = new EnumWrapper<CreateTaskAssignmentRequestBodyTaskTypeField>(type.getValue(), type);
      return this;
    }

    public CreateTaskAssignmentRequestBodyTaskField build() {
      return new CreateTaskAssignmentRequestBodyTaskField(this);
    }

  }

}
