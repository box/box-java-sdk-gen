package com.box.sdkgen.managers.classifications;

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
import java.util.List;
import static com.box.sdkgen.internal.utils.UtilsManager.mergeMaps;
import com.box.sdkgen.serialization.json.JsonManager;
import com.box.sdkgen.schemas.classificationtemplate.ClassificationTemplate;
import com.box.sdkgen.schemas.clienterror.ClientError;
import com.box.sdkgen.networking.auth.Authentication;
import com.box.sdkgen.networking.network.NetworkSession;
import static com.box.sdkgen.internal.utils.UtilsManager.prepareParams;
import static com.box.sdkgen.internal.utils.UtilsManager.convertToString;
import com.box.sdkgen.internal.utils.ByteStream;
import com.box.sdkgen.networking.fetch.FetchOptions;
import com.box.sdkgen.networking.fetch.FetchResponse;
import static com.box.sdkgen.networking.fetch.FetchManager.fetch;
import com.fasterxml.jackson.databind.JsonNode;

public class CreateClassificationTemplateRequestBody {

  @JsonDeserialize(using = CreateClassificationTemplateRequestBodyScopeField.CreateClassificationTemplateRequestBodyScopeFieldDeserializer.class)
  @JsonSerialize(using = CreateClassificationTemplateRequestBodyScopeField.CreateClassificationTemplateRequestBodyScopeFieldSerializer.class)
  protected EnumWrapper<CreateClassificationTemplateRequestBodyScopeField> scope;

  @JsonDeserialize(using = CreateClassificationTemplateRequestBodyTemplateKeyField.CreateClassificationTemplateRequestBodyTemplateKeyFieldDeserializer.class)
  @JsonSerialize(using = CreateClassificationTemplateRequestBodyTemplateKeyField.CreateClassificationTemplateRequestBodyTemplateKeyFieldSerializer.class)
  protected EnumWrapper<CreateClassificationTemplateRequestBodyTemplateKeyField> templateKey;

  @JsonDeserialize(using = CreateClassificationTemplateRequestBodyDisplayNameField.CreateClassificationTemplateRequestBodyDisplayNameFieldDeserializer.class)
  @JsonSerialize(using = CreateClassificationTemplateRequestBodyDisplayNameField.CreateClassificationTemplateRequestBodyDisplayNameFieldSerializer.class)
  protected EnumWrapper<CreateClassificationTemplateRequestBodyDisplayNameField> displayName;

  protected Boolean hidden;

  protected Boolean copyInstanceOnItemCopy;

  protected final List<CreateClassificationTemplateRequestBodyFieldsField> fields;

  public CreateClassificationTemplateRequestBody(@JsonProperty("fields") List<CreateClassificationTemplateRequestBodyFieldsField> fields) {
    this.fields = fields;
    this.scope = new EnumWrapper<CreateClassificationTemplateRequestBodyScopeField>(CreateClassificationTemplateRequestBodyScopeField.ENTERPRISE.getValue(), CreateClassificationTemplateRequestBodyScopeField.ENTERPRISE);
    this.templateKey = new EnumWrapper<CreateClassificationTemplateRequestBodyTemplateKeyField>(CreateClassificationTemplateRequestBodyTemplateKeyField.SECURITYCLASSIFICATION_6VMVOCHWUWO.getValue(), CreateClassificationTemplateRequestBodyTemplateKeyField.SECURITYCLASSIFICATION_6VMVOCHWUWO);
    this.displayName = new EnumWrapper<CreateClassificationTemplateRequestBodyDisplayNameField>(CreateClassificationTemplateRequestBodyDisplayNameField.CLASSIFICATION.getValue(), CreateClassificationTemplateRequestBodyDisplayNameField.CLASSIFICATION);
  }

  protected CreateClassificationTemplateRequestBody(CreateClassificationTemplateRequestBodyBuilder builder) {
    this.scope = builder.scope;
    this.templateKey = builder.templateKey;
    this.displayName = builder.displayName;
    this.hidden = builder.hidden;
    this.copyInstanceOnItemCopy = builder.copyInstanceOnItemCopy;
    this.fields = builder.fields;
  }

  public EnumWrapper<CreateClassificationTemplateRequestBodyScopeField> getScope() {
    return scope;
  }

  public EnumWrapper<CreateClassificationTemplateRequestBodyTemplateKeyField> getTemplateKey() {
    return templateKey;
  }

  public EnumWrapper<CreateClassificationTemplateRequestBodyDisplayNameField> getDisplayName() {
    return displayName;
  }

  public Boolean getHidden() {
    return hidden;
  }

  public Boolean getCopyInstanceOnItemCopy() {
    return copyInstanceOnItemCopy;
  }

  public List<CreateClassificationTemplateRequestBodyFieldsField> getFields() {
    return fields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClassificationTemplateRequestBody casted = (CreateClassificationTemplateRequestBody) o;
    return Objects.equals(scope, casted.scope) &&
      Objects.equals(templateKey, casted.templateKey) &&
      Objects.equals(displayName, casted.displayName) &&
      Objects.equals(hidden, casted.hidden) &&
      Objects.equals(copyInstanceOnItemCopy, casted.copyInstanceOnItemCopy) &&
      Objects.equals(fields, casted.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      scope, templateKey, displayName, hidden, copyInstanceOnItemCopy, fields
    );
  }

  @Override
  public String toString() {
    return "CreateClassificationTemplateRequestBody{" + "scope='" + scope + '\'' + ", " + "templateKey='" + templateKey + '\'' + ", " + "displayName='" + displayName + '\'' + ", " + "hidden='" + hidden + '\'' + ", " + "copyInstanceOnItemCopy='" + copyInstanceOnItemCopy + '\'' + ", " + "fields='" + fields + '\'' + "}";
  }

  public static class CreateClassificationTemplateRequestBodyBuilder {

    protected EnumWrapper<CreateClassificationTemplateRequestBodyScopeField> scope;

    protected EnumWrapper<CreateClassificationTemplateRequestBodyTemplateKeyField> templateKey;

    protected EnumWrapper<CreateClassificationTemplateRequestBodyDisplayNameField> displayName;

    protected Boolean hidden;

    protected Boolean copyInstanceOnItemCopy;

    protected final List<CreateClassificationTemplateRequestBodyFieldsField> fields;

    public CreateClassificationTemplateRequestBodyBuilder(List<CreateClassificationTemplateRequestBodyFieldsField> fields) {
      this.fields = fields;
      this.scope = new EnumWrapper<CreateClassificationTemplateRequestBodyScopeField>(CreateClassificationTemplateRequestBodyScopeField.ENTERPRISE.getValue(), CreateClassificationTemplateRequestBodyScopeField.ENTERPRISE);
      this.templateKey = new EnumWrapper<CreateClassificationTemplateRequestBodyTemplateKeyField>(CreateClassificationTemplateRequestBodyTemplateKeyField.SECURITYCLASSIFICATION_6VMVOCHWUWO.getValue(), CreateClassificationTemplateRequestBodyTemplateKeyField.SECURITYCLASSIFICATION_6VMVOCHWUWO);
      this.displayName = new EnumWrapper<CreateClassificationTemplateRequestBodyDisplayNameField>(CreateClassificationTemplateRequestBodyDisplayNameField.CLASSIFICATION.getValue(), CreateClassificationTemplateRequestBodyDisplayNameField.CLASSIFICATION);
    }

    public CreateClassificationTemplateRequestBodyBuilder scope(CreateClassificationTemplateRequestBodyScopeField scope) {
      this.scope = new EnumWrapper<CreateClassificationTemplateRequestBodyScopeField>(scope.getValue(), scope);
      return this;
    }

    public CreateClassificationTemplateRequestBodyBuilder templateKey(CreateClassificationTemplateRequestBodyTemplateKeyField templateKey) {
      this.templateKey = new EnumWrapper<CreateClassificationTemplateRequestBodyTemplateKeyField>(templateKey.getValue(), templateKey);
      return this;
    }

    public CreateClassificationTemplateRequestBodyBuilder displayName(CreateClassificationTemplateRequestBodyDisplayNameField displayName) {
      this.displayName = new EnumWrapper<CreateClassificationTemplateRequestBodyDisplayNameField>(displayName.getValue(), displayName);
      return this;
    }

    public CreateClassificationTemplateRequestBodyBuilder hidden(Boolean hidden) {
      this.hidden = hidden;
      return this;
    }

    public CreateClassificationTemplateRequestBodyBuilder copyInstanceOnItemCopy(Boolean copyInstanceOnItemCopy) {
      this.copyInstanceOnItemCopy = copyInstanceOnItemCopy;
      return this;
    }

    public CreateClassificationTemplateRequestBody build() {
      return new CreateClassificationTemplateRequestBody(this);
    }

  }

}
