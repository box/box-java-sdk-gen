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

public class UpdateAllSkillCardsOnFileRequestBodyUsageField {

  protected String unit;

  protected Double value;

  public UpdateAllSkillCardsOnFileRequestBodyUsageField() {
  }

  protected UpdateAllSkillCardsOnFileRequestBodyUsageField(UpdateAllSkillCardsOnFileRequestBodyUsageFieldBuilder builder) {
    this.unit = builder.unit;
    this.value = builder.value;
  }

  public String getUnit() {
    return unit;
  }

  public Double getValue() {
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
    UpdateAllSkillCardsOnFileRequestBodyUsageField casted = (UpdateAllSkillCardsOnFileRequestBodyUsageField) o;
    return Objects.equals(unit, casted.unit) &&
      Objects.equals(value, casted.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      unit, value
    );
  }

  @Override
  public String toString() {
    return "UpdateAllSkillCardsOnFileRequestBodyUsageField{" + "unit='" + unit + '\'' + ", " + "value='" + value + '\'' + "}";
  }

  public static class UpdateAllSkillCardsOnFileRequestBodyUsageFieldBuilder {

    protected String unit;

    protected Double value;

    public UpdateAllSkillCardsOnFileRequestBodyUsageFieldBuilder unit(String unit) {
      this.unit = unit;
      return this;
    }

    public UpdateAllSkillCardsOnFileRequestBodyUsageFieldBuilder value(Double value) {
      this.value = value;
      return this;
    }

    public UpdateAllSkillCardsOnFileRequestBodyUsageField build() {
      return new UpdateAllSkillCardsOnFileRequestBodyUsageField(this);
    }

  }

}
