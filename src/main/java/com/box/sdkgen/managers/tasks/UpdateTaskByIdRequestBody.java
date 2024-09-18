package com.box.sdkgen.managers.tasks;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.tasks.Tasks;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.task.Task;
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

public class UpdateTaskByIdRequestBody {

  @JsonDeserialize(using = UpdateTaskByIdRequestBodyActionField.UpdateTaskByIdRequestBodyActionFieldDeserializer.class)
  @JsonSerialize(using = UpdateTaskByIdRequestBodyActionField.UpdateTaskByIdRequestBodyActionFieldSerializer.class)
  protected EnumWrapper<UpdateTaskByIdRequestBodyActionField> action;

  protected String message;

  @JsonProperty("due_at")
  protected String dueAt;

  @JsonDeserialize(using = UpdateTaskByIdRequestBodyCompletionRuleField.UpdateTaskByIdRequestBodyCompletionRuleFieldDeserializer.class)
  @JsonSerialize(using = UpdateTaskByIdRequestBodyCompletionRuleField.UpdateTaskByIdRequestBodyCompletionRuleFieldSerializer.class)
  @JsonProperty("completion_rule")
  protected EnumWrapper<UpdateTaskByIdRequestBodyCompletionRuleField> completionRule;

  public UpdateTaskByIdRequestBody() {
  }

  protected UpdateTaskByIdRequestBody(UpdateTaskByIdRequestBodyBuilder builder) {
    this.action = builder.action;
    this.message = builder.message;
    this.dueAt = builder.dueAt;
    this.completionRule = builder.completionRule;
  }

  public EnumWrapper<UpdateTaskByIdRequestBodyActionField> getAction() {
    return action;
  }

  public String getMessage() {
    return message;
  }

  public String getDueAt() {
    return dueAt;
  }

  public EnumWrapper<UpdateTaskByIdRequestBodyCompletionRuleField> getCompletionRule() {
    return completionRule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTaskByIdRequestBody casted = (UpdateTaskByIdRequestBody) o;
    return Objects.equals(action, casted.action) &&
      Objects.equals(message, casted.message) &&
      Objects.equals(dueAt, casted.dueAt) &&
      Objects.equals(completionRule, casted.completionRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      action, message, dueAt, completionRule
    );
  }

  @Override
  public String toString() {
    return "UpdateTaskByIdRequestBody{" + "action='" + action + '\'' + ", " + "message='" + message + '\'' + ", " + "dueAt='" + dueAt + '\'' + ", " + "completionRule='" + completionRule + '\'' + "}";
  }

  public static class UpdateTaskByIdRequestBodyBuilder {

    protected EnumWrapper<UpdateTaskByIdRequestBodyActionField> action;

    protected String message;

    protected String dueAt;

    protected EnumWrapper<UpdateTaskByIdRequestBodyCompletionRuleField> completionRule;

    public UpdateTaskByIdRequestBodyBuilder action(UpdateTaskByIdRequestBodyActionField action) {
      this.action = new EnumWrapper<UpdateTaskByIdRequestBodyActionField>(action.getValue(), action);
      return this;
    }

    public UpdateTaskByIdRequestBodyBuilder message(String message) {
      this.message = message;
      return this;
    }

    public UpdateTaskByIdRequestBodyBuilder dueAt(String dueAt) {
      this.dueAt = dueAt;
      return this;
    }

    public UpdateTaskByIdRequestBodyBuilder completionRule(UpdateTaskByIdRequestBodyCompletionRuleField completionRule) {
      this.completionRule = new EnumWrapper<UpdateTaskByIdRequestBodyCompletionRuleField>(completionRule.getValue(), completionRule);
      return this;
    }

    public UpdateTaskByIdRequestBody build() {
      return new UpdateTaskByIdRequestBody(this);
    }

  }

}
