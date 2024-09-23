package com.box.sdkgen.schemas.classification;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class Classification {

  @JsonProperty("Box__Security__Classification__Key")
  protected String boxSecurityClassificationKey;

  @JsonProperty("$parent")
  protected String parent;

  @JsonDeserialize(
      using = ClassificationTemplateField.ClassificationTemplateFieldDeserializer.class)
  @JsonSerialize(using = ClassificationTemplateField.ClassificationTemplateFieldSerializer.class)
  @JsonProperty("$template")
  protected EnumWrapper<ClassificationTemplateField> template;

  @JsonProperty("$scope")
  protected String scope;

  @JsonProperty("$version")
  protected Long version;

  @JsonProperty("$type")
  protected String type;

  @JsonProperty("$typeVersion")
  protected Double typeVersion;

  @JsonProperty("$canEdit")
  protected Boolean canEdit;

  public Classification() {}

  protected Classification(ClassificationBuilder builder) {
    this.boxSecurityClassificationKey = builder.boxSecurityClassificationKey;
    this.parent = builder.parent;
    this.template = builder.template;
    this.scope = builder.scope;
    this.version = builder.version;
    this.type = builder.type;
    this.typeVersion = builder.typeVersion;
    this.canEdit = builder.canEdit;
  }

  public String getBoxSecurityClassificationKey() {
    return boxSecurityClassificationKey;
  }

  public String getParent() {
    return parent;
  }

  public EnumWrapper<ClassificationTemplateField> getTemplate() {
    return template;
  }

  public String getScope() {
    return scope;
  }

  public Long getVersion() {
    return version;
  }

  public String getType() {
    return type;
  }

  public Double getTypeVersion() {
    return typeVersion;
  }

  public Boolean getCanEdit() {
    return canEdit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Classification casted = (Classification) o;
    return Objects.equals(boxSecurityClassificationKey, casted.boxSecurityClassificationKey)
        && Objects.equals(parent, casted.parent)
        && Objects.equals(template, casted.template)
        && Objects.equals(scope, casted.scope)
        && Objects.equals(version, casted.version)
        && Objects.equals(type, casted.type)
        && Objects.equals(typeVersion, casted.typeVersion)
        && Objects.equals(canEdit, casted.canEdit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        boxSecurityClassificationKey, parent, template, scope, version, type, typeVersion, canEdit);
  }

  @Override
  public String toString() {
    return "Classification{"
        + "boxSecurityClassificationKey='"
        + boxSecurityClassificationKey
        + '\''
        + ", "
        + "parent='"
        + parent
        + '\''
        + ", "
        + "template='"
        + template
        + '\''
        + ", "
        + "scope='"
        + scope
        + '\''
        + ", "
        + "version='"
        + version
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + ", "
        + "typeVersion='"
        + typeVersion
        + '\''
        + ", "
        + "canEdit='"
        + canEdit
        + '\''
        + "}";
  }

  public static class ClassificationBuilder {

    protected String boxSecurityClassificationKey;

    protected String parent;

    protected EnumWrapper<ClassificationTemplateField> template;

    protected String scope;

    protected Long version;

    protected String type;

    protected Double typeVersion;

    protected Boolean canEdit;

    public ClassificationBuilder boxSecurityClassificationKey(String boxSecurityClassificationKey) {
      this.boxSecurityClassificationKey = boxSecurityClassificationKey;
      return this;
    }

    public ClassificationBuilder parent(String parent) {
      this.parent = parent;
      return this;
    }

    public ClassificationBuilder template(ClassificationTemplateField template) {
      this.template = new EnumWrapper<ClassificationTemplateField>(template.getValue(), template);
      return this;
    }

    public ClassificationBuilder scope(String scope) {
      this.scope = scope;
      return this;
    }

    public ClassificationBuilder version(Long version) {
      this.version = version;
      return this;
    }

    public ClassificationBuilder type(String type) {
      this.type = type;
      return this;
    }

    public ClassificationBuilder typeVersion(Double typeVersion) {
      this.typeVersion = typeVersion;
      return this;
    }

    public ClassificationBuilder canEdit(Boolean canEdit) {
      this.canEdit = canEdit;
      return this;
    }

    public Classification build() {
      return new Classification(this);
    }
  }
}
