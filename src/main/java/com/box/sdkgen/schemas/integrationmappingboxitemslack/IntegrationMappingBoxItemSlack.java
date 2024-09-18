package com.box.sdkgen.schemas.integrationmappingboxitemslack;

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

public class IntegrationMappingBoxItemSlack {

  @JsonDeserialize(using = IntegrationMappingBoxItemSlackTypeField.IntegrationMappingBoxItemSlackTypeFieldDeserializer.class)
  @JsonSerialize(using = IntegrationMappingBoxItemSlackTypeField.IntegrationMappingBoxItemSlackTypeFieldSerializer.class)
  protected EnumWrapper<IntegrationMappingBoxItemSlackTypeField> type;

  protected final String id;

  public IntegrationMappingBoxItemSlack(@JsonProperty("id") String id) {
    this.id = id;
    this.type = new EnumWrapper<IntegrationMappingBoxItemSlackTypeField>(IntegrationMappingBoxItemSlackTypeField.FOLDER.getValue(), IntegrationMappingBoxItemSlackTypeField.FOLDER);
  }

  protected IntegrationMappingBoxItemSlack(IntegrationMappingBoxItemSlackBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<IntegrationMappingBoxItemSlackTypeField> getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationMappingBoxItemSlack casted = (IntegrationMappingBoxItemSlack) o;
    return Objects.equals(type, casted.type) &&
      Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, id
    );
  }

  @Override
  public String toString() {
    return "IntegrationMappingBoxItemSlack{" + "type='" + type + '\'' + ", " + "id='" + id + '\'' + "}";
  }

  public static class IntegrationMappingBoxItemSlackBuilder {

    protected EnumWrapper<IntegrationMappingBoxItemSlackTypeField> type;

    protected final String id;

    public IntegrationMappingBoxItemSlackBuilder(String id) {
      this.id = id;
      this.type = new EnumWrapper<IntegrationMappingBoxItemSlackTypeField>(IntegrationMappingBoxItemSlackTypeField.FOLDER.getValue(), IntegrationMappingBoxItemSlackTypeField.FOLDER);
    }

    public IntegrationMappingBoxItemSlackBuilder type(IntegrationMappingBoxItemSlackTypeField type) {
      this.type = new EnumWrapper<IntegrationMappingBoxItemSlackTypeField>(type.getValue(), type);
      return this;
    }

    public IntegrationMappingBoxItemSlack build() {
      return new IntegrationMappingBoxItemSlack(this);
    }

  }

}
