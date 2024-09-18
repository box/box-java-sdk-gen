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

public class CreateTaskAssignmentRequestBody {

  protected final CreateTaskAssignmentRequestBodyTaskField task;

  @JsonProperty("assign_to")
  protected final CreateTaskAssignmentRequestBodyAssignToField assignTo;

  public CreateTaskAssignmentRequestBody(@JsonProperty("task") CreateTaskAssignmentRequestBodyTaskField task, @JsonProperty("assign_to") CreateTaskAssignmentRequestBodyAssignToField assignTo) {
    this.task = task;
    this.assignTo = assignTo;
  }

  public CreateTaskAssignmentRequestBodyTaskField getTask() {
    return task;
  }

  public CreateTaskAssignmentRequestBodyAssignToField getAssignTo() {
    return assignTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTaskAssignmentRequestBody casted = (CreateTaskAssignmentRequestBody) o;
    return Objects.equals(task, casted.task) &&
      Objects.equals(assignTo, casted.assignTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      task, assignTo
    );
  }

  @Override
  public String toString() {
    return "CreateTaskAssignmentRequestBody{" + "task='" + task + '\'' + ", " + "assignTo='" + assignTo + '\'' + "}";
  }

}
