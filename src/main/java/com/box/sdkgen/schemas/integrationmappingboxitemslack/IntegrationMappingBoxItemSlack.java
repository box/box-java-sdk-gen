package com.box.sdkgen.schemas.integrationmappingboxitemslack;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class IntegrationMappingBoxItemSlack extends SerializableObject {

  @JsonDeserialize(
      using =
          IntegrationMappingBoxItemSlackTypeField
              .IntegrationMappingBoxItemSlackTypeFieldDeserializer.class)
  @JsonSerialize(
      using =
          IntegrationMappingBoxItemSlackTypeField.IntegrationMappingBoxItemSlackTypeFieldSerializer
              .class)
  protected EnumWrapper<IntegrationMappingBoxItemSlackTypeField> type;

  protected final String id;

  public IntegrationMappingBoxItemSlack(@JsonProperty("id") String id) {
    super();
    this.id = id;
    this.type =
        new EnumWrapper<IntegrationMappingBoxItemSlackTypeField>(
            IntegrationMappingBoxItemSlackTypeField.FOLDER);
  }

  protected IntegrationMappingBoxItemSlack(IntegrationMappingBoxItemSlackBuilder builder) {
    super();
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
    return Objects.equals(type, casted.type) && Objects.equals(id, casted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    return "IntegrationMappingBoxItemSlack{"
        + "type='"
        + type
        + '\''
        + ", "
        + "id='"
        + id
        + '\''
        + "}";
  }

  public static class IntegrationMappingBoxItemSlackBuilder {

    protected EnumWrapper<IntegrationMappingBoxItemSlackTypeField> type;

    protected final String id;

    public IntegrationMappingBoxItemSlackBuilder(String id) {
      this.id = id;
      this.type =
          new EnumWrapper<IntegrationMappingBoxItemSlackTypeField>(
              IntegrationMappingBoxItemSlackTypeField.FOLDER);
    }

    public IntegrationMappingBoxItemSlackBuilder type(
        IntegrationMappingBoxItemSlackTypeField type) {
      this.type = new EnumWrapper<IntegrationMappingBoxItemSlackTypeField>(type);
      return this;
    }

    public IntegrationMappingBoxItemSlackBuilder type(
        EnumWrapper<IntegrationMappingBoxItemSlackTypeField> type) {
      this.type = type;
      return this;
    }

    public IntegrationMappingBoxItemSlack build() {
      return new IntegrationMappingBoxItemSlack(this);
    }
  }
}
