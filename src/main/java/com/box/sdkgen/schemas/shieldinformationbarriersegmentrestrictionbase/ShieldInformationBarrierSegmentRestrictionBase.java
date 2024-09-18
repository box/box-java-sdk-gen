package com.box.sdkgen.schemas.shieldinformationbarriersegmentrestrictionbase;

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

public class ShieldInformationBarrierSegmentRestrictionBase {

  @JsonDeserialize(using = ShieldInformationBarrierSegmentRestrictionBaseTypeField.ShieldInformationBarrierSegmentRestrictionBaseTypeFieldDeserializer.class)
  @JsonSerialize(using = ShieldInformationBarrierSegmentRestrictionBaseTypeField.ShieldInformationBarrierSegmentRestrictionBaseTypeFieldSerializer.class)
  protected EnumWrapper<ShieldInformationBarrierSegmentRestrictionBaseTypeField> type;

  protected String id;

  public ShieldInformationBarrierSegmentRestrictionBase() {
  }

  protected ShieldInformationBarrierSegmentRestrictionBase(ShieldInformationBarrierSegmentRestrictionBaseBuilder builder) {
    this.type = builder.type;
    this.id = builder.id;
  }

  public EnumWrapper<ShieldInformationBarrierSegmentRestrictionBaseTypeField> getType() {
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
    ShieldInformationBarrierSegmentRestrictionBase casted = (ShieldInformationBarrierSegmentRestrictionBase) o;
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
    return "ShieldInformationBarrierSegmentRestrictionBase{" + "type='" + type + '\'' + ", " + "id='" + id + '\'' + "}";
  }

  public static class ShieldInformationBarrierSegmentRestrictionBaseBuilder {

    protected EnumWrapper<ShieldInformationBarrierSegmentRestrictionBaseTypeField> type;

    protected String id;

    public ShieldInformationBarrierSegmentRestrictionBaseBuilder type(ShieldInformationBarrierSegmentRestrictionBaseTypeField type) {
      this.type = new EnumWrapper<ShieldInformationBarrierSegmentRestrictionBaseTypeField>(type.getValue(), type);
      return this;
    }

    public ShieldInformationBarrierSegmentRestrictionBaseBuilder id(String id) {
      this.id = id;
      return this;
    }

    public ShieldInformationBarrierSegmentRestrictionBase build() {
      return new ShieldInformationBarrierSegmentRestrictionBase(this);
    }

  }

}
