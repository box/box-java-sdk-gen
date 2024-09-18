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

public class CreateMetadataCascadePolicyRequestBody {

  @JsonProperty("folder_id")
  protected final String folderId;

  @JsonDeserialize(using = CreateMetadataCascadePolicyRequestBodyScopeField.CreateMetadataCascadePolicyRequestBodyScopeFieldDeserializer.class)
  @JsonSerialize(using = CreateMetadataCascadePolicyRequestBodyScopeField.CreateMetadataCascadePolicyRequestBodyScopeFieldSerializer.class)
  protected final EnumWrapper<CreateMetadataCascadePolicyRequestBodyScopeField> scope;

  protected final String templateKey;

  public CreateMetadataCascadePolicyRequestBody(@JsonProperty("folder_id") String folderId, @JsonProperty("scope") EnumWrapper<CreateMetadataCascadePolicyRequestBodyScopeField> scope, @JsonProperty("templateKey") String templateKey) {
    this.folderId = folderId;
    this.scope = scope;
    this.templateKey = templateKey;
  }

  public CreateMetadataCascadePolicyRequestBody(String folderId, CreateMetadataCascadePolicyRequestBodyScopeField scope, String templateKey) {
    this.folderId = folderId;
    this.scope = new EnumWrapper<CreateMetadataCascadePolicyRequestBodyScopeField>(scope.getValue(), scope);
    this.templateKey = templateKey;
  }

  public String getFolderId() {
    return folderId;
  }

  public EnumWrapper<CreateMetadataCascadePolicyRequestBodyScopeField> getScope() {
    return scope;
  }

  public String getTemplateKey() {
    return templateKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMetadataCascadePolicyRequestBody casted = (CreateMetadataCascadePolicyRequestBody) o;
    return Objects.equals(folderId, casted.folderId) &&
      Objects.equals(scope, casted.scope) &&
      Objects.equals(templateKey, casted.templateKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      folderId, scope, templateKey
    );
  }

  @Override
  public String toString() {
    return "CreateMetadataCascadePolicyRequestBody{" + "folderId='" + folderId + '\'' + ", " + "scope='" + scope + '\'' + ", " + "templateKey='" + templateKey + '\'' + "}";
  }

}
