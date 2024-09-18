package com.box.sdkgen.schemas.metadataquery;

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
import java.util.Map;
import java.util.List;

public class MetadataQueryOrderByField {

  @JsonProperty("field_key")
  protected String fieldKey;

  @JsonDeserialize(using = MetadataQueryOrderByDirectionField.MetadataQueryOrderByDirectionFieldDeserializer.class)
  @JsonSerialize(using = MetadataQueryOrderByDirectionField.MetadataQueryOrderByDirectionFieldSerializer.class)
  protected EnumWrapper<MetadataQueryOrderByDirectionField> direction;

  public MetadataQueryOrderByField() {
  }

  protected MetadataQueryOrderByField(MetadataQueryOrderByFieldBuilder builder) {
    this.fieldKey = builder.fieldKey;
    this.direction = builder.direction;
  }

  public String getFieldKey() {
    return fieldKey;
  }

  public EnumWrapper<MetadataQueryOrderByDirectionField> getDirection() {
    return direction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataQueryOrderByField casted = (MetadataQueryOrderByField) o;
    return Objects.equals(fieldKey, casted.fieldKey) &&
      Objects.equals(direction, casted.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      fieldKey, direction
    );
  }

  @Override
  public String toString() {
    return "MetadataQueryOrderByField{" + "fieldKey='" + fieldKey + '\'' + ", " + "direction='" + direction + '\'' + "}";
  }

  public static class MetadataQueryOrderByFieldBuilder {

    protected String fieldKey;

    protected EnumWrapper<MetadataQueryOrderByDirectionField> direction;

    public MetadataQueryOrderByFieldBuilder fieldKey(String fieldKey) {
      this.fieldKey = fieldKey;
      return this;
    }

    public MetadataQueryOrderByFieldBuilder direction(MetadataQueryOrderByDirectionField direction) {
      this.direction = new EnumWrapper<MetadataQueryOrderByDirectionField>(direction.getValue(), direction);
      return this;
    }

    public MetadataQueryOrderByField build() {
      return new MetadataQueryOrderByField(this);
    }

  }

}
