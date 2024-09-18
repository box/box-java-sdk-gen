package com.box.sdkgen.schemas.classificationtemplate;

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
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class ClassificationTemplate {

  protected final String id;

  @JsonDeserialize(using = ClassificationTemplateTypeField.ClassificationTemplateTypeFieldDeserializer.class)
  @JsonSerialize(using = ClassificationTemplateTypeField.ClassificationTemplateTypeFieldSerializer.class)
  protected EnumWrapper<ClassificationTemplateTypeField> type;

  protected final String scope;

  @JsonDeserialize(using = ClassificationTemplateTemplateKeyField.ClassificationTemplateTemplateKeyFieldDeserializer.class)
  @JsonSerialize(using = ClassificationTemplateTemplateKeyField.ClassificationTemplateTemplateKeyFieldSerializer.class)
  protected EnumWrapper<ClassificationTemplateTemplateKeyField> templateKey;

  @JsonDeserialize(using = ClassificationTemplateDisplayNameField.ClassificationTemplateDisplayNameFieldDeserializer.class)
  @JsonSerialize(using = ClassificationTemplateDisplayNameField.ClassificationTemplateDisplayNameFieldSerializer.class)
  protected EnumWrapper<ClassificationTemplateDisplayNameField> displayName;

  protected Boolean hidden;

  protected Boolean copyInstanceOnItemCopy;

  protected final List<ClassificationTemplateFieldsField> fields;

  public ClassificationTemplate(@JsonProperty("id") String id, @JsonProperty("scope") String scope, @JsonProperty("fields") List<ClassificationTemplateFieldsField> fields) {
    this.id = id;
    this.scope = scope;
    this.fields = fields;
    this.type = new EnumWrapper<ClassificationTemplateTypeField>(ClassificationTemplateTypeField.METADATA_TEMPLATE.getValue(), ClassificationTemplateTypeField.METADATA_TEMPLATE);
    this.templateKey = new EnumWrapper<ClassificationTemplateTemplateKeyField>(ClassificationTemplateTemplateKeyField.SECURITYCLASSIFICATION_6VMVOCHWUWO.getValue(), ClassificationTemplateTemplateKeyField.SECURITYCLASSIFICATION_6VMVOCHWUWO);
    this.displayName = new EnumWrapper<ClassificationTemplateDisplayNameField>(ClassificationTemplateDisplayNameField.CLASSIFICATION.getValue(), ClassificationTemplateDisplayNameField.CLASSIFICATION);
  }

  protected ClassificationTemplate(ClassificationTemplateBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
    this.scope = builder.scope;
    this.templateKey = builder.templateKey;
    this.displayName = builder.displayName;
    this.hidden = builder.hidden;
    this.copyInstanceOnItemCopy = builder.copyInstanceOnItemCopy;
    this.fields = builder.fields;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<ClassificationTemplateTypeField> getType() {
    return type;
  }

  public String getScope() {
    return scope;
  }

  public EnumWrapper<ClassificationTemplateTemplateKeyField> getTemplateKey() {
    return templateKey;
  }

  public EnumWrapper<ClassificationTemplateDisplayNameField> getDisplayName() {
    return displayName;
  }

  public Boolean getHidden() {
    return hidden;
  }

  public Boolean getCopyInstanceOnItemCopy() {
    return copyInstanceOnItemCopy;
  }

  public List<ClassificationTemplateFieldsField> getFields() {
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
    ClassificationTemplate casted = (ClassificationTemplate) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type) &&
      Objects.equals(scope, casted.scope) &&
      Objects.equals(templateKey, casted.templateKey) &&
      Objects.equals(displayName, casted.displayName) &&
      Objects.equals(hidden, casted.hidden) &&
      Objects.equals(copyInstanceOnItemCopy, casted.copyInstanceOnItemCopy) &&
      Objects.equals(fields, casted.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type, scope, templateKey, displayName, hidden, copyInstanceOnItemCopy, fields
    );
  }

  @Override
  public String toString() {
    return "ClassificationTemplate{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + ", " + "scope='" + scope + '\'' + ", " + "templateKey='" + templateKey + '\'' + ", " + "displayName='" + displayName + '\'' + ", " + "hidden='" + hidden + '\'' + ", " + "copyInstanceOnItemCopy='" + copyInstanceOnItemCopy + '\'' + ", " + "fields='" + fields + '\'' + "}";
  }

  public static class ClassificationTemplateBuilder {

    protected final String id;

    protected EnumWrapper<ClassificationTemplateTypeField> type;

    protected final String scope;

    protected EnumWrapper<ClassificationTemplateTemplateKeyField> templateKey;

    protected EnumWrapper<ClassificationTemplateDisplayNameField> displayName;

    protected Boolean hidden;

    protected Boolean copyInstanceOnItemCopy;

    protected final List<ClassificationTemplateFieldsField> fields;

    public ClassificationTemplateBuilder(String id, String scope, List<ClassificationTemplateFieldsField> fields) {
      this.id = id;
      this.scope = scope;
      this.fields = fields;
      this.type = new EnumWrapper<ClassificationTemplateTypeField>(ClassificationTemplateTypeField.METADATA_TEMPLATE.getValue(), ClassificationTemplateTypeField.METADATA_TEMPLATE);
      this.templateKey = new EnumWrapper<ClassificationTemplateTemplateKeyField>(ClassificationTemplateTemplateKeyField.SECURITYCLASSIFICATION_6VMVOCHWUWO.getValue(), ClassificationTemplateTemplateKeyField.SECURITYCLASSIFICATION_6VMVOCHWUWO);
      this.displayName = new EnumWrapper<ClassificationTemplateDisplayNameField>(ClassificationTemplateDisplayNameField.CLASSIFICATION.getValue(), ClassificationTemplateDisplayNameField.CLASSIFICATION);
    }

    public ClassificationTemplateBuilder type(ClassificationTemplateTypeField type) {
      this.type = new EnumWrapper<ClassificationTemplateTypeField>(type.getValue(), type);
      return this;
    }

    public ClassificationTemplateBuilder templateKey(ClassificationTemplateTemplateKeyField templateKey) {
      this.templateKey = new EnumWrapper<ClassificationTemplateTemplateKeyField>(templateKey.getValue(), templateKey);
      return this;
    }

    public ClassificationTemplateBuilder displayName(ClassificationTemplateDisplayNameField displayName) {
      this.displayName = new EnumWrapper<ClassificationTemplateDisplayNameField>(displayName.getValue(), displayName);
      return this;
    }

    public ClassificationTemplateBuilder hidden(Boolean hidden) {
      this.hidden = hidden;
      return this;
    }

    public ClassificationTemplateBuilder copyInstanceOnItemCopy(Boolean copyInstanceOnItemCopy) {
      this.copyInstanceOnItemCopy = copyInstanceOnItemCopy;
      return this;
    }

    public ClassificationTemplate build() {
      return new ClassificationTemplate(this);
    }

  }

}
