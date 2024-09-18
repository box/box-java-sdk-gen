package com.box.sdkgen.schemas.shieldinformationbarriersegmentrestrictionmini;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentrestrictionbase.ShieldInformationBarrierSegmentRestrictionBaseTypeField;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentrestrictionbase.ShieldInformationBarrierSegmentRestrictionBase;

public class ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentField {

  protected String id;

  @JsonDeserialize(using = ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentTypeField.ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentTypeFieldDeserializer.class)
  @JsonSerialize(using = ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentTypeField.ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentTypeFieldSerializer.class)
  protected EnumWrapper<ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentTypeField> type;

  public ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentField() {
  }

  protected ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentField(ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentTypeField> getType() {
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
    ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentField casted = (ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentField) o;
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
    return "ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentField{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentFieldBuilder {

    protected String id;

    protected EnumWrapper<ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentTypeField> type;

    public ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentFieldBuilder type(ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentTypeField type) {
      this.type = new EnumWrapper<ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentTypeField>(type.getValue(), type);
      return this;
    }

    public ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentField build() {
      return new ShieldInformationBarrierSegmentRestrictionMiniShieldInformationBarrierSegmentField(this);
    }

  }

}
