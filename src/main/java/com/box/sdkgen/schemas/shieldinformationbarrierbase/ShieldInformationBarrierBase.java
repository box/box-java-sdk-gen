package com.box.sdkgen.schemas.shieldinformationbarrierbase;

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class ShieldInformationBarrierBase {

  protected String id;

  @JsonDeserialize(using = ShieldInformationBarrierBaseTypeField.ShieldInformationBarrierBaseTypeFieldDeserializer.class)
  @JsonSerialize(using = ShieldInformationBarrierBaseTypeField.ShieldInformationBarrierBaseTypeFieldSerializer.class)
  protected EnumWrapper<ShieldInformationBarrierBaseTypeField> type;

  public ShieldInformationBarrierBase() {
  }

  protected ShieldInformationBarrierBase(ShieldInformationBarrierBaseBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<ShieldInformationBarrierBaseTypeField> getType() {
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
    ShieldInformationBarrierBase casted = (ShieldInformationBarrierBase) o;
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
    return "ShieldInformationBarrierBase{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class ShieldInformationBarrierBaseBuilder {

    protected String id;

    protected EnumWrapper<ShieldInformationBarrierBaseTypeField> type;

    public ShieldInformationBarrierBaseBuilder id(String id) {
      this.id = id;
      return this;
    }

    public ShieldInformationBarrierBaseBuilder type(ShieldInformationBarrierBaseTypeField type) {
      this.type = new EnumWrapper<ShieldInformationBarrierBaseTypeField>(type.getValue(), type);
      return this;
    }

    public ShieldInformationBarrierBase build() {
      return new ShieldInformationBarrierBase(this);
    }

  }

}
