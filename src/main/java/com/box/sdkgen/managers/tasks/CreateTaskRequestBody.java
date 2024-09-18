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

public class CreateTaskRequestBody {

  protected final CreateTaskRequestBodyItemField item;

  @JsonDeserialize(using = CreateTaskRequestBodyActionField.CreateTaskRequestBodyActionFieldDeserializer.class)
  @JsonSerialize(using = CreateTaskRequestBodyActionField.CreateTaskRequestBodyActionFieldSerializer.class)
  protected EnumWrapper<CreateTaskRequestBodyActionField> action;

  protected String message;

  @JsonProperty("due_at")
  protected String dueAt;

  @JsonDeserialize(using = CreateTaskRequestBodyCompletionRuleField.CreateTaskRequestBodyCompletionRuleFieldDeserializer.class)
  @JsonSerialize(using = CreateTaskRequestBodyCompletionRuleField.CreateTaskRequestBodyCompletionRuleFieldSerializer.class)
  @JsonProperty("completion_rule")
  protected EnumWrapper<CreateTaskRequestBodyCompletionRuleField> completionRule;

  public CreateTaskRequestBody(@JsonProperty("item") CreateTaskRequestBodyItemField item) {
    this.item = item;
  }

  protected CreateTaskRequestBody(CreateTaskRequestBodyBuilder builder) {
    this.item = builder.item;
    this.action = builder.action;
    this.message = builder.message;
    this.dueAt = builder.dueAt;
    this.completionRule = builder.completionRule;
  }

  public CreateTaskRequestBodyItemField getItem() {
    return item;
  }

  public EnumWrapper<CreateTaskRequestBodyActionField> getAction() {
    return action;
  }

  public String getMessage() {
    return message;
  }

  public String getDueAt() {
    return dueAt;
  }

  public EnumWrapper<CreateTaskRequestBodyCompletionRuleField> getCompletionRule() {
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
    CreateTaskRequestBody casted = (CreateTaskRequestBody) o;
    return Objects.equals(item, casted.item) &&
      Objects.equals(action, casted.action) &&
      Objects.equals(message, casted.message) &&
      Objects.equals(dueAt, casted.dueAt) &&
      Objects.equals(completionRule, casted.completionRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      item, action, message, dueAt, completionRule
    );
  }

  @Override
  public String toString() {
    return "CreateTaskRequestBody{" + "item='" + item + '\'' + ", " + "action='" + action + '\'' + ", " + "message='" + message + '\'' + ", " + "dueAt='" + dueAt + '\'' + ", " + "completionRule='" + completionRule + '\'' + "}";
  }

  public static class CreateTaskRequestBodyBuilder {

    protected final CreateTaskRequestBodyItemField item;

    protected EnumWrapper<CreateTaskRequestBodyActionField> action;

    protected String message;

    protected String dueAt;

    protected EnumWrapper<CreateTaskRequestBodyCompletionRuleField> completionRule;

    public CreateTaskRequestBodyBuilder(CreateTaskRequestBodyItemField item) {
      this.item = item;
    }

    public CreateTaskRequestBodyBuilder action(CreateTaskRequestBodyActionField action) {
      this.action = new EnumWrapper<CreateTaskRequestBodyActionField>(action.getValue(), action);
      return this;
    }

    public CreateTaskRequestBodyBuilder message(String message) {
      this.message = message;
      return this;
    }

    public CreateTaskRequestBodyBuilder dueAt(String dueAt) {
      this.dueAt = dueAt;
      return this;
    }

    public CreateTaskRequestBodyBuilder completionRule(CreateTaskRequestBodyCompletionRuleField completionRule) {
      this.completionRule = new EnumWrapper<CreateTaskRequestBodyCompletionRuleField>(completionRule.getValue(), completionRule);
      return this;
    }

    public CreateTaskRequestBody build() {
      return new CreateTaskRequestBody(this);
    }

  }

}
