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

public class ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentField {

  protected String id;

  @JsonDeserialize(using = ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentTypeField.ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentTypeFieldDeserializer.class)
  @JsonSerialize(using = ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentTypeField.ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentTypeFieldSerializer.class)
  protected EnumWrapper<ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentTypeField> type;

  public ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentField() {
  }

  protected ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentField(ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentTypeField> getType() {
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
    ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentField casted = (ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentField) o;
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
    return "ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentField{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentFieldBuilder {

    protected String id;

    protected EnumWrapper<ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentTypeField> type;

    public ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentFieldBuilder type(ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentTypeField type) {
      this.type = new EnumWrapper<ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentTypeField>(type.getValue(), type);
      return this;
    }

    public ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentField build() {
      return new ShieldInformationBarrierSegmentRestrictionMiniRestrictedSegmentField(this);
    }

  }

}
