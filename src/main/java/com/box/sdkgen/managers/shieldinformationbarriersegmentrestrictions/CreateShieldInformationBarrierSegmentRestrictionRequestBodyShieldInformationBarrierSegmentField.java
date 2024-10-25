package com.box.sdkgen.managers.shieldinformationbarriersegmentrestrictions;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Objects;

public
class CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentField {

  protected String id;

  @JsonDeserialize(
      using =
          CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentTypeField
              .CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentTypeFieldDeserializer
              .class)
  @JsonSerialize(
      using =
          CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentTypeField
              .CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentTypeFieldSerializer
              .class)
  protected EnumWrapper<
          CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentTypeField>
      type;

  public
  CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentField() {}

  protected
  CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentField(
      CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentFieldBuilder
          builder) {
    this.id = builder.id;
    this.type = builder.type;
  }

  public String getId() {
    return id;
  }

  public EnumWrapper<
          CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentTypeField>
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
    CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentField
        casted =
            (CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentField)
                o;
    return Objects.equals(id, casted.id) && Objects.equals(type, casted.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    return "CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentField{"
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
  class CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentFieldBuilder {

    protected String id;

    protected EnumWrapper<
            CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentTypeField>
        type;

    public
    CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentFieldBuilder
        id(String id) {
      this.id = id;
      return this;
    }

    public
    CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentFieldBuilder
        type(
            EnumWrapper<
                    CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentTypeField>
                type) {
      this.type = type;
      return this;
    }

    public
    CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentFieldBuilder
        type(
            CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentTypeField
                type) {
      this.type =
          new EnumWrapper<
              CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentTypeField>(
              type.getValue(), type);
      return this;
    }

    public
    CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentField
        build() {
      return new CreateShieldInformationBarrierSegmentRestrictionRequestBodyShieldInformationBarrierSegmentField(
          this);
    }
  }
}
