package com.box.sdkgen.managers.metadatacascadepolicies;

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
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.metadatacascadepolicies.MetadataCascadePolicies;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.metadatacascadepolicy.MetadataCascadePolicy;
import com.box.sdkgen.schemas.conflicterror.ConflictError;
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

public class ApplyMetadataCascadePolicyRequestBody {

  @JsonDeserialize(using = ApplyMetadataCascadePolicyRequestBodyConflictResolutionField.ApplyMetadataCascadePolicyRequestBodyConflictResolutionFieldDeserializer.class)
  @JsonSerialize(using = ApplyMetadataCascadePolicyRequestBodyConflictResolutionField.ApplyMetadataCascadePolicyRequestBodyConflictResolutionFieldSerializer.class)
  @JsonProperty("conflict_resolution")
  protected final EnumWrapper<ApplyMetadataCascadePolicyRequestBodyConflictResolutionField> conflictResolution;

  public ApplyMetadataCascadePolicyRequestBody(@JsonProperty("conflict_resolution") EnumWrapper<ApplyMetadataCascadePolicyRequestBodyConflictResolutionField> conflictResolution) {
    this.conflictResolution = conflictResolution;
  }

  public ApplyMetadataCascadePolicyRequestBody(ApplyMetadataCascadePolicyRequestBodyConflictResolutionField conflictResolution) {
    this.conflictResolution = new EnumWrapper<ApplyMetadataCascadePolicyRequestBodyConflictResolutionField>(conflictResolution.getValue(), conflictResolution);
  }

  public EnumWrapper<ApplyMetadataCascadePolicyRequestBodyConflictResolutionField> getConflictResolution() {
    return conflictResolution;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyMetadataCascadePolicyRequestBody casted = (ApplyMetadataCascadePolicyRequestBody) o;
    return Objects.equals(conflictResolution, casted.conflictResolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      conflictResolution
    );
  }

  @Override
  public String toString() {
    return "ApplyMetadataCascadePolicyRequestBody{" + "conflictResolution='" + conflictResolution + '\'' + "}";
  }

}
