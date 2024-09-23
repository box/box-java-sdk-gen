package com.box.sdkgen.managers.metadatatemplates;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import java.util.Objects;

public class CreateMetadataTemplateRequestBodyFieldsField {

  @JsonDeserialize(
      using =
          CreateMetadataTemplateRequestBodyFieldsTypeField
              .CreateMetadataTemplateRequestBodyFieldsTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          CreateMetadataTemplateRequestBodyFieldsTypeField
              .CreateMetadataTemplateRequestBodyFieldsTypeFieldSerializer.class)
  protected final EnumWrapper<CreateMetadataTemplateRequestBodyFieldsTypeField> type;

  protected final String key;

  protected final String displayName;

  protected String description;

  protected Boolean hidden;

  protected List<CreateMetadataTemplateRequestBodyFieldsOptionsField> options;

  public CreateMetadataTemplateRequestBodyFieldsField(
      @JsonProperty("type") EnumWrapper<CreateMetadataTemplateRequestBodyFieldsTypeField> type,
      @JsonProperty("key") String key,
      @JsonProperty("displayName") String displayName) {
    this.type = type;
    this.key = key;
    this.displayName = displayName;
  }

  public CreateMetadataTemplateRequestBodyFieldsField(
      CreateMetadataTemplateRequestBodyFieldsTypeField type, String key, String displayName) {
    this.type =
        new EnumWrapper<CreateMetadataTemplateRequestBodyFieldsTypeField>(type.getValue(), type);
    this.key = key;
    this.displayName = displayName;
  }

  protected CreateMetadataTemplateRequestBodyFieldsField(
      CreateMetadataTemplateRequestBodyFieldsFieldBuilder builder) {
    this.type = builder.type;
    this.key = builder.key;
    this.displayName = builder.displayName;
    this.description = builder.description;
    this.hidden = builder.hidden;
    this.options = builder.options;
  }

  public EnumWrapper<CreateMetadataTemplateRequestBodyFieldsTypeField> getType() {
    return type;
  }

  public String getKey() {
    return key;
  }

  public String getDisplayName() {
    return displayName;
  }

  public String getDescription() {
    return description;
  }

  public Boolean getHidden() {
    return hidden;
  }

  public List<CreateMetadataTemplateRequestBodyFieldsOptionsField> getOptions() {
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
    CreateMetadataTemplateRequestBodyFieldsField casted =
        (CreateMetadataTemplateRequestBodyFieldsField) o;
    return Objects.equals(type, casted.type)
        && Objects.equals(key, casted.key)
        && Objects.equals(displayName, casted.displayName)
        && Objects.equals(description, casted.description)
        && Objects.equals(hidden, casted.hidden)
        && Objects.equals(options, casted.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, key, displayName, description, hidden, options);
  }

  @Override
  public String toString() {
    return "CreateMetadataTemplateRequestBodyFieldsField{"
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
        + "description='"
        + description
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

  public static class CreateMetadataTemplateRequestBodyFieldsFieldBuilder {

    protected final EnumWrapper<CreateMetadataTemplateRequestBodyFieldsTypeField> type;

    protected final String key;

    protected final String displayName;

    protected String description;

    protected Boolean hidden;

    protected List<CreateMetadataTemplateRequestBodyFieldsOptionsField> options;

    public CreateMetadataTemplateRequestBodyFieldsFieldBuilder(
        CreateMetadataTemplateRequestBodyFieldsTypeField type, String key, String displayName) {
      this.type =
          new EnumWrapper<CreateMetadataTemplateRequestBodyFieldsTypeField>(type.getValue(), type);
      this.key = key;
      this.displayName = displayName;
    }

    public CreateMetadataTemplateRequestBodyFieldsFieldBuilder description(String description) {
      this.description = description;
      return this;
    }

    public CreateMetadataTemplateRequestBodyFieldsFieldBuilder hidden(Boolean hidden) {
      this.hidden = hidden;
      return this;
    }

    public CreateMetadataTemplateRequestBodyFieldsFieldBuilder options(
        List<CreateMetadataTemplateRequestBodyFieldsOptionsField> options) {
      this.options = options;
      return this;
    }

    public CreateMetadataTemplateRequestBodyFieldsField build() {
      return new CreateMetadataTemplateRequestBodyFieldsField(this);
    }
  }
}
