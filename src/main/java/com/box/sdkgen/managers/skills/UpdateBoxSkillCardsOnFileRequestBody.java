package com.box.sdkgen.managers.skills;

import java.util.Map;
import static com.box.sdkgen.internal.utils.UtilsManager.mapOf;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.skillcardsmetadata.SkillCardsMetadata;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.keywordskillcardorstatusskillcardortimelineskillcardortranscriptskillcard.KeywordSkillCardOrStatusSkillCardOrTimelineSkillCardOrTranscriptSkillCard;
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

public class UpdateBoxSkillCardsOnFileRequestBody {

  @JsonDeserialize(using = UpdateBoxSkillCardsOnFileRequestBodyOpField.UpdateBoxSkillCardsOnFileRequestBodyOpFieldDeserializer.class)
  @JsonSerialize(using = UpdateBoxSkillCardsOnFileRequestBodyOpField.UpdateBoxSkillCardsOnFileRequestBodyOpFieldSerializer.class)
  protected EnumWrapper<UpdateBoxSkillCardsOnFileRequestBodyOpField> op;

  protected String path;

  protected KeywordSkillCardOrStatusSkillCardOrTimelineSkillCardOrTranscriptSkillCard value;

  public UpdateBoxSkillCardsOnFileRequestBody() {
  }

  protected UpdateBoxSkillCardsOnFileRequestBody(UpdateBoxSkillCardsOnFileRequestBodyBuilder builder) {
    this.op = builder.op;
    this.path = builder.path;
    this.value = builder.value;
  }

  public EnumWrapper<UpdateBoxSkillCardsOnFileRequestBodyOpField> getOp() {
    return op;
  }

  public String getPath() {
    return path;
  }

  public KeywordSkillCardOrStatusSkillCardOrTimelineSkillCardOrTranscriptSkillCard getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBoxSkillCardsOnFileRequestBody casted = (UpdateBoxSkillCardsOnFileRequestBody) o;
    return Objects.equals(op, casted.op) &&
      Objects.equals(path, casted.path) &&
      Objects.equals(value, casted.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      op, path, value
    );
  }

  @Override
  public String toString() {
    return "UpdateBoxSkillCardsOnFileRequestBody{" + "op='" + op + '\'' + ", " + "path='" + path + '\'' + ", " + "value='" + value + '\'' + "}";
  }

  public static class UpdateBoxSkillCardsOnFileRequestBodyBuilder {

    protected EnumWrapper<UpdateBoxSkillCardsOnFileRequestBodyOpField> op;

    protected String path;

    protected KeywordSkillCardOrStatusSkillCardOrTimelineSkillCardOrTranscriptSkillCard value;

    public UpdateBoxSkillCardsOnFileRequestBodyBuilder op(UpdateBoxSkillCardsOnFileRequestBodyOpField op) {
      this.op = new EnumWrapper<UpdateBoxSkillCardsOnFileRequestBodyOpField>(op.getValue(), op);
      return this;
    }

    public UpdateBoxSkillCardsOnFileRequestBodyBuilder path(String path) {
      this.path = path;
      return this;
    }

    public UpdateBoxSkillCardsOnFileRequestBodyBuilder value(KeywordSkillCardOrStatusSkillCardOrTimelineSkillCardOrTranscriptSkillCard value) {
      this.value = value;
      return this;
    }

    public UpdateBoxSkillCardsOnFileRequestBody build() {
      return new UpdateBoxSkillCardsOnFileRequestBody(this);
    }

  }

}
