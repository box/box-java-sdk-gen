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

public class ClassificationTemplateFieldsOptionsStaticConfigField {

  protected ClassificationTemplateFieldsOptionsStaticConfigClassificationField classification;

  public ClassificationTemplateFieldsOptionsStaticConfigField() {
  }

  protected ClassificationTemplateFieldsOptionsStaticConfigField(ClassificationTemplateFieldsOptionsStaticConfigFieldBuilder builder) {
    this.classification = builder.classification;
  }

  public ClassificationTemplateFieldsOptionsStaticConfigClassificationField getClassification() {
    return classification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationTemplateFieldsOptionsStaticConfigField casted = (ClassificationTemplateFieldsOptionsStaticConfigField) o;
    return Objects.equals(classification, casted.classification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      classification
    );
  }

  @Override
  public String toString() {
    return "ClassificationTemplateFieldsOptionsStaticConfigField{" + "classification='" + classification + '\'' + "}";
  }

  public static class ClassificationTemplateFieldsOptionsStaticConfigFieldBuilder {

    protected ClassificationTemplateFieldsOptionsStaticConfigClassificationField classification;

    public ClassificationTemplateFieldsOptionsStaticConfigFieldBuilder classification(ClassificationTemplateFieldsOptionsStaticConfigClassificationField classification) {
      this.classification = classification;
      return this;
    }

    public ClassificationTemplateFieldsOptionsStaticConfigField build() {
      return new ClassificationTemplateFieldsOptionsStaticConfigField(this);
    }

  }

}
