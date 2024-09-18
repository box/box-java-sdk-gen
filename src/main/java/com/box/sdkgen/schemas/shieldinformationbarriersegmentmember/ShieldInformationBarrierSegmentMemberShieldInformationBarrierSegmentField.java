package com.box.sdkgen.schemas.shieldinformationbarriersegmentmember;

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
import com.box.sdkgen.schemas.shieldinformationbarriersegmentmemberbase.ShieldInformationBarrierSegmentMemberBaseTypeField;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentmemberbase.ShieldInformationBarrierSegmentMemberBase;
import com.box.sdkgen.schemas.shieldinformationbarriersegmentmembermini.ShieldInformationBarrierSegmentMemberMini;
import com.box.sdkgen.schemas.shieldinformationbarrierbase.ShieldInformationBarrierBase;
import com.box.sdkgen.schemas.userbase.UserBase;

public class ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentField {

  protected String id;

  @JsonDeserialize(using = ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField.ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeFieldDeserializer.class)
  @JsonSerialize(using = ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField.ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeFieldSerializer.class)
  protected EnumWrapper<ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField> type;

  public ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentField() {
  }

  protected ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentField(ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentFieldBuilder builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField> getType() {
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
    ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentField casted = (ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentField) o;
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
    return "ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentField{" + "id='" + id + '\'' + ", " + "type='" + type + '\'' + "}";
  }

  public static class ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentFieldBuilder {

    protected String id;

    protected EnumWrapper<ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField> type;

    public ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentFieldBuilder id(String id) {
      this.id = id;
      return this;
    }

    public ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentFieldBuilder type(ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField type) {
      this.type = new EnumWrapper<ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentTypeField>(type.getValue(), type);
      return this;
    }

    public ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentField build() {
      return new ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegmentField(this);
    }

  }

}
