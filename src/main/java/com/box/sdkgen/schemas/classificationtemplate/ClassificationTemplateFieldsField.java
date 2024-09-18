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

public class ClassificationTemplateFieldsField {

  protected final String id;

  @JsonDeserialize(using = ClassificationTemplateFieldsTypeField.ClassificationTemplateFieldsTypeFieldDeserializer.class)
  @JsonSerialize(using = ClassificationTemplateFieldsTypeField.ClassificationTemplateFieldsTypeFieldSerializer.class)
  protected EnumWrapper<ClassificationTemplateFieldsTypeField> type;

  @JsonDeserialize(using = ClassificationTemplateFieldsKeyField.ClassificationTemplateFieldsKeyFieldDeserializer.class)
  @JsonSerialize(using = ClassificationTemplateFieldsKeyField.ClassificationTemplateFieldsKeyFieldSerializer.class)
  protected EnumWrapper<ClassificationTemplateFieldsKeyField> key;

  @JsonDeserialize(using = ClassificationTemplateFieldsDisplayNameField.ClassificationTemplateFieldsDisplayNameFieldDeserializer.class)
  @JsonSerialize(using = ClassificationTemplateFieldsDisplayNameField.ClassificationTemplateFieldsDisplayNameFieldSerializer.class)
  protected EnumWrapper<ClassificationTemplateFieldsDisplayNameField> displayName;

  protected Boolean hidden;

  protected final List<ClassificationTemplateFieldsOptionsField> options;

  public ClassificationTemplateFieldsField(@JsonProperty("id") String id, @JsonProperty("options") List<ClassificationTemplateFieldsOptionsField> options) {
    this.id = id;
    this.options = options;
    this.type = new EnumWrapper<ClassificationTemplateFieldsTypeField>(ClassificationTemplateFieldsTypeField.ENUM.getValue(), ClassificationTemplateFieldsTypeField.ENUM);
    this.key = new EnumWrapper<ClassificationTemplateFieldsKeyField>(ClassificationTemplateFieldsKeyField.BOX__SECURITY__CLASSIFICATION__KEY.getValue(), ClassificationTemplateFieldsKeyField.BOX__SECURITY__CLASSIFICATION__KEY);
    this.displayName = new EnumWrapper<ClassificationTemplateFieldsDisplayNameField>(ClassificationTemplateFieldsDisplayNameField.CLASSIFICATION.getValue(), ClassificationTemplateFieldsDisplayNameField.CLASSIFICATION);
  }

  protected ClassificationTemplateFieldsField(ClassificationTemplateFieldsFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
    this.key = builder.key;
    this.displayName = builder.displayName;
    this.hidden = builder.hidden;
    this.options = builder.options;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<ClassificationTemplateFieldsTypeField> getType() {
    return type;
  }

  public EnumWrapper<ClassificationTemplateFieldsKeyField> getKey() {
    return key;
  }

  public EnumWrapper<ClassificationTemplateFieldsDisplayNameField> getDisplayName() {
    return displayName;
  }

  public Boolean getHidden() {
    return hidden;
  }

  public List<ClassificationTemplateFieldsOptionsField> getOptions() {
    return options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationTemplateFieldsField casted = (ClassificationTemplateFieldsField) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type) &&
      Objects.equals(key, casted.key) &&
      Objects.equals(displayName, casted.displayName) &&
      Objects.equals(hidden, casted.hidden) &&
      Objects.equals(options, casted.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type, key, displayName, hidden, options
    );
  }

  @Override
  public String toString() {
    return "ClassificationTemplateFieldsField{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + ", " + "key='" + key + '\'' + ", " + "displayName='" + displayName + '\'' + ", " + "hidden='" + hidden + '\'' + ", " + "options='" + options + '\'' + "}";
  }

  public static class ClassificationTemplateFieldsFieldBuilder {

    protected final String id;

    protected EnumWrapper<ClassificationTemplateFieldsTypeField> type;

    protected EnumWrapper<ClassificationTemplateFieldsKeyField> key;

    protected EnumWrapper<ClassificationTemplateFieldsDisplayNameField> displayName;

    protected Boolean hidden;

    protected final List<ClassificationTemplateFieldsOptionsField> options;

    public ClassificationTemplateFieldsFieldBuilder(String id, List<ClassificationTemplateFieldsOptionsField> options) {
      this.id = id;
      this.options = options;
      this.type = new EnumWrapper<ClassificationTemplateFieldsTypeField>(ClassificationTemplateFieldsTypeField.ENUM.getValue(), ClassificationTemplateFieldsTypeField.ENUM);
      this.key = new EnumWrapper<ClassificationTemplateFieldsKeyField>(ClassificationTemplateFieldsKeyField.BOX__SECURITY__CLASSIFICATION__KEY.getValue(), ClassificationTemplateFieldsKeyField.BOX__SECURITY__CLASSIFICATION__KEY);
      this.displayName = new EnumWrapper<ClassificationTemplateFieldsDisplayNameField>(ClassificationTemplateFieldsDisplayNameField.CLASSIFICATION.getValue(), ClassificationTemplateFieldsDisplayNameField.CLASSIFICATION);
    }

    public ClassificationTemplateFieldsFieldBuilder type(ClassificationTemplateFieldsTypeField type) {
      this.type = new EnumWrapper<ClassificationTemplateFieldsTypeField>(type.getValue(), type);
      return this;
    }

    public ClassificationTemplateFieldsFieldBuilder key(ClassificationTemplateFieldsKeyField key) {
      this.key = new EnumWrapper<ClassificationTemplateFieldsKeyField>(key.getValue(), key);
      return this;
    }

    public ClassificationTemplateFieldsFieldBuilder displayName(ClassificationTemplateFieldsDisplayNameField displayName) {
      this.displayName = new EnumWrapper<ClassificationTemplateFieldsDisplayNameField>(displayName.getValue(), displayName);
      return this;
    }

    public ClassificationTemplateFieldsFieldBuilder hidden(Boolean hidden) {
      this.hidden = hidden;
      return this;
    }

    public ClassificationTemplateFieldsField build() {
      return new ClassificationTemplateFieldsField(this);
    }

  }

}
