package com.box.sdkgen.schemas.integrationmappingbase;

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

public class IntegrationMappingBase {

  protected final String id;

  @JsonDeserialize(using = IntegrationMappingBaseTypeField.IntegrationMappingBaseTypeFieldDeserializer.class)
  @JsonSerialize(using = IntegrationMappingBaseTypeField.IntegrationMappingBaseTypeFieldSerializer.class)
  protected EnumWrapper<IntegrationMappingBaseTypeField> type;

  public IntegrationMappingBase(@JsonProperty("id") String id) {
    this.id = id;
    this.type = new EnumWrapper<IntegrationMappingBaseTypeField>(IntegrationMappingBaseTypeField.INTEGRATION_MAPPING.getValue(), IntegrationMappingBaseTypeField.INTEGRATION_MAPPING);
  }

  protected IntegrationMappingBase(IntegrationMappingBaseBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<IntegrationMappingBaseTypeField> getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationMappingBase casted = (IntegrationMappingBase) o;
    return Objects.equals(id, casted.id) &&
      Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      id, type
    );
  }

  @Override
  public String toString() {
    return "IntegrationMappingBase{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class IntegrationMappingBaseBuilder {

    protected final String id;

    protected EnumWrapper<IntegrationMappingBaseTypeField> type;

    public IntegrationMappingBaseBuilder(String id) {
      this.id = id;
      this.type = new EnumWrapper<IntegrationMappingBaseTypeField>(IntegrationMappingBaseTypeField.INTEGRATION_MAPPING.getValue(), IntegrationMappingBaseTypeField.INTEGRATION_MAPPING);
    }

    public IntegrationMappingBaseBuilder type(IntegrationMappingBaseTypeField type) {
      this.type = new EnumWrapper<IntegrationMappingBaseTypeField>(type.getValue(), type);
      return this;
    }

    public IntegrationMappingBase build() {
      return new IntegrationMappingBase(this);
    }

  }

}
