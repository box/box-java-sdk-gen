package com.box.sdkgen.managers.workflows;

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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.workflows.Workflows;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.outcome.Outcome;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import static com.box.sdkgen.serialization.json.JsonManager.sdToJson;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;

public class StartWorkflowRequestBody {

  @JsonDeserialize(using = StartWorkflowRequestBodyTypeField.StartWorkflowRequestBodyTypeFieldDeserializer.class)
  @JsonSerialize(using = StartWorkflowRequestBodyTypeField.StartWorkflowRequestBodyTypeFieldSerializer.class)
  protected EnumWrapper<StartWorkflowRequestBodyTypeField> type;

  protected final StartWorkflowRequestBodyFlowField flow;

  protected final List<StartWorkflowRequestBodyFilesField> files;

  protected final StartWorkflowRequestBodyFolderField folder;

  protected List<Outcome> outcomes;

  public StartWorkflowRequestBody(@JsonProperty("flow") StartWorkflowRequestBodyFlowField flow, @JsonProperty("files") List<StartWorkflowRequestBodyFilesField> files, @JsonProperty("folder") StartWorkflowRequestBodyFolderField folder) {
    this.flow = flow;
    this.files = files;
    this.folder = folder;
  }

  protected StartWorkflowRequestBody(StartWorkflowRequestBodyBuilder builder) {
    this.type = builder.type;
    this.flow = builder.flow;
    this.files = builder.files;
    this.folder = builder.folder;
    this.outcomes = builder.outcomes;
  }

  public EnumWrapper<StartWorkflowRequestBodyTypeField> getType() {
    return type;
  }

  public StartWorkflowRequestBodyFlowField getFlow() {
    return flow;
  }

  public List<StartWorkflowRequestBodyFilesField> getFiles() {
    return files;
  }

  public StartWorkflowRequestBodyFolderField getFolder() {
    return folder;
  }

  public List<Outcome> getOutcomes() {
    return outcomes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartWorkflowRequestBody casted = (StartWorkflowRequestBody) o;
    return Objects.equals(type, casted.type) &&
      Objects.equals(flow, casted.flow) &&
      Objects.equals(files, casted.files) &&
      Objects.equals(folder, casted.folder) &&
      Objects.equals(outcomes, casted.outcomes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, flow, files, folder, outcomes
    );
  }

  @Override
  public String toString() {
    return "StartWorkflowRequestBody{" + "type='" + type + '\'' + ", " + "flow='" + flow + '\'' + ", " + "files='" + files + '\'' + ", " + "folder='" + folder + '\'' + ", " + "outcomes='" + outcomes + '\'' + "}";
  }

  public static class StartWorkflowRequestBodyBuilder {

    protected EnumWrapper<StartWorkflowRequestBodyTypeField> type;

    protected final StartWorkflowRequestBodyFlowField flow;

    protected final List<StartWorkflowRequestBodyFilesField> files;

    protected final StartWorkflowRequestBodyFolderField folder;

    protected List<Outcome> outcomes;

    public StartWorkflowRequestBodyBuilder(StartWorkflowRequestBodyFlowField flow, List<StartWorkflowRequestBodyFilesField> files, StartWorkflowRequestBodyFolderField folder) {
      this.flow = flow;
      this.files = files;
      this.folder = folder;
    }

    public StartWorkflowRequestBodyBuilder type(StartWorkflowRequestBodyTypeField type) {
      this.type = new EnumWrapper<StartWorkflowRequestBodyTypeField>(type.getValue(), type);
      return this;
    }

    public StartWorkflowRequestBodyBuilder outcomes(List<Outcome> outcomes) {
      this.outcomes = outcomes;
      return this;
    }

    public StartWorkflowRequestBody build() {
      return new StartWorkflowRequestBody(this);
    }

  }

}
