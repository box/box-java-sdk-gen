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

public class UpdateAllSkillCardsOnFileRequestBody {

  @JsonDeserialize(using = UpdateAllSkillCardsOnFileRequestBodyStatusField.UpdateAllSkillCardsOnFileRequestBodyStatusFieldDeserializer.class)
  @JsonSerialize(using = UpdateAllSkillCardsOnFileRequestBodyStatusField.UpdateAllSkillCardsOnFileRequestBodyStatusFieldSerializer.class)
  protected final EnumWrapper<UpdateAllSkillCardsOnFileRequestBodyStatusField> status;

  protected final UpdateAllSkillCardsOnFileRequestBodyMetadataField metadata;

  protected final UpdateAllSkillCardsOnFileRequestBodyFileField file;

  @JsonProperty("file_version")
  protected UpdateAllSkillCardsOnFileRequestBodyFileVersionField fileVersion;

  protected UpdateAllSkillCardsOnFileRequestBodyUsageField usage;

  public UpdateAllSkillCardsOnFileRequestBody(@JsonProperty("status") EnumWrapper<UpdateAllSkillCardsOnFileRequestBodyStatusField> status, @JsonProperty("metadata") UpdateAllSkillCardsOnFileRequestBodyMetadataField metadata, @JsonProperty("file") UpdateAllSkillCardsOnFileRequestBodyFileField file) {
    this.status = status;
    this.metadata = metadata;
    this.file = file;
  }

  public UpdateAllSkillCardsOnFileRequestBody(UpdateAllSkillCardsOnFileRequestBodyStatusField status, UpdateAllSkillCardsOnFileRequestBodyMetadataField metadata, UpdateAllSkillCardsOnFileRequestBodyFileField file) {
    this.status = new EnumWrapper<UpdateAllSkillCardsOnFileRequestBodyStatusField>(status.getValue(), status);
    this.metadata = metadata;
    this.file = file;
  }

  protected UpdateAllSkillCardsOnFileRequestBody(UpdateAllSkillCardsOnFileRequestBodyBuilder builder) {
    this.status = builder.status;
    this.metadata = builder.metadata;
    this.file = builder.file;
    this.fileVersion = builder.fileVersion;
    this.usage = builder.usage;
  }

  public EnumWrapper<UpdateAllSkillCardsOnFileRequestBodyStatusField> getStatus() {
    return status;
  }

  public UpdateAllSkillCardsOnFileRequestBodyMetadataField getMetadata() {
    return metadata;
  }

  public UpdateAllSkillCardsOnFileRequestBodyFileField getFile() {
    return file;
  }

  public UpdateAllSkillCardsOnFileRequestBodyFileVersionField getFileVersion() {
    return fileVersion;
  }

  public UpdateAllSkillCardsOnFileRequestBodyUsageField getUsage() {
    return usage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAllSkillCardsOnFileRequestBody casted = (UpdateAllSkillCardsOnFileRequestBody) o;
    return Objects.equals(status, casted.status) &&
      Objects.equals(metadata, casted.metadata) &&
      Objects.equals(file, casted.file) &&
      Objects.equals(fileVersion, casted.fileVersion) &&
      Objects.equals(usage, casted.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      status, metadata, file, fileVersion, usage
    );
  }

  @Override
  public String toString() {
    return "UpdateAllSkillCardsOnFileRequestBody{" + "status='" + status + '\'' + ", " + "metadata='" + metadata + '\'' + ", " + "file='" + file + '\'' + ", " + "fileVersion='" + fileVersion + '\'' + ", " + "usage='" + usage + '\'' + "}";
  }

  public static class UpdateAllSkillCardsOnFileRequestBodyBuilder {

    protected final EnumWrapper<UpdateAllSkillCardsOnFileRequestBodyStatusField> status;

    protected final UpdateAllSkillCardsOnFileRequestBodyMetadataField metadata;

    protected final UpdateAllSkillCardsOnFileRequestBodyFileField file;

    protected UpdateAllSkillCardsOnFileRequestBodyFileVersionField fileVersion;

    protected UpdateAllSkillCardsOnFileRequestBodyUsageField usage;

    public UpdateAllSkillCardsOnFileRequestBodyBuilder(UpdateAllSkillCardsOnFileRequestBodyStatusField status, UpdateAllSkillCardsOnFileRequestBodyMetadataField metadata, UpdateAllSkillCardsOnFileRequestBodyFileField file) {
      this.status = new EnumWrapper<UpdateAllSkillCardsOnFileRequestBodyStatusField>(status.getValue(), status);
      this.metadata = metadata;
      this.file = file;
    }

    public UpdateAllSkillCardsOnFileRequestBodyBuilder fileVersion(UpdateAllSkillCardsOnFileRequestBodyFileVersionField fileVersion) {
      this.fileVersion = fileVersion;
      return this;
    }

    public UpdateAllSkillCardsOnFileRequestBodyBuilder usage(UpdateAllSkillCardsOnFileRequestBodyUsageField usage) {
      this.usage = usage;
      return this;
    }

    public UpdateAllSkillCardsOnFileRequestBody build() {
      return new UpdateAllSkillCardsOnFileRequestBody(this);
    }

  }

}
