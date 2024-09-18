package com.box.sdkgen.schemas.trackingcode;

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

public class TrackingCode {

  @JsonDeserialize(using = TrackingCodeTypeField.TrackingCodeTypeFieldDeserializer.class)
  @JsonSerialize(using = TrackingCodeTypeField.TrackingCodeTypeFieldSerializer.class)
  protected EnumWrapper<TrackingCodeTypeField> type;

  protected String name;

  protected String value;

  public TrackingCode() {
  }

  protected TrackingCode(TrackingCodeBuilder builder) {
    this.type = builder.type;
    this.name = builder.name;
    this.value = builder.value;
  }

  public EnumWrapper<TrackingCodeTypeField> getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingCode casted = (TrackingCode) o;
    return Objects.equals(type, casted.type) &&
      Objects.equals(name, casted.name) &&
      Objects.equals(value, casted.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, name, value
    );
  }

  @Override
  public String toString() {
    return "TrackingCode{" + "type='" + type + '\'' + ", " + "name='" + name + '\'' + ", " + "value='" + value + '\'' + "}";
  }

  public static class TrackingCodeBuilder {

    protected EnumWrapper<TrackingCodeTypeField> type;

    protected String name;

    protected String value;

    public TrackingCodeBuilder type(TrackingCodeTypeField type) {
      this.type = new EnumWrapper<TrackingCodeTypeField>(type.getValue(), type);
      return this;
    }

    public TrackingCodeBuilder name(String name) {
      this.name = name;
      return this;
    }

    public TrackingCodeBuilder value(String value) {
      this.value = value;
      return this;
    }

    public TrackingCode build() {
      return new TrackingCode(this);
    }

  }

}
