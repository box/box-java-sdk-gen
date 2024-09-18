package com.box.sdkgen.schemas.templatesignerinput;

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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.signrequestprefilltag.SignRequestPrefillTag;

public class TemplateSignerInputDimensionsField {

  protected Double width;

  protected Double height;

  public TemplateSignerInputDimensionsField() {
  }

  protected TemplateSignerInputDimensionsField(TemplateSignerInputDimensionsFieldBuilder builder) {
    this.width = builder.width;
    this.height = builder.height;
  }

  public Double getWidth() {
    return width;
  }

  public Double getHeight() {
    return height;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateSignerInputDimensionsField casted = (TemplateSignerInputDimensionsField) o;
    return Objects.equals(width, casted.width) &&
      Objects.equals(height, casted.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      width, height
    );
  }

  @Override
  public String toString() {
    return "TemplateSignerInputDimensionsField{" + "width='" + width + '\'' + ", " + "height='" + height + '\'' + "}";
  }

  public static class TemplateSignerInputDimensionsFieldBuilder {

    protected Double width;

    protected Double height;

    public TemplateSignerInputDimensionsFieldBuilder width(Double width) {
      this.width = width;
      return this;
    }

    public TemplateSignerInputDimensionsFieldBuilder height(Double height) {
      this.height = height;
      return this;
    }

    public TemplateSignerInputDimensionsField build() {
      return new TemplateSignerInputDimensionsField(this);
    }

  }

}
