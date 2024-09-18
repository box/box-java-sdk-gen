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

public class ClassificationTemplateFieldsOptionsField {

  protected final String id;

  protected final String key;

  protected ClassificationTemplateFieldsOptionsStaticConfigField staticConfig;

  public ClassificationTemplateFieldsOptionsField(@JsonProperty("id") String id, @JsonProperty("key") String key) {
    this.id = id;
    this.key = key;
  }

  protected ClassificationTemplateFieldsOptionsField(ClassificationTemplateFieldsOptionsFieldBuilder builder) {
    this.id = builder.id;
    this.key = builder.key;
    this.staticConfig = builder.staticConfig;
  }

  public String getId() {
    return id;
  }

  public String getKey() {
    return key;
  }

  public ClassificationTemplateFieldsOptionsStaticConfigField getStaticConfig() {
    return staticConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationTemplateFieldsOptionsField casted = (ClassificationTemplateFieldsOptionsField) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(key, casted.key) &&
      Objects.equals(staticConfig, casted.staticConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, key, staticConfig
    );
  }

  @Override
  public String toString() {
    return "ClassificationTemplateFieldsOptionsField{" + "id='" + id + '\'' + ", " + "key='" + key + '\'' + ", " + "staticConfig='" + staticConfig + '\'' + "}";
  }

  public static class ClassificationTemplateFieldsOptionsFieldBuilder {

    protected final String id;

    protected final String key;

    protected ClassificationTemplateFieldsOptionsStaticConfigField staticConfig;

    public ClassificationTemplateFieldsOptionsFieldBuilder(String id, String key) {
      this.id = id;
      this.key = key;
    }

    public ClassificationTemplateFieldsOptionsFieldBuilder staticConfig(ClassificationTemplateFieldsOptionsStaticConfigField staticConfig) {
      this.staticConfig = staticConfig;
      return this;
    }

    public ClassificationTemplateFieldsOptionsField build() {
      return new ClassificationTemplateFieldsOptionsField(this);
    }

  }

}
