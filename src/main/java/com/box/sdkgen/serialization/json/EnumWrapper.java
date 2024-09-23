package com.box.sdkgen.serialization.json;

import java.util.Objects;

public class EnumWrapper<E extends Enum<E>> {
  private E value;
  private final String stringValue;

  public EnumWrapper(String value, E enumValue) {
    this.stringValue = value;
    this.value = enumValue;
  }

  public EnumWrapper(String value) {
    this.stringValue = value;
  }

  public E getEnumValue() {
    return value;
  }

  public String getStringValue() {
    return stringValue;
  }

  @Override
  public String toString() {
    return "EnumWrapper{" + "value=" + value + ", stringValue='" + stringValue + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumWrapper<?> casted = (EnumWrapper<?>) o;
    return Objects.equals(stringValue, casted.stringValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringValue);
  }
}
