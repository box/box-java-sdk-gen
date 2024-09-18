package com.box.sdkgen.schemas.devicepinners;

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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.box.sdkgen.schemas.devicepinner.DevicePinner;

public class DevicePinnersOrderField {

  @JsonDeserialize(using = DevicePinnersOrderByField.DevicePinnersOrderByFieldDeserializer.class)
  @JsonSerialize(using = DevicePinnersOrderByField.DevicePinnersOrderByFieldSerializer.class)
  protected EnumWrapper<DevicePinnersOrderByField> by;

  @JsonDeserialize(using = DevicePinnersOrderDirectionField.DevicePinnersOrderDirectionFieldDeserializer.class)
  @JsonSerialize(using = DevicePinnersOrderDirectionField.DevicePinnersOrderDirectionFieldSerializer.class)
  protected EnumWrapper<DevicePinnersOrderDirectionField> direction;

  public DevicePinnersOrderField() {
  }

  protected DevicePinnersOrderField(DevicePinnersOrderFieldBuilder builder) {
    this.by = builder.by;
    this.direction = builder.direction;
  }

  public EnumWrapper<DevicePinnersOrderByField> getBy() {
    return by;
  }

  public EnumWrapper<DevicePinnersOrderDirectionField> getDirection() {
    return direction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevicePinnersOrderField casted = (DevicePinnersOrderField) o;
    return Objects.equals(by, casted.by) &&
      Objects.equals(direction, casted.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      by, direction
    );
  }

  @Override
  public String toString() {
    return "DevicePinnersOrderField{" + "by='" + by + '\'' + ", " + "direction='" + direction + '\'' + "}";
  }

  public static class DevicePinnersOrderFieldBuilder {

    protected EnumWrapper<DevicePinnersOrderByField> by;

    protected EnumWrapper<DevicePinnersOrderDirectionField> direction;

    public DevicePinnersOrderFieldBuilder by(DevicePinnersOrderByField by) {
      this.by = new EnumWrapper<DevicePinnersOrderByField>(by.getValue(), by);
      return this;
    }

    public DevicePinnersOrderFieldBuilder direction(DevicePinnersOrderDirectionField direction) {
      this.direction = new EnumWrapper<DevicePinnersOrderDirectionField>(direction.getValue(), direction);
      return this;
    }

    public DevicePinnersOrderField build() {
      return new DevicePinnersOrderField(this);
    }

  }

}
