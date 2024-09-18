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

public class UpdateTaskAssignmentByIdRequestBody {

  protected String message;

  @JsonDeserialize(using = UpdateTaskAssignmentByIdRequestBodyResolutionStateField.UpdateTaskAssignmentByIdRequestBodyResolutionStateFieldDeserializer.class)
  @JsonSerialize(using = UpdateTaskAssignmentByIdRequestBodyResolutionStateField.UpdateTaskAssignmentByIdRequestBodyResolutionStateFieldSerializer.class)
  @JsonProperty("resolution_state")
  protected EnumWrapper<UpdateTaskAssignmentByIdRequestBodyResolutionStateField> resolutionState;

  public UpdateTaskAssignmentByIdRequestBody() {
  }

  protected UpdateTaskAssignmentByIdRequestBody(UpdateTaskAssignmentByIdRequestBodyBuilder builder) {
    this.message = builder.message;
    this.resolutionState = builder.resolutionState;
  }

  public String getMessage() {
    return message;
  }

  public EnumWrapper<UpdateTaskAssignmentByIdRequestBodyResolutionStateField> getResolutionState() {
    return resolutionState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTaskAssignmentByIdRequestBody casted = (UpdateTaskAssignmentByIdRequestBody) o;
    return Objects.equals(message, casted.message) &&
      Objects.equals(resolutionState, casted.resolutionState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      message, resolutionState
    );
  }

  @Override
  public String toString() {
    return "UpdateTaskAssignmentByIdRequestBody{" + "message='" + message + '\'' + ", " + "resolutionState='" + resolutionState + '\'' + "}";
  }

  public static class UpdateTaskAssignmentByIdRequestBodyBuilder {

    protected String message;

    protected EnumWrapper<UpdateTaskAssignmentByIdRequestBodyResolutionStateField> resolutionState;

    public UpdateTaskAssignmentByIdRequestBodyBuilder message(String message) {
      this.message = message;
      return this;
    }

    public UpdateTaskAssignmentByIdRequestBodyBuilder resolutionState(UpdateTaskAssignmentByIdRequestBodyResolutionStateField resolutionState) {
      this.resolutionState = new EnumWrapper<UpdateTaskAssignmentByIdRequestBodyResolutionStateField>(resolutionState.getValue(), resolutionState);
      return this;
    }

    public UpdateTaskAssignmentByIdRequestBody build() {
      return new UpdateTaskAssignmentByIdRequestBody(this);
    }

  }

}
