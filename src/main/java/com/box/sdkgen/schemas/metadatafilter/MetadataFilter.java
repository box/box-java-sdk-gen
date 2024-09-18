package com.box.sdkgen.schemas.metadatafilter;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.box.sdkgen.schemas.metadatafieldfilterdaterangeormetadatafieldfilterfloatrangeorarrayofstringornumberorstring.MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString;

public class MetadataFilter {

  @JsonDeserialize(using = MetadataFilterScopeField.MetadataFilterScopeFieldDeserializer.class)
  @JsonSerialize(using = MetadataFilterScopeField.MetadataFilterScopeFieldSerializer.class)
  protected EnumWrapper<MetadataFilterScopeField> scope;

  protected String templateKey;

  protected Map<String, MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString> filters;

  public MetadataFilter() {
  }

  protected MetadataFilter(MetadataFilterBuilder builder) {
    this.scope = builder.scope;
    this.templateKey = builder.templateKey;
    this.filters = builder.filters;
  }

  public EnumWrapper<MetadataFilterScopeField> getScope() {
    return scope;
  }

  public String getTemplateKey() {
    return templateKey;
  }

  public Map<String, MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString> getFilters() {
    return filters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataFilter casted = (MetadataFilter) o;
    return Objects.equals(scope, casted.scope) &&
      Objects.equals(templateKey, casted.templateKey) &&
      Objects.equals(filters, casted.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      scope, templateKey, filters
    );
  }

  @Override
  public String toString() {
    return "MetadataFilter{" + "scope='" + scope + '\'' + ", " + "templateKey='" + templateKey + '\'' + ", " + "filters='" + filters + '\'' + "}";
  }

  public static class MetadataFilterBuilder {

    protected EnumWrapper<MetadataFilterScopeField> scope;

    protected String templateKey;

    protected Map<String, MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString> filters;

    public MetadataFilterBuilder scope(MetadataFilterScopeField scope) {
      this.scope = new EnumWrapper<MetadataFilterScopeField>(scope.getValue(), scope);
      return this;
    }

    public MetadataFilterBuilder templateKey(String templateKey) {
      this.templateKey = templateKey;
      return this;
    }

    public MetadataFilterBuilder filters(Map<String, MetadataFieldFilterDateRangeOrMetadataFieldFilterFloatRangeOrArrayOfStringOrNumberOrString> filters) {
      this.filters = filters;
      return this;
    }

    public MetadataFilter build() {
      return new MetadataFilter(this);
    }

  }

}
