package com.box.sdkgen.managers.shieldinformationbarriersegmentrestrictions;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public class CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentField {

  protected String id;

  @JsonDeserialize(
      using =
          CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField
              .CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeFieldDeserializer
              .class)
  @JsonSerialize(
      using =
          CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField
              .CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeFieldSerializer
              .class)
  protected EnumWrapper<
          CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField>
      type;

  public CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentField() {}

  protected CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentField(
      CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentFieldBuilder
          builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<
          CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField>
      getType() {
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
    CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentField casted =
        (CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentField) o;
    return Objects.equals(id, casted.id) && Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    return "CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentField{"
        + "id='"
        + id
        + '\''
        + ", "
        + "type='"
        + type
        + '\''
        + "}";
  }

  public static
  class CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentFieldBuilder {

    protected String id;

    protected EnumWrapper<
            CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField>
        type;

    public CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentFieldBuilder
        id(String id) {
      this.id = id;
      return this;
    }

    public CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentFieldBuilder
        type(
            CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField
                type) {
      this.type =
          new EnumWrapper<
              CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentTypeField>(
              type.getValue(), type);
      return this;
    }

    public CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentField
        build() {
      return new CreateShieldInformationBarrierSegmentRestrictionRequestBodyRestrictedSegmentField(
          this);
    }
  }
}
