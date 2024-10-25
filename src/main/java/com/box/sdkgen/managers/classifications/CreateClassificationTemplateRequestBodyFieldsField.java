package com.box.sdkgen.managers.classifications;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import java.util.Objects;

public class CreateClassificationTemplateRequestBodyFieldsField {

  @JsonDeserialize(
      using =
          CreateClassificationTemplateRequestBodyFieldsTypeField
              .CreateClassificationTemplateRequestBodyFieldsTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          CreateClassificationTemplateRequestBodyFieldsTypeField
              .CreateClassificationTemplateRequestBodyFieldsTypeFieldSerializer.class)
  protected EnumWrapper<CreateClassificationTemplateRequestBodyFieldsTypeField> type;

  @JsonDeserialize(
      using =
          CreateClassificationTemplateRequestBodyFieldsKeyField
              .CreateClassificationTemplateRequestBodyFieldsKeyFieldDeserializer.class)
  @JsonSerialize(
      using =
          CreateClassificationTemplateRequestBodyFieldsKeyField
              .CreateClassificationTemplateRequestBodyFieldsKeyFieldSerializer.class)
  protected EnumWrapper<CreateClassificationTemplateRequestBodyFieldsKeyField> key;

  @JsonDeserialize(
      using =
          CreateClassificationTemplateRequestBodyFieldsDisplayNameField
              .CreateClassificationTemplateRequestBodyFieldsDisplayNameFieldDeserializer.class)
  @JsonSerialize(
      using =
          CreateClassificationTemplateRequestBodyFieldsDisplayNameField
              .CreateClassificationTemplateRequestBodyFieldsDisplayNameFieldSerializer.class)
  protected EnumWrapper<CreateClassificationTemplateRequestBodyFieldsDisplayNameField> displayName;

  protected Boolean hidden;

  protected final List<CreateClassificationTemplateRequestBodyFieldsOptionsField> options;

  public CreateClassificationTemplateRequestBodyFieldsField(
      @JsonProperty("options")
          List<CreateClassificationTemplateRequestBodyFieldsOptionsField> options) {
    this.options = options;
    this.type =
        new EnumWrapper<CreateClassificationTemplateRequestBodyFieldsTypeField>(
            CreateClassificationTemplateRequestBodyFieldsTypeField.ENUM.getValue(),
            CreateClassificationTemplateRequestBodyFieldsTypeField.ENUM);
    this.key =
        new EnumWrapper<CreateClassificationTemplateRequestBodyFieldsKeyField>(
            CreateClassificationTemplateRequestBodyFieldsKeyField.BOX__SECURITY__CLASSIFICATION__KEY
                .getValue(),
            CreateClassificationTemplateRequestBodyFieldsKeyField
                .BOX__SECURITY__CLASSIFICATION__KEY);
    this.displayName =
        new EnumWrapper<CreateClassificationTemplateRequestBodyFieldsDisplayNameField>(
            CreateClassificationTemplateRequestBodyFieldsDisplayNameField.CLASSIFICATION.getValue(),
            CreateClassificationTemplateRequestBodyFieldsDisplayNameField.CLASSIFICATION);
  }

  protected CreateClassificationTemplateRequestBodyFieldsField(
      CreateClassificationTemplateRequestBodyFieldsFieldBuilder builder) {
    this.type = builder.type;
    this.key = builder.key;
    this.displayName = builder.displayName;
    this.hidden = builder.hidden;
    this.options = builder.options;
  }

  public EnumWrapper<CreateClassificationTemplateRequestBodyFieldsTypeField> getType() {
    return type;
  }

  public EnumWrapper<CreateClassificationTemplateRequestBodyFieldsKeyField> getKey() {
    return key;
  }

  public EnumWrapper<CreateClassificationTemplateRequestBodyFieldsDisplayNameField>
      getDisplayName() {
    return displayName;
  }

  public Boolean getHidden() {
    return hidden;
  }

  public List<CreateClassificationTemplateRequestBodyFieldsOptionsField> getOptions() {
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
    CreateClassificationTemplateRequestBodyFieldsField casted =
        (CreateClassificationTemplateRequestBodyFieldsField) o;
    return Objects.equals(type, casted.type)
        && Objects.equals(key, casted.key)
        && Objects.equals(displayName, casted.displayName)
        && Objects.equals(hidden, casted.hidden)
        && Objects.equals(options, casted.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, key, displayName, hidden, options);
  }

  @Override
  public String toString() {
    return "CreateClassificationTemplateRequestBodyFieldsField{"
        + "type='"
        + type
        + '\''
        + ", "
        + "key='"
        + key
        + '\''
        + ", "
        + "displayName='"
        + displayName
        + '\''
        + ", "
        + "hidden='"
        + hidden
        + '\''
        + ", "
        + "options='"
        + options
        + '\''
        + "}";
  }

  public static class CreateClassificationTemplateRequestBodyFieldsFieldBuilder {

    protected EnumWrapper<CreateClassificationTemplateRequestBodyFieldsTypeField> type;

    protected EnumWrapper<CreateClassificationTemplateRequestBodyFieldsKeyField> key;

    protected EnumWrapper<CreateClassificationTemplateRequestBodyFieldsDisplayNameField>
        displayName;

    protected Boolean hidden;

    protected final List<CreateClassificationTemplateRequestBodyFieldsOptionsField> options;

    public CreateClassificationTemplateRequestBodyFieldsFieldBuilder(
        List<CreateClassificationTemplateRequestBodyFieldsOptionsField> options) {
      this.options = options;
      this.type =
          new EnumWrapper<CreateClassificationTemplateRequestBodyFieldsTypeField>(
              CreateClassificationTemplateRequestBodyFieldsTypeField.ENUM.getValue(),
              CreateClassificationTemplateRequestBodyFieldsTypeField.ENUM);
      this.key =
          new EnumWrapper<CreateClassificationTemplateRequestBodyFieldsKeyField>(
              CreateClassificationTemplateRequestBodyFieldsKeyField
                  .BOX__SECURITY__CLASSIFICATION__KEY
                  .getValue(),
              CreateClassificationTemplateRequestBodyFieldsKeyField
                  .BOX__SECURITY__CLASSIFICATION__KEY);
      this.displayName =
          new EnumWrapper<CreateClassificationTemplateRequestBodyFieldsDisplayNameField>(
              CreateClassificationTemplateRequestBodyFieldsDisplayNameField.CLASSIFICATION
                  .getValue(),
              CreateClassificationTemplateRequestBodyFieldsDisplayNameField.CLASSIFICATION);
    }

    public CreateClassificationTemplateRequestBodyFieldsFieldBuilder type(
        EnumWrapper<CreateClassificationTemplateRequestBodyFieldsTypeField> type) {
      this.type = type;
      return this;
    }

    public CreateClassificationTemplateRequestBodyFieldsFieldBuilder type(
        CreateClassificationTemplateRequestBodyFieldsTypeField type) {
      this.type =
          new EnumWrapper<CreateClassificationTemplateRequestBodyFieldsTypeField>(
              type.getValue(), type);
      return this;
    }

    public CreateClassificationTemplateRequestBodyFieldsFieldBuilder key(
        EnumWrapper<CreateClassificationTemplateRequestBodyFieldsKeyField> key) {
      this.key = key;
      return this;
    }

    public CreateClassificationTemplateRequestBodyFieldsFieldBuilder key(
        CreateClassificationTemplateRequestBodyFieldsKeyField key) {
      this.key =
          new EnumWrapper<CreateClassificationTemplateRequestBodyFieldsKeyField>(
              key.getValue(), key);
      return this;
    }

    public CreateClassificationTemplateRequestBodyFieldsFieldBuilder displayName(
        EnumWrapper<CreateClassificationTemplateRequestBodyFieldsDisplayNameField> displayName) {
      this.displayName = displayName;
      return this;
    }

    public CreateClassificationTemplateRequestBodyFieldsFieldBuilder displayName(
        CreateClassificationTemplateRequestBodyFieldsDisplayNameField displayName) {
      this.displayName =
          new EnumWrapper<CreateClassificationTemplateRequestBodyFieldsDisplayNameField>(
              displayName.getValue(), displayName);
      return this;
    }

    public CreateClassificationTemplateRequestBodyFieldsFieldBuilder hidden(Boolean hidden) {
      this.hidden = hidden;
      return this;
    }

    public CreateClassificationTemplateRequestBodyFieldsField build() {
      return new CreateClassificationTemplateRequestBodyFieldsField(this);
    }
  }
}
