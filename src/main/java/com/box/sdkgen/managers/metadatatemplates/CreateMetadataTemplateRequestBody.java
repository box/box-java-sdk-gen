package com.box.sdkgen.managers.metadatatemplates;

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
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.box.sdkgen.internal.utils.UtilsManager.entryOf;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.metadatatemplates.MetadataTemplates;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.schemas.metadatatemplate.MetadataTemplate;
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

public class CreateMetadataTemplateRequestBody {

  protected final String scope;

  protected String templateKey;

  protected final String displayName;

  protected Boolean hidden;

  protected List<CreateMetadataTemplateRequestBodyFieldsField> fields;

  protected Boolean copyInstanceOnItemCopy;

  public CreateMetadataTemplateRequestBody(@JsonProperty("scope") String scope, @JsonProperty("displayName") String displayName) {
    this.scope = scope;
    this.displayName = displayName;
  }

  protected CreateMetadataTemplateRequestBody(CreateMetadataTemplateRequestBodyBuilder builder) {
    this.scope = builder.scope;
    this.templateKey = builder.templateKey;
    this.displayName = builder.displayName;
    this.hidden = builder.hidden;
    this.fields = builder.fields;
    this.copyInstanceOnItemCopy = builder.copyInstanceOnItemCopy;
  }

  public String getScope() {
    return scope;
  }

  public String getTemplateKey() {
    return templateKey;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Boolean getHidden() {
    return hidden;
  }

  public List<CreateMetadataTemplateRequestBodyFieldsField> getFields() {
    return fields;
  }

  public Boolean getCopyInstanceOnItemCopy() {
    return copyInstanceOnItemCopy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMetadataTemplateRequestBody casted = (CreateMetadataTemplateRequestBody) o;
    return Objects.equals(scope, casted.scope) &&
      Objects.equals(templateKey, casted.templateKey) &&
      Objects.equals(displayName, casted.displayName) &&
      Objects.equals(hidden, casted.hidden) &&
      Objects.equals(fields, casted.fields) &&
      Objects.equals(copyInstanceOnItemCopy, casted.copyInstanceOnItemCopy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      scope, templateKey, displayName, hidden, fields, copyInstanceOnItemCopy
    );
  }

  @Override
  public String toString() {
    return "CreateMetadataTemplateRequestBody{" + "scope='" + scope + '\'' + ", " + "templateKey='" + templateKey + '\'' + ", " + "displayName='" + displayName + '\'' + ", " + "hidden='" + hidden + '\'' + ", " + "fields='" + fields + '\'' + ", " + "copyInstanceOnItemCopy='" + copyInstanceOnItemCopy + '\'' + "}";
  }

  public static class CreateMetadataTemplateRequestBodyBuilder {

    protected final String scope;

    protected String templateKey;

    protected final String displayName;

    protected Boolean hidden;

    protected List<CreateMetadataTemplateRequestBodyFieldsField> fields;

    protected Boolean copyInstanceOnItemCopy;

    public CreateMetadataTemplateRequestBodyBuilder(String scope, String displayName) {
      this.scope = scope;
      this.displayName = displayName;
    }

    public CreateMetadataTemplateRequestBodyBuilder templateKey(String templateKey) {
      this.templateKey = templateKey;
      return this;
    }

    public CreateMetadataTemplateRequestBodyBuilder hidden(Boolean hidden) {
      this.hidden = hidden;
      return this;
    }

    public CreateMetadataTemplateRequestBodyBuilder fields(List<CreateMetadataTemplateRequestBodyFieldsField> fields) {
      this.fields = fields;
      return this;
    }

    public CreateMetadataTemplateRequestBodyBuilder copyInstanceOnItemCopy(Boolean copyInstanceOnItemCopy) {
      this.copyInstanceOnItemCopy = copyInstanceOnItemCopy;
      return this;
    }

    public CreateMetadataTemplateRequestBody build() {
      return new CreateMetadataTemplateRequestBody(this);
    }

  }

}
